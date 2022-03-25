
public class ejercicio_nueve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int x = 1; x<=1000;x++) {
			
			if(esPrimo(x) == true) {
				System.out.println("El numero " + x + " es primo");
			}
				
		}
			
	}
	
	
	public static boolean esPrimo(int num) {
		
		int contador = 0;
		
		for(int x=2;x<num;x++) {
			if (num%x == 0) {
				contador++;
			}
		}
		
		if (contador == 0) {
			return true;
		}else {
			return false;
		}
	}
}
