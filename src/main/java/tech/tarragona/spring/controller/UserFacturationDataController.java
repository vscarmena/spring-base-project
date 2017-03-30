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
import tech.tarragona.spring.model.UserFacturationData;
import tech.tarragona.spring.service.EmailService;
import tech.tarragona.spring.service.UserFacturationDataService;
import tech.tarragona.spring.service.UserService;

@Controller
public class UserFacturationDataController {
	@Autowired
	UserFacturationDataService userFacturationDataService;

	@Autowired
	EmailService emailService;

	@Autowired
	UserService userService;
	
	
	public static final String HOME_PAGE = "hello";
	public static final String USER_FACTURATION = "user/facturacion";
	
	
	@GetMapping("/facturacion")
	public String redirectToFacturationUser(@AuthenticationPrincipal User activeUser, Model model){
		UserFacturationData userFacturationData = new UserFacturationData();
		if (activeUser.getUserFacturationData() != null) {
			userFacturationData = activeUser.getUserFacturationData();
		}
		model.addAttribute("facturation", userFacturationData);
		return USER_FACTURATION;
	}

	@PostMapping("/facturacion")
	public String editFacturationUserInfo(@Valid @ModelAttribute("facturation") UserFacturationData userFacturationData, BindingResult result, @AuthenticationPrincipal User activeUser, Locale locale){
		if (result.hasErrors()){
			return USER_FACTURATION;
		}
		else {
			userFacturationDataService.editFacturationUserInfo(activeUser, userFacturationData);
		}
		return HOME_PAGE;		
	}
}
