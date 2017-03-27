package tech.tarragona.spring.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.social.UserIdSource;
import org.springframework.social.config.annotation.ConnectionFactoryConfigurer;
import org.springframework.social.config.annotation.EnableSocial;
import org.springframework.social.config.annotation.SocialConfigurer;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.connect.jdbc.JdbcUsersConnectionRepository;
import org.springframework.social.connect.web.ProviderSignInController;
import org.springframework.social.facebook.connect.FacebookConnectionFactory;
import org.springframework.social.google.connect.GoogleConnectionFactory;
import org.springframework.social.security.AuthenticationNameUserIdSource;

import tech.tarragona.spring.service.SignInService;
import tech.tarragona.spring.service.SignUpService;

@Configuration
@EnableSocial
@PropertySource("classpath:social/social.properties")
public class SocialConfig implements SocialConfigurer {
	
	@Autowired
    private DataSource dataSource;
	
	@Autowired
	private SignUpService signUpService;

    @Override
    public void addConnectionFactories(ConnectionFactoryConfigurer connectionFactoryConfigurer, Environment environment) {
        
    	connectionFactoryConfigurer.addConnectionFactory(new FacebookConnectionFactory(
            environment.getProperty("spring.social.facebook.appId"),
            environment.getProperty("spring.social.facebook.appSecret")));
        
    	connectionFactoryConfigurer.addConnectionFactory(new GoogleConnectionFactory(
                environment.getProperty("spring.social.google.appId"),
                environment.getProperty("spring.social.google.appSecret")));
    }

    @Override
    public UserIdSource getUserIdSource() {
        return new AuthenticationNameUserIdSource();
    }

	@Override
	public UsersConnectionRepository getUsersConnectionRepository(ConnectionFactoryLocator connectionFactoryLocator) {
		JdbcUsersConnectionRepository repository = new JdbcUsersConnectionRepository(dataSource, connectionFactoryLocator, Encryptors.noOpText());
		repository.setConnectionSignUp(signUpService);
		return repository;
	}
	
	@Bean
	public ProviderSignInController providerSignInController(ConnectionFactoryLocator connectionFactoryLocator, UsersConnectionRepository usersConnectionRepository) {
		ProviderSignInController controller = new ProviderSignInController(connectionFactoryLocator, usersConnectionRepository, new SignInService());
		return controller;
	}

}