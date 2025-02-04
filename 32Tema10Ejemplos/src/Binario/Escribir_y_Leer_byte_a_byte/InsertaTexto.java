package Binario.Escribir_y_Leer_byte_a_byte;

// USAR LA CLASE FileOutputStream de ficheros binarios para ficheros de texto

// Añadir al final de un fichero de texto creado

import java.io.*;

public class InsertaTexto {

	public static void main (String args[]) {
		
		// declaración del manejador del archivo para escritura => f
		FileOutputStream f = null;	
		
		String cad = " Esto es una prueba para añadir al final del archivo.";				
		
		// === AÑADIR AL FINAL DE UN FICHERO DE TEXTO ====		
		try {		
			File fichero = new File ("nuevo.txt");		
	
			// ver si el fichero no existe
			if (!fichero.exists ()) 
				System.out.println ("El fichero " + fichero.getName() + " no existe, se crea nuevo");		
				
			// abrir el fichero para añadir al final
			f = new FileOutputStream ("nuevo.txt", true);
			
			// escribir caracter a caracter (byte a byte) en el fichero f
			for (int i=0; i<cad.length(); i++) {
				char car = cad.charAt(i);
				f.write ((byte)car);			
			}
					
		} catch (IOException e) {
			// En caso de error			
			System.out.println ("Error en la escritura del archivo " + e);
			e.printStackTrace();
		}
		finally {
			try {
				// cerrar el archivo
				if (f != null)
					f.close();
			} catch (IOException e) {
				// En caso de error			
				System.out.println ("Error al cerrar el archivo abierto para escritura " + e);
				e.printStackTrace();
			} 
		
		}		
	
	} // fin main

} // fin clase InsertaTexto
