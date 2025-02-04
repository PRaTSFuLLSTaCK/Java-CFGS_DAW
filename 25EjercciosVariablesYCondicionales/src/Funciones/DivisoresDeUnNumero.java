package Funciones;

public class DivisoresDeUnNumero {

	// la función es_primo indica si el número pasado es o no primo    
	// recordamos que un número primo es solo divisible por el mismo y 1    

	static boolean es_primo(int num)    

	{        

		boolean primo;
		int i;

		primo=true; // suponemos que el número es primo

		// este algoritmo se puede mejorar sabiendo que si un número no es 
		// divisible entre 2 y su raíz cuadrada, entonces ya no será divisible
		// por ningún otro números -> será primo           

		// con esta mejora podemos ahorrar muchas vueltas del while para        

		// números grandes

		i=2;        

		while(i<num && primo==true)      

		{            

			if( num %i == 0) // si es divisible 

				primo=false; // si hemos entrado aquí significa que el número no es primo
		}

		i++;


		return(primo); 

	}
	
	// esta función me devuelve el número de divisores del número  
	// los divisores a tener en cuenta solo son aquellos que son primos
	// un ejemplo:    

	// los divisores de 24 son: 2 y 3    
	// aunque 4 y 6 también dividen a 24, no se consideran divisores, al no ser primos    
	// por lo que 24 tiene tres divisores (el 1, el 2 y el 3)

	static int num_divisores(int num){  

		int cont;



		cont=1; // siempre habrá un divisor seguro, el 1.

		for (int i=2;i<=num;i++)   

			if(es_primo (i) && num %i == 0) // si i es primo y divide a num 

				cont++;     // incrementamos el número de divisores

		return(cont);

	}
	static int [] divisores(int num){  

		int cont=0;   
		int div[];  // tabla donde guardaremos los divisores;  
		int num_div; // número de divisores primos que tiene num.

		num_div = num_divisores (num);

		div =new int[num_div];

		for (int i=1;i<=num;i++) 
			if(es_primo (i) && num %i == 0) // si i es primo y divide a num

			{                    

				div[cont] =i;     // incrementamos el número de divisores 

				cont++;           

			}
		return(div);  

	}
	public static void main(String[] args) { 

		int num, divisores[];       

		System.out.print("Introduce numero: "); 

		num=Utilidades.Entrada.entero();      

		divisores =divisores(num);

		System.out.println("Los divisores de " + num + " son:"); 

		for (int i = 0; i < divisores.length; i++)  

			System.out.print(divisores[i] + "   ");

		System.out.println("");     

	}

}


