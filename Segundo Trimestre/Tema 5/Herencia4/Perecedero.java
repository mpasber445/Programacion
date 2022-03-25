package Herencia4;

public class Perecedero extends Producto {

	

	private int diasACaducar;

	
	public Perecedero(String nombre, float precio,int diasACaducar) {
		super(nombre, precio);
		this.diasACaducar = diasACaducar;
	}
	
	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}

	@Override
	public String toString() {
		return "Perecedero [diasACaducar=" + diasACaducar + "]";
	}

	
	public float calcular (int cantidad_productos) {
		if (diasACaducar == 1) {
			return (precio*cantidad_productos)/4;
		}else if (diasACaducar == 2) {
			return (precio*cantidad_productos)/3;
		}else if (diasACaducar ==3) {
			return (precio*cantidad_productos)/2;
		}else {
		return precio*cantidad_productos;
		}
	}
	
}
