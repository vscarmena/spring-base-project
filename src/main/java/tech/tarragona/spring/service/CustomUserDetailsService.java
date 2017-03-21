package tech.tarragona.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import tech.tarragona.spring.model.User;
import tech.tarragona.spring.model.UserAuthority;
import tech.tarragona.spring.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{
	
	private static Logger logger = LoggerFactory.getLogger(UserDetailsService.class);
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user != null){
        	logger.debug("LOGIN : " + user.getUsername());
            return new User(user.getUsername(), user.getPassword(), getGrantedAuthorities(user.getUserAuthorities()), user.getUserData());
        }
        throw new UsernameNotFoundException("USER NOT FOUND");
	}
	
	private List<GrantedAuthority> getGrantedAuthorities(List<UserAuthority> userAuthorities) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (UserAuthority userAuthority : userAuthorities) {
            authorities.add(new SimpleGrantedAuthority(userAuthority.getAuthority().getName()));
        }
        return authorities;
    }

}
