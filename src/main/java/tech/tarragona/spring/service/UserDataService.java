package tech.tarragona.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
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
	@Autowired
	PasswordEncoder passwordEncoder;
	
	
	@Transactional
	public List <UserData> getUserData(){
		return userDataRepository.findAll();
	}
	
	@Transactional
	public void editUserInfo(User activeUser, UserData userData){
		User user = userRepository.findByUsername(activeUser.getUsername());
		user.getUserData().setName(userData.getName());
		user.getUserData().setAddress(userData.getAddress());
		user.getUserData().setNif(userData.getNif());
		user.getUserData().setEmail(userData.getEmail());
		user.getUserData().setSurname(userData.getSurname());
		user.getUserData().setBirthDate(userData.getBirthDate());
		user.getUserData().setTelephone(userData.getTelephone());
		user.getUserData().setCountry(userData.getCountry());
		user.getUserData().setCity(userData.getCity());
		user.getUserData().setCp(userData.getCp());
		user.getUserData().setGenre(userData.getGenre());
		userRepository.save(user);
		
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
	@Transactional
	public User findUserById(Integer id) {
		return userRepository.findById(id);
		
	}

	@Transactional
	public void editFacturationUserInfo(User activeUser, UserData userData) {
		User user = userRepository.findByUsername(activeUser.getUsername());
		user.getUserData().setNamef(userData.getNamef());
		user.getUserData().setAddressf(userData.getAddressf());
		user.getUserData().setNif(userData.getNif());
		user.getUserData().setEmailf(userData.getEmailf());		
		userRepository.save(user);
		
	}
	
	
	
}//
