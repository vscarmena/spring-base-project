package tech.tarragona.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tech.tarragona.spring.service.PersonService;

@Controller
@RequestMapping("/listar")
public class PersonController { 
@Autowired
PersonService personService;

@GetMapping
public String listarPersons(Model model) {
	
	model.addAttribute("lista", personService.listAllPersons());
    return "persons";

}}
