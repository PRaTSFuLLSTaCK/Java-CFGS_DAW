package Binario.Herencia;

public abstract class Figura implements java.io.Serializable {
	protected int x;
	protected int y;
	public Figura(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public abstract double area();
}



