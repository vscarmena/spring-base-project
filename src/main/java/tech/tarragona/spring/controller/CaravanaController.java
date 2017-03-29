package tech.tarragona.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tech.tarragona.spring.model.Caravan;
import tech.tarragona.spring.service.CampingService;
import tech.tarragona.spring.service.Caravanaservice;
import tech.tarragona.spring.validator.CaravanaValidator;

@Controller
@RequestMapping(value = "/caravana")
public class CaravanaController {

	@Autowired
	Caravanaservice caravanaservice;


	@Autowired
	CaravanaValidator caravanaValidator;
	
	@Autowired
	CampingService campingService;

	@GetMapping("/add")
	public String addCaravana(Model model) {

		model.addAttribute("caravana", new Caravan());
		
		
<<<<<<< HEAD
		
		model.addAttribute("campings", campingService.getCamping());

		return "caravan/gestionCaravanas";
=======
	return "caravan/gestionCaravanas";
>>>>>>> 3974f671298bdd2bfd4e1e99287a7f5af5bb1474

		//return "5.7";
	}


	@PostMapping("/add")
	public String addCaravana(@Valid @ModelAttribute("caravana") Caravan caravana, Errors errors, BindingResult result, Model model){
		caravanaValidator.validate(caravana, errors);


		if (!result.hasErrors()){	

			caravanaservice.addCaravana(caravana);			

<<<<<<< HEAD

=======
			model.addAttribute("caravanList", caravanaservice.findAllCaravan());
>>>>>>> 3974f671298bdd2bfd4e1e99287a7f5af5bb1474
			model.addAttribute("caravana", caravana);

			return "caravan/paginaDePruebas";
		}
		System.out.println("ERRORS: " + result.getFieldErrors());
		return "caravan/gestionCaravanas";
	}
<<<<<<< HEAD

	@GetMapping("/pruebaMarcos")
	public String prueba(Model model) {

		model.addAttribute("caravana", new Caravan());
		

		return "caravan/trasladoCaravana";
	}

=======
	
	
>>>>>>> 3974f671298bdd2bfd4e1e99287a7f5af5bb1474
}
