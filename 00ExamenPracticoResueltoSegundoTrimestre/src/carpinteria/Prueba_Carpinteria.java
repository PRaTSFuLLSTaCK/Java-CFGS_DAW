package carpinteria;

public class Prueba_Carpinteria  {

	// E: v => vector de interfaces Carpinteria
	// S: máximo de lo que se pagó por un montaje o fabricación de un producto a un trabajador.
	public static double pago_mayor (Carpinteria [] v) {		
		// primer candidato a ser máximo
		double max = v[0].paga_trabajador();
		
		// recorrer todos los elementos del vector v				
		for (Carpinteria ele: v)
			// comprobar si se supera al máximo para guardar el nuevo máximo
			if (ele.paga_trabajador() > max)
				max = ele.paga_trabajador();
		
		return max;	
	} // fin pago_mayor
	
	
	// E: v => vector de interfaces Carpinteria
	// S: nada, muestra todos los productos montados o fabricados y lo que se pagó al trabajador
	public static void muestra (Carpinteria [] v) {		
						
		// recorrer todos los elementos del vector v			
		for (Carpinteria ele: v) {			
			// ¿Es ele una instancia de la superclase abstracta Producto_Carpinteria?
			if (ele instanceof Producto_Carpinteria) {
				// conversión descendente => ya que get_trabajador() y get_nombre() no está en la superclase 
				Producto_Carpinteria prod = (Producto_Carpinteria) ele;				
				System.out.println ("El trabajador es " + prod.get_trabajador ().get_nombre() );				
			}
			else
				// ¿Es ele una instancia de la clase concreta Montaje?
				if (ele instanceof Montaje) {
					Montaje monta = (Montaje) ele;
					// conversión descendente => ya que get_trabajador() y get_nombre() no está en la superclase 				
					System.out.println ("El trabajador es " + monta.get_trabajador ().get_nombre() );				
				}			
			
			System.out.println (" y gana " + ele.paga_trabajador());
		}		

	} // fin muestra
	
	// E: v => vector de interfaces Carpinteria
	//    id => identificador del producto
	// S: -1 si no encuentra el producto
	//    el coste de fabricación en caso de ser encontrado
	public static double busca (Carpinteria [] v, int id) {
	
		boolean encontrado = false;
		double coste = -1;
		
		// recorrer todos los elementos del vector mientras no se haya encontrado el producto id
		for (int i=0; i<v.length && !encontrado; i++)
			// ¿Es v[i] una instancia de la superclase abstracta Producto_Carpinteria?
			if (v[i] instanceof Producto_Carpinteria) {
				// conversión descendente => ya que get_id_producto() no está en la superclase 
				Producto_Carpinteria prod = (Producto_Carpinteria) v[i];
				if (prod.get_id_producto () == id )	{	
					// se ha encontrado el producto		
					encontrado = true;
					coste = prod.coste_fabricacion();
				}
			}		
		
		return coste;	
	} // fin busca
	

	public static void main (String args []) {
		
		// crear 3 trabajadores		
		Trabajador t1 = new Trabajador ("Pedro", "12125654F");
		Trabajador t2 = new Trabajador ("Maria", "33125654G");
		Trabajador t3 = new Trabajador ("Pedro", "12125654F");
		
		// crear 5 productos
		Estanteria estanteria1 = new Estanteria ("Estanteria Moderna", t1, 2, 200, 4);
		Estanteria estanteria2 = new Estanteria ("Estanteria normal", t2, 3, 100, 2);
		Mesa mesa1 = new Mesa ("Mesa de formica", t3, 2, 50.75, true);
		Armario armario1 = new 	Armario ("Armario grande", t1, 4, 300, 3);
		Mesa mesa2 = new Mesa ("Mesa normal", t2, 1, 40, false);				
		
		// crear 4 montajes de productos		
		Montaje m1 = new Montaje (estanteria1, t3, 1, "Calle Granada 1º B");
		Montaje m2 = new Montaje (estanteria2, t2, 1, "Calle Alhama");
		Montaje m3 = new Montaje (mesa2, t3, 2, "Calle Gaviota 1º C");
		Montaje m4 = new Montaje (armario1, t1, 1, "Calle Alhambra 2º F");
		
		// crear el vector de interfaces		
		Carpinteria v[] = new Carpinteria[9];
		
		v[0] = estanteria1;
		v[1] = estanteria2;
		v[2] = mesa1;
		v[3] = armario1;
		v[4] = mesa2;
		v[5] = m1;
		v[6] = m2;
		v[7] = m3;
		v[8] = m4;
		
		// obtener el pago mayor realizado a un trabajador por fabricar un producto o  montarlo
		System.out.println ("Pago mayor a un trabajador = " + pago_mayor(v));
		
		// muestra todos los productos montados o fabricados y lo que se pagó al trabajador		
		muestra (v);
		
		// buscar si el producto con identificador 4 está y en tal caso mostrar su coste al fabricarlo
		double coste = busca (v, 4);		
		if (coste != -1)	
			System.out.println ("El producto con id 4 tiene un coste de fabricación de " + coste);
		else 
			System.out.println ("El producto no se ha encontrado");	
		
	
	} // fin main

} // fin Prueba_Carpinteria
