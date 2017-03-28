package tech.tarragona.spring.controller;

import java.util.Locale;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import tech.tarragona.spring.model.User;
import tech.tarragona.spring.model.UserData;
import tech.tarragona.spring.service.EmailService;
import tech.tarragona.spring.service.UserDataService;
import tech.tarragona.spring.service.UserService;

@Controller

public class UserDataController {

	@Autowired
	UserDataService userDataService;

	@Autowired
	EmailService emailService;

	@Autowired
	UserService userService;
	
	public static final String HOME_PAGE = "home";
	public static final String REGISTER_PAGE = "register";
	public static final String REGISTRATION_OK = "registration-success";
	public static final String REGISTRATION_FAIL = "registration-error";
	public static final String ACTIVATION_OK = "activation-success";
	public static final String ACTIVATION_FAIL = "activation-error";
	public static final String EDIT_USER = "info";
	public static final String REDIRECT_EDIT_USER = "redirect:/" +EDIT_USER;
	
	@GetMapping("/info")
	public String redirectToEditUser(@AuthenticationPrincipal User activeUser, Model model){
		model.addAttribute("userData", activeUser.getUserData());
		return EDIT_USER;
	}

	@PostMapping("/info")
	public String editUserInfo(@Valid @ModelAttribute("userData") UserData userData, BindingResult result, Locale locale){
		if (result.hasErrors()){
			System.out.println(result.getFieldErrors());
			return EDIT_USER;
		}
		else {
			userDataService.editUserInfo(userData);
		}
		return HOME_PAGE;
		
	}
	

	

}