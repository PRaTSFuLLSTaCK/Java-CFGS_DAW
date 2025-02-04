package CondicionalesYBucles;

public class LeerNumeroYMostrarCuadrado {

	public static void main(String[] args) {    

		int num,cuadrado;        
		
		// num guardará el número que leamos        
		
		// y cuadrado guardará el cuadrado de num

		System.out.print("Introduzca número: ");      

		num=Utilidades.Entrada.entero();

		while(num!=0){ // repetimos el proceso mientras el número leído no sea negativo       

			cuadrado=num*num;          

			System.out.println(num+ "² es igual a "+ cuadrado);     

			System.out.print("Introduzca otro número: ");        

			num=Utilidades.Entrada.entero(); // volvemos a leer num    

		}      

	} 
}


