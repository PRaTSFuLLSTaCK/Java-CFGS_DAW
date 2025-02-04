package ControlDeFlujo;

import javax.swing.JOptionPane;

public class ClaseWhile {
	
	public static void main(String[] args) {
		
		/*
		 * While es un ciclo de repeticion, se va a repetir siempre hasta llegar al valor indicado (se cumpla la condicion
		 * 
		 * 
		 * Si la condicion es false, el bucle no se va a ejecutar nunca. Solo entraria en el bucle si la condicion es true.
		 */
		
		int num = 1;
		
		int numero = 0;
		
		//Solicitamos ingresar el valor de la variable
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero al cual quieres que se cuente: "));
		
		while (num <= numero){//condicion la cual hace que se repita hasta que se cumpla la condicion, que num sea menor o igual a numero.
			
			System.out.println("El contador tiene el numero" + num);//imprimir en pantalla el mensaje que queramos con salto de linea.
			
			num++;//incrementamos num para ver si se cumple con este incremento la condicion y salimos del bucle
			
			//ruptura de un bucle
			
			if (num == 100) { //con esta sentencia podemos controlar que un bucle no se haga infinito. poniendo este limite de ejecuciones.
				
				System.out.println("");
				
				System.out.println("He cortado el bucle en el valor" + num);//imprimir en pantalla el mensaje que queramos con salto de linea.
				
				break;
				
			}
			
		}
		
		System.out.println("El programa ha finalizado.");//imprimir en pantalla el mensaje que queramos con salto de linea.
		
	}

}
