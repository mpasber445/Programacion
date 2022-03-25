package Herencia2;

public class Rectangulo extends Poligono {

	private double lado1;
	private double lado2;
	
	
	
	
	public Rectangulo(double lado1, double lado2) {
		NumeroLados = 2;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Area: " + Area();
	}
	
	public double Area() {
		
		return this.lado1*this.lado2;
		
	}
	
}
