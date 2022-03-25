package POO11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import POO6.Fecha;

public class Persona {

	
	private String nombre;
	private String direccion;
	private int codigoPostal;
	private String ciudad;
	private Fecha fechaNacimiento;
	private String añoActual = new SimpleDateFormat("yyyy").format(Calendar.getInstance().getTime());
	private String mesActual = new SimpleDateFormat("MM").format(Calendar.getInstance().getTime());
	private String diaActual = new SimpleDateFormat("dd").format(Calendar.getInstance().getTime());
	int añoActualMenosDieciocho = Integer.parseInt(añoActual)-18;
	
	
	
	
	public Persona(String nombre, String direccion, int codigoPostal, String ciudad, Fecha fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.ciudad = ciudad;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Persona(Persona obj) {
		super();
		this.nombre = obj.nombre;
		this.direccion = obj.direccion;
		this.codigoPostal = obj.codigoPostal;
		this.ciudad = obj.ciudad;
		this.fechaNacimiento = obj.fechaNacimiento;
	}
	
	public Persona() {
		}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\n Fecha de Nacimiento: " + fechaNacimiento+ "\n Dirección: "
				+ direccion + "\n "+ codigoPostal + " " + ciudad ;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	//Metodos
	
	public boolean esMayorDeEdad() {
		if(this.fechaNacimiento.getAño() == añoActualMenosDieciocho) {
			if(this.fechaNacimiento.getMes() == Integer.parseInt(mesActual)){
				if(this.fechaNacimiento.getDia() == Integer.parseInt(diaActual)) {
					return true;
				}else if (this.fechaNacimiento.getDia()<Integer.parseInt(diaActual)) {
					return true;
				}else {
					return false;
				}
			}else if (this.fechaNacimiento.getMes()<Integer.parseInt(mesActual)) {
				return true;
			}else {
				return false;
			}
		}else if (this.fechaNacimiento.getAño()<añoActualMenosDieciocho){
			return true;
		}else {
			return false;
		}
	}
}
