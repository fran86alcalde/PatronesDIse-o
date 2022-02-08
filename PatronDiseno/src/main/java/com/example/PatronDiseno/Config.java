package com.example.PatronDiseno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
	
	@Bean(name="personaPrototype")
	@Scope("prototype")
	public Persona personaPrototype() {

		return new Persona("carlos",38);
	}
	

	@Bean(name="personaSingleton")
	@Scope("singleton")
	public Persona personaSingleton() {

		return new Persona("tomas",12);
	}
}
