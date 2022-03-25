import java.util.Scanner;
public class ejercicio_ocho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		String frasealreves ="";
		
		System.out.println("Introduce una frase");
		String frase=sn.nextLine();
		
		frase = frase.trim();
		frase = frase.replace(" ", "");
		int tamaño = frase.length();  

		for(int i = 0; i < tamaño; i++)  
		{  
			
		frasealreves = (frasealreves + frase.charAt(frase.length() - i - 1));  
		} 

		if(frase.equalsIgnoreCase(frasealreves)) {
			System.out.println("La frase es palindroma");
		}else {
			System.out.println("La frase no es palindroma");
		}
		sn.close();
	}
	

}
