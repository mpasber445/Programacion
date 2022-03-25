
public class ejercicio_cuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		
		for (int x = 0; x<19;x++) {
			
			numero[x] = (int)Math.floor(Math.random()*(100));
			
		}
		
		
		for (int x = 0; x<19;x++) {
			
			cuadrado[x] = (int)Math.pow(numero[x], 2);
					
		}
		
		for (int x = 0; x<19;x++) {
			
			cubo[x] = (int)Math.pow(numero[x], 3);
					
		}
		
		System.out.println("Numero | Cuadrado | Cubo");
		
		for (int x = 0; x<19;x++) {
			
			System.out.println(numero[x] + "|" + cuadrado[x] + "|" + cubo[x]);
					
		}
		
	}

}
