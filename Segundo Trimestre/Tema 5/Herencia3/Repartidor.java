package Herencia3;

public class Repartidor extends Empleado {

	
	private String zona;

	
	public Repartidor(String nombre, int edad, int salario,String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
		// TODO Auto-generated constructor stub
	}


	public String getZona() {
		return zona;
	}


	public void setZona(String zona) {
		this.zona = zona;
	}


	@Override
	public String toString() {
		return "Repartidor [zona=" + zona + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
				+ ", getSalario()=" + getSalario() + ", getPlus()=" + getPlus() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

	public boolean plus() {
		
		if(getEdad()<25 && zona.equalsIgnoreCase("zona 3")) {
			return true;
		}else {
			return false;
		}
	}


	
	
}
