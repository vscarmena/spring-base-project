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
	  
	  @RequestMapping("/register")
	  public String regsiter() {
	    return "register";
	  }
	  
	  @RequestMapping("/info")
	  public String info() {
	    return "info";
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
	  public String start(Model model) {
	      return "hello";
	  }
	  
	  @RequestMapping("/hello")
	  public String hello(Model model) {
	      return "hello";
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
