package POO8;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador = 0;
		Disco[] discos = new Disco[100];

		// Rellena el array de discos
		for (int x = 0; x < 100; x++) {
			discos[x] = new Disco();
		}

		Scanner sn = new Scanner(System.in);
		Scanner sn2 = new Scanner(System.in);
		boolean salir = false;

		while (salir == false) {
			System.out.println("COLECCION DE DISCOS");
			System.out.println("=====================");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo Disco");
			System.out.println("3. Modificar");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");

			int seleccion = sn.nextInt();

			switch (seleccion) {
			case 1: {

				for (int x = 0; x < 100; x++) {

						if (discos[x].getCodigo().equalsIgnoreCase("Libre")) {
							System.out.println(x+1 + ".-  " + "Disco Vacío");
							System.out.println("");
						}else {
							System.out.println(x+1 + ".-  " + discos[x].getTitulo());
							System.out.println("");
	
						}
						
					
				}
				break;
			}
			case 2: {

				boolean codigocorrecto = false;
				Disco a = new Disco();
				while (codigocorrecto==false) {
				System.out.println("Introduce el codigo");
				a.setCodigo(sn2.nextLine());
				System.out.println("Introduce el titulo");
				a.setTitulo(sn2.nextLine());
				System.out.println("Introduce el autor");
				a.setAutor(sn2.nextLine());
				System.out.println("Introduce la duración");
				a.setDuracion(sn.nextInt());
				System.out.println("Introduce el genero");
				a.setGenero(sn2.nextLine());

				for(int x = 0; x<discos.length;x++) {
					if (!(a.getCodigo().equalsIgnoreCase(discos[x].getCodigo()))) {
					codigocorrecto=true;
						
					}else {
						codigocorrecto = false;
						System.out.println("Has introducido un codigo que ya existe");
						break;
					}
				}
				
				}
				
				discos[contador] = a;
				contador++;
				break;
				
			}
			case 3: {

				System.out.println("Introduce el codigo del disco que quieres modificar");
				String codigo = sn2.nextLine();
				boolean encontrado = false;
				for (int x = 0; x < 100; x++) {
					if (discos[x].getCodigo().equalsIgnoreCase(codigo)) {
						Disco a = new Disco();
						encontrado = true;
						System.out.println("Introduce el nuevo codigo");
						a.setCodigo(sn2.nextLine());
						System.out.println("Introduce el nuevo titulo");
						a.setTitulo(sn2.nextLine());
						System.out.println("Introduce el nuevo autor");
						a.setAutor(sn2.nextLine());
						System.out.println("Introduce la nueva duración");
						a.setDuracion(sn.nextInt());
						System.out.println("Introduce el nuevo genero");
						a.setGenero(sn2.nextLine());
						discos[x] = a;
						System.out.println("Disco modificado con éxito");
					}
					
				}
				if (encontrado == false) {
					System.out.println("No se ha encontrado el codigo entre la lista de discos");
				}
				break;
			}
			case 4: {
				System.out.println("Introduce el codigo del disco que quieres eliminar");
				String codigo = sn2.nextLine();
				boolean encontrado = false;
				for (int x = 0; x < 100; x++) {
					
					if (discos[x].getCodigo().equalsIgnoreCase(codigo)) {
						encontrado = true;
						discos[x].setCodigo("Libre");
						discos[x].setTitulo("");
						discos[x].setAutor("");
						discos[x].setDuracion(0);
						discos[x].setGenero("");
						System.out.println("Disco eliminado satisfactoriamente");
						contador--;
						for (x = x; x < 100; x++) {

							if (x == 99) {

								discos[x].setCodigo("Libre");
								discos[x].setTitulo("");
								discos[x].setAutor("");
								discos[x].setDuracion(0);
								discos[x].setGenero("");
								break;

							} else {
								discos[x] = discos[x + 1];
							}
						}
					}
				}
				
				if (encontrado = false) {
					System.out.println("No se ha encontrado el código entre la lista de discos");
				}
				// Añadir algo que ponga todo el array a partir del discos[x] a una posicion
				// menos
				// Disco 1, disco 2, disco 3, disco borrado, disco 4, disco 5, discos libres...
				// Disco 1, disco 2, disco 3, disco 4, disco 5, espacios libres...
				break;
			}case 5: {
				
				salir=true;
				System.out.println("Gracias por usar nuestro CRUD");
				break;
				
			}
			default:
				System.out.println("No has introducido un valor valido");
			}
		}
		sn.close();
		sn2.close();
	}

}
