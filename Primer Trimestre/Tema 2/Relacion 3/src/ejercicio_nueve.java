
public class ejercicio_nueve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] notas = new int[20];
	
		for (int x = 0; x<=19;x++) {
			
			notas[x] = (int)Math.floor(Math.random()*(11));
			
		}
		
		for (int x = 0; x<=19;x++) {
			
			if (notas[x] <= 4) {
				System.out.println("La nota " + (x+1) + " tiene un valor de " + notas[x] + " y es un suspenso");
			}else if (notas[x] == 5) {
				System.out.println("La nota " + (x+1) + " tiene un valor de " + notas[x] + " y es un suficiente");
			}else if (notas[x] == 6) {
				System.out.println("La nota " + (x+1) + " tiene un valor de " + notas[x] + " y es un bien");
			}else if (notas[x] == 7 || notas[x] == 8) {
				System.out.println("La nota " + (x+1) + " tiene un valor de " + notas[x] + " y es un notable");
			}else {
				System.out.println("La nota " + (x+1) + " tiene un valor de " + notas[x] + " y es un sobresaliente");
			}
			
			
		}
		
	}

}
