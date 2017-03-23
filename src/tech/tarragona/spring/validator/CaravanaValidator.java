package tech.tarragona.spring.validator;

import java.util.Calendar;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import tech.tarragona.spring.model.Caravana;

@Component
public class CaravanaValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Caravana.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		Caravana caravana = (Caravana) object;

		
		
		
		if (caravana.getConstructionYear() == null) {
			errors.rejectValue("constructionYear", "constructionYear.NotEmptyOrWhitespace");
			
			} else if (caravana.getConstructionYear() < 1931) {
				errors.rejectValue("constructionYear", "constructionYear.OutOfRangeMin");
			} else if (caravana.getConstructionYear() > Calendar.getInstance().get(Calendar.YEAR)) {
				errors.rejectValue("constructionYear", "constructionYear.OutOfRangeMax");
			} else if (caravana.getConstructionYear().toString() == "") {
				ValidationUtils.rejectIfEmptyOrWhitespace(errors, "constructionYear", "constructionYear.NotEmptyOrWhitespace");
			}
	}
}
