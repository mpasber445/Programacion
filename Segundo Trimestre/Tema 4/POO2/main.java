package POO2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuenta cuentaUno = new Cuenta();
		cuentaUno.establecer_nombre_cliente();
		cuentaUno.establecer_numero_cuenta();
		cuentaUno.establecer_interes();
		cuentaUno.establecer_saldo();
		cuentaUno.obtener_numero_cuenta();
		cuentaUno.obtener_numero_cuenta();
		cuentaUno.obtener_interes();
		cuentaUno.obtener_saldo();
		
		
		Cuenta cuentaDos = new Cuenta("Juan Fernandez Rubio", "1234567890", 1.75, 300);
		Cuenta cuentaTres = new Cuenta(cuentaUno);
		
		cuentaUno.ingreso(100);
		cuentaDos.mostrarDatos();
		System.out.println(cuentaTres.mostrarDatos());
		cuentaTres.transferencia(cuentaDos, 10);
		cuentaTres.obtener_saldo();
		
	}

}
