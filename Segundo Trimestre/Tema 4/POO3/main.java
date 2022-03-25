package POO3;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contador contador = new Contador();
		
		contador.setCont(5);
		contador.incrementar();
		System.out.println(contador.getCont());
		contador.incrementar();
		contador.incrementar();
		System.out.println(contador.getCont());
		contador.decrementar();
		System.out.println(contador.getCont());
		
		Contador contadordos = new Contador(10);
		contadordos.incrementar();
		contadordos.incrementar();
		System.out.println(contadordos.getCont());
		contadordos.decrementar();
		System.out.println(contadordos.getCont());
		
		Contador contadortres = new Contador(contadordos);
		System.out.println(contadortres.getCont());
	}

}
