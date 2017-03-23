package tech.tarragona.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.social.security.SocialUserDetailsService;
import org.springframework.social.security.SpringSocialConfigurer;

import tech.tarragona.spring.service.CustomUserDetailsService;
import tech.tarragona.spring.service.SimpleSocialUsersDetailService;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	CustomUserDetailsService customUserDetailsService;
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
		http
			.csrf().disable()
			.authorizeRequests()
            	.antMatchers(
                    "/auth/**",
                    "/login",
                    "/signup/**",
                    "/signin/**",
                    "/user/register/**"
            		).permitAll()
            	.anyRequest().authenticated()
            	.and()
			.formLogin()
        		.loginPage("/login")
        		.failureUrl("/login-error")
        		.permitAll()
        		.and()
        	.logout()
        		.logoutSuccessUrl("/login")
        		.permitAll()
        		.and()
            .apply(new SpringSocialConfigurer()
            	.postLoginUrl("/")
            	.alwaysUsePostLoginUrl(true));
		http
			.exceptionHandling()
			.accessDeniedPage("/403");
    }
	
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
        	.userDetailsService(customUserDetailsService);
    }

    @Bean
    public SocialUserDetailsService socialUserDetailsService() {
        return new SimpleSocialUsersDetailService(customUserDetailsService);
    }
 
}