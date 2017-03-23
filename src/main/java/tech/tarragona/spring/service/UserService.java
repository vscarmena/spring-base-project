package tech.tarragona.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tech.tarragona.spring.model.User;
import tech.tarragona.spring.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	@Transactional
	public List <User> getUserData(){
		return userRepository.findAll();
	}
	@Transactional
	public void updateSecurityCode(String code) {
		User user = new User();
		user.setSecurityCode(code);
		userRepository.save(user);
	}
	
	@Transactional
	public boolean findBySecurityCodeAndSetEnabled(String code) {
		if (userRepository.findBySecurityCode(code)!=null){
			User user = userRepository.findBySecurityCode(code);
			user.setEnabled(true);
			return true;
		}else{
			return false;
		}		
	}
}

