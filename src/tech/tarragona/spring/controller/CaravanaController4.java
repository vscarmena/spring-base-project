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
import tech.tarragona.spring.model.Servicio;
import tech.tarragona.spring.service.Caravanaservice;



@Controller
@RequestMapping(value = "/caravana4")
public class CaravanaController4 {

	@Autowired
	Caravanaservice caravanaService;
	
	@GetMapping("/caravana4")
	public String showAddCharacteristics(Model model) {
		
		model.addAttribute("servicio", new Servicio());
		return "extrasCaravana";
	}
	@PostMapping("/caravana4")
	public String addCharacteristics(@Valid @ModelAttribute("servicio") Caravana caravana, BindingResult result, Model model){
		
		caravanaService.addCaravana(caravana);
		return "paginaDePruebas";
	}
	
	
}
