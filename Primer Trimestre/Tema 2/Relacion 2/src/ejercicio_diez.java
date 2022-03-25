import java.util.Scanner;

public class ejercicio_diez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sn = new Scanner(System.in);
	
	double x = 1;
	double cuenta = 0;
	double y = 0;
	
	while (x > 0) {
		
		System.out.println("Introduce un numero para añadir a la media");
		x = sn.nextInt();
		
		if (x>0) {
			cuenta++;
			y = y+x;
		}
		
		
		
	}
		
	double media = y/cuenta;
	
	System.out.println("Has introducido un numero negativo por lo cual has parado el programa");
	System.out.println("La media de los numeros introducidos es = " + media );
		
		sn.close();
	}
}
