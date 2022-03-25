import java.util.Scanner;


public class ejercicio_ocho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		
		System.out.println("Introduce el numero del que quieres mostrar la tabla de multiplicar");
		int numerousuario = sn.nextInt();
		
		
		for (int x = 1;x<=10;x++) {
			
		
			System.out.println(numerousuario + " x " + x + " = " + (numerousuario*x));
			
		}
		
		
		sn.close();
		
	}

}
