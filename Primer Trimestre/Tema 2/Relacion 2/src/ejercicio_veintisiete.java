import java.util.Scanner;


public class ejercicio_veintisiete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		int numerousuario = 0;
		int contador = 0;
		int suma = 0;
		int multiplicacion = 0;
		
		
		System.out.println("Introduce un numero");
		numerousuario = sn.nextInt();
		
		for(int x=1;x<=numerousuario;x++) {
			
		contador++;
		multiplicacion = (3*x);
		suma = suma + multiplicacion;
		System.out.println(contador + " multiplo = " + multiplicacion);
		
		}
		
		System.out.println("Hay " + contador + " multiplos, su suma total es " + suma);
		
		sn.close();
		
	}

}
