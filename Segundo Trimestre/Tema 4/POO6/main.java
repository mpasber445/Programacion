package POO6;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dia;
		int mes;
		int a�o;
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Introduce un dia");
		dia = sn.nextInt();
		System.out.println("Introduce un mes");
		mes = sn.nextInt();
		System.out.println("Introduce un a�o");
		a�o = sn.nextInt();
		
		
		Fecha fecha1 = new Fecha(dia,mes,a�o);
		
		if(fecha1.fechaCorrecta()) {
			fecha1.toString();
		}
		
		for(int x = 0;x<10;x++) {
			fecha1.diaSiguiente();
			System.out.println(fecha1.toString());
		}
		sn.close();
	}

}
