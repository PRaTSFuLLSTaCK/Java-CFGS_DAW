package Funciones;

//pudiendo configurar los valores de los dos primeros término de la serie.

public class CalcularTerminoDeLaserieDeFibonacciConfigurandoTerminos {

	/*sobrecargamos la función para que funcione de la siguiente forma:     
	 *  - si solo se le pasa el término a calcular: utiliza los casos bases típicos
	    se le puede pasar los valores de los casos bases: fibo(0) y fibo(1)*/ 

	static int fibo(int num)    { 
		int res;
		if(num==0)     
			// primer caso base            

			res=0;        

		else{      

			if(num==1)  // segundo caso base 

				res=1;           

			else               

				res=fibo(num-1)+fibo(num-2);

			// caso general recursivo  

		}

		return(res);

	}

	static int fibo(int num, int fibo0, int fibo1) 

	{        

		int res;

		if(num==0)  

			// primer caso base, que tendrá el valor indicado por el usuario 

			res=fibo0;        

		else{          

			if(num==1)  // segundo caso base, también configurable 

				res=fibo1;           

			else                

				res=fibo(num-1,fibo0, fibo1)+fibo(num-2, fibo0, fibo1); 

			// caso general recursivo             
			// hemos de acordarnos de utilizar la función fibo que  
			// tiene 3 parámetros       

		}

		return(res);

	}

	public static void main(String[] args) { 

		int num,resultado;     
		int fibo0,fibo1;

		System.out.println("Vamos calcular fibonacci(n)\n");

		System.out.print("Introduzca el valor de fibonacci(0): ");

		fibo0 = Utilidades.Entrada.entero();

		System.out.print("Introduzca el valor de fibonacci(1): ");  

		fibo1 = Utilidades.Entrada.entero();

		System.out.print ("\nIntroduzca n (se recomienda n<40):  "); 

		num=Utilidades.Entrada.entero();

		// si n es muy grande esto puede tardar bastante.

		resultado=fibo(num, fibo0, fibo1); 

		System.out.println("\nfibonacci(" + num + ") = " +resultado); 

	}

}



