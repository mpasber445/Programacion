package POO5;

public class Carta {

	private int numero;
	private int palo;
	
	
	public Carta(int numero, int palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}


	@Override
	public String toString() {
		return "Carta [numero=" + numero + ", palo=" + palo + "]";
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getPalo() {
		return palo;
	}


	public void setPalo(int palo) {
		this.palo = palo;
	}
	
}
