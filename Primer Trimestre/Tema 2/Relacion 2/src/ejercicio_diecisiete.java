import java.util.Scanner;

public class ejercicio_diecisiete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sn = new Scanner(System.in);
		
		
		System.out.println("Introduce un numero");
		int num = sn.nextInt();
		
		
		while(num<=0) {
			
			System.out.println("El numero debe ser positivo y entero");
			System.out.println("Introduce un numero");
			num = sn.nextInt();
		}
		
		int numfinal = num+100;
		int resultado = 0;
		int y = 0;
		
		for (int x=num+1;x<=numfinal;x++) {
			
		resultado = x+y;
			
		System.out.println(resultado);
		
		 y = resultado;
		
		}
		
		sn.close();
	}

}
