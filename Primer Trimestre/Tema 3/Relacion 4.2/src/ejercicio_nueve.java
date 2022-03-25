
public class ejercicio_nueve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[][] numero = new int[12][12];
		int cajon = 0;

		for (int x = 0; x<=11;x++) {

			for(int y = 0;y<=11;y++) {
			
				numero[x][y] = (int)Math.floor(Math.random()*(10-1)+1);
				
			}			
		}
		
		for (int x = 0; x<=11;x++) {

			for(int y = 0;y<=11;y++) {
			
				System.out.print(numero[x][y] + " ");
				
			}
			System.out.println(" ");
			
		}
		
		System.out.println("------------------------------------");
		
		for (int x = 0; x<=11;x++) {

			cajon = numero[x][11];
			
			for(int y = 11;y>=1;y--) {
			
				numero[x][y] = numero[x][y-1];				
			}
				
			numero [x][0] = cajon;
		}
		
		for (int x = 0; x<=11;x++) {

			for(int y = 0;y<=11;y++) {
			
				System.out.print(numero[x][y] + " ");
				
			}
			System.out.println(" ");
			
		}
		
	}

}
