package tech.tarragona.spring.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {

	  @RequestMapping("/login")
	  public String login() {
	    return "login";
	  }

	  @RequestMapping("/login-error")
	  public String loginError(Model model) {
	    model.addAttribute("loginError", true);
	    return "login";
	  }
	  
	  @RequestMapping("/403")
	  public String accessDenied(Model model) {
	    return "403";
	  }
	  
	  @RequestMapping("/")
	  public String hello(@AuthenticationPrincipal User activeUser, Model model) {
		  //TODO: Con @AuthenticationPrincipal hay problemas conocidos http://stackoverflow.com/questions/32686587/null-authenticationprincipal-with-spring-boot-security
		  //model.addAttribute("name", activeUser.getUsername() != null ? activeUser.getUsername() : "");
		  //if (activeUser.getUserData() != null) {
			  //System.out.println("USER NAME: " + activeUser.getUserData().getName());
		  //}
		  
	      return "redirect:/items";
	  }
	  
	  @Secured("ROLE_ADMIN")
	  @RequestMapping("/admin")
	  public String helloAdmin(@AuthenticationPrincipal User activeUser, Model model) {
		  model.addAttribute("name", activeUser.getUsername());
	      return "hello";
	  }
	  
	  @Secured("ROLE_USER")
	  @RequestMapping("/user")
	  public String helloUser(@AuthenticationPrincipal User activeUser, Model model) {
		  model.addAttribute("name", activeUser.getUsername());
	      return "hello";
	  }
	  
	  @Secured({"ROLE_USER", "ROLE_ADMIN"})
	  @RequestMapping("/userAdmin")
	  public String helloUserAdmin(@AuthenticationPrincipal User activeUser, Model model) {
		  model.addAttribute("name", activeUser.getUsername());
	      return "hello";
	  }
	  
	  

}
