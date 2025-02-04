package practica1Tema6a;

public class ordenacion_quicksort {

	/* in: v -> vector de enteros        
	   out: ordena ascendentemente (de menor a mayor) el vector v por el método de la burbuja */
	public static void burbuja_asc (int v[])
	{
		int i, j;	int temp;  
		int num_ele = v.length; // número de elementos del vector
		
		/* El bucle i controla el número de pasadas */
		for (i=1; i < num_ele; i++)
		   /* El bucle j controla el número de comparaciones entre elementos del vector */
		   for (j=0 ; j < num_ele - i; j++)
		      /*Comparar el elemento j con el j+1 y si están desordenados los intercambiamos*/
		       if (v[j] > v[j+1]) {
		            temp = v[j];
		            v[j] = v[j+1];
		            v[j+1] = temp;
		      } /* fin if */
	} /* fin burbuja_asc */	
	
	
	/* in: v -> vector de enteros
  	   out: ordena ascendentemente de menor a mayor
            el vector v por el metodo de shell */
	public static void shell_asc (int v[])
	{
		int d, i, ele;
		boolean ordenado;
		int num_ele = v.length; // número de elementos
		
		d = num_ele/2; // distancia de comparación		
		
		/* La ordenación se realiza mientras la distancia de comparación d sea mayor igual que 1 */ 
				
		while (d >= 1) {	
			
			ordenado = false;
			
			/* ordena el vector para la distancia d */	
			while (!ordenado) { 	// !ordenado es como poner ordenado == false
				
				ordenado = true;
				
				for (i=0; i < num_ele-d; i++)
					// si el elemento i es mayor que i+d los intercambia
					if (v[i] > v[i+d]) {						
						ele = v[i];
						v[i] = v[i+d];
						v[i+d] = ele;
						ordenado = false;
					} /* fin if */
			} /* fin while !ordenado */ 
			
			/* calcula la nueva distancia de comparación d */
			d = d/2;
			   
		} /* fin while d */

	} /* fin shell_asc */   
	
	
	/* E: v => vector de enteros
	      izq => posición del indice izquierda dentro del vector
	      der => posición del indice derecha dentro del vector
	   S: posición del pivote o elemento del vector que queda ordenado ascendentemente de 
	      tal forma que los elementos desde v[pivote-1] hasta v[izq] son menores o iguales
	      que v[pivote], además los elementos desde v[pivote+1] hasta v[der] son mayores 
	      que v[pivote] */
	public static int pivote_asc (int v[], int izq, int der) {	
		
		int temp; // variable auxiliar para el intercambio
		int pos; // posición del vector a intercambiar con el pivote
		/* eleccion del pivote, por ejemplo el elemento más a la izquierda */
		int	pivote = izq;		
		
		// comprobar el caso particular de que derecha es uno más que izquierda
		if (izq+1 == der) {
			// Caso 1) hay que ordenar un vector de dos elementos
			if (v[izq] > v[der]) 
				pos = der;
			else
				pos = izq;		
		}
		else {			
			// Caso 2) el vector a ordenar tiene 3 o más elementos
			izq ++;				
			
			while (izq < der) {
				// comprobar si v[izq] y v[der] están bien ordenados respecto a v[pivote]
				if (v[izq] > v[pivote] && v[der] <= v[pivote]) {
					// no están bien ordenados => se intercambian v[izq] con v[der]
					temp = v[izq];
					v[izq] = v[der];
					v[der] = temp;
					izq ++;
					der --;					
				}
				else {
					// comprobar si hay que avanzar o no los indices izquierda o derecha
					// en caso de que estén bien colocados respecto al pivote
					if (v[izq] <= v[pivote])
						izq ++;
						
					if (v[der] > v[pivote])
						der --;					
				}	// fin else					
			} // fin while			
		
			// ====== Calcular donde hay que colocar el pivote ===========
			if (izq == der) {
				if (v[pivote] > v[izq]) 
					// esto significa que hay que intercambiar el pivote con der, por ejemplo.
					pos = der;					
				else 
					// hay que intercambiar el pivote con derecha -1
					// puede suceder que si pivote = derecha -1 realmente no se intercambie nada
					pos = der -1;						
			}
			else
				// izq > der
				pos = der;	
				
		} // fin else de más arriba
		
		// Al salir del bucle a la izquierda de izq todos los elementos (no se cuenta a pivote) son 
		// menores o iguales que v[pivote]
		// Y a la derecha de dech todos los elementos (excepto pivote) son 
		// mayores que v[pivote]		
		
		if (pos != pivote) {			
			// intercambiar v[pos] con v[pivote]
			temp = v[pos];
			v[pos] = v[pivote];
			v[pivote] = temp;							
		} 
		
		// la posición del pivote está en pos
		return pos;
	
	} // fin pivote_asc
	
	
	/* E: v => vector de enteros
	   S: nada, ordena ascendentemente por quicsort el vector */
	public static void quicksort_asc (int [] v, int izq, int der) {
		 System.out.println ("\nquicksort (v," + izq + ", " + der + ")");
		 int pivote;
		 if(izq < der){
			pivote = pivote_asc(v, izq, der);
			System.out.println ("\npivote (v," + izq + ", " + der + ")" + " pivote = " + pivote);
			muestra2 (v, "vector = \n", pivote);
			// ordenar la parte izquierda del vector a partir de pivote
			quicksort_asc (v, izq, pivote-1);
			// ordenar la parte derecha del vector a partir de pivote
			quicksort_asc (v, pivote+1, der);
		 }  
	} // fin quicksort_asc	
	
	/* E: v => vector de enteros
	   S: muestra por pantalla el vector de enteros */
	public static void muestra (int v[], String mensaje) {
		System.out.println("\n El vector de enteros " + mensaje ); 
		for (int f=0; f < v.length; f++)
			System.out.print (v[f]+" ");
	} // fin muestra
	
	
	/* E: v => vector de enteros
	   S: muestra por pantalla el vector de enteros separando por más espacios en blanco donde
	   *  está el elemento situado en pos */
	public static void muestra2 (int v[], String mensaje, int pos) {
		System.out.println("\n El vector de enteros " + mensaje ); 
		for (int f=0; f < v.length; f++)
			if (f == pos)
				System.out.print ("  " + v[f] + "  ");
			else
				System.out.print (v[f]+" ");
	} // fin muestra2
	
	
	
	
	/* E: v => vector de enteros
	   S: genera un número aleatorio para cada elemento del vector de enteros */
	public static void aleatorio (int v[]) {		
		for (int f=0; f < v.length; f++)
			/* número aleatorio entre 0 y 100 */
			v[f] = (int) Math.round (Math.random()*100);	
			
			// (int) Math.random ()*10  ==> números aleatorios entre 0 y 9
						
	} // fin aleatorio
	
	/* E: v => vector de enteros
		 S: true => si está ordenado ascendentemente v		 
		    false => si no lo está */
	public static boolean ordenado_asc (int []v) {
		boolean ordenado = true;
		int i = 0;
		
		while (ordenado && i < v.length-1) {
			if (v[i] > v[i+1])
				ordenado = false; 
			i++;
		}
		
		return ordenado;
	} // fin ordenado_asc
	
	public static void main (String args []) {
		// int vector [] = new int [10];
		int vector[] = {10, 8, 15, 13, 7, 11, 5, 9, 2, 12};
		
		muestra (vector, " desordenado es:");
		
		quicksort_asc (vector, 0, vector.length-1);
		muestra (vector, " ordenado por quicksort");
		if (ordenado_asc(vector))
			System.out.println("\nVector ordenado ascendentemente por el método de quicksort");
		else
			System.out.println("\nVector NO ordenado ascendentemente por el método de quicksort");
		
		System.exit(1);
		
		aleatorio (vector);		
		muestra (vector, " desordenado es:");
		
		
		
		burbuja_asc (vector);
		muestra (vector, " ordenado por el método de la burbuja:");		
		if (ordenado_asc(vector))
			System.out.println("\nVector ordenado ascendentemente por el método de burbuja");
		else
			System.out.println("\nVector NO ordenado ascendentemente por el método de burbuja");
		
		
		aleatorio (vector);		
		muestra (vector, " desordenado es:");			
		
		shell_asc (vector);
		muestra (vector, " ordenado por el método de Shell:");
		
		
		if (ordenado_asc(vector))
			System.out.println("\nVector ordenado ascendentemente por el método de Shell");
		else
			System.out.println("\nVector NO ordenado ascendentemente por el método de Shell");	
		
		aleatorio (vector);
		muestra (vector, " desordenado es: ");
		
		//int pos = pivote_asc (vector, 0, vector.length-1);
				
		
	} // fin main

} // fin clase ordenacion
