package POO11;


import java.util.Scanner;

import POO6.Fecha;

public class main {

		//se crea el Array de Personas
		static Persona[] arrayPersonas = new Persona[5];
		static Scanner snString = new Scanner(System.in);
		static Scanner snInt = new Scanner(System.in);

		public static void main(String[] args) {
		//se leen las personas y se introducen en el Array
		leerPersonas();
		if (numeroDePersonas() > 0) {
		//se muestran todas las personas introducidas
		System.out.println("\nPersonas introducidas: ");
		mostrar();
		//se muestra la persona de mayor edad
		System.out.println("\nPersona de mayor edad: ");
		System.out.println(personaMayorEdad());
		//se muestran todas las personas que viven en Elche
		System.out.println("\nNúmero de personas que viven en Elche: "

		+

		cuantasPersonasVivenEn("Elche"));

		//se muestra el número de personas mayores de edad
		System.out.println("\nNúmero de personas mayores de edad : "
		+ personasMayoresDeEdad());

		}
		}
		//Resto de métodos
		
		public static void leerPersonas() {
			
			int dia;
			int mes;
			int año;
			
			System.out.println("Introduce 5 personas");
			for(int x = 0;x<5;x++) {
				Persona a = new Persona();
				System.out.println("-- Persona " + x + " --");
				System.out.println("");
				System.out.println("Introduce su nombre:");
				a.setNombre(snString.nextLine());
				System.out.println("Introduce su dirección:");
				a.setDireccion(snString.nextLine());
				System.out.println("Introduce su codigo postal");
				a.setCodigoPostal(snInt.nextInt());
				System.out.println("Introduce su ciudad:");
				a.setCiudad(snString.nextLine());
				System.out.println("Introduce la fecha de nacimiento");
				System.out.println("Introduce un dia");
				dia = snInt.nextInt();
				System.out.println("Introduce un mes");
				mes = snInt.nextInt();
				System.out.println("Introduce un año");
				año = snInt.nextInt();
				Fecha fecha = new Fecha(dia,mes,año);
				a.setFechaNacimiento(fecha);
				arrayPersonas[x] = a;
				
				snInt.close();
				snString.close();
			}
		}
		
		public static void mostrar() {
		
			for(int x = 0;x<arrayPersonas.length;x++) {
				System.out.println(arrayPersonas[x]);
			}
			
		}
	
		public static int numeroDePersonas() {
			return arrayPersonas.length;
		}
		
		public static Persona personaMayorEdad(){
			Persona personamayoredad = arrayPersonas[0];
			for(int x = 1;x<arrayPersonas.length;x++) {
				if(personamayoredad.getFechaNacimiento().esMayorQue(arrayPersonas[x].getFechaNacimiento())) {
					personamayoredad = arrayPersonas[x];
				}
			}
			return personamayoredad;
		}
		
		public static int cuantasPersonasVivenEn(String a) {
			int contador = 0;
			for(int x = 0;x<arrayPersonas.length;x++) {
				if(arrayPersonas[x].getCiudad().equalsIgnoreCase(a)) {
					contador++;
				}
			}
			return contador;
		}
		
		public static int personasMayoresDeEdad() {
			int contador = 0;
			for(int x = 0;x<arrayPersonas.length;x++) {
				if(arrayPersonas[x].esMayorDeEdad()) {
					contador++;
				}
			}
			return contador;
		}
	}
	
