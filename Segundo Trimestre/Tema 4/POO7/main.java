package POO7;

import java.util.Scanner;

public class main {


    static Empleado[] empleados = new Empleado[0];

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nif = null;
		String nombre = null;
		int sueldoBase;
		int horasExtra;
		int irpf;
		boolean casado;
		int hijos;
		Scanner sn1 = new Scanner(System.in);
		Scanner sn2 = new Scanner(System.in);

		int num = 90;
		
		while (num>20) {
			System.out.println("Introduce cuantos empleados quieres introducir");
			num = sn1.nextInt();
		}
		Empleado[] empleados = new Empleado[num];
		for (int x = 0; x<num;x++) {
			System.out.println("-- Empleado " + x + "--");
			System.out.println("Introduce su NIF");
			nif = sn2.nextLine();
			System.out.println("Introduce su nombre");
			nombre = sn2.nextLine();
			System.out.println("Introduce su sueldo base");
			sueldoBase = sn1.nextInt();
			System.out.println("Introduce el porcentaje de IRPF");
			irpf = sn1.nextInt();
			System.out.println("¿El empleado está casado? (Si/No)");
			String casado2 = sn2.nextLine();
			if (casado2.equalsIgnoreCase("Si")) {
				casado = true;
			}else {
				casado = false;
			}
			System.out.println("¿Cuantos hijos tiene el empleado?");
			hijos = sn1.nextInt();
			System.out.println("¿Cuantas horas extras ha hecho el empleado?");
			horasExtra = sn1.nextInt();
			Empleado a = new Empleado();
			a.setNif(nif);
			a.setNombre(nombre);
			a.setSueldoBase(sueldoBase);
			a.setIrpf(irpf);
			a.setCasado(casado);
			a.setHijos(hijos);
			a.setHorasExtra(horasExtra);
			
			empleados[x] = a;
			System.out.println(a);
			System.out.println("");
		}
		
		System.out.println("Introduce el importe por hora extra");
		Empleado.importeHoraExtra = sn1.nextInt();
		
		System.out.println("------------ Empleados -----------");
		for(int x = 0; x<empleados.length;x++) {
			System.out.println(empleados[x]);
			System.out.println("");
		}
		
		System.out.println("------------ Informacion -----------");
		int sueldomasalto = 0;
		for(int x = 0; x<empleados.length;x++) {
			if(sueldomasalto<empleados[x].calculoIRPF()) {
				sueldomasalto = empleados[x].calculoIRPF();
				nombre = empleados[x].getNombre();
				nif = empleados[x].getNif();
			}
		}
		System.out.println("Empleado que mas cobra: " + nombre + "   " + nif);
		int sueldomasbajo = 999999999;

		for(int x = 0; x<empleados.length;x++) {
			if(sueldomasbajo>empleados[x].calculoIRPF()) {
				sueldomasbajo = empleados[x].calculoIRPF();
				nombre = empleados[x].getNombre();
				nif = empleados[x].getNif();
			}
		}
		System.out.println("Empleado que menos cobra: " + nombre + "   " + nif);
		int horasmasalta = 0;
		for(int x = 0; x<empleados.length;x++) {
			if(horasmasalta<empleados[x].complementoHoras()) {
				horasmasalta = empleados[x].complementoHoras();
				nombre = empleados[x].getNombre();
				nif = empleados[x].getNif();
			}
		}
		System.out.println("Empleado que mas cobra por horas extras: " + nombre + "   " + nif);
		horasmasalta = 999999999;
		for(int x = 0; x<empleados.length;x++) {
			if(horasmasalta>empleados[x].complementoHoras()) {
				horasmasalta = empleados[x].complementoHoras();
				nombre = empleados[x].getNombre();
				nif = empleados[x].getNif();
			}
		}
		System.out.println("Empleado que menos cobra por horas extras: " + nombre + "   " + nif);
	
	
		
		sn1.close();
		sn2.close();
	}

}
