package tech.tarragona.spring.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

import tech.tarragona.spring.model.User;
import tech.tarragona.spring.model.UserData;
import tech.tarragona.spring.repository.UserDataRepository;
import tech.tarragona.spring.repository.UserRepository;

@Service
public class UserDataService {
	@Autowired
	UserDataRepository userDataRepository;
	@Autowired
	UserRepository userRepository;
	
	
	@Transactional
	public List <UserData> getUserData(){
		return userDataRepository.findAll();
	}
	
	@Transactional
	public void addNewUser(UserData user){
		userDataRepository.save(user);
		
	}
	
	@Transactional
	public boolean userAlreadyExists(UserData userData, BindingResult result){
		
		if (userDataRepository.findByEmail(userData.getEmail())==null){
			return false;
			
		}else{
			//result.rejectValue("email", "userAlreadyExists");
			return true;
		}
	}

	public User findUserById(Integer id) {
		return userRepository.findById(id);
		
	}
	
	public void generateAndSaveSecurityCode(Integer id){
		String securityCode = UUID.randomUUID().toString();
		User user = (userDataRepository.findById(id)).getUser();
		user.setSecurityCode(securityCode);
		userRepository.save(user);
	}
	
	
}//