package CodigoFuenteTema04;

public class Circulo {
	// atributo de instancia punto. Referencia a un objeto punto
	private Punto centro; 
	// atributo de instancia radio. Valor primitivo (int)
	private int radio;
	
	// constructor 1 => con argumentos
	// x, y => coordenadas del centro
	// r => radio
	Circulo (int x, int y, int r) {
		// se necesita crear el objeto de la clase Punto denominado centro
		// al crear un objeto Circulo con new Circulo()	
		centro = new Punto(x,y);
		radio = r;
	}
	
	// constructor 2 => sin argumentos	
	Circulo () {
		// se necesita crear el objeto de la clase Punto denominado centro
		// al crear un objeto Circulo con new Circulo()	
		centro = new Punto();		
	}
		

	/* método de instancia que se llama a través un objeto
	   Entrada: nada
	   Salida: devuelve la superficie del círculo 
	*/
	public double superficie() { 
		 return 3.14 * radio * radio;
	} // fin del método superficie
	
	public static void main (String args[]) {
		
		/******* USO DEL CONSTRUCTOR 2 => sin argumentos ******/
		/* Creación de un objeto de la clase Circulo que es apuntado por la referencia c */
		Circulo c = new Circulo();
		
		// poner las coordenadas (x, y) del centro del circulo c a (2,3) 				
		c.centro.set (2,3);
		// establecer el valor del radio del circulo c a 5
		c.radio = 5;
		// En s se guarda la superficie del circulo c		
		double s = c.superficie();
		
		System.out.println ("La superficie del circulo 1 es: " + s);		
		System.out.println ("Coordenadas (x,y) del círculo 1 son: " + c.centro.getx() + "," + c.centro.gety() ); 		
		
		/******* USO DEL CONSTRUCTOR 1 => con argumentos ******/		
		/* Creación de un objeto de la clase Circulo => con centro (4,5) y radio = 7 */
		Circulo c2 = new Circulo (4,5,7);		
		
		s = c2.superficie();
		
		System.out.println ("La superficie del circulo 2 es: " + s);		
		System.out.println ("Coordenadas (x,y) del círculo 2 son: " + c2.centro.getx() + "," + c2.centro.gety() ); 		
		
	} // fin main	

} // fin de la clase Circulo
