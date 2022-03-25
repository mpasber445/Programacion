import java.util.Scanner;

public class ejercicio_dieciseis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean primo = true;
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Introduce un numero y te diré si es primo o no");
		int num = sn.nextInt();
		
		    for(int i = 2; i < num; i++) {
		        if (num % i == 0) {
		        	primo = false;
		        }
		}
		
		    if (primo == false) {
		    	
		    	System.out.println("El numero no es primo");
		    	
		    }else {
		    	
		    	System.out.println("El numero es primo");
		    	
		    }
		    
		sn.close();
	}

}
