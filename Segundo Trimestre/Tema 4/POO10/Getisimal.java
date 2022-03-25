package POO10;

import java.util.Scanner;

public class Getisimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean salir = false;
		int opcion;
		Scanner sn = new Scanner(System.in);
		Scanner sn2 = new Scanner(System.in);
		Articulo[] ListaArticulos = new Articulo[100];
		int contador = 0;
		
		
		for(int x=0;x<ListaArticulos.length;x++) {
				
			ListaArticulos[x] = new Articulo();
			
		}
		
		
		while (!salir) {
			
			System.out.println("");
			System.out.println("-- Getisimal System --");
			System.out.println("");
			System.out.println("1.- Listado");
			System.out.println("2.- Alta");
			System.out.println("3.- Baja");
			System.out.println("4.- Modificación");
			System.out.println("5.- Entrada de mercancía");
			System.out.println("6.- Salida de mercancía");
			System.out.println("7.- Salir del sistema");
			System.out.println("-----------------------");
			System.out.println("");
			System.out.println("Escoge una opción");
			opcion = sn.nextInt();
			
			switch (opcion) {
			case 1: {
				
				Listado(ListaArticulos);
				break;
			
			}
			case 2: {
				
				boolean codigocorrecto = false;
				Articulo a = new Articulo();
				while (codigocorrecto==false) {
				
				System.out.println("Introduce el codigo");
				a.setCodigo(sn2.nextLine());
				System.out.println("Introduce la descripción");
				a.setDescripcion(sn2.nextLine());
				System.out.println("Introduce el precio de compra");
				a.setPrecio_compra(sn.nextFloat());
				System.out.println("Introduce el precio de venta");
				a.setPrecio_venta(sn.nextFloat());
				System.out.println("Introduce el stock del producto");
				a.setStock(sn.nextInt());
				
				for(int x = 0; x<ListaArticulos.length;x++) {
					if (!(a.getCodigo().equalsIgnoreCase(ListaArticulos[x].getCodigo()))) {
					codigocorrecto=true;
						
					}else {
						codigocorrecto = false;
						System.out.println("Has introducido un codigo que ya existe");
						break;
					}
				}
				
				}
				
				
				ListaArticulos[contador] = a;
				contador++;
				break;
				
			}
			case 3: {
				System.out.println("Introduce el codigo del articulo que quieres eliminar");
				String codigo = sn2.nextLine();
				boolean encontrado = false;
				for (int x = 0; x < 100; x++) {
					
					if (ListaArticulos[x].getCodigo().equalsIgnoreCase(codigo)) {
						encontrado = true;
						ListaArticulos[x].setCodigo("Libre");
						ListaArticulos[x].setDescripcion("");
						ListaArticulos[x].setPrecio_compra(0);
						ListaArticulos[x].setPrecio_venta(0);
						ListaArticulos[x].setStock(0);
						System.out.println("Articulo eliminado satisfactoriamente");
						contador--;
						for (x = x; x < 100; x++) {

							if (x == 99) {

								ListaArticulos[x].setCodigo("LIBRE");
								ListaArticulos[x].setDescripcion("");
								ListaArticulos[x].setPrecio_compra(0);
								ListaArticulos[x].setPrecio_venta(0);
								ListaArticulos[x].setStock(0);
								break;

							} else {
								ListaArticulos[x] = ListaArticulos[x + 1];
							}
						}
					}
				}
				
				if (encontrado = false) {
					System.out.println("No se ha encontrado el código entre la lista de articulos");
				}
				break;
			}
			case 4: {

				System.out.println("Introduce el codigo del articulo que quieres modificar");
				String codigo = sn2.nextLine();
				boolean encontrado = false;
				for (int x = 0; x < 100; x++) {
					if (ListaArticulos[x].getCodigo().equalsIgnoreCase(codigo)) {
						Articulo a = new Articulo();
						encontrado = true;
						System.out.println("Introduce el nuevo codigo");
						a.setCodigo(sn2.nextLine());
						System.out.println("Introduce la nueva descripción");
						a.setDescripcion(sn2.nextLine());
						System.out.println("Introduce el nuevo precio de compra");
						a.setPrecio_compra(sn.nextFloat());
						System.out.println("Introduce el nuevo precio de venta");
						a.setPrecio_venta(sn.nextFloat());
						System.out.println("Introduce el nuevo stock del producto");
						a.setStock(sn.nextInt());

						ListaArticulos[x] = a;
						System.out.println("Articulo modificado con éxito");
					}
					
				}
				if (encontrado == false) {
					System.out.println("No se ha encontrado el codigo entre la lista de articulos");
				}
				break;
			}
			case 5: {

				System.out.println("Introduce el codigo del articulo al que le ha llegado nueva mercancía");
				String codigo = sn2.nextLine();
				boolean encontrado = false;
				int mercancia;
				boolean mercanciacorrecta = false;

				for (int x = 0; x < 100; x++) {
					if (ListaArticulos[x].getCodigo().equalsIgnoreCase(codigo)) {
						encontrado = true;
						while(mercanciacorrecta == false) {
						System.out.println("Introduce cuanta mercancía ha llegado");
						mercancia = sn.nextInt();
						if (mercancia < 0) {
							System.out.println("Mercancia incorrecta, vuelve a introducirlo");
						}else {
							mercanciacorrecta = true;
							ListaArticulos[x].setStock(ListaArticulos[x].getStock()+mercancia);
							System.out.println("Nuevo Stock modificado con éxito");
						}
					}
					}
				}
				if (encontrado == false) {
					System.out.println("No se ha encontrado el codigo entre la lista de articulos");
				}
				break;
				
			}
			case 6: {

				System.out.println("Introduce el codigo del articulo del que ha salido mercancía");
				String codigo = sn2.nextLine();
				boolean encontrado = false;
				int mercancia;
				boolean mercanciacorrecta = false;
				for (int x = 0; x < 100; x++) {
					if (ListaArticulos[x].getCodigo().equalsIgnoreCase(codigo)) {
						encontrado = true;
						while(mercanciacorrecta == false) {
						System.out.println("Introduce cuanta mercancía ha salido");
						mercancia = sn.nextInt();
						if (mercancia > ListaArticulos[x].getStock()) {
							System.out.println("Mercancia incorrecta, vuelve a introducirlo");
						}else {
							mercanciacorrecta = true;
							ListaArticulos[x].setStock(ListaArticulos[x].getStock()-sn.nextInt());
							System.out.println("Nuevo Stock modificado con éxito");
						}
						}						
					}
					
				}
				if (encontrado == false) {
					System.out.println("No se ha encontrado el codigo entre la lista de articulos");
				}
				break;
			}
			case 7: {
				System.out.println("Gracias por usar nuestro sistema");
				System.out.println("-- Getisimal Company --");
				salir = true;
				break;
			}
			default:
				
				System.out.println("Error, deberias haber introducido un numero del 1 al 7");
			
			}
			
		}
		sn.close();
		sn2.close();
	}
	
	public static void Listado(Articulo[] a) {
		
		for(int x=0;x<a.length;x++) {			

			if (a[x].getCodigo().equalsIgnoreCase("Libre")) {
				System.out.println(x+1 + ".-  " + "Articulo Vacío");
				System.out.println("");
			}else {
				System.out.println(x+1 + ".-  ");
				System.out.println(a[x].toString());

			}
			
		}
		
		
		
	}
}
