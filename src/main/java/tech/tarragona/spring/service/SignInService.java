package tech.tarragona.spring.service;

import java.util.Arrays;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.web.SignInAdapter;
import org.springframework.web.context.request.NativeWebRequest;

import tech.tarragona.spring.type.Role;

public final class SignInService implements SignInAdapter {
	
	public String signIn(String userId, Connection<?> connection, NativeWebRequest request) {
		SecurityContextHolder.getContext().setAuthentication(new UsernamePasswordAuthenticationToken(userId, null, Arrays.asList(new SimpleGrantedAuthority(Role.USER.getValue()))));	
		return null;
	}

}
