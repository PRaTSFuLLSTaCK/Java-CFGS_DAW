package Tablas;

public class DesplazarElementosNVeces02 {
	
	 public static void main(String[] args) {     
		 
		 int t[]=new int[10];    
		 int n;
		 
     // leemos la tabla  
		 
		 for (int i=0;i<10;i++){   
			 
			 System.out.print("Introduzca número: ");  
			 
			 t[i]=Utilidades.Entrada.entero();   
			 
		 }
		 
     // preguntamos cuantas posiciones desea desplazar 
		 
		 System.out.print("Posiciones a desplazar:" ); 
		 
		 n = Utilidades.Entrada.entero();
		 
		 // en el caso de desplazar una posición: necesitamos guardar solo un elemento (el último que         
		 
		 // pasa a ser el primero)        
		 // en el caso de desplazar dos posiciones: necesitamos guardar dos elementos (penúltimo y       
		 // último, que pasarán a ser primero y segundo)        
		 // como a priori no sabemos cuantos elementos vamos a desplazar, ni cuantos elementos tenemos 
		 // que guardar. Una buena solución es hacer una copia de la tabla completa
		 
     int copia[] = t.clone();
     
     // desplazamos hacia abajo n posiciones  
     for (int i=0;i<10;i++)  
    	 
    	 t[i] =copia[(i+n)%10]; 
     
     // la tabla funciona como si fuese circular por eso utilizamos el módulo
     
     System.out.println("\n\nLa tabla queda:"); 
     
     for (int i=0;i<10;i++)       
    	 
    	 System.out.println(t[i]); 
     
	 } 

}
