package tech.tarragona.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

import tech.tarragona.spring.model.Availability;
import tech.tarragona.spring.model.Caravan;
import tech.tarragona.spring.repository.AvailabilityRepository;
import tech.tarragona.spring.repository.CaravanaRepository;

@Service
public class Caravanaservice {

	@Autowired
	CaravanaRepository caravanaRepository;
	
	@Autowired
	AvailabilityRepository availabilityRepository;
	
	@Transactional
	public boolean caravanaAlreadyExists(Caravan caravana,BindingResult result){
		if(caravanaRepository.findById(caravana.getId())==null){
			return false;			
		}else{
			result.rejectValue("Id", "caravanaAlreadyExists");
			return true;
		}
	}
	@Transactional
	public Caravan addCaravana(Caravan caravana){

		 return caravanaRepository.save(caravana);
	}
	@Transactional
	public Caravan findById(Integer id){
		Caravan caravan = caravanaRepository.findById(id);
		
		return caravan;
	}
	
	@Transactional
	public List<Caravan> findAllCaravan(){
		List<Caravan> caravanList = caravanaRepository.findAll();
		
		return caravanList;
	}
	
	@Transactional
	public void saveAllAvailabilities(ArrayList<Availability> availabilities){
		availabilityRepository.save(availabilities);
	}

		
}
