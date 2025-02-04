package Tablas;

/*
 * Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición hacia abajo: 
 * el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. 
 * 
 * El último pasa a ser el primero.
 */

public class DesplazarLosElementosDeUnaTabla {
	
	 public static void main(String[] args) {  
		 
		 int t[]=new int[10];        int ultimo;
	 
     // leemos la tabla   
		 
		 for (int i=0;i<10;i++){ 
			 
			 System.out.print("Introduzca número: ");
			 
			 t[i]=Utilidades.Entrada.entero();  
			 
		 }
		 
     // guardamos el último elemento de la tabla  
		 
		 ultimo = t[9];
		 
	// desplazamos hacia abajo (de 0 hacia la última posición)  
		 
	// al desplazar perdemos el último valor, por eso lo hemos guardado antes. 
		 
		 for (int i=8;i>=0;i--)     
			 
			 t[i+1]=t[i];
		 
     // el último valor pasa a ser el primero  
		 
		 t[0] =ultimo;   
		 
		 System.out.println("La tabla queda:");    
		 
		 for (int i=0;i<10;i++)     
			 
			 System.out.println(t[i]);  
		 
	 } 
}
