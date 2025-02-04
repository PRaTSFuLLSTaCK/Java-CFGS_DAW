package TablasNDimensionales;

//Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma. 

public class SumarDosMatricesYMostrarSuSuma {

	public static void main(String[] args) {  

		int a[][], b[][], suma[][];        
		int i,j;

		a = new int[3][3]; 
		b = new int[3][3];

		// Leemos los datos 

		System.out.println ("Matriz A:");

		for (i=0;i<3;i++) 

		{            
			for (j=0;j<3;j++)  

			{             

				System.out.print("A["+i+"]["+j+"]: "); 
				a[i][j]=Utilidades.Entrada.entero(); 

			}      

		}

		System.out.println ("Matriz B:");

		for (i=0;i<3;i++) 

		{           
			for (j=0;j<3;j++) 

			{               

				System.out.print("B["+i+"]["+j+"]: ");
				b[i][j]=Utilidades.Entrada.entero(); 

			}     

		}

		// hacemos la suma  

		suma = new int[3][3];

		for (i=0;i<3;i++)   

		{            

			for (j=0;j<3;j++)   

			{              

				suma[i][j] = a[i][j] + b[i][j];  

			}        

		}

		// mostramos los resultado  

		System.out.println ("Matriz Suma:");

		for (i=0;i<3;i++)   

		{            

			for (j=0;j<3;j++)    

			{             

				System.out.print (suma[i][j] + " "); 

			}          

			System.out.println ();  

		}   

	}
}
