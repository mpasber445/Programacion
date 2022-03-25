package POO4;

import java.util.Scanner;

public class main {

	 static int hola;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hola=2;
		Scanner sn = new Scanner(System.in);
		
		Libro libro1 = new Libro("El quijote", "Cervantes", 1,0);
		Libro libro2 = new Libro();
		System.out.println("Introduce el Titulo del segundo libro");
		libro2.setTitulo(sn.nextLine());
		System.out.println("Introduce el Autor del segundo libro");
		libro2.setAutor(sn.nextLine());
		System.out.println("Introduce la cantidad de ejemplares que tiene el libro");
		libro2.setEjemplares(sn.nextInt());
		System.out.println("Introduce la cantidad de ejemplares prestaods que tiene el segundo libro");
		libro2.setEjemplares_prestados(sn.nextInt());
		
		libro1.mostrarDatos();
		
		libro1.prestamo();
		libro1.devolucion();
		libro1.prestamo();
		libro1.prestamo();
		
		libro1.mostrarDatos();
		libro2.mostrarDatos();
		
		sn.close();
	}

}
