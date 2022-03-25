import java.util.Scanner;

public class ejercicio_catorce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);

		System.out.println("Introduce la base");
		int base = sn.nextInt();
		System.out.println("Introduce el exponente");
		int exponente = sn.nextInt();
		
		System.out.println("El resultado es " + Math.pow(base, exponente));
		
	
		sn.close();
	}

}
