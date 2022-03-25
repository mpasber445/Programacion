import java.util.Scanner;

public class ejercicio_diecinueve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sn = new Scanner(System.in);
		
		System.out.println("Introduce el alto de la piramide");
		int alto = sn.nextInt();
		System.out.println("Introduce el caracter con el que quieres que se haga la piramide");
		String caracter = sn.next();
		
		for (int x=1;x<=alto;x++) {
			
			for (int y=1;y<=alto-x;y++) {
				System.out.print(" ");
			}
				
			for (int z=1;z<=(x*2)-1;z++) {
			System.out.print(caracter);
			}
			
		System.out.println("");
		}
		
		sn.close();
		
	}
		

}
