package Tablas;

public class IntroducirTablaOrdenadaEInsertarNumerosDeFormaOrdenada {

	/*
	 * Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. 
	 * Éstos los guardaremos en una tabla de tamaño 10. Leer un número N,
	 *  e insertarlo en el lugar adecuado para que la tabla continúe ordenada.
	 */

	public static void main(String[] args) {  

		int t[]=new int[10];      
		int num,sitio_num,j;

		for (int i=0;i<5;i++)    

		{            

			System.out.print("Introduzca número (ordenado crecientemente): ");   

			t[i]=Utilidades.Entrada.entero(); 

		}

		System.out.println();  

		System.out.print("Número a insertar entre los anteriores: "); 

		num=Utilidades.Entrada.entero();

		sitio_num=0;  
		j=0;

		// buscaremos el sitio donde debería ir num    

		while(t[j]<num && j<=4){      

			sitio_num ++;       

			j++;  

		}

		// desplazaremos los elementos desde el sitio_num hasta el final 

		// así haremos un hueco para num

		for (int i=4; i>=sitio_num; i--)   

			t[i+1]=t[i];

		// por último ponemos num en su sitio para que todo siga ordenado  

		t[sitio_num]=num;

		System.out.println("La nueva serie ordenada queda: ");  

		for (int i=0;i<5+1;i++)    

			System.out.println(t[i]); 

	} 

}
