package tech.tarragona.spring.validator;

import java.util.Calendar;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import tech.tarragona.spring.model.Caravan;

@Component
public class CaravanaValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Caravan.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		Caravan Caravan = (Caravan) object;

		
		
		
		if (Caravan.getConstructionYear() == null) {
			errors.rejectValue("constructionYear", "constructionYear.NotEmptyOrWhitespace");
			
			} else if (Caravan.getConstructionYear() < 1931) {
				errors.rejectValue("constructionYear", "constructionYear.OutOfRangeMin");
			} else if (Caravan.getConstructionYear() > Calendar.getInstance().get(Calendar.YEAR)) {
				errors.rejectValue("constructionYear", "constructionYear.OutOfRangeMax");
			} else if (Caravan.getConstructionYear().toString() == "") {
				ValidationUtils.rejectIfEmptyOrWhitespace(errors, "constructionYear", "constructionYear.NotEmptyOrWhitespace");
			}
	}
}
