import java.util.Scanner;

public class tres_en_raya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] tablero = new int[9];
		int x1 = 0,x2 = 0,x3 = 0,o1 = 0,o2 = 0,o3 = 0;
		Scanner sn = new Scanner(System.in);
		boolean ficha;
		boolean jugardenuevo;
		
		limpiarTablero(tablero);
		System.out.println("¡Bienvenido al juego del tres en raya!");
		imprimeTablero(tablero);
		System.out.println("Este es el tablero inicial, a partir de aqui, el jugador tendra tres fichas");
		System.out.println("y la maquina otras tres, el primero en hacer una linea gana.");
		System.out.println("¡Suerte!");
		
		
		
		
		for(int x=0;x<3;x++) {
			
			System.out.println("¡Es tu turno!");
			System.out.println("¿Donde quieres colocar tu ficha?");
			String palabra = sn.nextLine();
			ficha = usuarioMueveFicha(palabra,tablero);
			while(ficha == false) {
				System.out.println("Has introducido una posicion erronea, vuelve a introducir una");
				palabra = sn.nextLine();
				ficha = usuarioMueveFicha(palabra,tablero);
				imprimeTablero(tablero);
			}
			
			if (x==0) {
				o1 = conviertePosicionMovimiento(palabra);
			}else if(x==1) {
				o2 = conviertePosicionMovimiento(palabra);
			}else if (x==2) {
				o3 = conviertePosicionMovimiento(palabra);
			}
			
			if(ganaUsuario(o1,o2,o3) == true) {
				System.out.println("Ha ganado el usuario");
				jugardenuevo = jugarOtraVez();
				if (jugardenuevo == false) {
					break;
				}else {
					x1 = 0;
					x2 = 0;
					x3 = 0;
					o1 = 0;
					o2 = 0;
					o3 = 0;
					x = -1;
					limpiarTablero(tablero);
				}
			}
			
			System.out.println("¡Turno de la maquina!");
			int fichamaquina = mueveFichaAleatoria(tablero);
			if(x==0 && fichamaquina!= -1) {
				x1 = fichamaquina;
				tablero[x1] = 2;
			}else if (x==1 && fichamaquina!= -1) {
				
				x2 = fichamaquina;
				tablero[x2] = 2;
				
			}else if (x==2 && fichamaquina!= -1) {
			
				x3 = fichamaquina;
				tablero[x3] = 2;
				
			}else {
				System.out.println("Movimiento erroneo de la maquina");
			}
			
			imprimeTablero(tablero);
			if (ganaPrograma(x1,x2,x3)== true) {
				System.out.println("La maquina ha ganado el programa");
				jugardenuevo = jugarOtraVez();
				if (jugardenuevo == false) {
					break;
				}else {
					x1 = 0;
					x2 = 0;
					x3 = 0;
					o1 = 0;
					o2 = 0;
					o3 = 0;
					x = -1;
					limpiarTablero(tablero);
				}
			}else if(x==2) {
				System.out.println("¡Empate!");
				jugardenuevo = jugarOtraVez();
				if (jugardenuevo == false) {
					break;
				}else {
					x1 = 0;
					x2 = 0;
					x3 = 0;
					o1 = 0;
					o2 = 0;
					o3 = 0;
					x = -1;
					limpiarTablero(tablero);
			}
		
			
			}
			
		}
		
	}

	
	public static boolean jugarOtraVez() {
		System.out.println("¿Quieres jugar otra vez? (s/n)");
		Scanner sn = new Scanner(System.in);
		String jugarotravez = sn.nextLine();
		if (jugarotravez.equalsIgnoreCase("s")){
			
			return true;
		}else if(jugarotravez.equalsIgnoreCase("n")){
			System.out.println("¡Adios!");
			return false;
		}else {
			System.out.println("No has introducido una opcion válida, se intuye que no quieres seguir jugando.");
			System.out.println("¡Adios!");
			return false;
		}
		
	}
	public static void imprimeTablero(int[] tablero) {
		
		for(int x=0;x<tablero.length;x++) {
			if (x==3 || x==6) {
				System.out.println("");
			}
			if (tablero[x] == 0) {
				System.out.print("   -");
			}else if(tablero[x] == 1){
				System.out.print("   O");
			}else if(tablero[x] == 2) {
				System.out.print("   X");
			} 
		}
		System.out.println("");
	}
	public static int mueveFichaAleatoria(int[] tablero) {
		
		int x= (int)Math.floor(Math.random()*(9));

		if (tablero[x] == 0) {
			return x;
		}else {
			x= (int)Math.floor(Math.random()*(9));
			if (tablero[x] == 0) {
				return x;
		}
		}
		return -1;
	}
	public static int conviertePosicionMovimiento(String palabra) {
		/*
		switch (palabra) {
		case "ARRIBA IZQUIERDA": {
			return 0;
		}
		case "ARRIBA CENTRO":{
			return 1;
		}
		case "ARRIBA DERECHA":{
			return 2;
		}
		case "CENTRO IZQUIERDA":{
			return 3;
		}
		case "CENTRO CENTRO":{
			return 4;
		}
		case "CENTRO DERECHA":{
			return 5;
		}
		case "ABAJO IZQUIERDA":{
			return 6;
		}
		case "ABAJO CENTRO":{
			return 7;
		}
		case "ABAJO DERECHA":{
			return 8;
		}
		default:
			return -1;
		}
		*/
		if (palabra.equalsIgnoreCase("arriba izquierda")) {
			return 0;
		}else if (palabra.equalsIgnoreCase("arriba centro")) {
			return 1;
		}else if (palabra.equalsIgnoreCase("arriba derecha")) {
			return 2;
		}else if (palabra.equalsIgnoreCase("centro izquierda")) {
			return 3;
		}else if (palabra.equalsIgnoreCase("centro centro")) {
			return 4;
		}else if (palabra.equalsIgnoreCase("centro derecha")) {
			return 5;
		}else if (palabra.equalsIgnoreCase("abajo izquierda")) {
			return 6;
		}else if (palabra.equalsIgnoreCase("abajo centro")) {
			return 7;
		}else if (palabra.equalsIgnoreCase("abajo derecha")) {
			return 8;
		}else {
			return -1;
		}
	}
	
	public static boolean usuarioMueveFicha(String palabra, int[] tablero) {
		
		int palabraennumero = conviertePosicionMovimiento(palabra);
		
		if (palabraennumero == -1) {
			return false;
		}else if(tablero[palabraennumero] == 0) {
			tablero[palabraennumero] = 1;
			return true;
		}else {
			return false;
		}
			
	}

	public static void limpiarTablero(int[] tablero){
		
		for(int x = 0; x<tablero.length;x++) {
			tablero[x] = 0;
		}
		
	}
	
	public static boolean ganaPrograma (int x1, int x2, int x3) {

		
		if ((x1==0 && x2==1 && x3==2) || (x1==0 && x2==2 && x3==1) || (x1==1 && x2==0 && x3==2) || (x1==1 && x2==2 && x3==0) || (x1==2 && x2==1 && x3==0) || (x1==2 && x2==0 && x3==1) ) {
			return true;
		}else if ((x1==3 && x2==4 && x3==5) || (x1==3 && x2==5 && x3==4) || (x1==4 && x2==3 && x3==5) || (x1==4 && x2==5 && x3==3) || (x1==5 && x2==4 && x3==3) || (x1==5 && x2==3 && x3==4) ) {
			return true;
		}else if((x1==6 && x2==7 && x3==8) || (x1==6 && x2==8 && x3==7) || (x1==7 && x2==6 && x3==8) || (x1==7 && x2==8 && x3==6) || (x1==8 && x2==7 && x3==6) || (x1==8 && x2==6 && x3==7) ){
			return true;
		}else if((x1==0 && x2==3 && x3==6) || (x1==0 && x2==6 && x3==3) || (x1==3 && x2==0 && x3==6) || (x1==3 && x2==6 && x3==0) || (x1==6 && x2==3 && x3==0) || (x1==6 && x2==0 && x3==3) ){
			return true;
		}else if((x1==1 && x2==4 && x3==7) || (x1==1 && x2==7 && x3==4) || (x1==4 && x2==1 && x3==7) || (x1==4 && x2==7 && x3==1) || (x1==7 && x2==4 && x3==1) || (x1==7 && x2==1 && x3==4) ){
			return true;
		}else if((x1==2 && x2==5 && x3==8) || (x1==2 && x2==8 && x3==5) || (x1==5 && x2==2 && x3==8) || (x1==5 && x2==8 && x3==2) || (x1==8 && x2==5 && x3==2) || (x1==8 && x2==2 && x3==5) ){
			return true;
		}else if((x1==0 && x2==4 && x3==8) || (x1==0 && x2==8 && x3==4) || (x1==4 && x2==0 && x3==8) || (x1==4 && x2==8 && x3==0) || (x1==8 && x2==4 && x3==0) || (x1==8 && x2==0 && x3==4) ){
			return true;
		}else if((x1==2 && x2==4 && x3==6) || (x1==2 && x2==6 && x3==4) || (x1==4 && x2==2 && x3==6) || (x1==4 && x2==6 && x3==2) || (x1==6 && x2==2 && x3==4) || (x1==6 && x2==4 && x3==2) ){
			return true;
		}else {
			return false;
		}
		
	}

	public static boolean ganaUsuario (int o1, int o2, int o3) {

		
		if ((o1==0 && o2==1 && o3==2) || (o1==0 && o2==2 && o3==1) || (o1==1 && o2==0 && o3==2) || (o1==1 && o2==2 && o3==0) || (o1==2 && o2==1 && o3==0) || (o1==2 && o2==0 && o3==1) ) {
			return true;
		}else if ((o1==3 && o2==4 && o3==5) || (o1==3 && o2==5 && o3==4) || (o1==4 && o2==3 && o3==5) || (o1==4 && o2==5 && o3==3) || (o1==5 && o2==4 && o3==3) || (o1==5 && o2==3 && o3==4) ) {
			return true;
		}else if((o1==6 && o2==7 && o3==8) || (o1==6 && o2==8 && o3==7) || (o1==7 && o2==6 && o3==8) || (o1==7 && o2==8 && o3==6) || (o1==8 && o2==7 && o3==6) || (o1==8 && o2==6 && o3==7) ){
			return true;
		}else if((o1==0 && o2==3 && o3==6) || (o1==0 && o2==6 && o3==3) || (o1==3 && o2==0 && o3==6) || (o1==3 && o2==6 && o3==0) || (o1==6 && o2==3 && o3==0) || (o1==6 && o2==0 && o3==3) ){
			return true;
		}else if((o1==1 && o2==4 && o3==7) || (o1==1 && o2==7 && o3==4) || (o1==4 && o2==1 && o3==7) || (o1==4 && o2==7 && o3==1) || (o1==7 && o2==4 && o3==1) || (o1==7 && o2==1 && o3==4) ){
			return true;
		}else if((o1==2 && o2==5 && o3==8) || (o1==2 && o2==8 && o3==5) || (o1==5 && o2==2 && o3==8) || (o1==5 && o2==8 && o3==2) || (o1==8 && o2==5 && o3==2) || (o1==8 && o2==2 && o3==5) ){
			return true;
		}else if((o1==0 && o2==4 && o3==8) || (o1==0 && o2==8 && o3==4) || (o1==4 && o2==0 && o3==8) || (o1==4 && o2==8 && o3==0) || (o1==8 && o2==4 && o3==0) || (o1==8 && o2==0 && o3==4) ){
			return true;
		}else if((o1==2 && o2==4 && o3==6) || (o1==2 && o2==6 && o3==4) || (o1==4 && o2==2 && o3==6) || (o1==4 && o2==6 && o3==2) || (o1==6 && o2==2 && o3==4) || (o1==6 && o2==4 && o3==2) ){
			return true;
		}else {
			return false;
		}
		
	}

}