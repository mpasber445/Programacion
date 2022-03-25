import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import POO6.Fecha;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean menu = true; //Sirve para que cuando el usuario escoja la opción 9 salga del menú
		String añoActual = new SimpleDateFormat("yyyy").format(Calendar.getInstance().getTime());
		String diaActual = new SimpleDateFormat("dd").format(Calendar.getInstance().getTime());
		String mesActual = new SimpleDateFormat("MM").format(Calendar.getInstance().getTime());
		Fecha fechaactual = new Fecha(Integer.parseInt(diaActual),Integer.parseInt(mesActual),Integer.parseInt(añoActual)); //Cogemos la fecha actual del sistema y la guardamos para hacer comprobaciones posteriormente
		Scanner snInt = new Scanner(System.in);
		Scanner snString = new Scanner(System.in);
		Vehiculos coche = new Vehiculos();
		Vehiculos vehiculoantiguo = new Vehiculos();
		boolean cochecreado = false; //Verifica si el coche ha sido creado, si no hay ningun coche creado, no podremos usar las otras opciones del menú
		

		
		while(menu) { 
			
			menu(); //Llama a la funcion menú que nos mostrará el menú por pantalla
			System.out.println("Escoge una opción");
			int opcion = snInt.nextInt();
			switch (opcion) {
			case 1: {
				vehiculoantiguo = coche; //guarda el vehiculo antiguo, en caso de que esta sea la 2º vez que creamos un vehiculo, si fallamos, volvera a obtener el vehiculo antiguo.
				System.out.println("Introduce la marca del vehiculo");
				coche.setMarca(snString.nextLine());
				System.out.println("Introduce la matricula del vehiculo");
				coche.setMatricula(snString.nextLine());
				System.out.println("Introduce los km que tiene el vehiculo");
				int km = snInt.nextInt();
				if(km<0) { //Los kilometros deberan ser 0 o mayor.
					System.out.println("Los km del vehiculo no pueden ser negativos, se eliminaran los datos introducidos hasta ahora.");
					coche = vehiculoantiguo;
					break;
				}else {
					coche.setKm(km);
				}
				System.out.println("Introduce la fecha de matriculación del vehiculo");
				System.out.println("Introduce un dia");
				int dia = snInt.nextInt();
				System.out.println("Introduce un mes");
				int mes = snInt.nextInt();
				System.out.println("Introduce un año");

				int año = snInt.nextInt();
				Fecha fechamatriculacion = new Fecha(dia,mes,año);
				if(!fechaactual.esMayorQue(fechamatriculacion)) { //Si la fecha es posterior o igual a la fecha actual significa que el vehiculo no esta matriculado aún, por lo que dara un error
					System.out.println("La fecha introducida es posterior o igual a la fecha actual. Se eliminaran los datos introducidos hasta ahora.");
					coche = vehiculoantiguo;
					break;
				}else {
				coche.setFecha_matriculacion(fechamatriculacion);
				}
				System.out.println("Introduce la descripción del vehiculo");
				coche.setDescripcion(snString.nextLine());
				System.out.println("Introduce el precio del vehiculo");
				coche.setPrecio(snInt.nextDouble());
				System.out.println("Introduce el nombre del propietario");
				coche.setNombre_propietario(snString.nextLine());
				System.out.println("Introduce el DNI el propietario");
				String DNI = snString.nextLine();
				if (dniCorrecto(DNI)) { //Llama a la funcion DNICorrecto que te comprueba si el DNI es correcto, si lo es, crea el nuevo coche, si no lo es, muestra un error.
					coche.setDni_propietario(DNI);
					cochecreado = true;
					break;
				}else {
					System.out.println("El DNI introducido es erroneo");
					coche = vehiculoantiguo;
					break;
				}
				
			}
			case 2:{
				if(cochecreado) {
				System.out.println("La matricula de este vehiculo es: " + coche.getMatricula());	
				break;	
				}else {
					System.out.println("Aun ningun coche ha sido creado");
					break;
				}
			}
			case 3:{
				if(cochecreado) {
				System.out.println("El numero de kilometros de este vehiculo es: " + coche.getKm());
				break;
				}else {
					System.out.println("Aun ningun coche ha sido creado");
					break;
				}
			}
			case 4:{
				if(cochecreado) {
					System.out.println("El numero anterior de kilometros es: " + coche.getKm());
					System.out.println("Introduce el nuevo numero de km:");
					int km = snInt.nextInt();
					if(km<0) { //Misma comprobacion que a la hora de insertar un vehiculo
						System.out.println("Los km del vehiculo no pueden ser negativos");
						break;
					}else {
						coche.setKm(km);
						System.out.println("El nuevo numero de km es: " + coche.getKm());
						break;
					}
				}else {
					System.out.println("Aun ningun coche ha sido creado");
					break;
				}
			}
			case 5:{
				if(cochecreado) {
				System.out.println("Los años de antiguedad de este vehiculo son/es: " + coche.getAnios() + " año/años");
				break;
				}else {
					System.out.println("Aun ningun coche ha sido creado");
					break;
				}
			}
			case 6:{
				if(cochecreado) {
				System.out.println("El propietario de este vehiculo es: " + coche.getNombre_propietario());
				break;
				}else {
					System.out.println("Aun ningun coche ha sido creado");
					break;
				}
			}
			case 7:{
				if(cochecreado) {
				System.out.println("La descripcion de este vehiculo es: " + coche.getDescripcion());
				System.out.println(coche.getDescripcion());
				break;
				}else {
					System.out.println("Aun ningun coche ha sido creado");
					break;
				}
			}
			case 8:{
				if(cochecreado) {
				System.out.println("El precio de este vehiculo es: " + coche.getPrecio());
				break;
				}else {
					System.out.println("Aun ningun coche ha sido creado");
					break;
				}
			}
			case 9:{
				System.out.println("Gracias por usar nuestra app.");
				menu = false;
				break;
			}
			default:
				System.out.println("No has escogido una opción válida.");
				break;
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
		System.out.println("2. Ver matrícula");
		System.out.println("3. Ver número de Kilómetros");
		System.out.println("4. Actualizar Kilómetros");
		System.out.println("5. Ver años de antigüedad");
		System.out.println("6. Mostrar propietario");
		System.out.println("7. Mostrar descripción");
		System.out.println("8. Mostrar precio");
		System.out.println("9. Salir");
		System.out.println("-----------");
	}
	
}
