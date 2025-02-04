package Texto;

// Lectura y escritura de archivos de texto: Clases FileReader y FileWriter 

import java.io.*;

public class LecturaEscritura {
	
	public static void main (String[] args){
		String []amigos={"Andrés Rosique","Pedro Ruiz","Isaac Sanchez","Juan Serrano"};
		File fs = new File("amigos.txt");
		
		// ESCRITURA DE UN FICHERO DE TEXTO con FileWriter		
		try {
			/* abrir fichero para escritura 
			 * sino existe el archivo lo crea nuevo
			 * si existe borra el archivo anterior y lo crea de nuevo */
			FileWriter fw = new FileWriter(fs);
			
			// Escribir cadena a cadena en el fichero fw
			for (String s : amigos){
				// también valdría asi: fw.write(s,0,s.length());
				fw.write(s + "\r\n");				
			}
			
			// cerrar fichero			
			if (fw != null) 
				fw.close();
				
		}catch(IOException e){
			e.printStackTrace();
		}
		
		// LECTURA DE UN FICHERO DE TEXTO con FileReader
		File fe = new File("amigos.txt");
		if (fe.exists()){
			try {
				// abrir fichero para lectura
				FileReader fr = new FileReader(fe);
				int num;
				char car;
				
				System.out.println("\nLectura de fichero caracter a caracter con FileReader: ");
				
				// Leer caracter a caracter
				while((num = fr.read()) != -1) {
					car = (char) num;
					System.out.print(car);
				}
				
				// cerrar fichero
				if (fr != null) 
					fr.close();
					
			} catch(IOException e){
				e.printStackTrace();
			}
		} // fin if		
		
		// LECTURA DE UN FICHERO DE TEXTO con FileReader y BufferedReader
		if (fe.exists()){
			try {
				// abrir fichero para lectura
				FileReader fr2 = new FileReader(fe);
				BufferedReader br = new BufferedReader(fr2);
				
				System.out.println("\nLectura de fichero línea a línea con BufferedReader: ");
				
				String s;
				while((s = br.readLine()) != null) {
					System.out.println(s);
				}
				
				if (fr2 != null) 
					fr2.close();
					
				if (br != null) 
					br.close();
					
			} catch(IOException e){
				e.printStackTrace();
			}
		} // fin if
		
	} // fin main
	
} // fin clase LecturaEscritura


