
public class ejercicio_veintidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador = 0;	
		
		for (int num = 2; num<=100 ; num++) {

		    for(int i = 2; i <= num; i++) {
		        if (num % i == 0) {
		        	contador++;
		        	
		        }
		    }
		    
		    if (contador == 1) {
		    	System.out.println(num);
		    }
		    
			contador = 0;
		}
		
	}

}
