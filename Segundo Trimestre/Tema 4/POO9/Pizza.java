package POO9;

public class Pizza {

	private String tamaño;
	private String tipo;
	private String estado="Pedida";
	private static int total_pizzas_pedidas;
	private static int total_pizzas_servidas;
	
	
	public Pizza(String tipo, String tamaño) {
		super();
		this.tamaño = tamaño;
		this.tipo = tipo;
		total_pizzas_pedidas++;
	}
	
	public void sirve() {
	
		if(estado == "Pedida") {
			estado = "Servida";
			total_pizzas_servidas++;
		}else {
			System.out.println("Esta pizza ya fue servida");
		}
	
	}

	@Override
	public String toString() {
		return "Pizza " + tipo + " " + tamaño + ", " + estado;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public static int getTotal_pizzas_pedidas() {
		return total_pizzas_pedidas;
	}

	public static void setTotal_pizzas_pedidas(int total_pizzas_pedidas) {
		Pizza.total_pizzas_pedidas = total_pizzas_pedidas;
	}

	public static int getTotal_pizzas_servidas() {
		return total_pizzas_servidas;
	}

	public static void setTotal_pizzas_servidas(int total_pizzas_servidas) {
		Pizza.total_pizzas_servidas = total_pizzas_servidas;
	}
	
	
	
}
