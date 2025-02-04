package Vector3d;

public class Cafetera {
	private int cantidadMaxima;
	private int cantidadActual;
	
	public Cafetera() {
		this.cantidadMaxima = 1000;
		this.cantidadActual = 0;
	}
	public Cafetera(int cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
		this.cantidadActual = cantidadMaxima;
	}
	public Cafetera(int cantidadMaxima, int cantidadActual) {
		this.cantidadMaxima = cantidadMaxima;
		if (cantidadActual > cantidadMaxima) {
			this.cantidadActual = cantidadMaxima;
		}else {
			this.cantidadActual = cantidadActual;
		}
	}
	public int getCantidadMaxima() {
		return cantidadMaxima;
	}
	public void setCantidadMaxima(int cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
		if(this.cantidadActual > this.cantidadMaxima) {
			this.cantidadActual = this.cantidadMaxima;
		}
	}
	public int getCantidadActual() {
		return cantidadActual;
	}
	public void setCantidadActual(int cantidadActual) {
		if(cantidadActual > this.cantidadMaxima) {
			this.cantidadActual = cantidadMaxima;
		}else {
		this.cantidadActual = cantidadActual;
		}
	}
	public void llenarCafetera() {
		this.cantidadActual = this.cantidadMaxima;
	}
	public void servirTaza(int cantidad) {
		if (cantidad > this.cantidadActual) {
			this.cantidadActual = 0;
		}else {
			this.cantidadActual -= cantidad;
		}
	}
	public void vaciarCafetera() {
		this.cantidadActual = 0;
	}
	public void agregarCafe(int cantidad) {
		if(this.cantidadActual + cantidad > this.cantidadMaxima) {
			this.cantidadActual = this.cantidadMaxima;
		}else {
			this.cantidadActual += cantidad;
		}
	}
	public String toString() {
		return "Cantidad actual: " + this.cantidadActual + "c.c.\n"+
				"Cantidad maxima: " + this.cantidadMaxima+"c.c.";
	}
}
