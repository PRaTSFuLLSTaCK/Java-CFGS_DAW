package Funciones;

public class FuncionQueDecidaSiUnNumeroEsPrimo {

	static boolean es_primo(int num){  

		boolean primo;       
		int i;

		primo=true;

		i=2;  
		while(i<num && primo==true)   

		{            

			if(num%i==0)        // si num es divisible por i 

				primo=false;    // si llego aquí es que num es divisible-> no es primo

			i++;       

		}
		return(primo); 

	}
	public static void main(String[] args) { 

		boolean res;       
		int num;

		System.out.print("Introduce numero: ");

		num=Utilidades.Entrada.entero();

		if(es_primo(num))  

			System.out.println("Es primo");

		else          

			System.out.println("No es primo");
	} 
}



