package Tablas;

public class Leer10NumerosEInsertarParePrimeroYLuegoImpares02 {

	/*  En esta versión nos fijaremos en los índices pares e impares     
	 *  en par se incluirá t[2],t[4]...    
	 *  en impar t[1], t[2],...     
	 *  
	 */
	public static void main(String[] args) { 

		int t[];        
		int par[];

		int impar[];
		t = new int[10];

		// Leemos los valores de la tabla

		for (int i=0;i<10;i++){ 

			System.out.print("Introduzca un número: "); 

			t[i]=Utilidades.Entrada.entero();

		}

		// creamos las tablas par e impar del tamaño adecuado (5)

		par=new int[5];  
		impar=new int[5];

		// copiamos cada elemento en la tabla adecuada   
		for (int i=0;i<10;i+=2) 

			par[i/2] = t[i];

		for (int i=1;i<10;i+=2) // la división entera redondeada hacia el entero más próximo por

			impar[i/2] = t[i];  // debajo: 1/2 =0, 3/2 =1, etc.

		System.out.println("\n\nTabla par:");  

		for (int i=0;i<5;i++)      

			System.out.println(par[i]); 

		System.out.println("Tabla impar:");     

		for (int i=0;i<5;i++)         

			System.out.println(impar[i]);  

	} 

}
