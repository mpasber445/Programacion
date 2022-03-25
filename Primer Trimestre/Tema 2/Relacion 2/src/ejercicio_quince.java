import java.util.Scanner;


public class ejercicio_quince {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		
		
		System.out.println("Introduce la base");
		int base = sn.nextInt();
		System.out.println("Introduce el exponente hasta el que se desea potenciar");
		int exponente = sn.nextInt();
		
		int base2 = base;
		
		for (int x = 1; x<=exponente;x++) {
						
			System.out.println(base);
			
			
			base = base*base2;
			
			sn.close();
			
		}
		
	}

}
