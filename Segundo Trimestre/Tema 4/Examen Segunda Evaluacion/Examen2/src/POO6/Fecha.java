package POO6;

public class Fecha {

	private int dia;
	private int mes;
	private int a�o;
	
	
	//CONSTRUCTORES
	public Fecha() {
		
	}
	
	
	public Fecha(int dia, int mes, int a�o) {
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}
	
	//TOSTRING
	@Override
	public String toString() {
		return dia + "-" + mes + "-" + a�o;
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
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	

	
	//METODOS
	public boolean esBisiesto(int a�o){
		
		return (a�o % 4 == 0 && a�o % 100 != 0 || a�o % 400 == 0);

	}

	public boolean fechaCorrecta() {
		if((dia>0 && dia < 32) && (mes>0 && mes < 13) && (a�o > 0 && a�o < 2023)){
			if(mes == 2) {
				if(esBisiesto(a�o)) {
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
			if(esBisiesto(a�o)) {
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
				a�o++;
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
		if(this.a�o>f.a�o) {
			return true;
		}else if (this.a�o == f.a�o) {
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
