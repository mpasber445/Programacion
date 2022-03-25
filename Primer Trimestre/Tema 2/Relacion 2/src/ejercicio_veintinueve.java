import java.util.Scanner;

public class ejercicio_veintinueve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sn = new Scanner(System.in);
		int numerousuario = 0;
		int numerodivisible = 0;
		
		System.out.println("Introduce un numero");
		numerousuario = sn.nextInt();
		System.out.println("Introduce otro numero para comprobar si es divisible");
		numerodivisible = sn.nextInt();
		
		
		while(numerousuario>0) {
			
			if (numerousuario%numerodivisible== 0) {
				
				System.out.println(numerousuario);
				
			}
			
			numerousuario--;
			
		}
		
		sn.close();
		
		
	}

}
