package TablasNDimensionales;

// utilizando dos tablas de tamaño 5x9 y 9x5, cargar la primera y trasponerla en la segunda. 

public class LeerUnaTablaYTransponerlaEnOtra {
	
	 public static void main(String[] args) {       
		 
		 int a[][], b[][]; 
		 int i,j; 
		 
		 a = new int[5][9]; 
		 b = new int [9][5];
		 
	        for (i=0;i<5;i++){ 
	        	
	        	for (j=0;j<9;j++){ 
	        		
	        		System.out.print("Elemento ["+i+"]["+j+"]: ");
	        		
	        		a[i][j]=Utilidades.Entrada.entero(); 
	        		
	        		// si queremos ahorrarnos introducir 5x9 (45) números, podemos comentar las
	        		// dos lineas anteriores y utilizar (por ejemplo):                
	        		// a[i][j] = 10*i+j;            
	        		
	        	}       
	        	
	        }
	        
	        // trasponemos  
	        
	        for (i=0;i<5;i++){  
	        	
	        	for (j=0;j<9;j++){ 
	        		
	        		b[j][i] = a[i][j];           
	        		
	        	}      
	        	
	        }
	        
	        // mostramos la matriz traspuesta  
	        
	        System.out.println("Matriz traspuesta");
	        
	        for (i=0;i<9;i++){ 
	        	
	        	for (j=0;j<5;j++)   
	        		
	        		System.out.print (b[i][j] + " "); 
	        	
	        	System.out.println ();
	        	
	        }
	        
	 }
	 
}
	  
	 


