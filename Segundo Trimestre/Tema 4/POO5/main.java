package POO5;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fracciones f1 = new Fracciones(1,4);
		Fracciones f2 = new Fracciones(1,2);
		Fracciones f3 = new Fracciones();
		Fracciones f4 = new Fracciones(4);
		
		Fracciones suma = f1.sumar(f2);
		Fracciones resta = f1.sumar(f3);
		Fracciones producto = f1.multiplicar(f4);
		Fracciones cociente = f1.dividir(f2);
		
		System.out.println(f1 + " + " + f2 + " = " + suma);
		System.out.println(f1 + " - " + f3 + " = " + resta);
		System.out.println(f1 + " * " + f4 + " = " + producto);
		System.out.println(f1 + " / " + f2 + " = " + cociente);


	}

}
