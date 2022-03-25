import java.util.Scanner;

public class ejercicio_veinticuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int n = sn.nextInt();
		int contador = 1;
		
		for (int x=1;x<=n;x++) {
			
			for (int y=1;y<=n-x;y++) {
				System.out.print(" ");
			};
			for (int z=1;z<=(x*2)-1;z++) {
				if (z<x+1) {
					
					System.out.print(z);
				
				}else {
					
					System.out.print(x-contador);
					contador++;
				}
			}
	
			contador = 1;
		System.out.println("");
		sn.close();
		}
			
	}

}
