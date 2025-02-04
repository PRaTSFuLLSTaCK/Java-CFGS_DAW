package CodigoFuenteTema04;

public class Punto {
    // variables miembro de la clase, atributos o propiedades 	
    // es mejor declarar los atributos privados, para que no puedan
    // ser modificados desde otras clases
    private int x; 
	private int y;
	
	// constructor 1 => para dar valor inicial a x e y
	Punto (int x1, int y1) {
		x = x1;
		y = y1;
	}
	
	// constructor 2 => sin argumentos
	Punto () {
		
	}
	
	// Los métodos normalmente se deben declarar públicos
	
	// Los métodos set son para cambiar los atributos de la clase
	public void set (int a, int b) {
		// Establecer los valores de las coordenadas x e y
		x = a;
		y = b;
	}	
	
	// los métodos get son para devolver el valor de los atributos de la clase
	public int getx () {
		return x;
	}
	
	public int gety () {
		return y;
	}
	
}

