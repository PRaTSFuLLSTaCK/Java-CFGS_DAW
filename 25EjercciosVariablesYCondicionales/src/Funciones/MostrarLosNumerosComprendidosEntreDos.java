package Funciones;

public class MostrarLosNumerosComprendidosEntreDos {

	static void mostrar(int a,int b){    

		int mayor, menor;  
		
		// desconocemos el orden en el que vienen a y b.       

		// Lo que haremos es poner los valores correctos en mayor, menor.              

		if(a>b){ 
			
			// a es el mayor. Se podría utilizar la función maximo() implementada anteriormente. 

			mayor=a;           
			menor=b;       

		}        

		else{   // en este caso b será el mayor

			mayor=b; 
			menor=a;  

		}

		for (int i=menor;i<=mayor;i++)   

			System.out.print(i+"  ");

		System.out.println();  

	}
	public static void main(String[] args) {  

		int a,b;

		System.out.print("Introduzca primer numero: "); 

		a=Utilidades.Entrada.entero();  

		System.out.print("Introduzca segundo numero: "); 

		b=Utilidades.Entrada.entero();   

		mostrar(a,b);  

	}

}



