package Herencia2;

public abstract class  Poligono {

	protected int NumeroLados;

	

	@Override
	public String toString() {
		return "Numero de lados del poligono: " + NumeroLados;
	}
	
	public abstract double Area();
	
	
}
