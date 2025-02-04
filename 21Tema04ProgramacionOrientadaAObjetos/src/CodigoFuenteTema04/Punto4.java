package CodigoFuenteTema04;

public class Punto4 {
    // Atributos de instancia => asociados a un objeto
    private int x; 
	private int y;
	
	// Atributo estático o de clase => asociado a la clase 
	// =>solo hay una copia en la clase que es compartida por todos los objetos
	static private int num_puntos = 0;
	
	// constructor 1 => para dar valor inicial a x e y
	Punto4 (int x1, int y1) {
		x = x1;
		y = y1;
		// incrementa el número de puntos (de objetos creados) en 1
		num_puntos ++;  
	}
	
	// constructor 2 => sin argumentos
	Punto4 () {
		
	}
	
	// Los métodos normalmente se deben declarar públicos
	
	// Los métodos set son para cambiar los atributos del objeto
	public void set (int a, int b) {
		// Establecer los valores de las coordenadas x e y
		x = a;
		y = b;
	}	
	
	// los métodos get son para devolver el valor de los atributos del objeto
	public int getx () {
		return x;
	}
	
	public int gety () {
		return y;
	}
	
	// OJO método get pero estático o de clase => modificador static
	public static int get_num_puntos () {
		return num_puntos;
	}
	
	public static void main (String args[]) {
		
		Punto4 punto1 = new Punto4 (3,7);		
		Punto4 punto2 = new Punto4 (5,-5);
		
		// Llamada a un método de clase o estático
		System.out.println ("Numéro de objetos punto creados = " + Punto4.get_num_puntos());
		
		// Esto es mejor no hacerlo asi 
		// => no es normal cambiar un atributo de clase a través de un objeto
		punto1.num_puntos = 7;
		
		// Es mejor hacerlo así, para modificar un atributo estático o de clase 
		// se nombra la clase a la que pertenece 
		Punto4.num_puntos = 8;
		
		// Llamada a un método de clase o estático
		System.out.println ("Numéro de objetos punto creados = " + Punto4.get_num_puntos());		
		
	}
	
	
}

