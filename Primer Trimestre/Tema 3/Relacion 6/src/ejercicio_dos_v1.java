import java.util.Scanner;


public class ejercicio_dos_v1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		System.out.println("Jugador 1, introduce la contraseņa");
		String contraseņa = sn.next();
		boolean adivinado = false;
		
		for (int i = 0; i < 50; ++i) {
			System.out.println();
			}
		
		System.out.println("Jugador 2, la contraseņa tiene " + contraseņa.length() + " caracteres de longitud");
		System.out.println("El primer caracter de la contraseņa es " + contraseņa.charAt(0) + " y el ultimo caracter es " + contraseņa.charAt(contraseņa.length()-1) );

		while (adivinado == false) {
			System.out.println("Jugador 2, introduce la contraseņa");
			String contraseņajugadordos = sn.next();
			if(contraseņa.equalsIgnoreCase(contraseņajugadordos)) {
				adivinado = true;
			}
		}
		
		System.out.println("Enhorabuena jugador 2, has adivinado la contraseņa");
		sn.close();
	}

}
