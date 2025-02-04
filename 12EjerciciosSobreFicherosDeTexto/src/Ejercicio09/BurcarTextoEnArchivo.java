package Ejercicio09;

/*El programa pedirá que se introduzca una palabra o un texto por teclado y 
 * realizará su búsqueda por todo el archivo. Se mostrará por pantalla 
 * el número de línea y el contenido de la línea del fichero que contiene la 
 * cadena buscada. Si la cadena buscada aparece en varias líneas se 
 * mostrarán todas ellas. Si el fichero no contiene el texto buscado se 
 * mostrará un mensaje indicándolo.*/

/*Para resolver el ejercicio de búsqueda de texto en ficheros leeremos el 
 * fichero línea a línea utilizando la clase Scanner. Para cada línea se 
 * comprueba si contiene o no el texto buscado, si la línea contiene lo que 
 * buscamos se muestra por pantalla junto a su número de línea. 
 * Para obtener el número de línea utilizaremos un contador que se 
 * incrementa cada vez que se lea una nueva línea desde el archivo. 
 * Se utilizará una variable de tipo boolean para saber si se ha encontrado 
 * o no el texto buscado.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class BurcarTextoEnArchivo {

    public static void main(String[] args) {

        Scanner entrada = null;
        String linea;
        int numeroDeLinea = 1;
        boolean contiene = false;
        Scanner sc = new Scanner(System.in);

        //Para seleccionar el archivo
        JFileChooser j = new JFileChooser();
        j.showOpenDialog(j);

        //Introducimos el texto a buscar
        System.out.print("Introduce texto a buscar: ");
        String texto = sc.nextLine();

        try {
            //guardamos el path del fichero en la variable ruta
            String ruta = j.getSelectedFile().getAbsolutePath();
            //creamos un objeto File asociado al fichero seleccionado
            File f = new File(ruta);
            //creamos un Scanner para leer el fichero
            entrada = new Scanner(f);
            //mostramos el nombre del fichero
            System.out.println("Archivo: " + f.getName());
            //mostramos el texto a buscar
            System.out.println("Texto a buscar: " + texto);
            while (entrada.hasNext()) { //mientras no se llegue al final del fichero
                linea = entrada.nextLine();  //se lee una línea
                if (linea.contains(texto)) {   //si la línea contiene el texto buscado se muestra por pantalla
                    System.out.println("Linea " + numeroDeLinea + ": " + linea);
                    contiene = true;
                }
                numeroDeLinea++; //se incrementa el contador de líneas
            }
            if(!contiene){ //si el archivo no contienen el texto se muestra un mensaje indicándolo

                System.out.println(texto + " no se ha encontrado en el archivo");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (NullPointerException e) {
            System.out.println(e.toString() + "No ha seleccionado ningún archivo");
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
    }
}//Fin programa de búsqueda de texto en un archivo
 