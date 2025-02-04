package ControlDeFlujo;

import javax.swing.JOptionPane;

public class ClaseSwitch {

	public static void main(String[] args) {
		
		/*
		 * // declaración de switch
		 * 
			switch(expresión)
			{
   			declaración case los valores deben ser del mismo tipo de la expresión
   			
   				case valor1 :
   				
      				// Declaraciones
      				 * 
      			break; // break es opcional
   
   				case valor2 :
   				
      				// Declaraciones
      				 * 
      				break; // break es opcional
   
   			Podemos tener cualquier número de declaraciones de casos o case debajo se encuentra la declaración predeterminada, 
   			que se usa cuando ninguno de los casos es verdadero.
   			
   			// No se necesita descanso en el case default
   			 * 
   			default : 
      			Declaraciones
      			
      		EJEMPLO:
      		
      		switch (day){
      		
            case 1:  dayString = "Lunes";
                     break;
                     
            case 2:  dayString = "Martes";
                     break;
                     
            case 3:  dayString = "Miercoles";
                     break;
                     
            case 4:  dayString = "Jueves";
                     break;
                     
            case 5:  dayString = "Viernes";
                     break;
                     
            case 6:  dayString = "Sabado";
                     break;
                     
            case 7:  dayString = "Domingo";
                     break;
                     
            default: dayString = "Dia inválido";
                     break;
      		 * 
      		 * 
			}
		 */
		
		int numero = 0;
		
		//Solicitamos ingresar el valor de la variable
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero del 1 al 10: "));
		
		switch(numero) {
		
		case 1:
			
			System.out.println("El numero introducido es 1.");//imprimir en pantalla el mensaje que queramos con salto de linea.
			
			break;
			
		case 2:
			
			System.out.println("El numero introducido es 2.");//imprimir en pantalla el mensaje que queramos con salto de linea.
			
			break;
			
			
		case 3:
				
			System.out.println("El numero introducido es 3.");//imprimir en pantalla el mensaje que queramos con salto de linea.
				
			break;
				
		case 4:
				
			System.out.println("El numero introducido es 4.");//imprimir en pantalla el mensaje que queramos con salto de linea.
				
			break;
			
			
		case 5:
			
			System.out.println("El numero introducido es 5.");//imprimir en pantalla el mensaje que queramos con salto de linea.
			
			break;
			
		case 6:
			
			System.out.println("El numero introducido es 6.");//imprimir en pantalla el mensaje que queramos con salto de linea.
			
			break;
			
			
		case 7:
				
			System.out.println("El numero introducido es 7.");//imprimir en pantalla el mensaje que queramos con salto de linea.
				
			break;
				
		case 8:
				
			System.out.println("El numero introducido es 8.");//imprimir en pantalla el mensaje que queramos con salto de linea.
				
			break;
			
		case 9:
			
			System.out.println("El numero introducido es 9.");//imprimir en pantalla el mensaje que queramos con salto de linea.
				
			break;
				
		case 10:
				
			System.out.println("El numero introducido es 10.");//imprimir en pantalla el mensaje que queramos con salto de linea.
				
			break;
			
		default:
			
			System.out.println("No ha introducido un numero entre 1 y 10.");//imprimir en pantalla el mensaje que queramos con salto de linea.
			
		}

	}

}
