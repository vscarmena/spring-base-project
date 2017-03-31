package tech.tarragona.spring.validator;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		} else if (Caravan.getConstructionYear() < 1978) {
			errors.rejectValue("constructionYear", "constructionYear.OutOfRangeMin");
		} else if (Caravan.getConstructionYear() > Calendar.getInstance().get(Calendar.YEAR)) {
			errors.rejectValue("constructionYear", "constructionYear.OutOfRangeMax");
		} else if (Caravan.getConstructionYear().toString() == "") {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "constructionYear",
					"constructionYear.NotEmptyOrWhitespace");
		}

		// Pattern p = Pattern.compile("1");
		// Matcher m = p.matcher(Caravan.getModel());
		// boolean specialChar = m.matches();

		// boolean b = Pattern.matches("~@#\\$%\\^&\\*:;<>\\.,/}\\{\\+",
		// Caravan.getModel());

		// Model: @NotNull@NotEmpty@Length(min = 5)@Size(max = 15)@NotBlank
		if (Caravan.getModel() == null || Caravan.getModel() == "") {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "model", "model.NotEmptyOrWhitespace");
		} else if (Caravan.getModel().contains("  ")) {
			errors.rejectValue("model", "model.notWithSpace");
		} else if (Caravan.getModel().length() < 5) {
			errors.rejectValue("model", "model.MinChars");
		} else if (Caravan.getModel().length() > 15) {
			errors.rejectValue("model", "model.MaxChars");
		}
		// else if (specialChar == true) {
		// errors.rejectValue("model", "model.invalidChars");

		// Brand: @NotNull@NotEmpty@Length(min = 5)@Size(max = 15)
		if (Caravan.getBrand() == null || Caravan.getBrand() == "") {
			// errors.rejectValue("brand", "brand.NotEmptyOrWhitespace");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "brand", "brand.NotEmptyOrWhitespace");
		} else if (Caravan.getBrand().contains("  ")) {
			errors.rejectValue("brand", "brand.notWithSpace");
		} else if (Caravan.getBrand().length() < 5) {
			errors.rejectValue("brand", "brand.MinChars");
		} else if (Caravan.getBrand().length() > 15) {
			errors.rejectValue("brand", "brand.MaxChars");
		}
		// Name: @NotEmpty@Length(min = 5)@Size(max = 50)
		if (Caravan.getName() == "") {
			// errors.rejectValue("name", "name.NotEmptyOrWhitespace");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.NotEmptyOrWhitespace");
		} else if (Caravan.getName().contains("  ")) {
			errors.rejectValue("name", "name.notWithSpace");
		} else if (Caravan.getName().length() < 5) {
			errors.rejectValue("name", "name.MinChars");
		} else if (Caravan.getName().length() > 50) {
			errors.rejectValue("name", "name.MaxChars");
		}
		if (Caravan.getInfTransAdress() == "") {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "infTransAdress", "infTransAdress.NotEmptyOrWhitespace");
		} else if (Caravan.getInfTransAdress().contains("  ")) {
			errors.rejectValue("infTransAdress", "infTransAdress.notWithSpace");
		} else if (Caravan.getInfTransAdress().length() < 5) {
			errors.rejectValue("infTransAdress", "infTransAdress.MinChars");
		} else if (Caravan.getInfTransAdress().length() > 50) {
			errors.rejectValue("infTransAdress", "infTransAdress.MaxChars");
		}

		if (Caravan.getInfTransContact() == "") {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "infTransContact",
					"infTransContact.NotEmptyOrWhitespace");
		} else if (Caravan.getInfTransContact().contains("  ")) {
			errors.rejectValue("infTransContact", "infTransContact.notWithSpace");
		} else if (Caravan.getInfTransContact().length() < 5) {
			errors.rejectValue("infTransContact", "infTransContact.MinChars");
		} else if (Caravan.getInfTransContact().length() > 50) {
			errors.rejectValue("infTransContact", "infTransContact.MaxChars");
		}

		if (Caravan.getInfTransEmail() == "") {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "infTransEmail", "infTransEmail.NotEmptyOrWhitespace");
		} else if (Caravan.getInfTransEmail().length() < 6) {
			errors.rejectValue("infTransEmail", "infTransEmail.infTransEmail.MinChars");
		} else if (Caravan.getInfTransEmail().length() > 30) {
			errors.rejectValue("infTransEmail", "infTransEmail.MaxChars");
		}
		if (Caravan.getInfTransName() == "") {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "infTransName", "infTransName.NotEmptyOrWhitespace");
		} else if (Caravan.getInfTransName().contains("  ")) {
			errors.rejectValue("infTransName", "infTransName.notWithSpace");
		} else if (Caravan.getInfTransName().length() < 3) {
			errors.rejectValue("infTransName", "infTransName.MinChars");
		} else if (Caravan.getInfTransName().length() > 20) {
			errors.rejectValue("infTransName", "infTransName.MaxChars");
		}
		if (Caravan.getInfTransTelephone() == null) {
			errors.rejectValue("infTransTelephone", "infTransTelephone.NotEmptyOrWhitespace");
		} else if (Caravan.getInfTransTelephone().toString().length() < 9) {
			errors.rejectValue("infTransTelephone", "infTransTelephone.MinChars");
		} else if (Caravan.getInfTransTelephone().toString().length() > 12) {
			errors.rejectValue("infTransTelephone", "infTransTelephone.MaxChars");
		} else if (Caravan.getInfTransTelephone().toString() == "") {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "infTransTelephone",
					"infTransTelephone.NotEmptyOrWhitespace");
		}
	}

}
