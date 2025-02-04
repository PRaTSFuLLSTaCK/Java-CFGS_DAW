package Funciones;

public class DivisoresPrimosDeUnNumero {

	// la función es_primo indica si el número pasado es o no primo    
	// recordamos que un número primo es solo divisible por el mismo y 1

	static boolean es_primo(int num)

	{       

		boolean primo; 
		int i;

		primo=true; 

		// suponemos que el número es primo
		// este algoritmo se puede mejorar sabiendo que si un número no es        
		// divisible entre 2 y su raíz cuadrada, entonces ya no será divisible        
		// por ningún otro números -> será primo               

		// con esta mejora podemos ahorrar muchas vueltas del while para
		// números grandes

		i=2; 

		while(i<num && primo==true) // en realidad bastaría probar hasta la raíz cuadrada de num 

		{            

			if( num %i == 0) // si es divisible 

				primo=false; // si hemos entrado aquí significa que el número no es primo

			i++;

		}

		return(primo); 

	}

	// esta función devuelve el número de divisores primos del número pasado como parámetro.  

	// un ejemplo:    

	// los divisores de 24 son: 2 y 3    

	// aunque 4 y 6 también dividen a 24, no se consideran divisores primos, al no ser primos    

	// por lo que 24 tiene tres divisores primos: el 1, el 2 y el 3.

	static int num_divisores (int num){ 

		int cont;

		cont=1; // siempre habrá un divisor seguro, el 1.

		for (int i=2;i<=num;i++)  

			if(es_primo (i) && num %i == 0) // si i es primo y divide a num 

				cont++;     // incrementamos el número de divisores primos

		return(cont); 

	}

	public static void main(String[] args) { 

		int num,div;  

		System.out.print("Introduce numero: ");   

		num=Utilidades.Entrada.entero();    

		div=num_divisores(num);

		System.out.println("Tiene " +div+ " divisores");

	} 

}



