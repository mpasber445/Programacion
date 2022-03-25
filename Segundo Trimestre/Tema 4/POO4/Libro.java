package POO4;

public class Libro {

	private String titulo;
	private String autor;
	private int ejemplares;
	private int ejemplares_prestados;
	
	
	public Libro(String titulo, String autor, int ejemplares, int ejemplares_prestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.ejemplares_prestados = ejemplares_prestados;
	}
	public Libro() {
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getEjemplares() {
		return ejemplares;
	}
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}
	public int getEjemplares_prestados() {
		return ejemplares_prestados;
	}
	public void setEjemplares_prestados(int ejemplares_prestados) {
		this.ejemplares_prestados = ejemplares_prestados;
	}
	
	public boolean prestamo() {
		if (ejemplares>ejemplares_prestados) {
			ejemplares_prestados++;
			System.out.println("Se ha realizado el prestamo correctamente");
			return true;
		}else {
			System.out.println("No se ha podido realizar el prestamo ya que no tienes ejemplares para prestar");
			return false;
		}
	}
	
	public boolean devolucion() {
		
		if (ejemplares_prestados>0) {
			ejemplares_prestados--;
			System.out.println("Se ha realizado la devolucion correctamente");
			return true;
		}else {
			System.out.println("No se ha podido realizar la devolucion porque no tienes ningun ejemplar prestado");
			return false;
		}
	}
	
	
	public String mostrarDatos() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", ejemplares_prestados="
				+ ejemplares_prestados + "]";
	}
	public String mostrarDatos(Libro objeto) {
		return "Libro [titulo=" + objeto.titulo + ", autor=" + objeto.autor + ", ejemplares=" + objeto.ejemplares + ", ejemplares_prestados="
				+ objeto.ejemplares_prestados + "]";
	}
	
}
