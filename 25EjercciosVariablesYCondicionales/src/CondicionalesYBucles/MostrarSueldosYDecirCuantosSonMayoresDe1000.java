package CondicionalesYBucles;

public class MostrarSueldosYDecirCuantosSonMayoresDe1000 {

	public static void main(String[] args) { 

		int sueldo,suma,mayor_1000;  

		suma=0;      
		mayor_1000=0; 

		for (int i=1;i<10;i++)      

		{            

			System.out.print("Escribe un sueldo: ");  

			sueldo =Utilidades.Entrada.entero();   

			if(sueldo>1000)         

				mayor_1000++;

			suma=suma+sueldo;      

		}      

		System.out.println("Mayores de 1000 hay: "+mayor_1000);    

		System.out.println("la suma es de: "+suma);  

	}
}
