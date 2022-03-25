package POO7;

public class Empleado {

	private String nif;
	private String nombre;
	private int sueldoBase;
	private int horasExtra;
	private int irpf;
	private boolean casado;
	private int hijos;
	static int importeHoraExtra;
	
	
	public Empleado(String nif) {
		this.nif = nif;
	}
	
	public Empleado() {
		
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	public int getIrpf() {
		return irpf;
	}

	public void setIrpf(int irpf) {
		this.irpf = irpf;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public int getHijos() {
		return hijos;
	}

	public void setHijos(int hijos) {
		this.hijos = hijos;
	}

	public static int getImporteHoraExtra() {
		return importeHoraExtra;
	}

	public static void setImporteHoraExtra(int importeHoraExtra) {
		Empleado.importeHoraExtra = importeHoraExtra;
	}
	
	
	public int complementoHoras(){
		return horasExtra*importeHoraExtra;
	}
	
	public int sueldoBruto() {
		return sueldoBase+complementoHoras();
	}
	
	public int calculoIRPF() {
	
		int porcentaje = irpf-hijos;
		if (casado) {
			porcentaje -= 2;
		}
		 porcentaje /= 100;
		 if (porcentaje<0) {
			 return sueldoBruto()-(sueldoBruto()*0); 
		 }else {
			return sueldoBruto()-(sueldoBruto()*porcentaje);	
		 }
	 }

	@Override
	public String toString() {
		String casado2;
		if (casado) {
			casado2 = "S";
		}else {
			casado2 ="N";
		}
		return nif + "  " + nombre + "\n Sueldo Base: " + sueldoBase + "\n Horas Extra: "
				+ horasExtra + "\n Tipo IRPF: " + irpf + "%" +"\n Casado: " + casado2 + "\n Numero de Hijos: " + hijos;
	}
	
	
}
