package Herencia1;

public class Operario extends Empleado {

	public Operario(String string) {
		super(string);
	}
	
	@Override
	public String toString() {
		return super.toString() + " -> Operario";
	}

	
	
}
