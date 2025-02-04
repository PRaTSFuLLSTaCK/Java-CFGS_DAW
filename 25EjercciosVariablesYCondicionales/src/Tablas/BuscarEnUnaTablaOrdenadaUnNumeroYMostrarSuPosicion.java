package Tablas;

/*
 * Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla. 
 * Se debe mostrar la posición en que se encuentra.
 *  Si no está, indicarlo con un mensaje.
 */

public class BuscarEnUnaTablaOrdenadaUnNumeroYMostrarSuPosicion {

	public static void main(String[] args) { 

		int t[]=new int[10];       
		int num,j;

		for (int i=0;i<10;i++){   

			System.out.print("Introduzca numero (orden creciente): ");  

			t[i]=Utilidades.Entrada.entero();    

		}

		System.out.println();

		System.out.println("Introduzca numero a buscar: ");

		num=Utilidades.Entrada.entero();   
		j=0;    
		while(j<10 && t[j]<num){   

			j++;    

		}

		// cuando me salgo del mientras puede ser por dos motivos: 
		// - que j llegue a 10 ó       
		// - que encuentre el donde iría num en la tabla

		if(j==10) // hemos llegado al final y no hemos encontrado nada. 

			System.out.println("No encontrado");     

		else{            // si t[j] < num, hemos sobrepasado el lugar donde debería estar num, sin encontrarlo          

			if(t[j]==num) // num está en la posición i. Entonces si está ahí              

				System.out.println("Encontrado en la posición " + j);            

			else                

				System.out.println("No encontrado");     

		}   
	} 
}
	

