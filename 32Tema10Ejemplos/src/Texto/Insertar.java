package Texto;

// Insertar al final de un fichero de texto: Clase FileWriter 

import java.io.*;

public class Insertar {
	
	public static void main (String[] args){
		String []amigos={"Perico","Pedrete","Manolo","Manolete", "Luisa"};
		File fs = new File("amigos.txt");
		FileWriter fw = null;
		
		// AÑADIR AL FINAL DE UN FICHERO DE TEXTO con FileWriter		
		try {
			// abrir fichero para añadir al final del mismo
			fw = new FileWriter(fs, true);
			
			// Escribir cadena a cadena en el fichero fw
			for (String s : amigos){
				// también valdría asi: fw.write(s,0,s.length());
				fw.write(s + "\r\n");				
			}				
		
		} catch (IOException ex) {
			System.out.println("\nError de E/S" + ex);		
			
		} finally {
			// En el finally cerrar el fichero, para asegurarse
			// que se cierra tanto si todo va bien como si salta una excepcion.
			try {                    
				if (null != fw) 
					fw.close();     				             
	
			} catch (Exception e2) { 
				e2.printStackTrace();
			}
		} // fin finally		
		
		
	} // fin main
	
} // fin clase Insertar


