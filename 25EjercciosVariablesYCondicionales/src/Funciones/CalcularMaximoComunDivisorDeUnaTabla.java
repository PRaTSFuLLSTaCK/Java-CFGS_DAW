package Funciones;

public class CalcularMaximoComunDivisorDeUnaTabla {

	/* el máximo común divisor es el número más grande que     
	 * es capaz de dividir a todos los números     
	 * Para calcularlo podríamos utilizar algún algoritmo existente o hacerlo     
	 * un poco por la "cuenta de la vieja".     
	 * La idea es dividir por todos los números desde 1 hasta mínimo(a, b, c)     
	 * y quedarnos con el mayor.    */

	static int max_comun_divisor (int t[])    

	{        

		int mcd=1;        
		int min;       
		boolean divide_a_todos; // una bandera para saber si un número divide 
								// a todos los elementos de la tabla 

		// esto funciona para tabla con al menos un valor        

		min = t[0];

		// utilizaremos la función con solo dos parámetros;

		for (int i = 0; i < t.length; i++)  

			min = minimo (min,t[i]);

		// al terminar el for, min debe tener el valor mínimo de toda la tabla.

		mcd=1; // existe un mcd seguro, el 1.

		for (int i=2;i<=min;i++)     

		{            

			divide_a_todos =true;

			for (int k=0;k<t.length;k++)    

				if( t[k]%i!=0) // si i divide a t[i]   

					divide_a_todos=false;  // entonces la i no divide a todos los elementos de t.

			if (divide_a_todos == true) // i es capaz de dividir a todos los elementos de t    

				mcd =i;     // entonces i es el nuevo mcd      

		}
		return(mcd);   

	}
	static int minimo(int a, int b){ 

		int min;

		if(a>b)    

			min=b;       

		else            

			min=a;

		return(min);

	}   

	public static void main(String[] args) {  

		int t[], mcd;

		t = new int [4];

		for (int i = 0; i < t.length; i++)

			t[i] = (int)(Math.random()*1000+1); // llenamos t con números aleatorios entre 1 y 1000

		System.out.println("Los números son: ");

		for (int i = 0; i < t.length; i++)

			System.out.print(t[i] +"   ");

		System.out.println("");

		mcd = max_comun_divisor (t);

		System.out.println("El mcd es: " +mcd); 
	} 

}


