package CondicionalesYBucles;

public class Sumar15Numeros {

	public static void main(String[] args) {     

		int num,suma_total;

		suma_total=0;   
		for (int i=1;i<=15;i++)   

		{            

			System.out.print("Introduzca número: "); 

			num=Utilidades.Entrada.entero();

			suma_total=suma_total+num;    

		}        

		System.out.println("La suma total es de: "+suma_total);  

	} 

}
