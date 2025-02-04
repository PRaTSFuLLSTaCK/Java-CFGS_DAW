/* 2.)	Programa que lee 10 datos, compuestos 
 * cada uno de ellos por un nombre de persona 
 * y su sueldo neto mensual, y obtiene e imprime 
 * el sueldo medio de la empresa, y adem�s el 
 * nombre y sueldo de los trabajadores que 
 * ganan m�s de 1000 euros.
 */
package Practica01;

import utilidades.teclado;

public class Practica01_02 {

	public static void main(String[] args) {
        int cont = 0;
        double acumulado = 0;
        String s = "";
        for (int i = 1; i <= 10; i++) {
			String nombre = teclado.leer_cadena2("Introduce el nombre del trabajador n�"+i+": ");
			double sueldo = teclado.leer_double("Introduce el sueldo del trabajador n�"+i+": ");
			acumulado += sueldo;
			cont++;
			if (sueldo >= 1000) {
				if(!s.isEmpty()) {
					s+= ", ";
					}
				s += nombre + " ("+sueldo+")";
				}
		}
        System.out.println("Sueldo medio: " + (acumulado/cont) +"�");
        System.out.println("Trabajadores mejor pagados: " + s);
	}
}
