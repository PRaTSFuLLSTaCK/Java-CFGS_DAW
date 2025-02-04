package Funciones;

public class RecursivaQueCalculeAElevadoAN {

	/* sobrecargamos la función para que funcione tanto con bases enteras
	 * como reales     
	*/    

	static int potencia (int a, int n) { 

		int res;
		if (n == 0) // el caso base: cuando el exponente es 0 

			res = 1;   

		else            // caso recursivo: a^n = a *a^n-1 

			res = a * potencia(a, n - 1);

		return (res); 

	}
	static double potencia (double a, int n) { 

		double res;       

		if (n == 0)          

			res = 1;       

		else            

			res = a * potencia(a, n - 1);

		return (res);

	}

	public static void main(String[] args) { 

		double num, resultado;  
		int potencia;   

		System.out.print("Introduzca base (real): "); 

		num = Utilidades.Entrada.real();
		System.out.print("Introduzca la potencia: ");
		potencia = Utilidades.Entrada.entero();

		resultado = potencia(num, potencia);

		System.out.println("El resultado es: " + resultado); 

	}

}



