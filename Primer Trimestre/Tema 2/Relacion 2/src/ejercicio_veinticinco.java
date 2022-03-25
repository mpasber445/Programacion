import java.util.Scanner;


public class ejercicio_veinticinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sn = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int num = sn.nextInt();
		
		while (num>0) {
			
			System.out.print((num%10));
			
			num = num/10;
	
			
			
				}

		sn.close();
	}
	

}
