
import java.util.Scanner;

public class ejercicio_nueve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		
		System.out.println("Introduce un numero y te diré cuantos digitos tiene");
		int numerousuario = sn.nextInt();
		
		if (numerousuario < 10 && numerousuario > -10) {
			
			System.out.println("Tu numero tiene un digito");
			
		}else if (numerousuario < 100 && numerousuario > -100) {
			
			System.out.println("Tu numero tiene dos digitos");
			
		}else if (numerousuario < 1000 && numerousuario > -1000) {
			
			System.out.println("Tu numero tiene tres digitos");
	
		}else if (numerousuario < 10000 && numerousuario > -10000) {
			
			System.out.println("Tu numero tiene cuatro digitos");
	
		}else if (numerousuario < 100000 && numerousuario > -100000) {
			
			System.out.println("Tu numero tiene cinco digitos");
	
		}else if (numerousuario < 1000000 && numerousuario > -1000000) {
			
			System.out.println("Tu numero tiene seis digitos");
	
		}else if (numerousuario < 10000000 && numerousuario > -10000000) {
			
			System.out.println("Tu numero tiene siete digitos");
	
		}else {
			
			System.out.println("Tu numero tiene demasiados digitos");
			
		}
		
		sn.close();
	}

}
