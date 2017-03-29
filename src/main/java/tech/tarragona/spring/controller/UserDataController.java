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

	public static final String HOME_PAGE = "hello";
	public static final String REGISTER_PAGE = "user/register";
	public static final String REGISTRATION_OK = "user/registration-success";
	public static final String REGISTRATION_FAIL = "user/registration-error";
	public static final String ACTIVATION_OK = "user/activation-success";
	public static final String ACTIVATION_FAIL = "user/activation-error";
	public static final String EDIT_USER = "user/info";
	public static final String USER_FACTURATION = "user/facturacion";
	
	@GetMapping("/info")
	public String redirectToEditUser(@AuthenticationPrincipal User activeUser, Model model){
		model.addAttribute("userData", activeUser.getUserData());
		return EDIT_USER;
	}

	@PostMapping("/info")
	public String editUserInfo(@Valid @ModelAttribute("userData") UserData userData, BindingResult result, @AuthenticationPrincipal User activeUser, Locale locale){
		if (result.hasErrors()){
			System.out.println(result.getFieldErrors());
			return EDIT_USER;
		}
		else {
			userDataService.editUserInfo(activeUser, userData);
		}
		return HOME_PAGE;		
	}

	@GetMapping("/facturacion")
	public String redirectToFacturationUser(@AuthenticationPrincipal User activeUser, Model model){
		model.addAttribute("facturation", activeUser.getUserData());
		return USER_FACTURATION;
	}

	@PostMapping("/facturacion")
	public String editFacturationUserInfo(@Valid @ModelAttribute("facturation") UserData userFacturationData, BindingResult result, @AuthenticationPrincipal User activeUser, Locale locale){
		if (result.hasErrors()){
			return USER_FACTURATION;
		}
		else {
			userDataService.editFacturationUserInfo(activeUser, userFacturationData);
		}
		return HOME_PAGE;		
	}


}