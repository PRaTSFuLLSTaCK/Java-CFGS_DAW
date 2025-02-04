package CodigoFuenteTema04;

public class Punto3 {
    // Atributos de instancia => asociados a un objeto
    private int x,y; 	
	
	// Atributo estático o de clase => asociado a la clase 
	// =>solo hay una copia en la clase que es compartida por todos los objetos
	static private int num_puntos = 0;
	
	// constructor 1 => para dar valor inicial a x e y
	Punto3 (int x1, int y1) {
		x = x1;
		y = y1;
		// incrementa el número de puntos (de objetos creados) en 1
		num_puntos ++;  
	}
	
	// constructor 2 => sin argumentos
	Punto3 () {
		// incrementa el número de puntos (de objetos creados) en 1
		num_puntos ++;		
	}	
	
	// Los métodos set son para cambiar los atributos del objeto
	public void set_x (int a) {		
		x = a;		
	}
	
	public void set_y (int a) {		
		y = a;		
	}
	
	// método estático o de clase => modificador static
	// no está asociado a un objeto, sino a una clase
	public static void set_num_puntos (int num) {		
		num_puntos = num;
		// OJO la llamada a este método debe hacerse con  cuidado
		// ya que cambia el contador de los objetos creados		
	}	
	
	// los métodos get son para devolver el valor de los atributos del objeto
	public int get_x () {
		return x;
	}
	
	public int get_y () {
		return y;
	}
	
	// método estático o de clase => modificador static
	public static int get_num_puntos () {
		return num_puntos;
	}
	
	public static void main (String args[]) {
		
		Punto3 punto1 = new Punto3 (3,7);		
		Punto3 punto2 = new Punto3 ();
		
		punto2.set_x (5);
		punto2.set_y (-10);
		System.out.println ("Coordenada x e y de punto2: " + punto2.get_x() + "," + punto2.get_y());
		
		// Llamada a un método de clase o estático
		System.out.println ("Numéro de objetos punto creados = " + Punto3.get_num_puntos());
		
		
		// Ojo, si cambiamos el número de puntos a 7 u 8
		//      numero de puntos no reflejará el número de objetos creados, ya que hay 2
		
		// Esto es mejor no hacerlo asi 
		// => no es normal cambiar un atributo de clase a través de un objeto
		punto1.set_num_puntos (7);
		
		// Es mejor hacerlo así, para modificar un atributo estático o de clase 
		// se nombra la clase a la que pertenece 
		Punto3.set_num_puntos (8);
		
		// Llamada a un método de clase o estático
		System.out.println ("Numéro de objetos punto creados = " + Punto3.get_num_puntos());
		
		// cambiar la coordenada x del punto1 a 48
		punto2.set_x (48);
		System.out.println ("Coordenada x e y de punto2: " + punto2.get_x() + "," + punto2.get_y());		
		
	}	
	
}

