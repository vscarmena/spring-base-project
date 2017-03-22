package tech.tarragona.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import tech.tarragona.spring.model.User;

@Controller
@RequestMapping("/lista")
public class UserController {
	 
	  public String lista(User user) {
		  
	    return "lista";
	  }
}