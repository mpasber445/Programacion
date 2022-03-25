package Herencia4;

public class noPerecedero extends Producto {

	

	private String tipo;
	
	public noPerecedero(String nombre, float precio,String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "noPerecedero [tipo=" + tipo + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}	
	
	public float calcular (int cantidad_productos) {
		return precio*cantidad_productos;
	}
	
}
