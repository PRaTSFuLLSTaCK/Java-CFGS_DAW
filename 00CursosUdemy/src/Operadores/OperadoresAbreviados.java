package Operadores;

import javax.swing.JOptionPane;

public class OperadoresAbreviados {
	
	public static void main (String[] args) {
		
		//declaracion de variables
		
		int a = 3;
		int b = 4;
		int r = 0;
		
		//Solicitamos los valores de los dos numeros con los que vamos a operar
		
		/*
		 * ABREVIADO                                NO ABREVIADO
		 * 
		 * a += b                                   a = a + b
		 * a -= b                                   a = a - b
		 * a *= b                                   a = a * b
		 * a /= b                                   a = a / b (cociente de la division entera)
		 * a %= b                                   a = a % b (resto de la division entera)
		 */
		
		//solicitamos los dos valores
		
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor numerico entero: "));
		
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un valor numerico entero: "));
		
		//vamos a reasignar los valores de las variables con las que vamos a operar para poder luego incrementarlas 
		//y disminuirlas para ver esa funcion
		
		int c = a;
		int d = b;
		
		int e = a;
		int f = b;
		
		//vamos a ir imprimiendo los valores segun los operadores utilizados
		
		r = a += b;
		
		System.out.println("El resultado de la suma es: " + r);
		
		r = a -= b;
		
		System.out.println("El resultado de la resta es: " + r);
		
		r = a *= b;
		
		System.out.println("El resultado de la multiplicacion es: " + r);
		
		r = a /= b;
		
		System.out.println("El cociente de la division es: " + r);
		
		r = a %= b;
		
		System.out.println("El resto de la division es: " + r);
		
		System.out.println(""); //creamos un salto de linea para visualizar los datos mas claramente
		
		/*
		 * Para incrementar el valor de una variable en 1 o restarle 1 a su valor utilizaremos
		 * 
		 * PARA INCREMENTAR EN 1                            PARA DISMINUIR EN 1
		 * 
		 * ++a o a++                                        --a o a--
		 */
		
		//Imprimimos los valores actuales de la variable
		
		System.out.println("El valor de la primera variable es: " + c);
		System.out.println("El resto de la division es: " + d);
		
		System.out.println(""); //creamos un salto de linea para visualizar los datos mas claramente 
		
		//incrementamos las dos variables en una unidad
		
		++c;
		++d;
		
		//mostramos ambas variables ya incrementadas
		
		System.out.println("El valor incrementado de la primera variable es: " + c);
		System.out.println("El valor incrementado de la segunda variable es: " + d);
		
		System.out.println(""); //creamos un salto de linea para visualizar los datos mas claramente
		
		//mostramos de nuevo las dos variables
		
		System.out.println("El valor de la primera variable es: " + e);
		System.out.println("El resto de la division es: " + f);
		
		//disminuimos las variables en una unidad
		
		e--;
		f--;
		
		// mostramos las variables una vez disminuidas en una unidad
		
		System.out.println("El valor disminuido en una unidad de la primera variable es: " + e);
		System.out.println("El valor disminuido en una unidad de la segunda variable es: " + f);
		
		/*
		 * Hay una diferencia entre colocar antes o despues de la variable los signos de incremento o decremento
		 * 
		 * ++variable o --variable, nos hace que el valor se actualice antes de mostrar su valor
		 * 
		 * ejemplo:
		 * 
		 * int a = 10;
		 * int b = ++a;
		 * 
		 * en este caso a y b tendrian el valor 11
		 * 
		 * 
		 * variable++ o variable-- el valor se incrementa tras ser asignado
		 * 
		 * ejemplo:
		 * 
		 * int a = 10;
		 * 
		 * int b = a++
		 * 
		 * en este caso a valdria 11 y b 10
		 */
		
		System.out.println("");//salto de linea
		
		/*
		 * En este apartado vemos como al colocar deltante el incremento nos asigna el valor ya incrementado de la variable
		 */
		
		 int x = 10;
		 
		 System.out.println("El valor valor de la variable antes de ser incrementada es: " + x);
		 
		 System.out.println("");//salto de linea
		 
		 int y = ++x;
		 
		 System.out.println("Operacion y = ++x x ha sido incrementada y ahora vale: " + x);
		 System.out.println("Operacion y = ++x y tiene el valor de x incrementado: " + y);
		 
		 System.out.println("");//salto de linea
		 
		 /*
		  * En este apartado vemos como al colocar detras de la variable el incremento primero nos asigna el valor de la variable
		  * y posteriormente la incrementa.
		  */
			
		 int v = 10;
		 
		 System.out.println("El valor valor de la variable antes de ser incrementada es: " + v);
		 
		 System.out.println("");//salto de linea
		 
		 int w = v++;
		 
		 System.out.println("Operacion w = v++ v ha sido incrementada y ahora vale: " + v);
		 System.out.println("Operacion w = v++ w tiene el valor de v pero sin incrementar: " + w);
		 
		
	}

}
