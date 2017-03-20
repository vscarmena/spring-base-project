package tech.tarragona.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

import tech.tarragona.spring.model.Caravana;
import tech.tarragona.spring.repository.CaravanaRepository;

@Service
public class Caravanaservice {
	@Autowired
	CaravanaRepository caravanaRepository;
	@Transactional
	public boolean caravanaAlreadyExists(Caravana caravana,BindingResult result){
		if(caravanaRepository.findByPlate(caravana.getPlate())==null){
			return false;			
		}else{
			result.rejectValue("plate", "caravanaAlreadyExists");
			return true;
		}
	}
	@Transactional
	public Caravana addCaravana(Caravana caravana){
		
	
		 return caravanaRepository.save(caravana);
	}

}
