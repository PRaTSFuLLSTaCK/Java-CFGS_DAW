package Prog_Tarea03_05;

//5. Construye una clase Complejo con dos atributos:
//• real: parte real del número complejo
//• imag: parte imaginaria del número complejo

import java.io.*;
/**
 * @author José Luis
 * @version 3.5
 */
public class Tarea3_05 {
    static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        // Creamos el objeto 'miNumero' de tipo 'Complejo' sin parámetros
        Complejo miNumero = new Complejo();
        // Creamos el objeto 'miNumero2' de tipo 'Complejo' pasándole dos parámetros 
        Complejo miNumero2 = new Complejo(12,2);
        // Solicitamos un valor real y lo introducimos en la variable miReal
        System.out.println("Introduzca un valor para el número real: ");
        double miReal = Double.parseDouble(dato.readLine());  
        // asignamos el valor introducido al atributo 'real' del objeto 'miNumero'
        miNumero.cambia_Real(miReal);
        // Mostramos el valor del numero real introducido usando el método 'consulta_Real'
        System.out.printf("El número real introducido es %.2f\n",miNumero.consulta_Real());
        // Solicitamos un valor imaginario y lo introducimos en la variable miImag
        System.out.println("Introduzca un valor para el número Imaginario: ");
        double miImag = Double.parseDouble(dato.readLine()); 
        // asignamos el valor introducido al atributo 'imag' del objeto 'miNumero'
        miNumero.cambia_Imag(miImag);
        // Mostramos el valor del numero imaginario introducido usando el método 'consulta_Imag'
        System.out.printf("El número imaginario introducido es %.2f\n", miNumero.consulta_Imag());
        // Usamos el método toString para mostrar los números en el formato '12 + 2i'
        System.out.println("El número complejo "+miNumero.toString()+" sumado a "+miNumero2.toString()+" es igual a:");
        // Usamos el método Sumar del objeto miNumero para obtener la suma de reales e imaginarios
        miNumero.Sumar(miNumero2);
    }
}
