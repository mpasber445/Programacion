import java.util.Scanner;

public class ejercicio_cuatro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		
		System.out.println("Introduce una frase");
		String frase = sn.nextLine();
		String frasesinespacios = frase.replace(" ", "");
		System.out.println(frase);
		System.out.println(frasesinespacios);
		int espacios = frase.length()-frasesinespacios.length();
		
		
		System.out.println("La frase tiene " + espacios + " espacios");
		sn.close();
	}

}
