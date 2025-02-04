package ControlDeFlujo;

import javax.swing.JOptionPane;

public class seleccionMultiple {

	public static void main(String[] args) {
	
		//Determina si el numero es igual, menor o mayor a 0
		
		int numero = 0;
		
		//Solicitamos ingresar el valor de la variable
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el  valor a verificar: "));
		
		//en esta condicion lo que vamos a revisar es que el numero introducido sea mayor o menor que 0.
		
		if (numero == 0) {//vermos si se cumple la condicion en este caso si es igual a 0
			
			System.out.println("el numero es igual a 0.");//imprimir en pantalla el mensaje que queramos con salto de linea.
			
		}else if (numero > 0){//Si el numero es menor que 0 entrara en esta condicion e imprimira en pantalla que el numero es menor.
			
			System.out.println("el numero es mayor que 0.");//imprimir en pantalla el mensaje que queramos con salto de linea.
			
		} else {
			
			System.out.println("el numero es menor que 0.");//imprimir en pantalla el mensaje que queramos con salto de linea.
			
		}
		
		System.out.println("El programa ha finalizado.");//imprimir en pantalla el mensaje que queramos con salto de linea.

	}

}
