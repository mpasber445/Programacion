import java.util.Scanner;

public class ejercicio_catorce {

	public static void main(String[] args) {
		
		//Pide la palabra al jugador 1
		Scanner sn = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		String palabra = sn.nextLine();
		boolean acertado = false;
		
		char[] uno = palabra.toCharArray();

		//Desordena la palabra para mostrarsela al segundo jugador
		for (int c = 0; c<palabra.length();c++) {
			int random = (int) Math.floor(Math.random()*palabra.length());
			int randomdos = (int) Math.floor(Math.random()*palabra.length());
			char guardauno = uno[random];
			uno[random] = uno[randomdos];
			uno[randomdos] = guardauno;
		}
		
		for(int s=0;s!=20;s++) {
			System.out.println("");
		}
		
		//Muestra la palabra desordenada para que el usuario intente averiguarla
		System.out.println("Un anagrama de la palabra introducida es ".concat(mostrararray(uno)));
		
		
		//Pregunta al usuario la palabra y si la acierta termina el juego
		while (acertado == false) {
		
			System.out.println("Introduce la palabra");
			String palabrados = sn.nextLine();
			
			if (palabra.equalsIgnoreCase("") || palabra.equalsIgnoreCase(" ")){
				System.out.println("No has introducido ninguna palabra");
			}else if (palabrados.equalsIgnoreCase(palabra)) {
				System.out.println("Has ganado el juego");
				acertado = true;
			}
		}
				
		sn.close();
	}
	
	public static String mostrararray(char[] a) {
		
		String b = "";
		
		for (int x=0;x<a.length;x++) {
			b+= a[x];
		}
		
		return b;
		
	}
	
}
