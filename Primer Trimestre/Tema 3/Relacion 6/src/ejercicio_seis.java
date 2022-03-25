
public class ejercicio_seis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto="Hola Mundo";
		
		int tamaño = texto.length();  
		  
		System.out.println("La frase: " + "'" + texto + "'" + " Al reves es:");  
		  
		for(int i = 0; i < tamaño; i++)  
		{  
		System.out.print(texto.charAt(texto.length() - i - 1));  
		} 
	}

}
