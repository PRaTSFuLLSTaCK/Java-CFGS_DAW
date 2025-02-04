package VariablesYCondicionales;

public class FechaCorrectaMeses30Dias {

	public static void main(String[] args) {   

		int dia,mes,año;
		// para que una fecha sea correcta se tiene que cumplir 

		// día en el rango 1..30    

		// mes en el rango 1..12   

		// año cualquiera distinto del 0


		System.out.print("Introduzca día: ");  

		dia=Utilidades.Entrada.entero();       

		System.out.print("Introduzca mes: "); 

		mes=Utilidades.Entrada.entero();       

		System.out.print("Introduzca año: "); 

		año=Utilidades.Entrada.entero();             

		if (dia >= 1 && dia <=30)       

			if (mes >= 1 && mes <= 12)

				if (año != 0)                   

					System.out.println ("Fecha correcta");            

				else                  

					System.out.println ("Año incorrecto");    

			else              

				System.out.println("Mes incorrecto");     

		else          

			System.out.println("Día incorrecto");      

	} 

}	 



