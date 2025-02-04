package CondicionalesYBucles;

public class MostrarNumerosDe1AlNumeroIntroducido {
	
	public static void main(String[] args) {
		
		int i,num;
		
        System.out.print("Introduce un número: ");      
        
        num=Utilidades.Entrada.entero();
        
        i=1;      
        
        // i es el contador que tomará los valores de 1 a n
        
        while(i<=num){        
        	
        	System.out.println(i);        
        	
        	i++;        
        	
        } 	
		
	}

}
