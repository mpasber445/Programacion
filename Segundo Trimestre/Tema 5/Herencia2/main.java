package Herencia2;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	static ArrayList<Poligono> array = new ArrayList<Poligono>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		llenarPoligono();
	}

	public static void llenarPoligono() {
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		while (salir == false) {
			System.out.println("");
			System.out.println("1. Introducir triangulos");
			System.out.println("2. Introducir rectangulos");
			System.out.println("3. Mostrar array");
			System.out.println("4. Salir");
			int opcion = sn.nextInt();
			switch (opcion) {
			case 1: {
				llenarTriangulos();
				break;
			}
			case 2: {
				llenarRectangulos();
				break;
			}
			case 3: {
				mostrarResultados();
				break;

			}
			case 4:{
				salir = true;
				break;
			}
			default:
				System.out.println("Has seleccionado una opcion erronea");
			}
		}

	}

	public static void llenarTriangulos() {
		Scanner sn = new Scanner(System.in);
		System.out.println("Introduce el primer lado");
		int lado1 = sn.nextInt();
		System.out.println("Introduce el segundo lado");
		int lado2 = sn.nextInt();
		System.out.println("Introduce el tercer lado");
		int lado3 = sn.nextInt();
		String a = "a";
		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
		array.add(triangulo);

	}

	public static void llenarRectangulos() {
		Scanner sn = new Scanner(System.in);
		System.out.println("Introduce el primer lado");
		int lado1 = sn.nextInt();
		System.out.println("Introduce el segundo lado");
		int lado2 = sn.nextInt();

		Rectangulo rectangulo = new Rectangulo(lado1, lado2);
		array.add(rectangulo);

	}

	public static void mostrarResultados() {
		for (Poligono num : array) {
			System.out.println(num);
		}
	}
}
