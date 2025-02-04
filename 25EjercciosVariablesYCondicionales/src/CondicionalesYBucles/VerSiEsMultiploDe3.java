package CondicionalesYBucles;

public class VerSiEsMultiploDe3 {

	public static void main(String[] args) { 

		int num;        
		boolean multiplo_3;

		multiplo_3=false;

		for (int i=0;i<5;i++){  

			System.out.print("Introduzca número: ");  

			num=Utilidades.Entrada.entero();

			if(num %3 == 0)    

				multiplo_3=true; // si se ejecuta esta instrucción significa que al menos hay un múltiplo de 3. 

			if(multiplo_3 == false)  

				System.out.println("no existen múltiplos de 3");  

			else           
				System.out.println("Hay múltiplos de 3");  

		}
	}

}
