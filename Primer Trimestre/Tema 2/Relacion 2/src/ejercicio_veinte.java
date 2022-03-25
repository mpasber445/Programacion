import java.util.Scanner;

public class ejercicio_veinte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sn = new Scanner(System.in);
		
		System.out.println("Introduce el alto de la piramide");
		int alto = sn.nextInt();
		System.out.println("Introduce el caracter con el que quieres que se haga la piramide");
		String caracter = sn.next();
		int ancho = 0;
		int caracteresintroducidos = 0;
		
		for (int k=1;k<=alto-1;k++) {
			System.out.print(" ");
		}
		
		System.out.print(caracter);
		System.out.println("");
		
		for (int x=2;x<=alto-1;x++) {
			
			for (int y=1;y<=alto-x;y++) {
				System.out.print(" "); //Espacios en blanco al principio
			}
		
			ancho = (x*2)-3; //Espacios en blanco en medio
			
			
				if (caracteresintroducidos == 0){
				System.out.print(caracter);
				for (int z=1;z<=ancho;z++) {
					
					System.out.print(" "); //Espacios en blanco en medio
				}
				
				caracteresintroducidos++;
				
				} 
				
				if (caracteresintroducidos == 1) {
					
					System.out.print(caracter);
					caracteresintroducidos = 0;
				}
				
			
		System.out.println("");
		}
		
		System.out.print(caracter);
		for (int t=1;t<=alto-1;t++) {
			System.out.print(" ");
			System.out.print(caracter);
		}

		
		
		
		
		sn.close();
		
	}
		

}
