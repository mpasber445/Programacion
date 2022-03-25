package Herencia4;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto[] productos = new Producto[3];
		productos[0] = new Producto("Producto 1",10);
		productos[1] = new Perecedero("Producto 2",10,2);
		productos[2] = new noPerecedero("Producto 3",10,"Tipo 1");
		
		System.out.println("El resutado de calcular el precio de 5 productos es: " + productos[0].calcular(5) + "€");
		System.out.println("El resultado de calcular el precio de 5 productos perecederos es: " + productos[1].calcular(5) + "€");
		System.out.println("El resultado de calcular el precio de 5 productos no perecederos es: " + productos[2].calcular(5) + "€");

		
		
		
		
	}

}
