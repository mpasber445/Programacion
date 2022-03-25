import java.util.Arrays;
import java.util.Scanner;

public class ejercicio_doce {

	public static void main(String[] args) {
		
		
		Scanner sn = new Scanner(System.in);
		boolean anagrama = false;
		System.out.println("Introduce una palabra");
		String palabra = sn.nextLine();
		System.out.println("Introduce otra palabra");
		String palabrados = sn.nextLine();
		
		char[] uno = palabra.toCharArray();
		char[] dos = palabrados.toCharArray();
		
		Arrays.sort(uno);
		Arrays.sort(dos);
		
		for (int x=0; x<uno.length;x++) {
			for (int y=0; y<dos.length;y++) {
				if (uno[x] == dos[y]) {
				anagrama = true;	
				}else {
					anagrama = false;
				}
			}	
		}
		
		if (anagrama == true) {
			System.out.println("La palabra es un anagrama");
		}else {
			System.out.println("La palabra no es un anagrama");
		}
		
		sn.close();
	}
}
