
public class ejercicio_cinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] num = new int[6][10];
		int maximox = 0;
		int maximoy = 0;
		int maximo = 0;
		int minimo = 2000;
		int minimox = 0;
		int minimoy = 0;

		for(int x=0;x<=5;x++) {
			
			for(int y=0;y<=9;y++) {
				
				num[x][y] = (int)Math.floor(Math.random()*(1001));
				
			}
			
		}
		
		for(int x=0;x<=5;x++) {
			
			for(int y=0;y<=9;y++) {
				
				if (num[x][y] > maximo) {
					
					maximo = num[x][y];
					maximox=x;
					maximoy=y;
					
				}
				
			}
			
		}
		
		for(int x=0;x<=5;x++) {
			
			for(int y=0;y<=9;y++) {
				
				if (num[x][y] < minimo) {
					
					minimo = num[x][y];
					minimox=x;
					minimoy=y;
					
				}
				
			}
			
		}
		
		System.out.println("El numero maximo es " + maximo + " y se encuentra en la coordenada x: " + maximox + " y: " + maximoy);
		System.out.println("El numero minimo es " + minimo + " y se encuentra en la coordenada x: " + minimox + " y: " + minimoy);

	}

}
