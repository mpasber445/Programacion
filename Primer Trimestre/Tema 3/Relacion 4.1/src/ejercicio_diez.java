
public class ejercicio_diez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = new int[20];
		int[] pares = new int[20];
		int[] resto = new int [20];
		int y = 0;
		int z = 0;
		int a = 0;
		
		for(int x=0;x<19;x++) {
			
			numeros[x] = (int)Math.floor(Math.random()*(100));
			
		}
		System.out.println("Generados:");
		for(int x=0;x<19;x++) {
			
			System.out.print(numeros[x] + " ");
		}
		System.out.println(" ");
		
		for(int x=0;x<19;x++) {
			
			pares[x] = 3;
			
		}
		
		for(int x=0;x<19;x++) {
			
			if(numeros[x]%2==0) {
				
				pares[y]=numeros[x];
				y++;
				
			}else {
				
				resto[z] = numeros[x];
				z++;
				
			}
			
		}
		
		for(int x=0;x<19;x++) {
			
			if(pares[x]%2==0) {
				
				numeros[x] = pares[x];
				
			}else {
				
				numeros[x] = resto[a];
				a++;
				
			}
			
		}
		
		System.out.println("Ordenados:");
		
		for(int x=0;x<19;x++) {
			
			System.out.print(numeros[x] + " ");
		}
		
		
	}

}
