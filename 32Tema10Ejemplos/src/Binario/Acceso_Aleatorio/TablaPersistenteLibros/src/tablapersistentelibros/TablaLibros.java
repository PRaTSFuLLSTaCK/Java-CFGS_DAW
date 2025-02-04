
package Binario.Acceso_Aleatorio.TablaPersistenteLibros.src.tablapersistentelibros;

import java.io.*;

/**
* Tabla de libros persistente almacenada en
* un fichero de acceso aleatorio
*/
public class TablaLibros {
    // atributo => fichero de acceso aleatorio
    private RandomAccessFile fich;
    
    /**
    * Constructor al que se le pasa el nombre del fichero
    * => nombreFichero se abre para lectura y escritura 
    * * Nota: lanza FileNotFoundException para controlar que el fichero se pueda crear */    
    public TablaLibros (String nombreFichero) throws FileNotFoundException {
        fich = new RandomAccessFile(nombreFichero,"rw");
    }
    
    /**
     * E: indice => 0 es el primer elemento de la tabla persistente (fichero acceso aleatorio)
     *           => 1 es el segundo elemento, etc...
     * S: devuelve el elemento de la tabla que esta en "indice" 
     * Nota: Lanza IOException o EOFException para controlar errores al posicionarse */ 
    public Libro obten(int indice) throws IOException, EOFException {        
        long pos = indice*Libro.tamañoEnBytes;
        
        // posiciona el contador de lectura/escritura
        fich.seek(pos);
        
        // lee y retorna el libro
        return Libro.leeDeFichero(fich);
    }
    
    /* E: indice => indice de la tabla persistente 
     *     l => objeto libro a escribir
     * S: Escribe un libro en la posición "indice" de la tabla 
     * Nota: Lanza la excepción IOException para controlar errores al posicionarse  
     * y escribir en el fichero */ 
    public void almacena(int indice, Libro l) throws IOException {        
        long pos = indice*Libro.tamañoEnBytes;
        
        // posiciona el contador de lectura/escritura
        fich.seek(pos);
        
        // escribe el libro
        l.escribeEnFichero(fich);
    }
    
    /* obtener el tamaño del archivo */
    public long tamano () throws IOException {
        return fich.length();        
    }
    
    /* calcular el total de registros del archivo */
    public long num_registros () throws IOException {
        long capacidad = tamano();
        long resto = capacidad % Libro.tamañoEnBytes;
        long total;
        
        if (resto == 0)
            total = capacidad / Libro.tamañoEnBytes;
        else
            total = (capacidad / Libro.tamañoEnBytes) + 1;
        
        return total;            
    }
    
    /** Cerrar la tabla */
    public void cerrar() throws IOException {
        fich.close();
    }
} // clase TablaLibros
