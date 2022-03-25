package Herencia1;

public class Directivo extends Empleado {

	public Directivo(String string) {
		super(string);
	}

	@Override
	public String toString() {
		return super.toString() + " -> Directivo";
	}
	
}
