package tech.tarragona.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import tech.tarragona.spring.model.Camping;
import tech.tarragona.spring.service.CampingService;

@Controller
public class CampingController {
	
	@Autowired
	CampingService campingService;
	

	  
	@GetMapping("/addCamping")
	public String Camping(Model model) {
		model.addAttribute("camping", new Camping());
	    return "addCamping";
	  }
	
	@PostMapping("/addCamping")
	public String addCamping(Model model, Camping camping) {
		campingService.addNewCamping(camping);
	    return "addCamping";
	  }

}
