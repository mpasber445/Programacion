
import java.util.Scanner;

public class ejercicio_siete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sn = new Scanner(System.in);
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		boolean encontrado = false;
		
		while (encontrado == false) {
			
			System.out.println("Introduce el primer valor de la caja fuerte");
			int num1usuario = sn.nextInt();
			System.out.println("Introduce el segundo valor de la caja fuerte");
			int num2usuario = sn.nextInt();
			System.out.println("Introduce el tercer valor de la caja fuerte");
			int num3usuario = sn.nextInt();
			System.out.println("Introduce el cuarto valor de la caja fuerte");
			int num4usuario = sn.nextInt();
			
			if (num1usuario == num1 && num2usuario == num2 && num3usuario == num3 && num4usuario == num4) {
			
				System.out.println("El código es correcto");
				encontrado = true;
				
			}else
			{
				
				System.out.println("El código introducido es incorrecto. Vuelve a introducirlo");
				
			}
		}
	
		sn.close();
	}

}
