package tech.tarragona.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

import tech.tarragona.spring.model.Caravan;
import tech.tarragona.spring.repository.CaravanaRepository;

@Service
public class Caravanaservice {

	@Autowired
	CaravanaRepository caravanaRepository;
	
	@Transactional
	public boolean caravanaAlreadyExists(Caravan caravana,BindingResult result){
		if(caravanaRepository.findById(caravana.getId())==null){
			return false;			
		}else{
			result.rejectValue("plate", "caravanaAlreadyExists");
			return true;
		}
	}
	@Transactional
	public Caravan addCaravana(Caravan caravana){

		 return caravanaRepository.save(caravana);
	}
		
		
	}
