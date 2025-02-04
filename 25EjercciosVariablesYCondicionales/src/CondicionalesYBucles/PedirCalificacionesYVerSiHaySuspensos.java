package CondicionalesYBucles;

public class PedirCalificacionesYVerSiHaySuspensos {

	public static void main(String[] args) {    

		int notas;       
		boolean suspensos;

		suspensos=false; // suponemos que en principio no hay ningún suspenso

		for (int i=0;i<5;i++)  

		{            

			System.out.print("Introduzca nota (de 0 a 10): ");  

			notas=Utilidades.Entrada.entero();

			if(notas<5)     

				suspensos=true;  

		}

		if(suspensos)  
			System.out.println("Hay alumnos suspensos");  

		else          

			System.out.println("No hay suspensos");   
	} 

}
