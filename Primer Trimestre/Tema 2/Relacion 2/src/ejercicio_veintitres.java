import java.util.Scanner;

public class ejercicio_veintitres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		int contador = 0;
		int media = 0;
		
		Scanner sn = new Scanner(System.in);
		
		while (num < 10000) {
			
			System.out.println("Introduce un numero para añadir a la suma");
			num = num + sn.nextInt();
			contador++;
		}
		
		media = num/contador;
		System.out.println("Has superado el limite de 10000");
		System.out.println("La suma total es " + num + ". la cantidad de numeros introducidos es " + contador + " Y la media es " + media);
		
		sn.close();
		
	}

}
