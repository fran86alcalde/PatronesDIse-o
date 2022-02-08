package PatronDecorator;

import com.example.PatronDiseno.Persona;

import lombok.Builder;

public class Decorator implements IPersona {

	
	private Persona persona;
	
	public void setPersona(Persona persona) {
		this.persona=persona;
	}
	

	@Override
	public int getedad() {
		// TODO Auto-generated method stub
		return 15;
	}

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return null;
	}
}
