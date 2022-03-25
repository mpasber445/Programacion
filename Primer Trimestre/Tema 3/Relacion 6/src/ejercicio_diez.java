import java.util.Scanner;

public class ejercicio_diez {
	
	public static void main(String[] args) {
		
		char[] patron1 = "eikmpqrstuv".toCharArray();
	    char[] patron2 = "pviumterkqs".toCharArray();
		Scanner sn = new Scanner(System.in);
				
		System.out.println("Introduce la frase");
		String frasesincodificar = sn.nextLine();
		System.out.println("La frase codificada es: " + codificafrase(frasesincodificar,patron1,patron2));
		
		sn.close();
	}
	
	public static char codifica(char conjunto1[], char conjunto2[], char c) {
		
		boolean encontrado = false;
		char resultado = c;
		for (int x = 0;x<conjunto1.length && encontrado == false;x++) {
			if(Character.toLowerCase(c) == conjunto1[x]) {
				resultado= conjunto2[x];
				encontrado = true;
			}
	
			
		}
		
		return resultado;
		
	}
	
	public static String codificafrase (String frase, char conjunto1[], char conjunto2[]) {
		
		String resultado ="";
		
		for(int x = 0;x<frase.length() ;x++){
		
		resultado += codifica(conjunto1,conjunto2,frase.charAt(x));	
			
		}
		
		
		return resultado;
		
	}
	
}
