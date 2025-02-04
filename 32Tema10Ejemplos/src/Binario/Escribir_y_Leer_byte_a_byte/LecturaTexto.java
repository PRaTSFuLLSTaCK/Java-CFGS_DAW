package Binario.Escribir_y_Leer_byte_a_byte;

// USAR LA CLASE FileInputStream de ficheros binarios para ficheros de texto

// Leer un fichero de texto

import java.io.*;

public class LecturaTexto {

	public static void main (String args[]) {
	
		// cadena que almacenará el contenido del archivo
		// OjO!! => para archivos grandes no se puede almacenar el contenido en una cadena
		String cad = ""; 
		
		// declaración del manejador del archivo para lectura => f
		FileInputStream f = null;		
			
		try {									
			File fichero = new File ("nuevo.txt");		
	
			// ver si el fichero no existe
			if (!fichero.exists ()) {
				System.out.println ("El fichero " + fichero.getName() + " no existe, no se puede leer.");
				// salida incondicional del programa
				System.exit (1);
			}
			else {		
				// === LEER UN FICHERO DE TEXTO ====		
				
				// abrir el fichero para lectura
				f = new FileInputStream (fichero);								
		
				// tamaño en bytes del archivo
				long tamano = f.available();
				// también vale así:
				// long tamano = fichero.length();				
			
				// leer caracter a caracter (byte a byte) en el fichero f
				for (int i=1; i<=tamano; i++) {
					char car = (char) f.read();
					cad = cad + car;
				}
			}// fin else
							
		} catch (IOException e) {
			// En caso de error			
			System.out.println ("Error en la lectura del archivo " + e);
			e.printStackTrace();
		}
		finally {
			try {
				// cerrar el archivo
				if (f != null)
					f.close();
			} catch (IOException e) {
				// En caso de error			
				System.out.println ("Error al cerrar el archivo abierto para lectura " + e);
				/* printStackTrace() => Describe el contenido de la pila de llamadas en el momento 
				 * en que se produjo la excepción */
				e.printStackTrace(); 
			} 
			System.out.println ("El contenido del archivo es: \n" + cad);
										
		} // fin finally			
	
	} // fin main

} // fin clase LecturaTexto
