package tech.tarragona.spring.controller;

import java.util.Locale;

import javax.mail.MessagingException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import tech.tarragona.spring.model.User;
import tech.tarragona.spring.service.EmailService;
import tech.tarragona.spring.service.UserDataService;
import tech.tarragona.spring.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserDataService userDataService;

	@Autowired
	EmailService emailService;

	@Autowired
	UserService userService;

	public static final String VIEW_PEOPLE = "persons";
	public static final String REGISTER_PAGE = "register";
	public static final String REGISTRATION_OK = "registration-success";
	public static final String REGISTRATION_FAIL = "registration-error";
	public static final String ACTIVATION_OK = "activation-success";
	public static final String ACTIVATION_FAIL = "activation-error";
	public static final String EDIT_USER = "edit-user-info";
	public static final String REDIRECT_EDIT_USER = "redirect:/" +EDIT_USER;

	@PostMapping("/register")
	public String registro(@Valid @ModelAttribute("user") User user, BindingResult result, Locale locale){
		//Add to BD
		if (result.hasErrors()){
			return REGISTER_PAGE;
		}
		if (userService.userAlreadyExists(user, result)){
			return REGISTER_PAGE;
		}else {
			userService.addNewUser(user);
			userService.generateAndSaveSecurityCode(user.getId());
			try {
				emailService.sendConfirmationMail(user, locale);
				return REGISTRATION_OK;
			} catch (MessagingException e) {
				e.printStackTrace();
				return REGISTRATION_FAIL;
			}
		}		
	}

	@GetMapping("/hello/{code}")
	public String enableUser(@PathVariable String code){
		if (userService.findBySecurityCodeAndSetEnabled(code)){
			return	ACTIVATION_OK;
		}else{
			return	ACTIVATION_FAIL;
		}
	}
	



}