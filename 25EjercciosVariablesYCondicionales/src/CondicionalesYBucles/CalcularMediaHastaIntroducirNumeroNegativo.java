package CondicionalesYBucles;

public class CalcularMediaHastaIntroducirNumeroNegativo {

	public static void main(String[] args) {     

		int num, suma, elementos;   

		float media; // la media puede tener decimales

		// num: guardará los números introducidos por el usuario  

		// suma: almacenará la suma de todos los números introducidos   

		// elementos: será un contador que indicará el números de números 8o elementos) introducidos

		System.out.print("Introduzca un número: ");  

		num=Utilidades.Entrada.entero();            

		suma= 0;    

		elementos= 0;  

		while(num>=0) // nos interesan los positivos y el cero       

		{            

			suma+=num;  

			elementos++;


			System.out.print("Introduzca otro número: ");   

			num=Utilidades.Entrada.entero();     

		}
		if (elementos == 0) // daría un error de división por cero   

			System.out.println("Imposible hacer la media");       

		else        

		{           

			media= (float)suma/elementos;    

			System.out.println("La media es de: " + media);      

		}   

	} 
}

