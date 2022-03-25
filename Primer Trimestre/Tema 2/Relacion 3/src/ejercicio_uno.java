
public class ejercicio_uno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("El programa va a proceder a tirar tres dados");
		
		int dado1 = (int)Math.floor(Math.random()*(7-1)+1);
		int dado2 = (int)Math.floor(Math.random()*(7-1)+1);
		int dado3 = (int)Math.floor(Math.random()*(7-1)+1);

		
		System.out.println("El primer dado ha dado un resultado de: " + dado1);
		System.out.println("El segundo dado ha dado un resultado de: " + dado2);
		System.out.println("El tercer dado ha dado un resultado de: " + dado3);
		
		System.out.println("La suma de los tres dados es: " + (dado1+dado2+dado3));
		
	}

}
