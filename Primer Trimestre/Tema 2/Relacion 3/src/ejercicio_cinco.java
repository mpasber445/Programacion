
public class ejercicio_cinco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador = 50;
		int contadordos = 0;
		int numeromaximo = 0;
		int numerominimo = 99999;
		
		
		while (contador >= 0) {
			
			int numerorandom = (int)Math.floor(Math.random()*(200-100)+100);

			System.out.print(numerorandom + " ");
			
			contadordos = contadordos+numerorandom;
			
			if (numeromaximo < numerorandom) {
				
				numeromaximo = numerorandom;
				
			}
			
			if (numerominimo>numerorandom) {
				
				numerominimo = numerorandom;
				
			} 
			
			contador--;
			
		}
		
		System.out.println("");
		
		System.out.println("El numero maximo es " + numeromaximo + " el numero minimo es " + numerominimo + " y la media de todos los numeros introducidos es " + (contadordos/50));
		
	}

}
