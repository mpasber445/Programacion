
public class ejercicio_siete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numerorandom = 0;
		int contador = 0;
		
		while (numerorandom != 24) {
		numerorandom = (int)Math.floor(Math.random()*(101));
		contador++;
		}
		
		System.out.println("Se han generado " + contador + " numeros hasta llegar al 24");
	}

}
