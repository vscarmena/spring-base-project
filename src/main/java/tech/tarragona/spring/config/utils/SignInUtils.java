package tech.tarragona.spring.config.utils;

import java.util.Arrays;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

public class SignInUtils {
	
	public static void signIn(String userId) {
		SecurityContextHolder.getContext().setAuthentication(new UsernamePasswordAuthenticationToken(userId, null, Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"))));	
	}

}
