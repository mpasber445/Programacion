
public class ejercicio_tres {
	
	public static void main(String[] args) {
		
		int[][] num = new int[4][5];	
		int sumafila = 0;
		
	
		for(int x=0;x<=3;x++) {
			
			for(int y=0;y<=4;y++) {
				
				num[x][y] = (int)Math.floor(Math.random()*(999-100)+100);
				
			}
			
		}
		
		for(int x = 0; x<=4;x++) {
			
			System.out.print("       Columna " + x );
			
		}
		System.out.print("       Suma ");
		System.out.println("");
		System.out.print("Fila 1:    ");
		for(int x = 0; x<=4;x++) {
			
			System.out.print(num[0][x] + "            ");
			sumafila += num[0][x];
		}
		System.out.print(sumafila);
		sumafila = 0;
		System.out.println(" ");
		System.out.print("Fila 2:    ");

		for(int x = 0; x<=4;x++) {
			
			System.out.print(num[1][x] + "            ");
			sumafila += num[1][x];
			
		}
		System.out.print(sumafila);
		sumafila = 0;
		System.out.println(" ");
		System.out.print("Fila 3:    ");

		for(int x = 0; x<=4;x++) {
			
			System.out.print(num[2][x] + "            ");
			sumafila += num[2][x];
		}
		System.out.print(sumafila);
		sumafila = 0;
		System.out.println(" ");
		System.out.print("Fila 4:    ");

		for(int x = 0; x<=4;x++) {
			
			System.out.print(num[3][x] + "            ");
			sumafila += num[3][x];
		}
	
		System.out.print(sumafila);
		sumafila = 0;
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.print("Suma:    ");
	
		for(int x = 0; x<=4;x++) {
			for(int y=0 ;y<=3;y++) {
				
				sumafila += num[y][x];
			}
			System.out.print(sumafila + "           ");
			sumafila = 0;
			
		}
		
		for(int x = 0; x<=4;x++) {
			for(int y=0 ;y<=3;y++) {
				
				sumafila += num[y][x];
			}
			
		}
		System.out.print(sumafila + "           ");
	}
	
}
