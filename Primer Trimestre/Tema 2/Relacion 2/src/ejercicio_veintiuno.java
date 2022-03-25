import java.util.Scanner;

public class ejercicio_veintiuno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		int num = 0;
		int cont = 0;
		int contmedia = 0;
		int contmediados = 0;
		int nummayor = 0;
		
		while (num >= 0) {
		
			System.out.println("Introduce un numero positivo, para salir del bucle introduce uno negativo");
			num = sn.nextInt();
			cont++;
			if (num == 0) {
				
				System.out.println("Has introducido un numero que es cero.");
				
			}else if (num < 0) {
				
				
			} else if (num%2 == 0) {
				
				if(num>nummayor) {
					
					nummayor = num;
					
				}
				
			}else {
				
				contmediados = contmediados+num;
				contmedia++;
			}
			
		}
		
		int media = 1;
		if (contmedia >= 1) {
		media = contmediados/contmedia;
		}
		System.out.println("Has introducido un total de " + cont + " numeros. La media de todos los numeros impares introducidos es " + media + ". El numero par mayor introducido es " + nummayor);
		
		sn.close();
	}

}
