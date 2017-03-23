package tech.tarragona.spring.controller;

import java.util.Locale;

import javax.mail.MessagingException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

	public static final String VIEW_PEOPLE = "persons";
	public static final String REGISTER_PAGE = "register";
	public static final String REGISTRATION_OK = "registration-success";
	public static final String REGISTRATION_FAIL = "registration-error";
	public static final String ACTIVATION_OK = "activation-success";
	public static final String ACTIVATION_FAIL = "activation-error";

	@GetMapping("/listar")
	public String lista(UserData userdata, Model model) {
		model.addAttribute("lista", userDataService.getUserData());
		return VIEW_PEOPLE;
	}

	

}