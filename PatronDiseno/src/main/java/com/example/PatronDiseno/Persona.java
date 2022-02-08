package com.example.PatronDiseno;

import PatronDecorator.IPersona;
import PatronProxy.PersonProxy;

public class Persona implements Iprototype, IPersona, PersonProxy {
	
	private String nombre;
	private int edad;
		

	@Override
	public Persona clonar() {
		return new Persona(this.nombre,this.edad);
	}

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public static class PersonaBuilder{
		
		private String nombre;
		private int edad;
		
		public PersonaBuilder nombre(String nombre) {
			this.nombre=nombre;
			return this;
		}
		
		public PersonaBuilder edad(int edad) {
			this.edad=edad;
			return this;
		}
		
		public Persona build() {
			return new Persona(this.nombre,this.edad);
		}
		
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static PersonaBuilder builder() {
		return new PersonaBuilder();
	}

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getedad() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void operacion() {
		System.out.println("operacion antes");
	}

	public void setPersona(Persona build) {
		// TODO Auto-generated method stub
		
	}	
	

}
