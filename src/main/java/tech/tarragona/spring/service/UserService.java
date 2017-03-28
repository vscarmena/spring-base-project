package tech.tarragona.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

import tech.tarragona.spring.helper.UserHelper;
import tech.tarragona.spring.model.User;
import tech.tarragona.spring.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserHelper userHelper;
	
	@Autowired
	PasswordEncoder passwordEncoder;

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
	@Transactional
	public boolean userAlreadyExists(User user, BindingResult result) {
		if (userRepository.findByUsername(user.getUsername())!=null){
			return true;
		}else{
			return false;
		}
	}
	@Transactional
	public void addNewUser(User user) {
		String passwordEncode = passwordEncoder.encode(user.getPassword());
		user.setPassword(passwordEncode);
		user.setSecurityCode(userHelper.generateAndSaveSecurityCode());
		userRepository.save(user);
	}
	public User findUserByUsername(String username) {
		return userRepository.findByUsername(username);
	}
	
}

