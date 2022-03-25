import java.util.Scanner;
public class ejercicio_trece {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArr1 = new int[10];
		int cuentapos = 0;
		int cuentaneg = 0;
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Introduce 10 numeros");
		
		for (int x=0;x<10;x++) {
			
		intArr1[x] = sn.nextInt();
			
		}
		
		for (int x=0;x<10;x++) {
			
		if (intArr1[x] > 0) {
			
			System.out.println("El numero " + intArr1[x] + " es positivo");
			System.out.println("");
			cuentapos++;
			
		}else if (intArr1[x] < 0) {
			
			System.out.println("El numero " + intArr1[x] + " es negativo");
			cuentaneg++;
			
		}
				
		}
		
		System.out.println("En total hay " + cuentapos + " numeros positivos y " + cuentaneg + " numeros negativos.");
		
		sn.close();
	}

}
