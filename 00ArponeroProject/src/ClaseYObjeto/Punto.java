package ClaseYObjeto;

public class Punto {
	
	private double x;
	private double y;
	
	public Punto () {
		
		this.x = 0;
		this.y = 0;
		
	}
	
	public Punto (double x, double y) {
		
		this.x = 0;
		this.y = 0;
		
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + ", getX()=" + getX() + ", getY()=" + getY() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public double distancia (Punto otro) {
		
		return Math.sqrt(Math.pow(this.x-otro.x, 2) + Math.pow(this.y-otro.y, 2));
	
	}
	
	public Punto puntoMedio (Punto otro) {
		
		double x1 = (this.x - otro.x) / 2;
		double y1 = (this.y - otro.y) / 2;
		
		return new Punto (x1, y1);
		
	}
	
}
