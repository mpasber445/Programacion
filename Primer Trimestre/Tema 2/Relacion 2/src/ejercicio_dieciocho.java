import java.util.Scanner;


public class ejercicio_dieciocho {
	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		int numero_uno = 0;
		int numero_dos = 0;
		
		
		System.out.println("Introduce un numero entero");
		int num_uno = sn.nextInt();
		System.out.println("Introduce el segundo numero entero");
		int num_dos = sn.nextInt();
		
		while (num_uno < 0 || num_dos < 0) {
			
			System.out.println("Los numeros introducidos deben ser positivos");
			System.out.println("Introduce un numero entero");
			 num_uno = sn.nextInt();
			System.out.println("Introduce el segundo numero entero");
			 num_dos = sn.nextInt();
			
		}
		
		while (num_uno == num_dos) {
			
			System.out.println("Los numeros deben ser distintos");
			System.out.println("Introduce un numero entero");
			 num_uno = sn.nextInt();
			System.out.println("Introduce el segundo numero entero");
			 num_dos = sn.nextInt();
		}
		
		if (num_uno < num_dos) {
			
			 numero_uno = num_uno;
			 numero_dos = num_dos;
			
		} else {
		
			 numero_uno = num_dos;
			 numero_dos = num_uno;
			
		}
		
		System.out.println(numero_uno);
		System.out.println(numero_dos);
		
		for(int x=numero_uno; x <= numero_dos; x = x+7) {
			
			System.out.println(x);
			
			sn.close();
			
		}
		 
	}
}
