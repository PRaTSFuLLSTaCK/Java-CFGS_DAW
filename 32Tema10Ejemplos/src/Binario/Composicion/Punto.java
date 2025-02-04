package Binario.Composicion;

public class Punto implements java.io.Serializable{
	private int x;
	private int y;
	
	public Punto (int x1, int y1) {
		x = x1;
		y = y1;
	}

	public String toString(){
		return new String("(x:"+x+", y:"+y+")");
	}
}
