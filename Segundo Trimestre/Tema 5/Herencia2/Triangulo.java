package Herencia2;


public class Triangulo extends Poligono {

	
	private double lado1;
	private double lado2;
	private double lado3;
	
	
	
	public Triangulo(double lado1, double lado2, double lado3) {
		NumeroLados = 3;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Area: " + Area();
	}
	
	public double Area() {
		
		double sp = (lado1 + lado2 + lado3)/2;
		return  (sp*(sp-lado1) * (sp-lado2) * (sp-lado3));
	}
	
	
}
