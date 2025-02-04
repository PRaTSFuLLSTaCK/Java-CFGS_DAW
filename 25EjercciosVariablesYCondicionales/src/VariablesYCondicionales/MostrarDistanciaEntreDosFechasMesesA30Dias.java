package VariablesYCondicionales;

public class MostrarDistanciaEntreDosFechasMesesA30Dias {
	
	 public static void main(String[] args) {       
		 
		 int dia1,mes1,año1;      
		 
		 int dia2,mes2,año2;      
		 
		 int total_dias;
		 
     System.out.println ("Fecha 1:");    
     
     System.out.print("Introduzca día: ");   
     
     dia1=Utilidades.Entrada.entero();      
     
     System.out.print("Introduzca mes: ");  
     
     mes1=Utilidades.Entrada.entero();     
     
     System.out.print("Introduzca año: ");  
     
     año1=Utilidades.Entrada.entero();
     
     System.out.println ("Fecha 2:");   
     
     System.out.print("Introduzca día: ");    
     
     dia2=Utilidades.Entrada.entero();    
     
     System.out.print("Introduzca mes: ");   
     
     mes2=Utilidades.Entrada.entero();     
     
     System.out.print("Introduzca año: ");  
     
     año2=Utilidades.Entrada.entero();
     
     // suponemos que las fecha introducidas son correctas
     
     // convertimos las dos fechas a días y calculamos la diferencia    
     
     total_dias = dia2-dia1 + 30*(mes2-mes1)+365*(año2-año1);
     
     System.out.println ("Días de diferencia: " + total_dias);  
     
	 } 
	 
}

