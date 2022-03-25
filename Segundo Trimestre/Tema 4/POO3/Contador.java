package POO3;

public class Contador {
	//ATRIBUTOS
	private int cont;
	
	
	//CONSTRUCTORES
	public Contador() {
		
	}
	
	public Contador(int cont) {
		if (cont < 0) {
			this.cont = 0;
		}else {
			this.cont = cont;
		}
	}
	
	public Contador(Contador objeto) {
		this.cont = objeto.cont;
	}


	
	//GETTERS y SETTERS
	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
	//METODOS
	
	public void incrementar() {
		cont++;
	}
	
	public void decrementar() {
		cont--;
		if (cont < 0) {
			cont = 0;
		}
	}
}
