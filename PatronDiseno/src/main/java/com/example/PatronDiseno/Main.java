package com.example.PatronDiseno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import CadenaResponsabilidad.Unidad;
import PatronDecorator.Decorator;

@SpringBootApplication
public class Main implements CommandLineRunner {

	@Autowired
	private ApplicationContext context;
	
	
	
	public static void main(String[] args) {	
		SpringApplication.run(Main.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

        /* Persona tipo1=new Persona("pedro",25);
		
		Persona tipo2=tipo1.clonar();
		
		System.out.println(tipo1.hashCode());
		
		System.out.println(tipo2.hashCode());
		
		Persona tipo3 = Persona.builder().edad(45).nombre("Alfonso").build();
		
		System.out.println(tipo3.hashCode()); */
		
		 /* System.out.println(context.getBean("personPrototype").hashCode());
		System.out.println(context.getBean("personPrototype").hashCode());
		System.out.println(context.getBean("personPrototype").hashCode());
		System.out.println(context.getBean("personPrototype").hashCode());

		System.out.println(context.getBean("personSingleton").hashCode());
		System.out.println(context.getBean("personSingleton").hashCode());
		System.out.println(context.getBean("personSingleton").hashCode());
		System.out.println(context.getBean("personSingleton").hashCode()); */
		
		/* Decorator dec=new Decorator();
		dec.setPersona(Persona.builder().edad(29).nombre("manuel").build());
		
		System.out.println(dec.getedad());
		
		Persona persona=new Persona(null, 0);
		persona.setPersona(Persona.builder().edad(29).nombre("manuel").build());
		
		Proxy persona=new Proxy(new Persona("ignacio", 17));
		
		persona.operacion(); */
		
	
		Unidad soldado=Unidad.builder().nombre("soldado").build();
		
		Unidad sargento=Unidad.builder().nombre("sargento").subordinado(soldado).build();
		
		Unidad capitan=Unidad.builder().nombre("capitan").subordinado(sargento).build();
		
		sargento.ejecutaOrden();
	
		
	}

}
