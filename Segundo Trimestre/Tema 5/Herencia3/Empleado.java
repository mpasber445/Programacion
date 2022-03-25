package Herencia3;

abstract class Empleado {

	private String nombre;
	private int edad;
	private int salario;
	private final int plus = 300;
	
	
	
	public Empleado(String nombre, int edad, int salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public int getPlus() {
		return plus;
	}
	
	
	
}
