package ejemploBusquedaOrdenacion;

import java.util.Arrays;

public class ordenacion {

	/* in: v -> vector de enteros        
	   out: ordena ascendentemente (de menor a mayor) el vector v por el método de la burbuja */
	public static void burbuja_asc (int v[])
	{
		int i, j;	int temp;  
		int num_ele = v.length; // número de elementos del vector
		
		
		boolean ordenado = false;
		/* El bucle i controla el número de pasadas */
		for (i=1; i < num_ele && !ordenado; i++) {
		   /* El bucle j controla el número de comparaciones entre elementos del vector */
		   
		   ordenado = true; 
		   // si no hay ningún intercambio estará ordenado el vector
		   // y no hará falta realizar más pasadas para ordenarlo
		   for (j=0 ; j < num_ele - i; j++)
		      /*Comparar el elemento j con el j+1 y si están desordenados los intercambiamos*/
		       if (v[j] > v[j+1]) {
		            temp = v[j];
		            v[j] = v[j+1];
		            v[j+1] = temp;
		            // ha habido un intercambio el vector no estaba ordenado
		            ordenado = false; 
		      } /* fin if */
		}
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
	   S: nada, ordena ascendentemente por quicksort el vector */	
	public static void quicksort_asc (int v[]) {
		quicksort_asc(v, 0, v.length-1);		
	}
	
	
	// Se sobrecarga el método para evitar llamarlo la primera vez
	// con quicksort_asc(v, 0, v.length-1)
	/* E: v => vector de enteros
	   S: nada, ordena ascendentemente por quicksort el vector */	
	public static void quicksort_asc (int v[], int izq, int der) {

	  int pivote=v[izq]; // tomamos primer elemento como pivote
	  int i=izq; // i realiza la búsqueda de izquierda a derecha
	  int j=der; // j realiza la búsqueda de derecha a izquierda
	  int aux;
	 
	  while(i<j){            // mientras no se crucen las búsquedas
		 while(v[i]<=pivote && i<j) 
			i++; // busca elemento mayor que pivote
		 while(v[j]>pivote) 
			j--;         // busca elemento menor que pivote
		 if (i<j) {                      // si no se han cruzado                      
			 aux= v[i];                  // los intercambia
			 v[i]=v[j];
			 v[j]=aux;
		 }
	   }
	   v[izq]=v[j]; // se coloca el pivote en su lugar de forma que tendremos
	   v[j]=pivote; // los menores a su izquierda y los mayores a su derecha
	   if(izq<j-1)
		  quicksort_asc(v,izq,j-1); // ordenamos subarray izquierdo
	   if(j+1 <der)
		  quicksort_asc(v,j+1,der); // ordenamos subarray derecho
	}


	/* E: v => vector de enteros
	   S: nada, ordena descendentemente por quicksort el vector */	
	public static void quicksort_desc (int v[]) {
		quicksort_desc(v, 0, v.length-1);		
	}
	
	
	// Se sobrecarga el método para evitar llamarlo la primera vez
	// con quicksort_desc(v, 0, v.length-1)
	/* E: v => vector de enteros
	   S: nada, ordena ascendentemente por quicksort el vector */	
	public static void quicksort_desc (int v[], int izq, int der) {

	  int pivote=v[izq]; // tomamos primer elemento como pivote
	  int i=izq; // i realiza la búsqueda de izquierda a derecha
	  int j=der; // j realiza la búsqueda de derecha a izquierda
	  int aux;
	 
	  while(i<j){            // mientras no se crucen las búsquedas
		 while(v[i]>=pivote && i<j) 
			i++; // busca elemento menor que pivote
		 while(v[j]<pivote) 
			j--;         // busca elemento mayor igual que pivote
		 if (i<j) {                      // si no se han cruzado                      
			 aux= v[i];                  // los intercambia
			 v[i]=v[j];
			 v[j]=aux;
		 }
	   }
	   v[izq]=v[j]; // se coloca el pivote en su lugar de forma que tendremos
	   v[j]=pivote; // los mayores a su izquierda y los menores a su derecha
	   if(izq<j-1)
		  quicksort_desc(v,izq,j-1); // ordenamos subarray izquierdo
	   if(j+1 <der)
		  quicksort_desc(v,j+1,der); // ordenamos subarray derecho
	}

	
	
	
	
	/* E: v => vector de enteros
	   S: muestra por pantalla el vector de enteros */
	public static void muestra (int v[], String mensaje) {
		if (v.length <= 50) {
			System.out.println("\n El vector de enteros " + mensaje ); 
			for (int f=0; f < v.length; f++)
				System.out.print (v[f]+" ");
		}
	} // fin muestra
	
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
	
	
	/* E: v => vector de enteros
		 S: true => si está ordenado descendentemente v		 
		    false => si no lo está */
	public static boolean ordenado_desc (int []v) {
		boolean ordenado = true;
		int i = 0;
		
		while (ordenado && i < v.length-1) {
			if (v[i] < v[i+1])
				ordenado = false; 
			i++;
		}
		
		return ordenado;
	} // fin ordenado_desc
	
	
	public static void main (String args []) {
		
		final int DIM  = 10000;
		final int DIM2 = 1000000; // 1 millón
		
		int vector[] = {8, 10, 9, 6, 6, 3, 8, 55, 6, 18};		
		int vector2 [] = new int [DIM];
		int vector3 [] = new int [DIM2];
		
		
		
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
		
		
		
		quicksort_asc (vector2);
		muestra (vector, " ordenado por quicksort ascendente");
		if (ordenado_asc(vector2))
			System.out.println("\nVector ordenado ascendentemente por el método de quicksort");
		else
			System.out.println("\nVector NO ordenado ascendentemente por el método de quicksort");
		
		aleatorio (vector2);
		muestra (vector2, " desordenado es: ");
		quicksort_desc (vector2);
		muestra (vector2, " ordenado por quicksort descendente");
		if (ordenado_desc(vector2))
			System.out.println("\nVector ordenado descendentemente por el método de quicksort");
		else
			System.out.println("\nVector NO ordenado descendentemente por el método de quicksort");		
		
		
		// Probar con un vector muy grande
		aleatorio (vector3);
		
		
		shell_asc (vector3);
		//muestra (vector, " ordenado por el método de Shell:");
		
		
		if (ordenado_asc(vector3))
			System.out.println("\nVector grande ordenado ascendentemente por el método de Shell");
		else
			System.out.println("\nVector grande NO ordenado ascendentemente por el método de Shell");	
		
		// Uso del método sort de ordenación de la clase Arrays
		// esté metodo fundamentalmente es el quicksort de forma iterativa (no recursiva)
		// Ahora no usadlo en las prácticas
		// más adelante se verá en el Tema 10. Colecciones
		aleatorio (vector3);		
		Arrays.sort (vector3);		
		if (ordenado_asc(vector3))
			System.out.println("\nVector grande ordenado ascendentemente por el método de sort");
		else
			System.out.println("\nVector NO ordenado ascendentemente por el método de sort");	
				
		
		
	} // fin main

} // fin clase ordenacion
