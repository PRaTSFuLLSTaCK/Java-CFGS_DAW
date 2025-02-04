package TablasNDimensionales;

// Crear y cargar una tabla de tamaño 10x10, mostrar la suma de cada fila y de cada columna. 

public class MostrarSumaYColumnaDeLaTabla {

	public static void main(String[] args) { 

		int t[][]=new int[4][4];  
		int suma_fila,suma_col;   
		int i,j;       
		final int tamaño=4;

		t = new int[tamaño][tamaño];

		for (i=0;i<tamaño;i++){ 

			for (j=0;j<tamaño;j++){ 

				System.out.print("Elemento ["+i+"]["+j+"]: ");
			}

			t[i][j]=Utilidades.Entrada.entero(); 

		}       

		// sumamos columna a columna  

		System.out.println();   

		for (i=0;i<tamaño;i++){    

			suma_col=0;         

			for (j=0;j<tamaño;j++){     

				suma_col=suma_col+t[i][j];        

			}          

			System.out.println("Columna"+" "+i+":"+" "+suma_col);  

		}

		// sumamos fila a fila   

		for (j=0;j<tamaño;j++){  

			suma_fila=0;            

			for (i=0;i<tamaño;i++){   

				suma_fila=suma_fila+t[i][j];      

			}        

			System.out.println("Fila"+" "+j+":"+" "+suma_fila);  

		}   

	} 

}



