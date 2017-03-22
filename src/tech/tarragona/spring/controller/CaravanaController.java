package tech.tarragona.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tech.tarragona.spring.model.Caravana;
import tech.tarragona.spring.service.Caravanaservice;

@Controller
@RequestMapping(value = "/caravana")
public class CaravanaController {
	
	@Autowired
	Caravanaservice caravanaservice;
	
	@GetMapping("/caravana")
	public String addCaravana(Model model) {
		
		model.addAttribute("caravana", new Caravana());
		return "5.1";
	}
	@PostMapping("/caravana")
	public String addCaravana(@Valid @ModelAttribute("caravana") Caravana caravana, BindingResult result, Model model){
		if (!result.hasErrors()){
			caravanaservice.addCaravana(caravana);
			caravanaservice.seleccionarPersonas(caravana, result);
			model.addAttribute("caravana", caravana);
			caravanaservice.addCaravana(caravana);
			return "paginaDePruebas";
		}
		System.out.println("ERRORS: " + result.getFieldErrors());
		return "5.1";
	}
}
