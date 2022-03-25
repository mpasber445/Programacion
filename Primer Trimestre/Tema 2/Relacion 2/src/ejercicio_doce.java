import java.util.Scanner;

public class ejercicio_doce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numerouno = 0;
		int numerodos = 1;
		
		Scanner sn = new Scanner(System.in);

		System.out.println("Introduce los numeros de la sucesion de Fibonacci que quieras mostrar");
		int n = sn.nextInt();
		
		System.out.println(numerouno);
		System.out.println(numerodos);
		
		if (n>0) {
		for (int u = 1;u <= (n-2);u++) {
			
			int numerotres = numerouno + numerodos;
			
			System.out.println(numerotres);
			
			numerouno = numerodos;
			numerodos = numerotres;
			
		}
		
		}else {
			
			for (int u = -1;u >= (n+2);u--) {
				
				int numerotres = numerouno + numerodos;
				
				System.out.println(numerotres);
				
				numerouno = numerodos;
				numerodos = numerotres;
				
			}
			
		}
		sn.close();
		
	}

}
