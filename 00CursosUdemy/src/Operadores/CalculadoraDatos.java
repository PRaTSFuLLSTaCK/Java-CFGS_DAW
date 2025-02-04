package Operadores;

import javax.swing.JOptionPane;

public class CalculadoraDatos {
	
	//declaramos las variables y las inicializamos
	
	static int numero1 = 0;

	static int numero2 = 0;

	static int totalEnteroSuma = 0;

	static int totalEnteroResta = 0;

	static int totalEnteroMultiplicacion = 0;

	static int totalEnteroDivision = 0;
	
	private static double num1 = 0;

	private static double num2 = 0;

	private static double totalSuma = 0;

	private static double totalResta = 0;

	private static double totalMultiplicacion = 0;

	private static double totalDivision = 0;
	
	public static void main (String[] args) {
		
	
		numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el primer valor: "));
	
		numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el segundo valor: "));
		
		totalEnteroSuma = numero1 + numero2;
		totalEnteroResta = numero1 - numero2;
		totalEnteroMultiplicacion = numero1 * numero2;
		totalEnteroDivision = numero1 / numero2;
		
		System.out.println("La suma es: " + totalEnteroSuma);
		System.out.println("La resta es: " + totalEnteroResta);
		System.out.println("La multiplicacion es: " + totalEnteroMultiplicacion);
		System.out.println("La division es: " + totalEnteroDivision);
		
		num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa un valor numerico entero para a: "));
		
		num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa un valor numerico entero para b: "));
		
		totalSuma = num1 + num2;
		totalResta = num1 - num2;
		totalMultiplicacion = num1 * num2;
		totalDivision = num1 / num2;
		
		System.out.println("La suma es: " + totalSuma);
		System.out.println("La resta es: " + totalResta);
		System.out.println("La multiplicacion es: " + totalMultiplicacion);
		System.out.println("La division es: " + totalDivision);
	
	}

}
