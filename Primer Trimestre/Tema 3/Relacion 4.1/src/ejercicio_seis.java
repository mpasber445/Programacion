import java.util.Scanner;

public class ejercicio_seis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		int[] numero = new int[15];
		int cajon = 0;
		
		System.out.println("Introduce 15 numeros");
		for (int x = 0 ; x<=14 ; x++) {
			
			numero[x] = sn.nextInt();
		}
		
		cajon = numero[14];
		
		for (int x = 14; x>=1;x--) {

			numero[x] = numero[x-1];
			
		}

		numero[0] = cajon;
		
		for (int x=0;x<=14;x++) {
			
			System.out.print(numero[x] + " ");
			
		}
		
		sn.close();

	}

}
