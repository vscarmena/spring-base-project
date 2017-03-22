package tech.tarragona.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tech.tarragona.spring.model.Item;
import tech.tarragona.spring.service.ItemService;

@Controller
@RequestMapping("/items")
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	@GetMapping
	public String getItems(Model model) {
		model.addAttribute("items", itemService.getAllItems());
		return "items";
	}
	
	@GetMapping("/add")
	public String addItem(Model model) {
		model.addAttribute("item", new Item());
		return "addItem";
	}
	
	@PostMapping("/add")
	public String saveItem(@Valid Item item, BindingResult result, Model model) {
		return "addItem";
	}

}
