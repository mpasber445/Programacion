
public class ejercicio_uno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] num = new int[3][6];
		
		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;
		num[1][0] = 75;
		num[1][4] = 0;
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;
		
		for(int x = 0; x<=5;x++) {
			
			System.out.print("    Columna " + x );
			
		}
		System.out.println("");
		System.out.print("Fila 1:    ");
		for(int x = 0; x<=5;x++) {
			
			System.out.print(num[0][x] + "            ");
			
		}
		
		System.out.println(" ");
		System.out.print("Fila 2:    ");

		for(int x = 0; x<=5;x++) {
			
			System.out.print(num[1][x] + "            ");
			
		}
		System.out.println(" ");
		System.out.print("Fila 3:    ");

		for(int x = 0; x<=5;x++) {
			
			System.out.print(num[2][x] + "            ");
			
		}
		
	}

}
