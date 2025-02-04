package CondicionalesYBucles;

public class AdivinarNumero01 {

	public static void main(String[] args) {        

		int n, num;

		// n es el número que hay que acertar     
		// num guarda los números introducidos

		System.out.print("Introduce N: ");    

		n =Utilidades.Entrada.entero();

		System.out.print("Introduce número: ");   

		num=Utilidades.Entrada.entero();      

		while(num!=n) // mientras no coincidan ambos números    
		{            

			if(num>n)               

				System.out.println("menor");       

			else             

				System.out.println("mayor");

			System.out.print("Introduce número: "); 

			num=Utilidades.Entrada.entero();    

		}
		// al salir del mientras tenemos la certeza que num es igual a n   

		System.out.println("acertaste...");   

	} 

}


