package Ejercicio01;

/*Para escribir en un fichero de texto utilizaremos dos clases:
FileWriter y PrintWriter.
La clase FileWriter permite tener acceso al fichero en modo escritura.
Para crear objetos FileWriter podemos utilizar los constructores:

FileWriter(String path)
FileWriter(File objetoFile);

El fichero se crea y si ya existe su contenido se pierde.
Si lo que necesitamos es abrir un fichero de texto existente sin perder su 
contenido y añadir más contenido al final utilizaremos los constructores:

FileWriter(String path, boolean append)
FileWriter(File objetoFile, boolean append)

Si el parámetro append es true significa que los datos se van a añadir a los existentes. 
Si es false los datos existentes se pierden.
La clase FileWriter proporciona el método write() para escribir cadenas de caracteres aunque 
lo normal es utilizar esta clase junto con la clase PrintWriter para facilitar la escritura.
La clase PrintWriter permite escribir caracteres en el fichero de la misma forma que en la pantalla.
Un objeto PrintWriter se crea a partir de un objeto FileWriter.

Ejemplo:

FileWriter fw = new FileWriter("c:/ficheros/datos.txt");
PrintWriter salida = new PrintWriter(fw);
En este ejemplo se ha creado un fichero de texto llamado datos.txt. 
El fichero se encuentra dentro de la carpeta ficheros en la unidad C:

A partir de Java 5 se puede crear un objeto PrintWriter directamente a partir de un objeto File o de la ruta:
PrintWriter salida = new PrintWriter("c:/ficheros/datos.txt");
En este caso, si el fichero no existe se crea. Si no se puede crear un archivo con ese nombre o 
si ocurre algún error se lanza una excepción FileNotFoundException.
Una vez creado el objeto podemos utilizar print(), println() y printf() para escribir en el fichero 
como si fuese en pantalla.
*/

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class File11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter salida = null;
        try {
            salida = new PrintWriter("c:/ficheros/datos.txt"); //se crea el fichero
            String cadena;
            System.out.println("Introduce texto. Para acabar introduce la cadena FIN:");
            cadena = sc.nextLine(); //se introduce por teclado una cadena de texto
            while (!cadena.equalsIgnoreCase("FIN")) {
                salida.println(cadena);  //se escribe la cadena en el fichero
                cadena = sc.nextLine(); //se introduce por teclado una cadena de texto
            }
            salida.flush();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {         
            salida.close();
        }
    }
}