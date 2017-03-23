package tech.tarragona.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("tech.tarragona")
@PropertySource("classpath:application.properties")
public class MainConfig {

}
