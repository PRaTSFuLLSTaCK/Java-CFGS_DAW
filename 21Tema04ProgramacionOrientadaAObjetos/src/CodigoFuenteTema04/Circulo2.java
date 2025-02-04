package CodigoFuenteTema04;

public class Circulo2 {
	// atributo de instancia punto. Referencia a un objeto punto
	public Punto2 centro; 
	// atributo de instancia radio. Valor primitivo (int)
	public int radio;	

	/* método de instancia que se llama a través un objeto
	   Entrada: nada
	   Salida: devuelve la superficie del círculo 
	*/
	public double superficie() { 
		 return 3.14 * radio * radio;
	} // fin del método superficie
	
	public static void main (String args[]) {
		/* Creación de un objeto de la clase Circulo 
		que es apuntado por la referencia c */
		Circulo2 c = new Circulo2();
		
		// Hay que crear el objeto c.centro que es el atributo centro del objeto c
		c.centro = new Punto2();
		
		// poner las coordenadas (x, y) del centro del circulo c a (2,3) 		
		c.centro.x = 2;
		c.centro.y = 3;
		
		// es mejor hacerlo a través de c.centro.set (2,3);
		
		// establecer el valor del radio del circulo c a 5
		c.radio = 5;
		// En s se guarda la superficie del circulo c
		
		double s = c.superficie();
		
		System.out.println ("La superficie del circulo es: " + s);
		
		System.out.println ("Coordenadas (x,y) del círculo son: " + c.centro.x + "," + c.centro.y); 
	}
	
	

} // fin de la clase Circulo2

