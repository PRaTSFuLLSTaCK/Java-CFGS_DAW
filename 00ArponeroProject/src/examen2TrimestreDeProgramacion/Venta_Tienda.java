package examen2TrimestreDeProgramacion;

public class Venta_Tienda {
	
	private String nombre_tienda;
	
	private String trabajador;
	
	private double total_ventas;

	public Venta_Tienda(String nombre_tienda, String trabajador, double total_ventas) {
		
		
	}

	public String getNombre_tienda() {
		return nombre_tienda;
	}

	public void setNombre_tienda(String nombre_tienda) {
		this.nombre_tienda = nombre_tienda;
	}

	public String getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(String trabajador) {
		this.trabajador = trabajador;
	}

	public double getTotal_ventas() {
		return total_ventas;
	}

	public void setTotal_ventas(double total_ventas) {
		this.total_ventas = total_ventas;
	}
	
	@Override
	public String toString() {
		return "Venta_Tienda [nombre_tienda=" + nombre_tienda + ", trabajador=" + trabajador + ", total_ventas="
				+ total_ventas + "]";
	}

}
