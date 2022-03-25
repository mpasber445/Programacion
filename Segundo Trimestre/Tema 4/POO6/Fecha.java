package POO6;

public class Fecha {

	private int dia;
	private int mes;
	private int año;
	
	
	//CONSTRUCTORES
	public Fecha() {
		
	}
	
	
	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	
	//TOSTRING
	@Override
	public String toString() {
		return dia + "-" + mes + "-" + año;
	}
	
	//GET && SET
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	

	
	//METODOS
	public boolean esBisiesto(int año){
		
		return (año % 4 == 0 && año % 100 != 0 || año % 400 == 0);

	}

	public boolean fechaCorrecta() {
		if((dia>0 && dia < 32) && (mes>0 && mes < 13) && (año > 0 && año < 2023)){
			if(mes == 2) {
				if(esBisiesto(año)) {
					if (dia<30) {
						return true;
					}else {
						return false;
					}
				}else {
					if(dia<29) {
						return true;
					}else {
						return false;
					}
				}
			}else if (mes==1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				if (dia < 32) {
					return true;
				}else {
					return false;
				}
			}else {
				if (dia < 31) {
					return true;
				}else {
					return false;
				}
			}
		}else{
			return false;
		}
	}
	
	public void diaSiguiente() {
		
		if(mes == 2) {
			if(esBisiesto(año)) {
				if (dia==29) {
					dia = 1;
					mes++;
				}else {
					dia++;
				}
			}else {
				if(dia==28) {
					dia = 1;
					mes++;
				}else {
					dia++;
				}
			}
		}else if (mes==1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			if (dia == 31 && mes == 12) {
				dia = 1;
				mes = 1;
				año++;
			}else if (dia == 31){
				dia = 1;
				mes++;
			}else {
				dia++;
			}
		}else {
			if (dia == 30) {
				dia = 1;
				mes++;
			}else {
				dia++;
			}
		}
	}
	
	public boolean esMayorQue(Fecha f) {
		if(this.año>f.año) {
			return true;
		}else if (this.año == f.año) {
			if(this.mes>f.mes) {
				return true;
			}else if (this.mes==f.mes) {
				if(this.dia>f.dia) {
					return true;
				}else {
					return false;
				}
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}
}
