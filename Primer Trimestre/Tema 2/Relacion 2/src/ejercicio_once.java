import java.util.Scanner;

public class ejercicio_once {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		int x = 1;
		
		System.out.println("Introduce el numero");
		int numerousuario = sn.nextInt();
		
		System.out.println("Numero introducido | Cuadrado | Cubo");
		System.out.println("-------------------------------------");
		
		for(x=0;x<5;x++) {
		
			double cuadrado = Math.pow(numerousuario, 2);
			double cubo = Math.pow(numerousuario, 3);
			
			System.out.println(numerousuario + " | " + cuadrado + " | " + cubo);
			System.out.println("-------------------------------------");
			numerousuario++;
			
			sn.close();
		}
		
	}

}
