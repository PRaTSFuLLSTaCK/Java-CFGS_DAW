package Funciones;

public class MinimoComunMultiploDeDosNumeros02 {

	// aprovechando que tenemos hecha la función max_comun_divisor, calcularemos
	// el mínimo común múltiplo de dos números como la multiplicación de ambos  
	// divido por el mcd

	static int min_comun_multiplo (int a, int b)    {   

		int mcm;

		mcm = a*b / max_comun_divisor (a,b);

		return (mcm); 

	}
	static int max_comun_divisor (int a, int b)    {

		int mcd=1;
		int min;
		min = minimo (a,b);

		mcd=1; // existe un mcd seguro, el 1, que divide a y b.

		for (int i=2;i<=min;i++)

			if( a%i==0 && b%i==0) // si i divide a "a" y "b" 

				mcd=i;        // i será el nuevo mcd.

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

		int a, b, mcm;

		System.out.print("Introduce a: ");

		a=Utilidades.Entrada.entero();

		System.out.print("Introduce b: "); 

		b=Utilidades.Entrada.entero();

		System.out.println("");

		mcm = min_comun_multiplo (a, b);

		System.out.println("El mcm de "+a+" y "+b+" es: "+mcm); 

	}

}


