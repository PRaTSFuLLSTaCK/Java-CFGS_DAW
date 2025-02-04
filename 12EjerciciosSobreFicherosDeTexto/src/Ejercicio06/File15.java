package Ejercicio06;

/*Disponemos de un fichero de texto llamado enteros.txt que contiene 
 * números enteros. El siguiente programa lee los números y los muestra. 
 * Muestra también la cantidad de números leídos y su suma.

Por ejemplo, si el fichero enteros.txt contiene los siguientes números:
323 34 234 990 22 3 1 
5463 28 34 0 7

El programa mostrará por pantalla: 

323
34
234
990
22
3
1
5463
28
34
0
7
Número leídos: 12
Suma 7139
Se utilizará el método hasNextInt() de Scanner para saber si quedan más 
enteros que leer en el fichero. El método hasNextInt() devuelve true cuando 
lo siguiente que se va a extraer del fichero es un entero y devuelve false en 
caso contrario. 
La lectura acaba cuando no quedan más enteros (se ha llegado al final del fichero)
 o cuando encuentra un carácter no válido como entero.

Por ejemplo, si el contenido del fichero enteros.txt es el siguiente:

323 34 KKK 234 990 22 3 1 
5463 28 34 0 7

El programa mostrará por pantalla:
323
34
Número leídos: 2
Suma 357*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class File15 {
    public static void main(String[] args) {
        File f = new File("c:/ficheros/enteros.txt");
        int numero, suma = 0, cont = 0;
        Scanner entrada = null;
        try {
            entrada = new Scanner(f);
            while (entrada.hasNextInt()) {
                   numero = entrada.nextInt();
                   System.out.println(numero);
                   suma = suma + numero;
                   cont++;                 
            }
            System.out.println("Número leídos: " + cont);
            System.out.println("Suma " + suma);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally{
            entrada.close();
        }
    }
}