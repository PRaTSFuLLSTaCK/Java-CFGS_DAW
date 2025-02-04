package VariablesYCondicionales;

public class DosNumerosMultiploONo {

	public static void main(String[] args) {
		int n1,n2;

		System.out.print("Introduce un número: "); 

		n1=Utilidades.Entrada.entero();

		System.out.print("Introduce otro número: "); 

		n2=Utilidades.Entrada.entero();

		if(n1%n2==0)            

			System.out.println("Son múltiplos");       

		else            

			System.out.println("No son múltiplos");    

	} 

}
