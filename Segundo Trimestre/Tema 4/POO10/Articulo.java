package POO10;

public class Articulo {


		private String codigo = "LIBRE";
		private String descripcion;
		private float precio_compra;
		private float precio_venta;
		private int stock;
		
		public Articulo(String codigo, String descripcion, float precio_compra, float precio_venta, int stock) {
			super();
			this.codigo = codigo;
			this.descripcion = descripcion;
			this.precio_compra = precio_compra;
			this.precio_venta = precio_venta;
			this.stock = stock;
		}
		
		public Articulo() {
		
		}
		
		
	

		@Override
		public String toString() {
			return "\nCodigo: " + codigo + "\nDescripcion: " + descripcion + "\nPrecio de compra: " + precio_compra
					+ "\nPrecio de venta: " + precio_venta + "\nStock: " + stock + "\n";
		}

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public float getPrecio_compra() {
			return precio_compra;
		}

		public void setPrecio_compra(float precio_compra) {
			this.precio_compra = precio_compra;
		}

		public float getPrecio_venta() {
			return precio_venta;
		}

		public void setPrecio_venta(float precio_venta) {
			this.precio_venta = precio_venta;
		}

		public int getStock() {
			return stock;
		}

		public void setStock(int stock) {
			this.stock = stock;
		}
		


}
