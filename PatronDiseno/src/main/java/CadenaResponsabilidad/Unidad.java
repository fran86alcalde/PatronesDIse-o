package CadenaResponsabilidad;

import lombok.Builder;

@Builder
public class Unidad {

	private String nombre;
	private Unidad subordinado;
	
	public void ejecutaOrden() {
		
		if (subordinado!=null) {
			
			System.out.println("si");
		}
		System.out.println("no");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Unidad getSubordinado() {
		return subordinado;
	}

	public void setSubordinado(Unidad subordinado) {
		this.subordinado = subordinado;
	}
}
