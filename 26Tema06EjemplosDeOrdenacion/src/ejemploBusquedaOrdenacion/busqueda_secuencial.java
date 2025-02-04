package ejemploBusquedaOrdenacion;

public class busqueda_secuencial {
	/* in: v -> vector de reales
				ele -> real a buscar en v	
		out: -1 -> si no encuentra ele en v
           la posición de ele -> si se encuentra ele en v */
	public static int buscar_secuencial (float v[], float ele)
	{
		int i, pos = -1;
		boolean encontrado = false;
		
		/* !encontrado es igual que encontrado == false */
		for (i=0; i < v.length && !encontrado; i++)
			if (v[i] == ele) {
				// se ha encontrado el elemento ele en el vector
				encontrado = true;
				pos = i;
			}
			
		return pos;
	} /* fin buscar_secuencial */
	
	/* in: v -> vector de enteros
				ele -> real a buscar en v	
		out: -1 -> si no encuentra ele en v
           la posición de ele -> si se encuentra ele en v */
	public static int buscar_secuencial (int v[], int ele)
	{
		int i, pos = -1;
		boolean encontrado = false;
		
		/* !encontrado es igual que encontrado == false */
		for (i=0; i < v.length && !encontrado; i++)
 		  if (v[i] == ele) {
 		  	// se ha encontrado el elemento ele en el vector
				encontrado = true;
	      pos = i;
			}
			
		return pos;
	} /* fin buscar_secuencial */
	
	/*in: cadenas -> vector de cadenas
        cad -> cadena a buscar en cadenas 
		out: -1 -> si no encuentra cad en cadenas
         la posicion -> si se encuentra cad en cadenas */
	public static int buscar_secuencial (String cadenas[], String cad)
	{
		int i, pos = -1;
		boolean encontrado = false;

		for (i=0; i < cadenas.length && !encontrado; i++)
			if (cadenas[i].equals(cad)) {
				encontrado = true;
				pos = i;
			}
			
		return pos;
	} /* fin buscar_secuencial */

	public static void main (String args[]) {
		float reales [] = {1.05f, -34, -55.5f, 200.1f, 48, 45.45f};
		int enteros [] = {4, -45, 567, 88, 5, 6, 88, 9, 12, 14, -345};
		String cadenas [] = {"Juan", "Antonio", "María", "Pepe Luis", "Esteban", "Pepa", "Calixto"};
		
		int posicion = buscar_secuencial (reales, 48);
		if (posicion == -1)
			System.out.println ("Real no encontrado en el vector");
		else
			System.out.println (reales[posicion] + " encontrado en la posición " + (posicion+1) );		
		
		posicion = buscar_secuencial (reales, 45.8f);
		if (posicion == -1)
			System.out.println ("Real no encontrado en el vector");
		else
			System.out.println (reales[posicion] + " encontrado en la posición " + (posicion+1) );	
		
		posicion = buscar_secuencial (enteros, 48);
		if (posicion == -1)
			System.out.println ("Entero no encontrado en el vector");
		else
			System.out.println (enteros[posicion] + " encontrado en la posición " + (posicion+1) );		
		
		posicion = buscar_secuencial (enteros, 88);
		if (posicion == -1)
			System.out.println ("Entero no encontrado en el vector");
		else
			System.out.println (enteros[posicion] + " encontrado en la posición " + (posicion+1) );
		
		posicion = buscar_secuencial (cadenas, "Alejandro");
		if (posicion == -1)
			System.out.println ("Cadena no encontrada en el vector");
		else
			System.out.println (cadenas[posicion] + " encontrado en la posición " + (posicion+1) );		
		
		posicion = buscar_secuencial (cadenas, "Pepa");
		if (posicion == -1)
			System.out.println ("Cadena no encontrada en el vector");
		else
			System.out.println (cadenas[posicion] + " encontrada en la posición " + (posicion+1) );			
		
	} // fin main

} // fin clase busqueda_secuencial
