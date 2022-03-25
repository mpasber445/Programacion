
public class ejercicio_tres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int carta = (int)Math.floor(Math.random()*(11-1)+1);
		int palo = (int)Math.floor(Math.random()*(5-1)+1);
		
		
		switch(carta) {
		
		case 1:
			System.out.print("Tu carta es el as de ");
			break;
		case 2:
			System.out.print("Tu carta es el dos de ");
			break;
		case 3:
			System.out.print("Tu carta es el tres de ");
			break;
		case 4:
			System.out.print("Tu carta es el cuatro de ");
			break;
		case 5:
			System.out.print("Tu carta es el cinco de ");
			break;
		case 6:
			System.out.print("Tu carta es el seis de ");
			break;
		case 7:
			System.out.print("Tu carta es el siete de ");
			break;
		case 8:
			System.out.print("Tu carta es la sota de ");
			break;
		case 9:
			System.out.print("Tu carta es el caballo de ");
			break;
		case 10:
			System.out.print("Tu carta es el rey de ");
			break;
		
		
		}
		
		switch(palo) {
		
		case 1:
			System.out.print("oro");
			break;
		case 2:
			System.out.print("copas");
			break;
		case 3:
			System.out.print("espadas");
			break;
		case 4:
			System.out.print("bastos");
			break;
		
		}
		
	}

}
