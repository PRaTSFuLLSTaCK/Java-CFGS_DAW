package CondicionalesYBucles;

public class CantidadDeAprobadosYsuspensos {

	public static void main(String[] args) {     

		int nota,aprobados,suspensos,condicionados;

		nota = 0;
		aprobados=0;       
		suspensos=0;
		condicionados=0; 

		for (int i=1;i<=6;i++)     

		{   

			System.out.print("Introduzca nota entre 0 y 10: ");     

			nota=Utilidades.Entrada.entero();

		}

		if(nota == 4)    

			condicionados++;  

		else           

			if(nota >= 5)    

				aprobados++;    

			else               

				if(nota < 4) // este if sobra, ya que es el único caso posible   

					suspensos++;  

		System.out.println("Aprobados: " +aprobados);   
		System.out.println("Suspensos: " +suspensos);    
		System.out.println("Condicionados: "+condicionados);   

	} 
}
