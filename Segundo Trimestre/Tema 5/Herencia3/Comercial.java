package Herencia3;

public class Comercial extends Empleado {

	private double comision;
	
	
	public Comercial(String nombre, int edad, int salario,double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Comercial [comision=" + comision + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()
				+ ", getSalario()=" + getSalario() + ", getPlus()=" + getPlus() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	public double getComision() {
		return comision;
	}


	public void setComision(double comision) {
		this.comision = comision;
	}
	
	public boolean plus() {
		
		if(getEdad()>30 && comision>200) {
			return true;
		}else {
			return false;
		}
	}
	
}
