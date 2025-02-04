package Funciones;

public class ValorMaximoDeUnaTablaDeFormaRecursiva02 {

	public static void main(String[] args)    {

		int t[]={7, 2, 10, 5, 1, 9}; // un ejemplo para probar la función    

		int max;



		max =maximo(t);

		System.out.println("El máximo es: " +max);

	}

	// El máximo de una tabla será el máximo entre el primer elemento de la    
	// tabla y el resto de la tabla (es decir del segundo elemento hasta el    
	// último).    

	// Vamos acortando la tabla, indicando el primer índice donde se empezará a    
	// buscar el máximo.    // El caso base será una tabla donde solo se busca en un elemento elemento.    
	// Está claro que ese único elemento será el mayor de la tabla (de 1 elemento).

	static int maximo(int t[])    { 

		return (maximo(t, 0, t.length-1 ));   

	}
	static int maximo(int t[], int desde, int hasta) 

	{     

		int mayor;

		if (desde == hasta) // caso base 
			// la tabla solo tiene un elemento

			mayor=t[desde];   

		else        

		{            

			mayor = maximo(t, desde+1, hasta);

			if (mayor < t[desde])         

				mayor = t[desde];        

		}        

		return (mayor);    

	}

}



