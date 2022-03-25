import java.util.Scanner;

public class ejercicio_doce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		int[] numeros = new int[10];
		System.out.println("Introduce 10 numeros");
		int posinicial = 0;
		int posfinal = 0;
		boolean cumple = false;
		int cajon = 0;

		
		for(int x = 0; x<=9;x++) {
			
		numeros[x] = sn.nextInt();	
			
		}
		
		cajon=numeros[9];
		
		
		System.out.println("Array inicial:");
		
		for(int x=0;x<=9;x++) {
			
			System.out.print(numeros[x] + " ");
			
		}
		
		System.out.println(" ");
		while(cumple == false) {
			
			System.out.println("Introduce una posicion inicial");
			posinicial = sn.nextInt();
			System.out.println("Introduce una posicion final");
			posfinal = sn.nextInt();
			
			if (posinicial>=0 && posinicial<=9 && posfinal>=0 && posfinal<=9) {
				
				cumple = true;
				
			}
			
		}
		
		int cajondos = numeros[posinicial];
		
	
		for (int x = 9; x>=(posfinal+1);x--) {

			numeros[x] = numeros[x-1];
			
		}
		
		for (int x = posinicial; x>0;x--) {

			numeros[x] = numeros[x-1];
			
		}

		numeros[0] = cajon;
		numeros[posfinal] = cajondos;

		
		System.out.println("Array Final");
		
		for (int x=0;x<=9;x++) {
			
			System.out.print(numeros[x] + " ");
		}
		
		sn.close();
	}

}
