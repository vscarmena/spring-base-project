package tech.tarragona.spring.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tech.tarragona.spring.model.Availability;
import tech.tarragona.spring.model.Caravan;
import tech.tarragona.spring.service.CampingService;
import tech.tarragona.spring.service.Caravanaservice;
import tech.tarragona.spring.validator.CaravanaValidator;

@Controller
@RequestMapping(value = "/caravana")
public class CaravanaController {

	private final static String PREFIX = "caravan/";
	private final static String CARAVAN = PREFIX + "gestionCaravanas";
	private final static String CALENDAR = PREFIX + "calendar";
	
	
	@Autowired
	Caravanaservice caravanaservice;

	@Autowired
	CaravanaValidator caravanaValidator;
	
	@Autowired
	CampingService campingService;

	@GetMapping("/add")
	public String addCaravana(Model model) {

		model.addAttribute("caravana", new Caravan());
		
		

		
		model.addAttribute("campings", campingService.getCamping());

		return CARAVAN;



		//return "5.7";
	}


	@PostMapping("/add")
	public String addCaravana(@Valid @ModelAttribute("caravana") Caravan caravana, Errors errors, BindingResult result, Model model){
		caravanaValidator.validate(caravana, errors);


		if (!result.hasErrors()){	

			caravanaservice.addCaravana(caravana);			


			model.addAttribute("caravanList", caravanaservice.findAllCaravan());

			model.addAttribute("caravana", caravana);

			return "caravan/paginaDePruebas";
		}
		System.out.println("ERRORS: " + result.getFieldErrors());
		return CARAVAN;
	}


	@GetMapping("/pruebaMarcos")
	public String prueba(Model model) {

		model.addAttribute("caravana", new Caravan());
		

		return "caravan/trasladoCaravana";
	}

	@GetMapping("/calendar/{id}")
	public String calendar(@PathVariable("id") Integer id, Model model) {
		
		model.addAttribute("availabilities", caravanaservice.findById(id).getAvailabilities());
		model.addAttribute("availability", new Availability());
		model.addAttribute("caravan", caravanaservice.findById(id));
		model.addAttribute("id", id);
		
		return CALENDAR;
	}
	
	@PostMapping("/calendar/{id}")
	public String calendar(@PathVariable("id") Integer id, @ModelAttribute("availability") Availability availability){
		
		ArrayList<Availability> availabilities = caravanaservice.findById(id).getAvailabilities();
		availability.setCaravan(caravanaservice.findById(id));
		
		availabilities.add(availability);
		caravanaservice.saveAllAvailabilities(availabilities);
		
		return CALENDAR;
	}
}
