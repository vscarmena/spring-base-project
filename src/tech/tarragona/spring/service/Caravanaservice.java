package tech.tarragona.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.tarragona.spring.model.Caravana;
import tech.tarragona.spring.repository.CaravanaRepository;

@Service
public class Caravanaservice {
	
	@Autowired
	CaravanaRepository caravanaRepository;

	public void seleccionarPersonas(int adults, int babys, int kids, Caravana caravana)
	{
		caravana.setAdults(adults);
		caravana.setBabys(babys);
		caravana.setKids(kids);
		
		caravanaRepository.save(caravana);
	}
	
}
