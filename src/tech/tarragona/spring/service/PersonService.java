package tech.tarragona.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.tarragona.spring.model.Person;
import tech.tarragona.spring.repository.PersonRepository;

@Service
public class PersonService {
	@Autowired
	PersonRepository personRepository;
	
	public List<Person> listAllPersons(){
		
		List<Person> lista = personRepository.findAll();
		
		return lista;
				
	}
	 
	
	
}
