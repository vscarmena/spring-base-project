package tech.tarragona.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tech.tarragona.spring.model.UserData;
import tech.tarragona.spring.repository.UserDataRepository;

@Service
public class UserDataService {
	@Autowired
	UserDataRepository userDataRepository;
	@Transactional
	public List <UserData> getUserData(){
		return userDataRepository.findAll();
	}
}//
