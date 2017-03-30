package tech.tarragona.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tech.tarragona.spring.model.User;
import tech.tarragona.spring.model.UserFacturationData;
import tech.tarragona.spring.repository.UserFacturationDataRepository;
import tech.tarragona.spring.repository.UserRepository;

@Service
public class UserFacturationDataService {
	
	@Autowired
	UserFacturationDataRepository userFacturationDataRepository;
	@Autowired
	UserRepository userRepository;

	@Transactional
	public void editFacturationUserInfo(User activeUser, UserFacturationData userFacturationData) {
		User user = userRepository.findOne(activeUser.getId());
		userFacturationData.setUser(user);
		user.setUserFacturationData(userFacturationData);
		userRepository.save(user);
	}
	
	
	
}
