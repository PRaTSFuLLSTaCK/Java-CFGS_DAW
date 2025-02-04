package Funciones;

public class FuncionMaximoDosNumeros {

	static int maximo(int a, int b){  // suponemos que los dos números serán distintos  

		int max;

		if(a>b) 

			max=a;   

		else         

			max=b;

		return(max);
	}  

	public static void main(String[] args) {  

		int max; 
		int a,b;

		System.out.print("Introduzca un numero: "); 

		a=Utilidades.Entrada.entero();

		System.out.print("Introduzca otro numero: ");

		b=Utilidades.Entrada.entero();

		max =maximo (a, b); 

		System.out.println("El número mayor es: " +max);     

	} 

}



