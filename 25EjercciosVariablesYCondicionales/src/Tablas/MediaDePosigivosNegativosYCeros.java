package Tablas;

public class MediaDePosigivosNegativosYCeros {

	public static void main(String[] args) {  

		int t[]=new int [5];
		int suma_pos,cont_pos,suma_neg,cont_neg,cont_cero;

		suma_pos=0; 
		cont_pos=0;   
		suma_neg=0;      
		cont_neg=0;     
		cont_cero=0;

		// utilizamos un bucle para leer los datos y otro para procesarlos   
		// se podrían hacer ambas operaciones, leer y procesar, en un solo bucle   

		for (int i=0;i<5;i++){       

			System.out.print("Introduzca un número: ");   

			t[i]=Utilidades.Entrada.entero();   

		}
		
		for (int i=0;i<5;i++){ 

			if(t[i]==0)         

				cont_cero++;  

			else{            

				if(t[i]>0){  

					suma_pos=suma_pos+t[i];      

					cont_pos++;          

				}               

				else{         

					suma_neg=suma_neg+t[i];    

					cont_neg++;          

				}         

			}     

		}      

		if(cont_pos==0)      

			System.out.println("No se puede realizar la media de números positivos");   

		else             

			System.out.println("La media de los positivos: "+(float)suma_pos/cont_pos);  

		if(cont_neg==0)     

			System.out.println("No se puede realizar la media de números negativos");  

		else 

			System.out.println("La media de los negativos: " + (float)suma_neg/cont_neg);        
		System.out.println("La cantidad de cero es de: " + cont_cero);  
		
	} 

}
