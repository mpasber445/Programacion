package Herencia6;

public class Electrodomestico {


	protected final float CONSTPRECIOBASE = 100;
	protected final String CONSTCOLOR = "Blanco";
	protected final char CONSTCONSUMO = 'F';
	protected final float CONSTPESO = 5;
	protected float precioBase = 100;
	protected String color = "Blanco";
	protected char consumo = 'F';
	protected float peso = 5;
	
	public Electrodomestico() {
		
	}
	
	public Electrodomestico(float precio, float peso) {
		
		this.precioBase = precio;
		this.peso = peso;
		
	}

	public Electrodomestico(float precioBase, String color, char consumo, float peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}

	public float getCONSTPRECIOBASE() {
		return CONSTPRECIOBASE;
	}

	public String getCONSTCOLOR() {
		return CONSTCOLOR;
	}

	public char getCONSTCONSUMO() {
		return CONSTCONSUMO;
	}

	public float getCONSTPESO() {
		return CONSTPESO;
	}

	public float getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumo() {
		return consumo;
	}

	public float getPeso() {
		return peso;
	}
	
	public boolean comprobarConsumoEnergetico(char a) {
		if(Character.getNumericValue(a)>= 10 && Character.getNumericValue(a) <=15) {
			return true;
		}else {
			this.consumo = CONSTCONSUMO;
			return false;
		}
	}
	
	public boolean comprobarColor(String color) {
		if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("gris") || color.equalsIgnoreCase("azul")) {
			return true;
		}else {
			this.color=CONSTCOLOR;
			return false;
		}
	}
	
	public int precioFinal() {
		int precio=0;
		
		if (Character.getNumericValue(this.consumo)== 10) {
			precio+=100;
		}else if (Character.getNumericValue(this.consumo)== 11) {
			precio+=80;
		}else if (Character.getNumericValue(this.consumo)== 12) {
			precio+=60;
		}else if (Character.getNumericValue(this.consumo)== 11) {
			precio+=50;
		}else if (Character.getNumericValue(this.consumo)== 11) {
			precio+=30;
		}else if (Character.getNumericValue(this.consumo)== 15) {
			precio+=10;
		}
		
		if (peso<20) {
			precio+=10;
		}else if(peso<50) {
			precio+= 50;
		}else if(precio<80) {
			precio+= 80;
		}else if (precio>80) {
			precio+=100;
		}
		return precio;
	}
	
}
