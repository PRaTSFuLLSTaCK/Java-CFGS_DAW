package Texto;

// Insertar al final de un fichero de texto: Clase FileWriter 

import java.io.*;

public class Insertar2 {
	
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
		
		// LECTURA DE UN FICHERO DE TEXTO con FileReader
		File fe = new File("amigos.txt");
		FileReader fr = null;
		
		// comprobar que el fichero existe
		if (fe.exists()){
			try {
				// abrir fichero para lectura
				fr = new FileReader(fe);
				int num;
				char car;
				
				System.out.println("\nLectura de fichero caracter a caracter con FileReader: ");
				
				// Leer caracter a caracter
				while((num = fr.read()) != -1) {
					car = (char) num;
					System.out.print(car);
				}
				
			} catch (FileNotFoundException ex) {
				// antes se ha comprobado de que el fichero existe, es extraño que salte esta excepción			
				System.out.println("\n Error, el fichero no existe!!");					
					
			} catch(IOException e){
				e.printStackTrace();
				
			} finally {
				// En el finally cerrar el fichero, para asegurarse
				// que se cierra tanto si todo va bien como si salta una excepcion.
				try {                    
					if (null != fw) 
						fr.close();     				             
		
				} catch (Exception e2) { 
					e2.printStackTrace();
				}
			}
			
		} // fin if		
		
		// LECTURA DE UN FICHERO DE TEXTO con FileReader y BufferedReader
		if (fe.exists()){
			FileReader fr2 = null;
			BufferedReader br = null;
			try {
				// abrir fichero para lectura
				fr2 = new FileReader(fe);
				br = new BufferedReader(fr2);
				
				System.out.println("\nLectura de fichero línea a línea con BufferedReader: ");
				
				String s;
				while((s = br.readLine()) != null) {
					System.out.println(s);
				}
				
				
					
			} catch (IOException ex) {
				System.out.println("\nError de E/S" + ex);		
			
			} finally {
				// En el finally cerrar el fichero, para asegurarse
				// que se cierra tanto si todo va bien como si salta una excepcion.
				try {                    
					if (fr2 != null) 
						fr2.close();
						
					if (br != null) 
						br.close();			             
		
				} catch (Exception e2) { 
					e2.printStackTrace();
				}
			} // fin finally		
			
		} // fin if
		
	} // fin main
	
} // fin clase Insertar


