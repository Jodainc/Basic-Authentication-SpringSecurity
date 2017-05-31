package com.dajo.configuration;
/**
 * Created by LordKotan on 31/05/2017... RESTApiBasicAuthentication
 */
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.dajo")
public class HelloWorldConfiguration {
	

}