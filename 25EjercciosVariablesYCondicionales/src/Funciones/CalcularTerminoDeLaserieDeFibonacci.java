package Funciones;

public class CalcularTerminoDeLaserieDeFibonacci {

	static int fibo(int num)    { 

		int res;

		if(num==0)      // primer caso base          

			res=0; 

		else{           

			if(num==1)  // segundo caso base

				res=1;           

			else               

				res=fibo(num-1)+fibo(num-2);    // caso general recursivo  

		}

		return(res);
	}

	public static void main(String[] args) {   

		int num,resultado;

		System.out.print("Vamos calcular fibonacci(n).\nIntroduzca n (se recomienda n<40):  "); 

		num=Utilidades.Entrada.entero();

		resultado=fibo(num); // si n es muy grande esto puede tardar bastante.

		System.out.println("\nfibonacci(" + num + ") = " +resultado);  

	}




}
