package tech.tarragona.spring.service;

import java.util.Date;
import java.util.Locale;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
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

	public void sendConfirmationMail(User user, Locale locale)
			throws MessagingException {

		final Context ctx = new Context(locale);
//		ctx.setVariable("name", user.getUserData().getName()); //Si en "registro" se envía nombre.
		ctx.setVariable("subscriptionDate", new Date());
		String url = "http://localhost:8080/spring-base-project/hello/"+user.getSecurityCode();
		ctx.setVariable("url", url);

		final String htmlContent = emailTemplateEngine.process("html/registration-mail", ctx);

		// Prepare message using a Spring helper
		final MimeMessage mimeMessage = mailSender.createMimeMessage();
		final MimeMessageHelper message =
				new MimeMessageHelper(mimeMessage, true, "UTF-8");
		message.setSubject("Registro Caravaning: Necesaria confirmación de email");
		message.setFrom("caravaning.tgn@gmail.com");
		message.setTo(user.getUsername());

		// Create the HTML body using Thymeleaf
		message.setText(htmlContent, true);
		// Send mail

		mailSender.send(mimeMessage);

	}
/*
	public void sendTestMail(final String recipientName, final String recipientEmail, final String imageResourceName,
			final byte[] imageBytes, final String imageContentType, final Locale locale)
					throws MessagingException {

		final Context ctx = new Context(locale);
		ctx.setVariable("name", "Pollo");
		ctx.setVariable("subscriptionDate", new Date());

		//		ctx.setVariable("imageResourceName", ); // so that we can reference it from HTML

		final String htmlContent = emailTemplateEngine.process("html/registration-mail", ctx);

		// Prepare message using a Spring helper
		final MimeMessage mimeMessage = mailSender.createMimeMessage();
		final MimeMessageHelper message =
				new MimeMessageHelper(mimeMessage, true, "UTF-8"); // true = multipart
		message.setSubject("Caravaning: Necesaria confirmación de email");
		message.setFrom("caravaning.tgn@gmail.com");
		message.setTo(recipientEmail);

		// Create the HTML body using Thymeleaf
		message.setText(htmlContent, true); // true = isHtml

		// Add the inline image, referenced from the HTML code as "cid:${imageResourceName}"
		//	    final InputStreamSource imageSource = new ByteArrayResource(imageBytes);
		//	    message.addInline(imageResourceName, imageSource, imageContentType);

		// Send mail
		mailSender.send(mimeMessage);

	}
*/

	
	
}
