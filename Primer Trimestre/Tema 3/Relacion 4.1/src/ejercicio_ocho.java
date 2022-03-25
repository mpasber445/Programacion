import java.util.Scanner;

public class ejercicio_ocho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		int[] temperatura = new int[12];
		
		for (int x = 0 ; x<=11;x++) {
			
			System.out.println("Introduce la temperatura media del mes " + (x+1));
			temperatura[x] = sn.nextInt();
		}
		
		for (int x=0;x<=11;x++) {
			
			if (x<9) {
				
				System.out.print("Mes " + (x+1) + ":   ");
				
			}else {
				
				System.out.print("Mes " + (x+1) + ":  ");
				
			}
			
			for(int y = 1;y<=temperatura[x];y++) {
				System.out.print("*");
				
			}
			System.out.println(" ");
		}
		
		sn.close();
		
	}

}
