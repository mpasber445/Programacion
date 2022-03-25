package Herencia1;

public class Tecnico extends Operario {


	
	public Tecnico(String string) {
		super(string);
	}

	@Override
	public String toString() {
		return super.toString() + " -> Tecnico";
	}
	
}
