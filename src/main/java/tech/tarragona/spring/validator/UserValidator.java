package tech.tarragona.spring.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import tech.tarragona.spring.model.User;

@Component
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors error) {
		User user = (User) object;

		if(user.getPassword().equals(user.getUsername())) {
			error.rejectValue("password", "error.passwordDifferent");
		}

	}

}
