package tech.tarragona.spring.service;

<<<<<<< HEAD
=======
import java.util.List;

>>>>>>> feature/caravan-project
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tech.tarragona.spring.model.Camping;
import tech.tarragona.spring.repository.CampingRepository;

@Service
public class CampingService {
	
	@Autowired
<<<<<<< HEAD
	CampingRepository campingRepository;
	
	@Transactional
	public void addNewCamping(Camping camping) {
		campingRepository.save(camping);	
	}

}
=======
	CampingRepository campingRepository; 
	
	@Transactional
	public List <Camping> getCamping(){
	return campingRepository.findAll();
	}
}
>>>>>>> feature/caravan-project
