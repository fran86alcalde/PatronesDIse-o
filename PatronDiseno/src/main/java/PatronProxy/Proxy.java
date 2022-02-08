package PatronProxy;

import com.example.PatronDiseno.Persona;

import lombok.Builder;



public class Proxy {
	
	
	private Persona persona;

	public Proxy(Persona persona, Persona usuario1) {
		super();
		this.persona = persona;
		this.usuario1 = usuario1;
	}

	Persona usuario1=new Persona("pedro",25);
	


	public void operacion() {

		System.out.println("antes de ");
		persona.operacion();
		System.out.println(" despues ");
		
	}
	
}
