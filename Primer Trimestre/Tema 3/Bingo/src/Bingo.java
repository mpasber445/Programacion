import java.util.Scanner;
public class Bingo {
	//Metemos los arrays aqui para que al escribir el tablero se pueda mostrar un mensaje mostrando a que jugador pertence 
	//(Subalgoritmo Escribir_Tablero linea 129)
	static int carton1[][] = new int[3][5];
	static int carton2[][] = new int[3][5];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 9;
		int b = 1;
		int dinero_uno = 0;
		int dinero_dos = 0;
		int numerogenerado = (int)Math.floor(Math.random()*(50-1)+1);
		int primero = 0;
		@SuppressWarnings("unused") //Añadimos esto para que continua no nos de warning de que no esta siendo usado
		String continua;
		Scanner sn = new Scanner(System.in);
		//Genera ambos cartones aleatoriamente
		for (int x = 0; x<=2;x++) {
			for(int y = 0;y<=4;y++) {
				carton1[x][y] = (int)Math.floor(Math.random()*(a-b)+b);
				carton2[x][y] = (int)Math.floor(Math.random()*(a-b)+b);
				a += 10;
				b += 10;	
			}
			a = 10;
			b = 1;
		}
		//Muestra los premios y mi nombre
		System.out.printf("%26s","**IES MARTINEZ MONTAÑÉS**\n");
		System.out.printf("%24s","**Bingo Manuel Jesús**\n");
		System.out.println("-----------");
		System.out.println("  Premios");
		System.out.println("-----------");
		System.out.println("Linea: 100€");
		System.out.println("Bingo: 500€");
		
		//Muestra ambos cartones
		EscribirTablero(carton1);
		EscribirTablero(carton2);
		System.out.println("Pulsa enter para continuar");
		continua = sn.nextLine();
		
		//Entra en el bucle de generar numeros aleatorios y comprobar si estan
		while(ComprobarLinea(carton1)==false && ComprobarLinea(carton2)==false) {
			//Genera el numero aleatorio
			numerogenerado = (int)Math.floor(Math.random()*(50-1)+1);
			System.out.println("El numero generado es " + numerogenerado);
			
			//Comprueba si el numero aleatorio esta en el tablero y lo cambia por un 1000
			ComprobarNum(carton1,numerogenerado);
			ComprobarNum(carton2,numerogenerado);
			
			//Vuelve a mostrar los dos tableros (Ya cambiados por la X)
			EscribirTablero(carton1);
			EscribirTablero(carton2);
			
			//Comprobar si alguno de los dos jugadores ha hecho linea
			if (ComprobarLinea(carton1) == true && ComprobarLinea(carton2) == true) {
				primero = (int)Math.floor(Math.random()*(3-1)+1); //En caso de que los dos consigan la linea al mismo tiempo
				if (primero == 1) {								  //Se genera un numero aleatorio para ver quien lo canta antes
					System.out.println("El jugador 1 ha cantado linea y ha ganado 100€");
					dinero_uno += 100;
					MostrarDinero(dinero_uno,dinero_dos);
				}else if (primero == 2) {
					System.out.println("El jugador 2 ha cantado linea y ha ganado 100€");
					dinero_dos += 100;
					MostrarDinero(dinero_uno,dinero_dos);
				}
			}else if (ComprobarLinea(carton1)==true) {	
				System.out.println("El jugador 1 ha cantado linea, ha ganado 100€");
				dinero_uno += 100;
				MostrarDinero(dinero_uno,dinero_dos);
			}else if (ComprobarLinea(carton2) == true) {
				
				System.out.println("El jugador 2 ha cantado linea, ha ganado 100€");
				dinero_dos += 100;
				MostrarDinero(dinero_uno,dinero_dos);
			}
			System.out.println("Pulsa enter para continuar");
			continua = sn.nextLine();
		}

		//Una vez ya alguien ha cantado linea, el siguiente premio es el bingo, por lo cual se empieza a comprobar si alguien tiene bingo
		while (ComprobarBingo(carton1)==false && ComprobarBingo(carton2)==false) {
			//Genera el numero aleatorio
			numerogenerado = (int)Math.floor(Math.random()*(50-1)+1);
			System.out.println("El numero generado es " + numerogenerado);
			
			
			//Comprueba si tenemos el numero en el carton y lo cambia por 1000
			ComprobarNum(carton1,numerogenerado);
			ComprobarNum(carton2,numerogenerado);
			
			//Muestra el tablero por pantalla
			EscribirTablero(carton1);
			EscribirTablero(carton2);
			
			//Si alguno de los dos tiene bingo, muestra el mensaje que tiene bingo y sale del bucle
			if (ComprobarBingo(carton1) == true && ComprobarBingo(carton2) == true) {
				primero = (int)Math.floor(Math.random()*(3-1)+1); //En caso de que ambos consigan bingo al mismo tiempo
				if (primero == 1) {                               //se genera un numero aleatorio para ver quien lo canta antes
					System.out.println("El jugador 1 ha cantado bingo y ha ganado 500€");
					dinero_uno += 500;
					MostrarDinero(dinero_uno,dinero_dos);
				}else if (primero == 2) {
					System.out.println("El jugador 2 ha cantado bingo y ha ganado 500€");
					dinero_dos += 500;
					MostrarDinero(dinero_uno,dinero_dos);
				}
			}else if (ComprobarBingo(carton1)==true) {
				System.out.println("El jugador 1 ha cantado bingo y ha ganado 500€");
				dinero_uno += 500;
				MostrarDinero(dinero_uno,dinero_dos);
			}else if (ComprobarBingo(carton2) == true) {
				System.out.println("El jugador 2 ha cantado bingo y ha ganado 500€");
				dinero_dos += 500;
				MostrarDinero(dinero_uno,dinero_dos);
			}else {
				System.out.println("Pulsa enter para continuar");
				continua = sn.nextLine();
		}	
		}
		sn.close();
	}
	
	public static void EscribirTablero(int[][] tablero) {
		//Printea ambos tableros, pero comprobando por cada celda si el valor es 1000 (Coincide con el numero generado), en cuyo caso
		//Muestra una X en vez de 1000
		String jugador;
		if(tablero==carton1) {
			jugador = "Jugador 1";
		}else {
			jugador = "Jugador 2";
		}
		System.out.println("------------------------");
		System.out.println("       " + jugador);
		System.out.println("------------------------");
		for (int x = 0; x<=2;x++) {
			for(int y = 0;y<=4;y++) {
				if (tablero[x][y] == 1000) {
					System.out.printf("%3s","X" + "|");
				}else {
					System.out.printf("%3s",tablero[x][y] + "|");
				}
			}
			System.out.println(" ");		
		}		
	}
	public static void ComprobarNum(int[][] tablero, int numerogenerado) {
		//Si el numero generado aleatoriamente, es igual al numero en el tablero, se cambiar por un 1000, que despues
		//Con la funcion GenerarTablero, lo cambiaremos por una X
		for (int x = 0; x<=2;x++) {
			for(int y = 0;y<=4;y++) {
				if (tablero[x][y] == numerogenerado) {
					tablero[x][y] = 1000;
				}					
			}				
		}
	}
	public static boolean ComprobarLinea(int[][] tablero) {
		//Si la suma de una fila entera es igual a 5000(Hay 5 numeros y cada numero vale 1000), significará que el jugador tiene linea
		int suma_uno = 0;
		for (int x = 0; x<=2;x++) {
			for(int y = 0;y<=4;y++) {
				suma_uno += tablero[x][y];			
			}	
			if (suma_uno == 5000) {
				return true;	
			}	
			suma_uno = 0;
		}
		return false;
	}
	public static boolean ComprobarBingo(int[][] tablero) {
		//Si la suma de todos los numeros del carton es 15000 (Todos los numeros son puestos a 1000 y hay 15 numeros) significara que el jugador ha hecho bingo)
		int suma_uno = 0;
		for (int x = 0; x<=2;x++) {
			for(int y = 0;y<=4;y++) {
				suma_uno += tablero[x][y];			
			}	
			if (suma_uno == 15000) {
				return true;	
			}	
		}
		return false;
	}
	public static void MostrarDinero(int jugador_uno, int jugador_dos) {
		//Muestra el dinero que lleva acumulado el jugador uno y el jugador dos
		System.out.println("-----------------");
		System.out.println("Dinero Acumulado");
		System.out.println("-----------------");
		System.out.println("Jugador 1: " + jugador_uno + "€");
		System.out.println("Jugador 2: " + jugador_dos + "€");
		System.out.println("-----------------");
	}
}