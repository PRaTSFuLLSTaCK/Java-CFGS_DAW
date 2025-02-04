package Tablas;

public class Leer10NumerosYDecirOrdenadosODesordenados {

	public static void main(String[] args) {   

		int numeros[];    
		int i;

		boolean creciente, decreciente;            
		// creciente indicará si los números están ordenados de forma creciente           
		// decreciente indicará si la serie está ordenada de forma decreciente

		// los posible valores para creciente y decreciente son:
		
		/*        creciente         decreciente             
		 *          false              false    -> cuando todos los números sean idénticos             
		 *          false              true     -> orden decreciente             
		 *          true               false    -> orden creciente             
		 *          true               true     -> desordenado             
		 *             
		 * 
		 * si, para algún i, se cumple t[i]>t[i+1]: la serie t[i], t[i+1] es decreciente                          
		 * 
		 *  o el caso contrario.                          
		 */
		numeros = new int [10];
		creciente = false;        
		decreciente = false;

		// leemos los números 

		System.out.println("Leyendo números:");

		for (i=0;i<10;i++){   

			System.out.print("número: ");  

			numeros[i]=Utilidades.Entrada.entero(); 

		}
		// comprobaremos el orden  

		for (i=0;i<9;i++)   // usamos i e i+1, por lo que la i solo podrá llegar hasta 8 (ó <9)      

		{            

			if (numeros[i] > numeros[i+1])  // en este momento es decreciente

				decreciente = true;

			if (numeros[i] < numeros[i+1])  // en este momento es creciente    

				creciente = true;      

		}

		// dependiendo de los valores de creciente y decreciente daremos un tipo de ordenación

		if (creciente ==true && decreciente ==false) //toda las parejas están en orden creciente  

			System.out.println("Serie creciente.");

		if (creciente ==false && decreciente ==true) // todas la parejas están en orden decreciente          

			System.out.println("Serie decreciente.");

		if (creciente ==true && decreciente ==true) // si ha tenido momentos creciente y decrecientes    

			System.out.println("Serie desordenada.");

		if (creciente ==false && decreciente ==false) // no hay parejas crecientes ni decrecientes       

			System.out.println("Todos los números iguales."); // lo que significa que todos son iguales

	} 

}
