package Ejercicio05;

import java.util.Scanner;

public class AnoBisiesto {
	
     public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a;
      System.out.println("Ingresa año");
      a= sc.nextInt();
      /*Se sabe
		que son bisiestos los años múltiplos de 4, excepto los que sean múltiplos
		de 100 sin ser múltiplos de 400.
			Ejemplo:
				1985 es no bisiesto, ya que no es múltiplo de 4
				2004 es bisiesto, ya que es múltiplo de 4 y no es múltiplo de 100
				2000 es bisiesto, ya que es múltiplo de 4, es múltiplo de 100 y es
				múltiplo de 400
				2100 es no bisiesto, ya que es múltiplo de 4, es múltiplo de 100 y
				no es múltiplo de 400*/
      
     if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0){
         System.out.println("El año "+a+" Si es bisiesto ");
     }else{
         System.out.println("El año "+a+" No es bisiesto ");
     	}
     }
}