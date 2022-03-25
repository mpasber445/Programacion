
public class ejercicio_once {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dado1 = 1;
		int dado2 = 0;
		
		while (dado1 != dado2) {
		 dado1 = (int)Math.floor(Math.random()*(7-1)+1);
		 dado2 = (int)Math.floor(Math.random()*(7-1)+1);
		 System.out.println("El primer dado ha salido con el valor de " + dado1);
		 System.out.println("El segundo dado ha salido con el valor de " + dado2);
		}
		
	}

}
