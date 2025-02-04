package Funciones;

public class SenoCosenoTanjenteDeUnAngulo {

	static void informacion_angulo (double n)    {

		// como las funciones que calculan el seno, coseno y tangente trabajan en 
		// radianes, hemos de pasar n de grados a radianes

		n = Math.PI/180*n; 

		// otra forma sería n = Math.toRadians(n); 

		System.out.println("seno: " + Math.sin(n)); 

		System.out.println("coseno: " + Math.cos(n)); 

		System.out.println("tangente: " + Math.tan(n));

	}

	public static void main(String[] args) { 

		double angulo;

		System.out.print("Introduzca un ángulo (0..360): "); 

		angulo =Utilidades.Entrada.real();

		informacion_angulo (angulo);   

	} 
}



