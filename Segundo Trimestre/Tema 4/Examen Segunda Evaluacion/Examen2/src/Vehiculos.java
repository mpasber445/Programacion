import java.text.SimpleDateFormat;
import java.util.Calendar;

import POO6.Fecha;

public class Vehiculos {

	private String marca;
	private String matricula;
	private int km;
	private Fecha fecha_matriculacion;
	private String descripcion;
	private double precio;
	private String nombre_propietario;
	private String dni_propietario;
	
	
	public Vehiculos(String marca, String matricula, int km, Fecha fecha_matriculacion, String descripcion,
			double precio, String nombre_propietario, String dni_propietario) {
		super();
		this.marca = marca;
		this.matricula = matricula;
		this.km = km;
		this.fecha_matriculacion = fecha_matriculacion;
		this.descripcion = descripcion;
		this.precio = precio;
		this.nombre_propietario = nombre_propietario;
		this.dni_propietario = dni_propietario;
	}
	
	public Vehiculos() {
		

	}
	
	public Vehiculos(Vehiculos obj) {
		super();
		this.marca = obj.marca;
		this.matricula = obj.matricula;
		this.km = obj.km;
		this.fecha_matriculacion = obj.fecha_matriculacion;
		this.descripcion = obj.descripcion;
		this.precio = obj.precio;
		this.nombre_propietario = obj.nombre_propietario;
		this.dni_propietario = obj.dni_propietario;
	}

	
	
	
	@Override
	public String toString() {
		return " Marca= " + marca + "\n Matricula= " + matricula + "\n KM= " + km + "\n Fecha de matriculación ="
				+ fecha_matriculacion + "\n Descripcion= " + descripcion + "\n Precio= " + precio + "\n Nombre del propietario = "
				+ nombre_propietario + "\n DNI del propietario= " + dni_propietario;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public Fecha getFecha_matriculacion() {
		return fecha_matriculacion;
	}

	public void setFecha_matriculacion(Fecha fecha_matriculacion) {
		this.fecha_matriculacion = fecha_matriculacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre_propietario() {
		return nombre_propietario;
	}

	public void setNombre_propietario(String nombre_propietario) {
		this.nombre_propietario = nombre_propietario;
	}

	public String getDni_propietario() {
		return dni_propietario;
	}

	public void setDni_propietario(String dni_propietario) {
		this.dni_propietario = dni_propietario;
	}
	
	
	public int getAnios() {
		String añoActual = new SimpleDateFormat("yyyy").format(Calendar.getInstance().getTime());
		String diaActual = new SimpleDateFormat("dd").format(Calendar.getInstance().getTime());
		String mesActual = new SimpleDateFormat("MM").format(Calendar.getInstance().getTime());
		int añosDiferencia = Integer.parseInt(añoActual) - fecha_matriculacion.getAño();
	
		if (añosDiferencia>0) {
			if(Integer.parseInt(mesActual)==fecha_matriculacion.getMes()) {
				if(Integer.parseInt(diaActual)>=fecha_matriculacion.getDia()) {
					return añosDiferencia;
				}else {
					return añosDiferencia-1;
				}
			}else if (Integer.parseInt(mesActual)>fecha_matriculacion.getMes()) {
				return añosDiferencia;
			}else {
				return añosDiferencia-1;
			}
		}else {
			return 0;
		}
		
		
	}
	
}
