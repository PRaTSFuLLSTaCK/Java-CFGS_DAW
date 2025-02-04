package ExamenPractico01;

/*Ejercicio 2 (1.5 puntos)
 Implementa dos funciones para obtener, la parte entera y la parte decimal de 
un número en punto flotante (double). La definición de las funciones es como sigue:
 int getParteEntera(double numero) (0.5 puntos)
 int getParteDecimal(double numero) (0.5 puntos)
 Internamente, estas dos funciones convierten el número double a cadena 
de caracteres para obtener la parte correspondiente.
 Una vez obtenido el valor buscado, la cadena se convertirá al tipo de retorno indicado.
Además el programa principal (main) pedirá al usuario que introduzca un número por 
teclado y posteriormente mostrará un menú por pantalla en el que se pregunte si desea 
obtener la parte entera o decimal del número introducido. El programa principal main se 
ejecutará hasta que el usuario introduzca la opción adecuada para salir (0.5 puntos).*/

import java.util.Scanner;
/**
*
* @author jose
*/
public class Ejercicio2 {
	public static int getParteEntera(double numero){
		String snumero = String.valueOf(numero);
		int posicion_coma = snumero.indexOf('.');
		int parte_entera = Integer.parseInt(snumero.substring(0, posicion_coma));
		return parte_entera;
	}
	public static int getParteDecimal(double numero){
		String snumero = String.valueOf(numero);
		int posicion_coma = snumero.indexOf('.');
		int parte_decimal = Integer.parseInt(snumero.substring(posicion_coma+1));
		return parte_decimal;
	}
	public static void main(String [] args){
		Scanner entrada_teclado = new Scanner(System.in);
		int opcion_menu=0;
		double numero=0;
		do{
			//lectura de un valor Double válido
			boolean numero_valido=false;
			do{
				System.out.println("Introduzca un número double válido: ");
				if(entrada_teclado.hasNextDouble()){
					numero = entrada_teclado.nextDouble();
					numero_valido=true;
				}
				else{
					System.out.println("Número erroneo introducido. Vuelva a intentarlo");
					entrada_teclado.next();
				}
			}while(!numero_valido);
			//mostramos el menú de opciones
			System.out.println("¿Qué desea hacer con el número?");
			System.out.println("1.Obtener la parte entera.");
			System.out.println("2.Obtener la parte decimal");
			System.out.println("3.Salir del programa");
			//leemos una opción válida
			numero_valido=false;
			do{
				System.out.println("Introduzca opción: ");
				if(entrada_teclado.hasNextInt()){
					opcion_menu = entrada_teclado.nextInt();
					if(opcion_menu>=1 && opcion_menu<=3)
						numero_valido=true;
					else
						System.out.println("Debe introducir un valor entre 1 y 3");
				}
				else{
					System.out.println("Número erroneo introducido. Vuelva a intentarlo");
					entrada_teclado.next();
				}
			}while(!numero_valido);
			//Según opción introducida hacemos la acción deseada
			switch(opcion_menu){
			case 1:
				System.out.println("La parte entera de "+numero+" es "+getParteEntera(numero));
				break;
			case 2:
				System.out.println("La parte decimal de "+numero+" es "+getParteDecimal(numero));
				break;
			}
		}while(opcion_menu!=3);
	}
}
