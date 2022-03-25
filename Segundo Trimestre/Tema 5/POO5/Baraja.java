package POO5;

public class Baraja {

	static int contador = 39;
	
	public static void main(String[] args) {
		
		Carta baraja[] = new Carta[40];
		
		crear(baraja);
		System.out.println(cartasDisponibles());
		System.out.println(siguienteCarta(baraja));
		darCartas(5,baraja);
		System.out.println(cartasDisponibles());
		barajar(baraja);
		darCartas(5,baraja);
		
		
		
	}
	
	
	public static void crear(Carta[] baraja){
		
		for (int x = 0;x<baraja.length;x++) {
			
			for (int y = 1;y<=4;y++) {
			
				for (int z = 1;z<=10;z++) {
					
					baraja[x] = new Carta(z,y);
					x++;
					
				}
				
			}
			
		}
		
	}
	
	public static void barajar(Carta[] baraja) {
		
		for (int x = 0;x<baraja.length;x++) {
			
			int random = (int)Math.floor(Math.random()*((contador+1)-1)+1);
			int randomdos = (int)Math.floor(Math.random()*((contador+1)-1)+1);
			Carta aux = baraja[random];
			baraja[random] = baraja[randomdos];
			baraja[randomdos] = aux;
			
		}
		
	}
	
	public static String siguienteCarta(Carta[] baraja) {
		
		
		if (contador < 0) {
			return "Ya has terminado la baraja";
		}else {
			Carta a = baraja[contador];
			contador--;
			return a.toString(); 
		}
		
		
	}
	
	public static int cartasDisponibles() {
		
		return contador+1;
	}

	public static void darCartas(int cantidad, Carta[] baraja) {
		
		for (int x = 0;x<cantidad;x++) {
			
			if (contador<0) {
				System.out.println("Has terminado la baraja");
				break;
			}else {
				
				Carta a = baraja[contador];
				contador--;
				System.out.println(a.toString());
				
			}
			
		}
		
	}
	
	public void mostrarMonton (Carta[] baraja) {
		
		int contadoraux = 39-contador; 
		
		if (contadoraux == 0) {
			System.out.println("Aun no ha salido ninguna carta");
		}else {
			
			for (int x = 39;x>contadoraux;x--) {
					
					Carta a = baraja[x];
					System.out.println(a.toString());
					
				}
				
			}
		
	}
	
	
	public static void mostrarBaraja(Carta[] baraja) {
		
		int contadoraux = contador;
		
		for (int x = 0;x<contadoraux;x++) {
			
			if (contadoraux<0) {
				break;
			}else {
				
				Carta a = baraja[x];
				System.out.println(a.toString());
				
			}
			
		}
		
		
	}
	
}
