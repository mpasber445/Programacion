package Herencia4;

public class Producto {

	private String nombre;
	protected float precio;
	
	public Producto(String nombre, float precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	public float calcular (int cantidad_productos) {
		return precio*cantidad_productos;
	}
	
}
