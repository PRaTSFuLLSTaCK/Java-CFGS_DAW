package Funciones;

public class MinimoComunMultiploDeTresNumeros01 {

	// el mínimo común múltiplo de a, b y c, es el número más pequeño que    

	// es divisible por a, b y c.

	// Para calcularlo podríamos utilizar algún algoritmo existente o hacerlo    
	// un poco por la "cuenta de la vieja".    
	// La idea es elegir el mayor de ellos, y multiplicarlo por i (1..), hasta que    
	// el número resultante sea divisible por todos

	static int min_comun_multiplo (int a, int b, int c)    

	{        

		int mcm=1;
		int max;
		int i;

		max = maximo (a, maximo(b,c));

		mcm =max;   // en principio el mcm es el mayor de los dos números 

		i=1;

		while (mcm%a!=0 || mcm%b!=0 || mcm%c!=0)   // mientras el mcm no sea divisible por todos

		{           

			i++;            

			mcm=max*i;      // el nuevo mcm sera el mayor por i 

		}

		return(mcm);

	}
	static int maximo (int a, int b){ 

		int max;

		if(a>b) 

			max=a; 

		else           

			max=b;

		return(max);  

	}
	public static void main(String[] args) { 

		int a, b, c, mcm;

		System.out.print ("Introduce a: ");  

		a=Utilidades.Entrada.entero();

		System.out.print ("Introduce b: ");

		b=Utilidades.Entrada.entero();

		System.out.print ("Introduce c: "); 

		c=Utilidades.Entrada.entero();

		System.out.println("");

		mcm = min_comun_multiplo (a, b, c);

		System.out.println("El mcm es: " +mcm);  

	} 

}


