package CondicionalesYBucles;

public class MostrarNsueldosYVerCualEsElMaximo01 {

	public static void main(String[] args) {

		int sueldo, sueldo_max;  
		int n;

		sueldo_max = 0; // como los sueldos son positivos, inicializamos el sueldo máximo a cero.

		System.out.print("Número de sueldos: ");  

		n = Utilidades.Entrada.entero();

		System.out.println("--------");

		for (int i=1;i<=n;i++)   

		{           

			System.out.print("Introduce sueldo: "); 

			sueldo=Utilidades.Entrada.entero();



			if (sueldo > sueldo_max)   

				sueldo_max = sueldo;   

			// si leemos un sueldo mayor que el máximo, este sueldo será el nuevo máximo.  

		}
		
		System.out.println("\nEl sueldo máximo es: " +sueldo_max);

	}

}
