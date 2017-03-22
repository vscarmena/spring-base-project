package tech.tarragona.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import tech.tarragona.spring.model.UserData;
import tech.tarragona.spring.service.UserDataService;

@Controller

public class UserDataController {
	@Autowired
	UserDataService userDataService;
	
	
	 @GetMapping("/listar")
	  public String lista(UserData userdata, Model model) {
		model.addAttribute("lista", userDataService.getUserData());
	    return "persons";
	  }
}
