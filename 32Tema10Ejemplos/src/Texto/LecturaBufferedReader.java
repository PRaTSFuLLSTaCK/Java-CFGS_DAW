package Texto;

import java.io.*;

public class LecturaBufferedReader {
	
	public static void main (String args[]) {

		// LECTURA DE UN FICHERO DE TEXTO con FileReader y BufferedReader
		File fe = new File ("LecturaBufferedReader.java");
		FileReader fr = null;
		BufferedReader br = null;
		
		if (fe.exists()){
			try {
				// abrir fichero para lectura
				fr = new FileReader(fe);
				br = new BufferedReader(fr);
				
				System.out.println("\nLectura de fichero línea a línea con BufferedReader: ");
				
				String s;
				while((s = br.readLine()) != null) {
					System.out.println(s);
				}				
					
			} catch(IOException e){
				System.out.println ("\nError de E/S");
				e.printStackTrace();
			} finally {
				
				try {
					// cerrar flujos
					if (fr != null) 
						fr.close();
						
					if (br != null) 
						br.close();
						
				} catch (IOException e) {
					System.out.println ("\nError de E/S al cerrar el archivo(s)");
					e.printStackTrace();
				}
			}
			
		} // fin if
		
	} // fin main
	
} // fin clase LecturaBufferedReader
