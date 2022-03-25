package POO2;

import java.util.Scanner;

public class Cuenta {

	private String nombre_cliente;
	private String numero_cuenta;
	private double interes;
	private double saldo;
	
	//Constructor por defecto
	public Cuenta() {
		
	}
	
	//Constructor copia
	
	public Cuenta(Cuenta objeto) {
		
		this.nombre_cliente = objeto.nombre_cliente;
		this.numero_cuenta = objeto.numero_cuenta;
		this.interes = objeto.interes;
		this.saldo = objeto.saldo;
		
	}
	
	
	//Constructor con parametros
	public Cuenta(String nombre_cliente, String numero_cuenta, double interes, double saldo) {
		this.nombre_cliente = nombre_cliente;
		this.numero_cuenta = numero_cuenta;
		this.interes = interes;
		this.saldo = saldo;
	}
	
	
	


	public String mostrarDatos() {
		return "Cuenta [nombre_cliente=" + nombre_cliente + ", numero_cuenta=" + numero_cuenta + ", interes=" + interes
				+ ", saldo=" + saldo + "]";
	}

	public String obtener_nombre_cliente() {
		
		return nombre_cliente;
		
	}
	
	public String obtener_numero_cuenta() {
		
		return numero_cuenta;
		
	}
	
	public double obtener_interes() {
		
		return interes;
		
	}
	
	public double obtener_saldo() {
		return saldo;
	}
	
	
	
	public void establecer_nombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	public void establecer_numero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}
	
	public void establecer_interes(double interes) {
		this.interes = interes;
	}
	
	public void establecer_saldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public void establecer_nombre_cliente() {
		Scanner sn = new Scanner(System.in);
		System.out.println("Introduce el nombre que quieras que tenga el cliente");
		nombre_cliente = sn.nextLine();
		sn.close();
	}
	
	public void establecer_numero_cuenta() {
		Scanner sn = new Scanner(System.in);
		System.out.println("Introduce el numero que quieras que tenga la cuenta");
		numero_cuenta = sn.nextLine();
		sn.close();
	}
	public void establecer_interes() {
		Scanner sn = new Scanner(System.in);
		System.out.println("Introduce el interes que quieres que tenga la cuenta");
		interes = sn.nextDouble();
		sn.close();
	}
	public void establecer_saldo() {
		Scanner sn = new Scanner(System.in);
		System.out.println("Introduce el saldo que quieres que tenga la cuenta");
		saldo = sn.nextDouble();
		sn.close();
	}

	public boolean ingreso() {
		Scanner sn = new Scanner(System.in);
		double ingreso;
		System.out.println("Introduce la cantidad a ingresar");
		ingreso = sn.nextDouble();
		if (ingreso<=0) {
			System.out.println("Esa cantidad no se puede ingresar");
			sn.close();
			return false;
		}else {
			System.out.println("Cantidad ingresada: " + ingreso);
			saldo += ingreso;
			obtener_saldo();
			sn.close();
			return true;
		}
	}
	
	public boolean ingreso( double ingreso) {
		if (ingreso<=0) {
			System.out.println("Esa cantidad no se puede ingresar");
			return false;
		}else {
			System.out.println("Cantidad ingresada: " + ingreso);
			saldo += ingreso;
			obtener_saldo();
			return true;
		}
	}
	
	public boolean reintegro() {
		Scanner sn = new Scanner(System.in);
		double reintegro;
		System.out.println("Introduce la cantidad a retirar");
		reintegro = sn.nextDouble();
		if (reintegro < 0 || reintegro > saldo) {
			System.out.println("Esa cantidad no se puede retirar");
			sn.close();
			return false;
		}else {
			System.out.println("Cantidad retirada: " + reintegro);
			saldo -= reintegro;
			obtener_saldo();
			sn.close();
			return true;
		}
	}
	
	public boolean reintegro(double reintegro) {
		System.out.println("Introduce la cantidad a retirar");
		if (reintegro < 0 || reintegro > saldo) {
			System.out.println("Esa cantidad no se puede retirar");
			return false;
		}else {
			System.out.println("Cantidad retirada: " + reintegro);
			saldo -= reintegro;
			obtener_saldo();
			return true;
		}
	}
	
	public boolean transferencia(Cuenta cuentaDestino, double importe) {
		
		if(importe > saldo) {
			System.out.println("No tienes suficiente saldo");
			return false;
		}else {
			saldo -= importe;
			cuentaDestino.saldo += importe;
			System.out.println("Se ha hecho la transferencia con exito");
			return true;
		}
	
	}
	
}
