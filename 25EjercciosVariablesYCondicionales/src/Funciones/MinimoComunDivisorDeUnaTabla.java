package Funciones;

public class MinimoComunDivisorDeUnaTabla {

	// el mínimo común múltiplo de a y b, es el número más pequeño que
	// es divisible por ambos.   
	// Para calcularlo podríamos utilizar algún algoritmo existente o hacerlo    
	// un poco por la "cuenta de la vieja".    
	// La idea es elegir el mayor de ellos, y multiplicarlo por i (1..), hasta que    
	// el número resultante sea divisible por ambos

	static int min_comun_multiplo (int a, int b)    {  

		int mcm=1;  
		int max;   
		int i;

		max = maximo (a, b);

		mcm =max;   // en principio el mcm es el mayor de los dos números 

		i=1;

		while (mcm%a!=0 || mcm%b!=0)   // mientras el mcm no sea divisible por todos 

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

		int t[], mcm;
		t = new int[4];

		for (int i = 0; i < t.length; i++)

			t[i]=(int)(Math.random()*100+1);

		System.out.println("Los datos son:");

		for (int i = 0; i < t.length; i++)  

			System.out.print(t[i]+"  ");

		System.out.println("");

		mcm = t[0];

		for (int i = 0; i < t.length; i++) 

			mcm = min_comun_multiplo (t[i],mcm);

		System.out.println("El mcm es: " +mcm);  
	}

}



