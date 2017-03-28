package tech.tarragona.spring.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

import tech.tarragona.spring.model.User;
import tech.tarragona.spring.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

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
			result.rejectValue("username", "error.emailAlreadyExists");
			return true;
		}else{
			
			return false;
		}
	}
	@Transactional
	public void addNewUser(User user) {
		/*TODO: Before save user do passwordEncoder.encode('<password>')*/
		userRepository.save(user);	
	}
	@Transactional
	public void generateAndSaveSecurityCode(Integer id) {
		String securityCode = UUID.randomUUID().toString();
		User user = userRepository.findById(id);
		user.setSecurityCode(securityCode);
		String passwordEncode = passwordEncoder.encode(user.getPassword());
		user.setPassword(passwordEncode);
		userRepository.save(user);
		
	}	
}

