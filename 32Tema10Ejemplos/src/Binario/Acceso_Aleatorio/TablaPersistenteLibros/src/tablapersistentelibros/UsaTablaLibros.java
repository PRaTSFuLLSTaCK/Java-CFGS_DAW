
package Binario.Acceso_Aleatorio.TablaPersistenteLibros.src.tablapersistentelibros;

import java.io.*;

public class UsaTablaLibros {
    public static void main(String[] args) throws IOException {
        // ejemplo de uso de TablaLibros
        TablaLibros t = null;
        
        try {
            
            t = new TablaLibros("Libros.dat");
            
            // Crear 8 libros
            Libro libro1 = new Libro("Java", 2006, 15.0); 
            Libro libro2 = new Libro("1984", 1949, 25.0);
            Libro libro3 = new Libro("Head First Java",  2005, 14.75); 
            Libro libro4 = new Libro("Head First Object Oriented Analysis and Desig", 2006, 14.45);
            Libro libro5 = new Libro("Thinking in Java", 2006, 16.57); 
            Libro libro6 = new Libro("The Java Tutorial: A Short Course on the Basics", 2013, 32.54);            
            Libro libro7 = new Libro("The Java Language Specification", 2013, 26.34); 
            Libro libro8 = new Libro("COMO PROGRAMAR EN JAVA", 2008, 59.95); 
            
            String s = "COMO PROGRAMAR EN JAVA";
            System.out.println ("\n tamaño 'COMO PROGRAMAR EN JAVA' = " + s.length());
            
            System.out.println ("tamaño integer = " + Integer.SIZE/8  + " tamaño double = " + Double.SIZE/8 );           
            

            // almacenamos los libros de modo persistente (en el archivo Libros.dat)
            t.almacena(0,libro1); t.almacena(1,libro2); t.almacena(2,libro3); t.almacena(3,libro4);   
            t.almacena(4,libro5); t.almacena(5,libro6); t.almacena(6,libro7); t.almacena(7,libro8);   

            // recuperamos los libros accediendo de modo directo o aleatorio
            Libro l1= t.obten(3); Libro l2= t.obten(7); Libro l3= t.obten(4);
            Libro l4= t.obten(5); Libro l5= t.obten(1); Libro l6= t.obten(0);   
            Libro l7= t.obten(6); Libro l8= t.obten(2);   

            // Mostramos los datos de los libros anteriores
            System.out.println ("\nDatos de los libros:" );   
            System.out.println (l1.toString());
            System.out.println (l2);  // no hace falta poner toString()    
            System.out.println (l3); System.out.println (l4);        
            System.out.println (l5); System.out.println (l6); 
            System.out.println (l7); System.out.println (l8);
            
            
            // Averiguar el tamaño del fichero
            long capacidad = t.tamano();
            long registros = t.num_registros();           
            
            System.out.println ("\nCapacidad bytes archivo = " + capacidad);        
            System.out.println ("\nTamaño de cada registro archivo = " + Libro.tamañoEnBytes);
            System.out.println ("\nTotal de libros = " + registros);
            
            
            // recorrer todos los libros y mostrarlos       
            Libro lib = null;
            System.out.println ("\nDatos de los libros en el orden que se grabaron 1:" );   
            for (int i=0;  i < registros; i++) {
                lib = t.obten (i);
                System.out.println ("Libro " + (i+1) + " " + lib);                           
            }
            
            
            // Como borrar???, => escribiendo un registro con  datos vacios a cero o en blanco
            
            
            // podemos recorrer desde el primer libro hasta el último del archivo
            // aunque no sepamos el total de libros almacenados
            // en el orden almacenado    
            int i = 0;            
            System.out.println ("\nDatos de los libros en el orden que se grabaron 2:" );   
            while (true) {         
                lib = t.obten (i);
                System.out.println ("Libro " + (i+1) + " " + lib); 
                i++;
            } // bucle infinito termina al llegar al final del archivo => EOFException
            
            // para leer es mejor con el total de registros del archivo
            
        } catch (EOFException ex) {
            System.out.println ("\n--------EOF--------");   
        
        } catch (FileNotFoundException ex) {
            System.out.println ("\n Error el fichero no se puede crear: " + ex);
            
        } catch (IOException ex) {
            System.out.println ("\n Error de E/S al leer o escribir en el fichero: " +ex);
        } finally {
            try {
                if (t != null) 
                    t.cerrar();            
            } catch (IOException ex) {
                System.out.println ("\n Error de E/S al cerrar el fichero: " +ex);
            }
        }
             
    
    } // fin main

} // fin clase UsaTablaLibros
