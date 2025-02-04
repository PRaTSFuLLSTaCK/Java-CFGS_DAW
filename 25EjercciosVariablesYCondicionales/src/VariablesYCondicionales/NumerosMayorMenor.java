package VariablesYCondicionales;

public class NumerosMayorMenor {

	public static void main(String[] args) {
		
		int n1,n2;
		
        System.out.print("Introduce un número: ");  
        
        n1=Utilidades.Entrada.entero();        
        
        System.out.print("Introduce otro número: ");
        
        n2=Utilidades.Entrada.entero();               
        
        // si ambos números son iguales diría que n2 es mayor que n1
        
        if(n1>n2)          
        	
        	System.out.println(n1 + " es mayor que " + n2);
        
        else          
        	
        	System.out.println(n2 + " es mayor que " + n1);          
        
	} 
	
}
 