package ControlDeFlujo;

import javax.swing.JOptionPane;

public class SeleccionSimple {
	
	
	
	public static void main (String[] args) {
		
		//Seleccion simple, nos va a decir si una condicion se cumple o no 
		//if
		
		int numero = 0;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el  valor a verificar: "));
		
		//en esta condicion lo que vamos a revisar es que el numero introducido sea mayor que 0.
		
		if (numero > 0) {
			
			System.out.println("el numero es mayor que 0.");//imprimir en pantalla el mensaje que queramos con salto de linea.
			
		}
		
		System.out.println("El programa ha finalizado.");//imprimir en pantalla el mensaje que queramos con salto de linea.
		
	}

}
