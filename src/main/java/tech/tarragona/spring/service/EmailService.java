package tech.tarragona.spring.service;

import java.util.Date;
import java.util.Locale;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import tech.tarragona.spring.model.User;

@Service
public class EmailService {

	@Autowired
	TemplateEngine emailTemplateEngine;

	@Autowired
	JavaMailSender mailSender;
	
	@Autowired
	ResourceBundleMessageSource emailMessageSource;

	public void sendConfirmationMail(User user, Locale locale)
			throws MessagingException {

		final Context ctx = new Context(locale);
//		ctx.setVariable("name", user.getUserData().getName()); //Si en "registro" se envía nombre.
		ctx.setVariable("subscriptionDate", new Date());
		/* TODO: Cuidado URL absoluta */
		String url = "http://localhost:8080/spring-base-project/hello/"+user.getSecurityCode();
		ctx.setVariable("url", url);

		final String htmlContent = emailTemplateEngine.process("html/registration-mail", ctx);

		final MimeMessage mimeMessage = mailSender.createMimeMessage();
		final MimeMessageHelper message = new MimeMessageHelper(mimeMessage, true, "UTF-8");
		message.setSubject(emailMessageSource.getMessage("ForEmail.subject", null, locale));
		message.setFrom("caravaning.tgn@gmail.com");
		message.setTo(user.getUsername());
		message.setText(htmlContent, true);
		// Send mail

		mailSender.send(mimeMessage);
	}
	

	public void sendChangedPassMail(String email, Locale locale) throws MessagingException {
		
		final Context ctx = new Context(locale);
		ctx.setVariable("subscriptionDate", new Date());
				
		final String htmlContent = emailTemplateEngine.process("html/changed-pass-mail", ctx);
		
		final MimeMessage mimeMessage = mailSender.createMimeMessage();
		final MimeMessageHelper message =
				new MimeMessageHelper(mimeMessage, true, "UTF-8");
		message.setSubject("Caravaning: Se ha modificado su contraseña");
		message.setFrom("caravaning.tgn@gmail.com");
		message.setTo(email);

		message.setText(htmlContent, true);

		mailSender.send(mimeMessage);
		
	}
	
}
