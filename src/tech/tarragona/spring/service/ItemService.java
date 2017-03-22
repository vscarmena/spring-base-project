package tech.tarragona.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.tarragona.spring.model.Item;
import tech.tarragona.spring.repository.ItemRepository;

@Service
public class ItemService {

	@Autowired
	ItemRepository itemRepository;
	
	public List<Item> getAllItems() {
		return itemRepository.findAll();
	}

}
