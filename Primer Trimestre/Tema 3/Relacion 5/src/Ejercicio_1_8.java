import java.util.Scanner;
public class Ejercicio_1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		int numero;
		int exponente;
		int posicion;
		int digito;
		System.out.println("Introduce un numero");
		numero = sn.nextInt();
		
		if (esCapicua(numero) == true) {
			System.out.println("El numero introducido es capicua");
		}else {
			System.out.println("El numero introducido no es capicua");
		}
		
		if (esPrimo(numero) == true) {
			System.out.println("El numero introducido es primo");
		}else {
			System.out.println("El numero introducido no es primo");
		}
		
		System.out.println("El siguiente numero primo, buscando desde el que has introducido es " + siguientePrimo(numero));
		System.out.println("Introduce un numero y un exponente para calcular su potencia");
		System.out.println("Numero:");
		numero = sn.nextInt();
		System.out.println("Exponente:");
		exponente=sn.nextInt();
		System.out.println("La potencia es: " + potencia(numero,exponente));
		System.out.println("Introduce un numero al que quieras darle la vuelta:");
		numero = sn.nextInt();
		System.out.println("Ese numero dado la vuelta es " + voltea(numero));
		System.out.println("Introduce un numero en el que buscar");
		numero = sn.nextInt();
		System.out.println("Introduce la posicion en la que quieras buscar");
		posicion = sn.nextInt();
		System.out.println("En esa posicion esta el numero " + digitoN(numero,posicion));
		System.out.println("Introduce un numero en el que buscar");
		numero = sn.nextInt();
		System.out.println("Introduce un digito que buscar");
		digito = sn.nextInt();
		System.out.println("Ese digito esta en la posicion " + posicionDeDigito(numero,digito));
		sn.close();
	}
	

	
	
	public static boolean esCapicua(int num) {
		
		int num2=num;
		int num3 = 0;
		for(int x=String.valueOf(num).length();x>0;x--) {
			
			num3 *= 10;
			num3 += num2%10;
			num2 /= 10;
			
		}
		
		if (num==num3) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static boolean esPrimo(int num) {
		
		int contador = 0;
		
		for(int x=2;x<num;x++) {
			if (num%x == 0) {
				contador++;
			}
		}
		
		if (contador == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	public static int siguientePrimo(int num) {
		boolean primo = false;
		int contador = 0;
		while (primo == false) {
			contador = 0;
			num++;
			for(int x=2;x<num;x++) {
				if (num%x == 0) {
					contador++;
				}
			}
			if (contador == 0) {
				primo = true;
				
			}
		}
		
		return num;

	}
	public static int potencia(int num, int exponente) {
	
		for (int x=exponente;x>1;x--) {
			num *= exponente;
		}
		return num;
		
	}
	
	public static int voltea (int num) {
		
		int num2 = 0;
		for(int x=String.valueOf(num).length();x>0;x--) {
			
			num2 *= 10;
			num2 += num%10;
			num /= 10;
			
		}
		
		return num2;
		
	}
	public static int digitoN (int num, int pos) {
	
		int num2 = 0;
		int digito = 0;
		for(int x=String.valueOf(num).length();x>0;x--) {
			
			num2 *= 10;
			num2 += num%10;
			num /= 10;
			
		}
		
		for(int y = 1; y<pos; y++) {
			
		num2 /=10;
		digito = num2%10;
			
		}
		
		return digito;
			
	}
	
	public static int posicionDeDigito(int num,int digito) {
		
		int num2 = 0;
		int contador = 1;
		for(int x=String.valueOf(num).length();x>0;x--) {
			
			num2 *= 10;
			num2 += num%10;
			num /= 10;
			
		}
		
		for (int y = 1; y<String.valueOf(num2).length();y++) {
			if (num2%10 == digito) {
				return contador;
			}else {
				num2 /= 10;
			}
			contador++;
		}
		
		return -1;
	}
}
