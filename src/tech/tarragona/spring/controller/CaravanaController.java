package tech.tarragona.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

import tech.tarragona.spring.model.Caravana;
import tech.tarragona.spring.service.Caravanaservice;

@Controller
public class CaravanaController {
	
	@Autowired
	Caravanaservice caravanaservice;

	@PostMapping("/caravana")
	public String seleccionarPersonas(Caravana caravana, BindingResult result, Model model)
	{
		int adults = caravana.getAdults();
		int kids = caravana.getKids();
		int babys = caravana.getBabys();
		
		caravanaservice.seleccionarPersonas(adults, babys, kids, caravana);
		
		return "gestionCaravana";
	}
	
}
