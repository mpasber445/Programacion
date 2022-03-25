import java.util.Scanner;


public class ejercicio_dos_v1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		System.out.println("Jugador 1, introduce la contraseña");
		String contraseña = sn.next();
		boolean adivinado = false;
		
		for (int i = 0; i < 50; ++i) {
			System.out.println();
			}
		
		System.out.println("Jugador 2, la contraseña tiene " + contraseña.length() + " caracteres de longitud");
		System.out.println("El primer caracter de la contraseña es " + contraseña.charAt(0) + " y el ultimo caracter es " + contraseña.charAt(contraseña.length()-1) );

		while (adivinado == false) {
			System.out.println("Jugador 2, introduce la contraseña");
			String contraseñajugadordos = sn.next();
			if(contraseña.equalsIgnoreCase(contraseñajugadordos)) {
				adivinado = true;
			}
		}
		
		System.out.println("Enhorabuena jugador 2, has adivinado la contraseña");
		sn.close();
	}

}
