package tech.tarragona.spring.service;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionKey;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.google.api.Google;
import org.springframework.stereotype.Service;

import tech.tarragona.spring.model.Authority;
import tech.tarragona.spring.model.User;
import tech.tarragona.spring.model.UserAuthority;
import tech.tarragona.spring.model.UserData;
import tech.tarragona.spring.repository.AuthorityRepository;
import tech.tarragona.spring.repository.UserRepository;

@Service
public class SignUpService implements ConnectionSignUp{
	
	@Autowired
    private UserRepository userRepository;
	
	@Autowired
    private AuthorityRepository authorityRepository;
 
    @Override
    public String execute(Connection<?> connection) {
    	System.out.println("signup === ");
    	ConnectionKey key = connection.getKey();
        System.out.println("key= (" + key.getProviderId() + "," + key.getProviderUserId() + ")");
        
        String username = "";
        //String email = "";
   	 	String name = "";
   	 	String lastname = "";
        
        if (connection.getApi() instanceof Google) {
        	UserProfile userProfile = connection.fetchUserProfile();
        	name = userProfile.getFirstName();
        	username = userProfile.getName();
        	lastname = userProfile.getLastName(); 
        	//email = userProfile.getEmail(); 
        }
        /*BUG http://stackoverflow.com/questions/39890885/error-message-is-12-bio-field-is-deprecated-for-versions-v2-8-and-higher */
        else if (connection.getApi() instanceof Facebook) {
        	name = connection.getDisplayName();
        	username = connection.getDisplayName();
       	 	lastname = "#";
       	 	//email = "#";
        }
        
        /*TODO: Revisar insert en tablas relacionadas ROLES / USERDATA */
        UserData userData = new UserData();
        userData.setName(name);
        userData.setLastname(lastname);
        User user = new User(username, randomAlphabetic(8), Arrays.asList(new SimpleGrantedAuthority("ROLE_USER")), userData);
        userData.setUser(user);
        UserAuthority userAuthority = new UserAuthority(getUserAuthority(), user);
        user.setUserAuthorities(new ArrayList<UserAuthority>());
        user.addUserAuthority(userAuthority);
        userRepository.save(user);
        return username;
    }
    
    public Authority getUserAuthority(){
    	return authorityRepository.findByName("ROLE_USER");
    }
}
