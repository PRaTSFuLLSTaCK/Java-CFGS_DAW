package Binario.Escribir_y_Leer_byte_a_byte;

// USAR LA CLASE FileOutputStream de ficheros binarios para ficheros de texto

// Escribir en fichero de texto nuevo, si existe el fichero lo borra antes de crearlo

import java.io.*;

public class EscribeTexto {

	public static void main (String args[]) {
		
		// declaración del manejador del archivo para escritura => f
		FileOutputStream f = null;		
	
		String cad = "La teoría del Big Bang es un modelo científico, que trata de explicar el origen del Universo y su desarrollo posterior a partir de una singularidad espaciotemporal.";				
		
		
		// === ESCRITURA DE UN FICHERO DE TEXTO ====
		
		try {		
			File fichero = new File ("nuevo.txt");		
	
			// ver si el fichero existe
			if (fichero.exists ()) 
				System.out.println ("El fichero " + fichero.getName() + " existe, se borra y crea nuevo");				
	
			// abrir el fichero para escritura nuevo.txt apuntado por el manejador de archivo f
			// Crea un fichero nuevo, si existe borra su contenido
			f = new FileOutputStream ("nuevo.txt");
			
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

} // fin clase EscribeTexto
