package Herencia1;

public class Oficial extends Operario {

	
	public Oficial(String string) {
		super(string);
	}

	@Override
	public String toString() {
		return super.toString() + " -> Oficial";
	}
	
}
