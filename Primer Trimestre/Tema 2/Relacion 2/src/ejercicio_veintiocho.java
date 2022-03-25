import java.util.Scanner;
public class ejercicio_veintiocho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		int numerousuario = 0;
		int factorial = 1;
		
		System.out.println("Introduce un numero");
		numerousuario = sn.nextInt();
		
		for(int x=1;x<=numerousuario;x++) {
			
		factorial = (factorial*x);
			
		} 
		
		System.out.println("El factorial de " + numerousuario + " es " + factorial);
		sn.close();
	}

}
