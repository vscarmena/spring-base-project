package tech.tarragona.spring.service;

import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.InputStreamSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
public class EmailService {
	
	@Autowired
	TemplateEngine emailTemplateEngine;
	
	@Autowired
	JavaMailSender mailSender;
	
	public void sendTestMail(final String recipientName, final String recipientEmail, final String imageResourceName,
		  final byte[] imageBytes, final String imageContentType, final Locale locale)
		  throws MessagingException {
		
		final Context ctx = new Context(locale);
		ctx.setVariable("name", "Cesar");
		ctx.setVariable("subscriptionDate", new Date());
		ctx.setVariable("hobbies", Arrays.asList("Cinema", "Sports", "Music"));
//		ctx.setVariable("imageResourceName", ); // so that we can reference it from HTML

		final String htmlContent = emailTemplateEngine.process("html/email-inlineimage", ctx);
		
		// Prepare message using a Spring helper
	    final MimeMessage mimeMessage = mailSender.createMimeMessage();
	    final MimeMessageHelper message =
	        new MimeMessageHelper(mimeMessage, true, "UTF-8"); // true = multipart
	    message.setSubject("Example HTML email with inline image");
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

}
