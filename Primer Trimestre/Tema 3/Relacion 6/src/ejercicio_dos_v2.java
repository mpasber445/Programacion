import java.util.Scanner;


public class ejercicio_dos_v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		System.out.println("Jugador 1, introduce la contrase�a");
		String contrase�a = sn.next();
		int comparacion;
		boolean adivinado = false;
		
		for (int i = 0; i < 50; ++i) {
			System.out.println();
			}
		
		System.out.println("Jugador 2, la contrase�a tiene " + contrase�a.length() + " caracteres de longitud");
		System.out.println("El primer caracter de la contrase�a es " + contrase�a.charAt(0) + " y el ultimo caracter es " + contrase�a.charAt(contrase�a.length()-1) );

		while (adivinado == false) {
			System.out.println("Jugador 2, introduce la contrase�a");
			String contrase�ajugadordos = sn.next();
			comparacion = contrase�a.compareTo(contrase�ajugadordos);
			if(contrase�a.equalsIgnoreCase(contrase�ajugadordos)) {
				adivinado = true;
			}else if (comparacion < 0) {
				System.out.println("La contrase�a introducida es menor alfabeticamente que la original");
			}else if (comparacion > 0) {
				System.out.println("La contrase�a introducida es mayor alfabeticamente que la original");
			}
		}
		
		System.out.println("Enhorabuena jugador 2, has adivinado la contrase�a");
		sn.close();
	}

}
