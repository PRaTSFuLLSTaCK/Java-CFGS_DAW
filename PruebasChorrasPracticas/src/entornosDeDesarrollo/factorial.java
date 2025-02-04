package entornosDeDesarrollo;

import javax.swing.JOptionPane;

public class factorial {
	    
	    private static int factorial(int n) {
	        int resultado;
	        resultado = 1;
	        for (int i = 2; i <= n; i++) {
	            resultado = resultado * i;
	        }
	        return resultado;
	}

	    
	    public static void main(String[] args) {
	             
	        int n= utilidades.teclado.leer_entero("Ingrese un valor");
	         
	       int r = factorial (n);
	       
	       System.out.println("El factorial es: "+r);
	      
	     }
	    
	    
}
	    