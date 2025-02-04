package Funciones;

public class SumarLosNPrimerosNumerosImpares01 {

	static int suma_n_impares (int n)    { 

		int suma=0;

		for (int i =1; i <=n ; i++)

			suma += 2*i-1;       // así calculamos el i-ésimo impar

		return (suma); 

	}

	public static void main(String[] args) { 

		int n;

		System.out.print("Introduzca un numero: ");

		n =Utilidades.Entrada.entero();

		System.out.println("La suma de los " +n+ " primeros impares es: " +suma_n_impares (n));

	}
}


