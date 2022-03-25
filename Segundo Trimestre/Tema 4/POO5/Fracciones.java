package POO5;

public class Fracciones {

	private int num;
	private int den = 1;
	
	
	public Fracciones() {
		
	}
	
	public Fracciones(int num) {
		super();
		this.num = num;
	}
	
	public Fracciones(int num, int den) {
		super();
		this.num = num;
		this.den = den;
	}
	
	public Fracciones(Fracciones objeto) {
		super();
		this.num = objeto.num;
		this.den = objeto.den;
	}
	
	
	@Override
	public String toString() {
		return  num + "/" + den;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getDen() {
		return den;
	}
	public void setDen(int den) {
		this.den = den;
	}
	
	
	public Fracciones simplificar(Fracciones fraccion) {
		int a =mcd(fraccion.num,fraccion.den);
		Fracciones b = new Fracciones((fraccion.num/a),(fraccion.den/a));
		return b;
	}
	
	
	public Fracciones sumar (Fracciones fraccion) {
		
		if (this.den == fraccion.den) {
			//return this.num + fraccion.num + "/" + this.den;
			Fracciones a = new Fracciones((this.num+fraccion.num),this.den);
			return simplificar(a);
		}else {
			if (this.den < fraccion.den) {
				int tempden = mcm(this.den,fraccion.den);
				int tempnum = tempden/this.den*this.num;
				Fracciones a = new Fracciones((tempnum+fraccion.num),tempden);
				a=simplificar(a);
				return simplificar(a);
				//return tempnum+fraccion.num + "/" + tempden;
			}else {
				int tempden = mcm(this.den,fraccion.den);
				int tempnum = tempden/fraccion.den*fraccion.num;
				Fracciones a = new Fracciones((tempnum+this.num),tempden);
				a=simplificar(a);
				return (a);
				//return tempnum+this.num + "/" + tempden;
			}
			
			
		}
		
	}
	
	public Fracciones restar (Fracciones fraccion) {
		
		if (this.den == fraccion.den) {
			//return this.num + fraccion.num + "/" + this.den;
			Fracciones a = new Fracciones((this.num-fraccion.num),this.den);
			return simplificar(a);
		}else {
			if (this.den < fraccion.den) {
				int tempden = mcm(this.den,fraccion.den);
				int tempnum = tempden/this.den*this.num;
				Fracciones a = new Fracciones((tempnum-fraccion.num),tempden);
				a=simplificar(a);
				return simplificar(a);
				//return tempnum+fraccion.num + "/" + tempden;
			}else {
				int tempden = mcm(this.den,fraccion.den);
				int tempnum = tempden/fraccion.den*fraccion.num;
				Fracciones a = new Fracciones((tempnum-this.num),tempden);
				a=simplificar(a);
				return (a);
				//return tempnum+this.num + "/" + tempden;
			}
			
			
		}
		
	}
	
	public Fracciones multiplicar (Fracciones fraccion) {
		
		Fracciones a = new Fracciones(this.num*fraccion.num,this.den*fraccion.den);
		a = simplificar(a);
		return a;
		
	}
	
	public Fracciones dividir (Fracciones fraccion) {
		
		Fracciones a = new Fracciones(this.num*fraccion.den,this.den*fraccion.num);
		a = simplificar(a);
		return a;
		
	}
	
	public int mcd(int u,int v) {
		if (v== 0) {
			return u;
		}
		int r;
		while (v != 0) {
			r = u % v;
			u = v;
			v = r;
		}
		return u;
	}
	

	public int mcm(int num1, int num2) {
	    int a = Math.max(num1, num2);
	    int b = Math.min(num1, num2);
	 
	    int resultado = (a / mcd(num1, num2)) * b;
	     
	    return resultado;
	 
	}
	
	
}
