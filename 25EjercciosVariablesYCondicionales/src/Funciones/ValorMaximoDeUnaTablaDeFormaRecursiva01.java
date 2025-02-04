package Funciones;

public class ValorMaximoDeUnaTablaDeFormaRecursiva01 {

	/** la función máximo busca el mayor número entre los elementos de t,     
	 *  a partir de las posición pos.     
	 */   

	static int maximo (int t[], int pos)    {  

		int res;

		if(pos==t.length-1)  // caso base: pos indica el último elemento de t 
			// en este caso este será el máximo

			res=t[pos];       

		else       

		{          

			int k;

			k = maximo (t,pos+1); // k será el mayor desde la posición pos+1 hasta el último elemento

			if (t[pos]>k)   // si t[pos] es mayor que k 
				res = t[pos];   //t[pos] es el máximo 

			else                

				res = k;// en caso contrario será k el máximo 

		}

		return(res);

	}

	// el usuario utilizará esta función por comodidad

	static int maximo (int t[])    { 

		return (maximo (t,0));  

	}
	public static void main(String[] args) { 

		int datos[];    
		int max;

		datos = new int[10];

		for (int i = 0; i < datos.length; i++)

			datos[i] = (int) (Math.random()*1000+1);

		System.out.println("Los datos son:");

		for (int i = 0; i < datos.length; i++) 

			System.out.print(datos[i] + "  ");

		max =maximo(datos);

		System.out.println("\n\nEl máximo es: " + max); 

	}

}



