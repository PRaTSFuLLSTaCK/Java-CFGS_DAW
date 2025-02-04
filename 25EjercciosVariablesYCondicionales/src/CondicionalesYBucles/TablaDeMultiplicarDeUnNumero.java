package CondicionalesYBucles;

public class TablaDeMultiplicarDeUnNumero {

	public static void main(String[] args) { 

		int num;

		do       

		{   

			System.out.print("Introduce número (de 0 a 10): ");        

			num=Utilidades.Entrada.entero();       

		}

		while ( !  (0<=num && num<=10));

		System.out.println("\n\nTabla del " + num);   

		for (int i=1;i<=10;i++)   

		{           

			System.out.println(num + " x " + i + " = " + num*i);     

		}  

	} 


}
