package tech.tarragona.spring.helper;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.crypto.password.PasswordEncoder;
import tech.tarragona.spring.model.User;
import tech.tarragona.spring.repository.UserRepository;

@Component
public class UserHelper {
	
@Autowired
UserRepository userRepository;

	@Transactional
	public String generateAndSaveSecurityCode() {
		String securityCode = UUID.randomUUID().toString();
		return securityCode;
	}	
	
	

}
