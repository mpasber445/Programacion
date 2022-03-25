import java.util.*;


public class HundirLaFlota {

	static int bombax;
	static int bombay;
	static String bombaysintraducir;
	static int puntosjugadoruno = 24;
	static int puntosjugadordos = 24;
	static String jugador1;
	static String jugador2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int panel1[][] = new int[10][10];
		int panel2[][] = new int[10][10];
		int cuenta = 1;
		String jugador;
		String texto;
		int[][] panel;
		String bombajunta;
		int bombaxprueba;
		boolean bombaxbuena = true;
		boolean ganador = false;
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Introduce el nombre del primer jugador");
		jugador1 = sn.next();
		System.out.println("Introduce el nombre del segundo jugador");
		jugador2 = sn.next(); //Guarda los nombres de los jugadores en variables
		generarbarcos(panel1); //Llama a la funcion "generarbarcos" para generar los barcos en el panel 1 y en el 2
		generarbarcos(panel2);
		while(ganador == false) { //Se inicializa el bucle con el que estaremos trabajando todo el rato
			if (cuenta%2==0) {
				jugador = jugador1;
				panel = panel1;
				texto= jugador2;
			}else {
				jugador = jugador2;
				panel = panel2;
				texto= jugador1;
			} //Si el jugador 1 va a lanzar la bomba, tendra que aparecer el tablero del jugador 2, de ahi estas variables
			// Para controlar quien juega, crearemos una cuenta que aumentará por cada ciclo del bucle while
			// De modo que en los turnos impares jugará el jugador 1 y en los pares el jugador 2
			System.out.println(texto + ", introduce unas coordenadas donde lanzar la bomba (LETRA+NUMERO)");
			bombajunta = sn.next();
			bombaxprueba = bombajunta.charAt(1); //Extrae el segundo caracter de la coordenada
			if (bombaxbuena = true) { //Si el caracter extraido es igual a una letra (a-z y A-Z en codigo ascii), la variable se pondra a false y saldra del bucle
				for(int ascii = 64; ascii<91;ascii++ ) { 
					if (bombaxprueba == ascii) {
						bombaxbuena = false; //Se pondra a false ya que la letra deberá estar en el primer caracter, no en el segundo
						break;
					}
				}
			}
			if (bombaxbuena = true) {
				for(int ascii = 96; ascii<123;ascii++ ) {
					if (bombaxprueba == ascii) {
						bombaxbuena = false;
						break;
					}
				}
				
			}
			if (bombajunta.length()!=2) {  //Si introduce una coordenada de mas de 3 caracteres metera error
				System.out.println("");
				System.out.println("Has introducido una coordenada erronea, has perdido tu turno.");
				System.out.println("");
			}else if (bombaxbuena == false) { //Si hay una letra en el segundo caracter, metera error
				System.out.println("");
				System.out.println("Has introducido una coordenada erronea, has perdido tu turno.");
				System.out.println("");
			}else {
				bombaysintraducir = bombajunta.substring(0,1); //Si ha introducido bien la coordenada, se extraera la letra y se pondra en esta variable
				bombax =  Integer.parseInt(bombajunta.substring(1,2)); //Se extraera el numero y se guardara en esta variable
				bombay=CambiarLetra(bombaysintraducir); //Se cambiara la letra a un numero, para poder trabajar con ella despues
				if (bombay == 24 || (bombax<0 || bombax > 9)) {
					System.out.println("");
					System.out.println("Has introducido una coordenada erronea, has perdido tu turno."); //Si introduce una letra/numero que no esta en el tablero (Se sale de este) metera error
					System.out.println("");
				}else {
					mostrarpanel(panel,jugador); //Muestra el panel
					if(jugador == jugador1) { 
						System.out.println("Puntos restantes de "+ jugador + ":" + puntosjugadoruno);
					}else if (jugador == jugador2) {
						System.out.println("Puntos restantes de "+ jugador + ":" + puntosjugadordos);
					}
				}
			}
			System.out.println("");
			if (puntosjugadoruno == 0) { //Si alguno de los dos jugadores llega a 0 puntos, significara que ha perdido
				ganador = true;
				System.out.println("¡Felicidades " + jugador2 + " has ganado la partida!");
				System.out.println("");
				System.out.println("-----------------------------------------");
				System.out.println("Manuel Jesús Pascual Bernal 1º DAM");
				System.out.println("IES Martinez Montañes");
			}else if(puntosjugadordos == 0){
				ganador = true;
				System.out.println("¡Felicidades " + jugador1 + " has ganado la partida!");
				System.out.println("");
				System.out.println("-----------------------------------------");
				System.out.println("Manuel Jesús Pascual Bernal 1º DAM");
				System.out.println("IES Martinez Montañes");
			}
			System.out.println("-----------------------------------------");
			System.out.println("");
			cuenta++;
			
		}
		
		sn.close();
	}

	public static void mostrarpanel (int[][] panel,String jugador) {
		
		if (panel[bombax][bombay] == 1000 || panel[bombax][bombay] == 3000 || panel[bombax][bombay] == 5000){ //Si la bomba lanzada coincide con algun barco se mostrara un mensaje en pantalla 
			System.out.println("¡La bomba ha impactado sobre un barco!");
			panel[bombax][bombay] = 20; //Los barcos impactados se cambiaran por 20
			if(jugador == jugador1) { //Se le restaran puntos al jugador que hayan impactado en sus barcos
				puntosjugadoruno --; 
			}else if (jugador == jugador2) {
				puntosjugadordos--;
			}
		}else {
			System.out.println("");
			System.out.println("La bomba no ha impactado sobre ningun barco");
			System.out.println("");
			panel[bombax][bombay] = 0; //Si la bomba ha caido en agua, se pondra a 0
		}
				
		System.out.println("Tablero del jugador " + jugador);
		System.out.print("   ");
		
		for (int y = 0; y<10;y++) {
			System.out.print("[" + y + "] ");
		}
		System.out.println("");
		for (int x = 0; x<=9;x++) {
			if (x == 0) {
				System.out.print("[A]");
			} else if (x ==1) {
				System.out.print("[B]");
			}else if (x ==2) {
				System.out.print("[C]");
			}else if (x ==3) {
				System.out.print("[D]");
			}else if (x ==4) {
				System.out.print("[E]");
			}else if (x ==5) {
				System.out.print("[F]");
			}else if (x ==6) {
				System.out.print("[G]");
			}else if (x ==7) {
				System.out.print("[H]");
			}else if (x ==8) {
				System.out.print("[I]");
			}else if (x ==9) {
				System.out.print("[J]");
			}
			for(int y = 0;y<=9;y++) { 
				if (panel[y][x] == 1){
					System.out.print(" ·  ");
				}else if (panel[y][x] == 1000) {
					System.out.print(" ·  "); //Barcos de 1
				}else if (panel [y][x] == 3000) {
					System.out.print(" ·  "); // Barcos de 3
				}else if (panel [y][x] == 5000) {
					System.out.print(" ·  "); // Barcos de 5
				}else if (panel [y][x] == 20) {
					System.out.print(" X  "); // Barcos impactados
				}else if (panel [y][x] == 0) { 
					System.out.print(" A  "); //Bombas lanzadas en agua
				}		
			}
			System.out.println(" ");	
		}	
	}
	public static void generarbarcos(int[][] panel) {
		
		for (int x = 0; x<=9;x++) { //Establece todo el panel como agua (1)
			for(int y = 0;y<=9;y++) {
				panel[y][x] = 1;
			}		
		}
		
		for (int j = 0 ; j<5;j++) { //Genera los 5 barcos de una casilla
			int coordx = (int)Math.floor(Math.random()*(10-1)+1);
			int coordy = (int)Math.floor(Math.random()*(10-1)+1);
			panel[coordy][coordx] = 1000;
		}
		
		for (int j = 0 ; j<3;j++) { //Genera los 3 barcos de tres casillas
			int coordx = (int)Math.floor(Math.random()*(10-1)+1);
			int coordy = (int)Math.floor(Math.random()*(10-1)+1);
			int posicion = (int)Math.floor(Math.random()*(3-1)+1); //Genera un numero aleatorio entre el 1 y el 2, si sale 1 el barco estara en vertical si sale 2 el barco estara en horizontal

			if(posicion == 1) { //Si la posicion es vertical comprueba si el barco entero se puede generar hacia arriba, si no lo comprueba ha
				if(coordy+1 < 9 && coordy+2 <=9 &&panel[coordy][coordx] == 1 && panel[coordy+1][coordx] == 1 && panel[coordy+2][coordx] == 1 ) {
				panel[coordy][coordx] = 3000;
				panel[coordy+1][coordx] = 3000;
				panel[coordy+2][coordx] = 3000;

				}else if(coordy-1 >0 && coordy-2 >=0 && panel[coordy][coordx] == 1 && panel[coordy-1][coordx] == 1 && panel[coordy-2][coordx] == 1 ) {
					
				panel[coordy][coordx] = 3000;
				panel[coordy-1][coordx] = 3000;
				panel[coordy-2][coordx] = 3000;
				}else { //Si no se puede generar, vuelve al mismo ciclo del bucle para volver a generar de nuevo las coordenadas y la posicion
					j = j-1;				
				}
			}
			else { //Si la posicion es horizontal hace exactamente lo mismo pero en horizontal
				if( coordx+1 < 9 && coordx+2 <=9 && panel[coordy][coordx] == 1 && panel [coordy][coordx+1] == 1 && panel[coordy][coordx+2] ==1) {
					panel[coordy][coordx] = 3000;
					panel[coordy][coordx+1] = 3000;
					panel[coordy][coordx+2] = 3000;
				}else if(coordx-1 > 0 && coordx-2 >=0 && panel[coordy][coordx] == 1 && panel [coordy][coordx-1] == 1 && panel[coordy][coordx-2] ==1 ) {
					panel[coordy][coordx] = 3000;
					panel[coordy][coordx-1] = 3000;
					panel[coordy][coordx-2] = 3000;
				}else {
					j = j-1;
				}
			}
		}
		for (int p = 0 ; p<2;p++) { //Genera los 2 barcos de cinco casillas
			int coordx = (int)Math.floor(Math.random()*(10-1)+1);
			int coordy = (int)Math.floor(Math.random()*(10-1)+1);
			int posicion = (int)Math.floor(Math.random()*(3-1)+1); //Genera un numero aleatorio entre el 1 y el 2, si sale 1 el barco estara en vertical si sale 2 el barco estara en horizontal

			if(posicion == 1) { //Si la posicion es vertical comprueba si el barco entero se puede generar hacia arriba, si no lo comprueba ha
				if(coordy+1 < 9 && coordy+2 <9 && coordy+3 < 9 && coordy+4 <=9 && panel[coordy][coordx] == 1 && panel[coordy+1][coordx] == 1 && panel[coordy+2][coordx] == 1 && panel[coordy+3][coordx] == 1 && panel[coordy+4][coordx] == 1) {
				panel[coordy][coordx] = 5000;
				panel[coordy+1][coordx] = 5000;
				panel[coordy+2][coordx] = 5000;
				panel[coordy+3][coordx] = 5000;
				panel[coordy+4][coordx] = 5000;

				}else if(coordy-1 > 0 && coordy-2 >0 && coordy-3 > 0 && coordy-4 >=0 && panel[coordy][coordx] == 1 && panel[coordy-1][coordx] == 1 && panel[coordy-2][coordx] == 1 && panel[coordy-3][coordx] == 1 && panel[coordy-4][coordx] == 1) {
					
				panel[coordy][coordx] = 5000;
				panel[coordy-1][coordx] = 5000;
				panel[coordy-2][coordx] = 5000;
				panel[coordy-3][coordx] = 5000;
				panel[coordy-4][coordx] = 5000;
				}else { //Si no se puede generar, vuelve al mismo ciclo del bucle para volver a generar de nuevo las coordenadas y la posicion
					p = p-1;
				}
			}
			else { //Si la posicion es horizontal hace exactamente lo mismo pero en horizontal
				if( coordx+1 < 9 && coordx+2 <9  && coordx+3 < 9 && coordx+4 <=9  && panel[coordy][coordx] == 1 && panel [coordy][coordx+1] == 1 && panel[coordy][coordx+2] ==1 && panel[coordy][coordx+3] ==1  && panel[coordy][coordx+4] ==1) {
					panel[coordy][coordx] = 5000;
					panel[coordy][coordx+1] = 5000;
					panel[coordy][coordx+2] = 5000;
					panel[coordy][coordx+3] = 5000;
					panel[coordy][coordx+4] = 5000;
				}else if(coordx-1 > 0 && coordx-2 >0 && coordx-3 > 0 && coordx-4 >=0 && panel[coordy][coordx] == 1 && panel [coordy][coordx-1] == 1 && panel[coordy][coordx-2] ==1  && panel[coordy][coordx-3] ==1 && panel[coordy][coordx-4] ==1) {
					panel[coordy][coordx] = 5000;
					panel[coordy][coordx-1] = 5000;
					panel[coordy][coordx-2] = 5000;
					panel[coordy][coordx-3] = 5000;
					panel[coordy][coordx-4] = 5000;
				}else {
					p = p-1;
				}
			}
		}
	}
	public static int CambiarLetra(String y) { //Cambia la letra por un numero del 0 al 9, si la letra no esta en el tablero devuelve 24	
		if ( y.equalsIgnoreCase("a")) { //Ese 24 lo usaremos para poder comparar y poner errores
			return 0;
		} else if ( y.equalsIgnoreCase("b")) {
			return 1;
		}else if ( y.equalsIgnoreCase("c")) {
			return 2;
		}else if ( y.equalsIgnoreCase("d")) {
			return 3;
		}else if ( y.equalsIgnoreCase("e")) {
			return 4;
		}else if ( y.equalsIgnoreCase("f")) {
			return 5;
		}else if ( y.equalsIgnoreCase("g")) {
			return 6;
		}else if ( y.equalsIgnoreCase("h")) {
			return 7;
		}else if ( y.equalsIgnoreCase("i")) {
			return 8;
		}else if ( y.equalsIgnoreCase("j")) {
			return 9;
		}else {
			return 24;
		}		
	}
}