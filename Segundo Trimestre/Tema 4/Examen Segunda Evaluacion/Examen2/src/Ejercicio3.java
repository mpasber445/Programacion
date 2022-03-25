import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import POO6.Fecha;

public class Ejercicio3 {

	static int contador = 0;
	static Vehiculos[] concesionario = new Vehiculos[50];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean menu = true;
		Scanner snInt = new Scanner(System.in);
		Scanner snString = new Scanner(System.in);
		boolean nuevovehiculocreado = false;
		String añoActual = new SimpleDateFormat("yyyy").format(Calendar.getInstance().getTime());
		String diaActual = new SimpleDateFormat("dd").format(Calendar.getInstance().getTime());
		String mesActual = new SimpleDateFormat("MM").format(Calendar.getInstance().getTime());
		Fecha fechaactual = new Fecha(Integer.parseInt(diaActual),Integer.parseInt(mesActual),Integer.parseInt(añoActual));
		
		Vehiculos nuevovehiculo = new Vehiculos();

		for(int x = 0;x<50;x++) {
			concesionario[x] = nuevovehiculo;
		} //Llena el array con vehiculos vacios.
		
		while(menu) {
			menu();
			System.out.println("Escoge una opción");
			int opcion = snInt.nextInt();
			
			switch (opcion) {
			case 1: {
				if(contador == 49) {
					System.out.println("No tienes mas espacio en tu concesionario de vehiculos");
				}else {
					nuevovehiculo = new Vehiculos();
	
					System.out.println("Introduce la marca del vehiculo");
					nuevovehiculo.setMarca(snString.nextLine());
					System.out.println("Introduce la matricula del vehiculo");
					nuevovehiculo.setMatricula(snString.nextLine());
					System.out.println("Introduce los km que tiene el vehiculo");
					int km = snInt.nextInt();
					if(km<0) {
						System.out.println("Los km del vehiculo no pueden ser negativos, se eliminaran los datos introducidos hasta ahora.");
						nuevovehiculo = new Vehiculos();
						nuevovehiculocreado = false;
						break;
					}else {
						nuevovehiculo.setKm(km);
					}
					System.out.println("Introduce la fecha de matriculación del vehiculo");
					System.out.println("Introduce un dia");
					int dia = snInt.nextInt();
					System.out.println("Introduce un mes");
					int mes = snInt.nextInt();
					System.out.println("Introduce un año");
	
					int año = snInt.nextInt();
					Fecha fechamatriculacion = new Fecha(dia,mes,año);
					if(!fechaactual.esMayorQue(fechamatriculacion)) {
						System.out.println("La fecha introducida es posterior o igual a la fecha actual. Se eliminaran los datos introducidos hasta ahora.");
						nuevovehiculo = new Vehiculos();
						nuevovehiculocreado = false;
						break;
					}else {
					nuevovehiculo.setFecha_matriculacion(fechamatriculacion);
					}
					System.out.println("Introduce la descripción del vehiculo");
					nuevovehiculo.setDescripcion(snString.nextLine());
					System.out.println("Introduce el precio del vehiculo");
					nuevovehiculo.setPrecio(snInt.nextDouble());
					System.out.println("Introduce el nombre del propietario");
					nuevovehiculo.setNombre_propietario(snString.nextLine());
					System.out.println("Introduce el DNI el propietario");
					String DNI = snString.nextLine();
					if (dniCorrecto(DNI)) {
						nuevovehiculo.setDni_propietario(DNI);
					}else {
						System.out.println("El DNI introducido es erroneo");
						nuevovehiculo = new Vehiculos();
						nuevovehiculocreado = false;
						break;
					}
					if(insertarVehiculo(nuevovehiculo) == 0) { //Una vez creado un vehiculo, comprueba si se puede insertar en el concesionario, si es 0, se puede insertar, si es -1 el concesionario esta lleno y si es -2 la matricula coincide con algun otro
						nuevovehiculocreado = true;
						System.out.println("Nuevo vehiculo insertado correctamente");
						break;
					}else if (insertarVehiculo(nuevovehiculo) == -2) {
						System.out.println("Ya hay un vehiculo con esa matricula");
						break;
					}else {
						System.out.println("El concesionario esta lleno y no se ha podido introducir el vehiculo");
						break;
					}
				}
				
			}
			case 2:{
				for(int x = 0;x<contador;x++) {
					System.out.println("Vehiculo " + x);
					System.out.println(concesionario[x]);
					System.out.println("-----------------");
					System.out.println("");
					
				}
				break;
			}
			case 3:{
				System.out.println("Introduce la matricula del vehiculo que quieres buscar");
				String matriculaabuscar = snString.nextLine();
				boolean encontrado = false;
				for (int x = 0; x < contador; x++) {
					if (concesionario[x].getMatricula().equalsIgnoreCase(matriculaabuscar)) {
						encontrado = true;
						System.out.println(concesionario[x]);
					}
					
				}
				if (encontrado == false) {
					System.out.println("No se ha encontrado la matricula en el concesionario");
				}
				break;
			}
			case 4:{
				System.out.println("Selecciona la matricula de la que quieras cambiar los kilometros");
				String matriculaabuscar = snString.nextLine();
				System.out.println("Introduce los nuevos km");
				int km = snInt.nextInt();
				if(km<0) {
					System.out.println("Los km del vehiculo no pueden ser negativos");
					break;
				}else {
					boolean encontrado = false;
					for (int x = 0; x < contador; x++) {
						if (concesionario[x].getMatricula().equalsIgnoreCase(matriculaabuscar)) {
							encontrado = true;
							concesionario[x].setKm(km);
							System.out.println("KM actualizados, los nuevos KM son: " + concesionario[x].getKm());
						}
						
					}
					if (encontrado == false) {
						System.out.println("No se ha encontrado la matricula en el concesionario");
					}
					break;
				}
			}
			case 5:{
				System.out.println("Gracias por usar nuestra app.");
				menu = false;
				break;
			}
			default:
				System.out.println("Has seleccionado una opcion erronea");
			}
		}
		
		
		
		
	}
	
public static int insertarVehiculo(Vehiculos nuevovehiculo){
	boolean matriculaencontrada = false;	
	
	if(contador >= 49) {
			return -1;
		}else{
			for (int x = 0; x < contador; x++) {
				if (concesionario[x].getMatricula().equalsIgnoreCase(nuevovehiculo.getMatricula())) {
					matriculaencontrada = true;
				}
				
			}
			
			if(matriculaencontrada) {
				return -2;
			}else {
				concesionario[contador] = nuevovehiculo;
				contador++;
				return 0;
			}
			
		}
}
	

	public static boolean dniCorrecto(String dni) {
		
		if(dni.length()==9) {
			if(dni.substring(0,1).equalsIgnoreCase("0") || dni.substring(0,1).equalsIgnoreCase("1") || dni.substring(0,1).equalsIgnoreCase("2") || dni.substring(0,1).equalsIgnoreCase("3") || dni.substring(0,1).equalsIgnoreCase("4") || dni.substring(0,1).equalsIgnoreCase("5") || dni.substring(0,1).equalsIgnoreCase("6") || dni.substring(0,1).equalsIgnoreCase("7") || dni.substring(0,1).equalsIgnoreCase("8") || dni.substring(0,1).equalsIgnoreCase("9")) {
				if(dni.substring(1,2).equalsIgnoreCase("0") || dni.substring(1,2).equalsIgnoreCase("1") || dni.substring(1,2).equalsIgnoreCase("2") || dni.substring(1,2).equalsIgnoreCase("3") || dni.substring(1,2).equalsIgnoreCase("4") || dni.substring(1,2).equalsIgnoreCase("5") || dni.substring(1,2).equalsIgnoreCase("6") || dni.substring(1,2).equalsIgnoreCase("7") || dni.substring(1,2).equalsIgnoreCase("8") || dni.substring(1,2).equalsIgnoreCase("9")) {
					if(dni.substring(6,7).equalsIgnoreCase("0") || dni.substring(6,7).equalsIgnoreCase("1") || dni.substring(6,7).equalsIgnoreCase("2") || dni.substring(6,7).equalsIgnoreCase("3") || dni.substring(6,7).equalsIgnoreCase("4") || dni.substring(6,7).equalsIgnoreCase("5") || dni.substring(6,7).equalsIgnoreCase("6") || dni.substring(6,7).equalsIgnoreCase("7") || dni.substring(6,7).equalsIgnoreCase("8") || dni.substring(6,7).equalsIgnoreCase("9")) {
						if(dni.substring(3,4).equalsIgnoreCase("0") || dni.substring(3,4).equalsIgnoreCase("1") || dni.substring(3,4).equalsIgnoreCase("2") || dni.substring(3,4).equalsIgnoreCase("3") || dni.substring(3,4).equalsIgnoreCase("4") || dni.substring(3,4).equalsIgnoreCase("5") || dni.substring(3,4).equalsIgnoreCase("6") || dni.substring(3,4).equalsIgnoreCase("7") || dni.substring(3,4).equalsIgnoreCase("8") || dni.substring(3,4).equalsIgnoreCase("9")) {
							if(dni.substring(4,5).equalsIgnoreCase("0") || dni.substring(4,5).equalsIgnoreCase("1") || dni.substring(4,5).equalsIgnoreCase("2") || dni.substring(4,5).equalsIgnoreCase("3") || dni.substring(4,5).equalsIgnoreCase("4") || dni.substring(4,5).equalsIgnoreCase("5") || dni.substring(4,5).equalsIgnoreCase("6") || dni.substring(4,5).equalsIgnoreCase("7") || dni.substring(4,5).equalsIgnoreCase("8") || dni.substring(4,5).equalsIgnoreCase("9")) {
								if(dni.substring(5,6).equalsIgnoreCase("0") || dni.substring(5,6).equalsIgnoreCase("1") || dni.substring(5,6).equalsIgnoreCase("2") || dni.substring(5,6).equalsIgnoreCase("3") || dni.substring(5,6).equalsIgnoreCase("4") || dni.substring(5,6).equalsIgnoreCase("5") || dni.substring(5,6).equalsIgnoreCase("6") || dni.substring(5,6).equalsIgnoreCase("7") || dni.substring(5,6).equalsIgnoreCase("8") || dni.substring(5,6).equalsIgnoreCase("9")) {
									if(dni.substring(6,7).equalsIgnoreCase("0") || dni.substring(6,7).equalsIgnoreCase("1") || dni.substring(6,7).equalsIgnoreCase("2") || dni.substring(6,7).equalsIgnoreCase("3") || dni.substring(6,7).equalsIgnoreCase("4") || dni.substring(6,7).equalsIgnoreCase("5") || dni.substring(6,7).equalsIgnoreCase("6") || dni.substring(6,7).equalsIgnoreCase("7") || dni.substring(6,7).equalsIgnoreCase("8") || dni.substring(6,7).equalsIgnoreCase("9")) {
										if(dni.substring(7,8).equalsIgnoreCase("0") || dni.substring(7,8).equalsIgnoreCase("1") || dni.substring(7,8).equalsIgnoreCase("2") || dni.substring(7,8).equalsIgnoreCase("3") || dni.substring(7,8).equalsIgnoreCase("4") || dni.substring(7,8).equalsIgnoreCase("5") || dni.substring(7,8).equalsIgnoreCase("6") || dni.substring(7,8).equalsIgnoreCase("7") || dni.substring(7,8).equalsIgnoreCase("8") || dni.substring(7,8).equalsIgnoreCase("9")) {
											if(!dni.substring(8,9).equalsIgnoreCase("0") || !dni.substring(8,9).equalsIgnoreCase("1") || !dni.substring(8,9).equalsIgnoreCase("2") || !dni.substring(8,9).equalsIgnoreCase("3") || !dni.substring(8,9).equalsIgnoreCase("4") || !dni.substring(8,9).equalsIgnoreCase("5") || !dni.substring(8,9).equalsIgnoreCase("6") || !dni.substring(8,9).equalsIgnoreCase("7") || !dni.substring(8,9).equalsIgnoreCase("8") || !dni.substring(8,9).equalsIgnoreCase("9")) {

												return true;
													
											}
										}
									}
								}
							}
						}
						
					}

				}

			}
		}
		return false;
	}
	
	
	public static void menu() {

		System.out.println("--- MENU ---");
		System.out.println("1. Nuevo vehiculo");
		System.out.println("2. Listar Vehiculos");
		System.out.println("3. Buscar Vehiculos");
		System.out.println("4. Modificar Kms de Vehiculo");
		System.out.println("5. Salir");
		System.out.println("-----------");
	}

}
