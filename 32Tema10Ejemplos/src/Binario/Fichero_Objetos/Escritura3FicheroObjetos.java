package Binario.Fichero_Objetos;

// Ejemplo de añadir al final de un fichero de objetos
// FUNCIONA BIEN al añadir datos sobre un ObjectOutputStream
// http://www.chuidiang.com/java/ficheros/ObjetosFichero.php

import java.io.*;

public class Escritura3FicheroObjetos{

	public static void main(String[] args){
	
		String [] amigos = {"Fernando Rosique","Luis Perez","Carlos Sanchez","Felipe Martin"};
		long [] telefonos = {950111117,950221116,95033115,950444424};		
		
		FileOutputStream fs = null;
		MiObjectOutputStream insertar = null; // flujo de salida para insertar objetos al final
		ObjectOutputStream nuevo = null; // flujo de salida para crear fichero nuevo
		String nombre = "amigos.dat";
		
		try {
			File f = new File (nombre);
			
			// comprobar si existe el fichero
			if (f.exists()) {
				
				// Existe el fichero 				
				System.out.println ("\n El fichero existe. Se añaden objetos al final.");
				
				// Apertura del fichero de objetos amigos.dat para añadir al final
				// FUNCIONA BIEN (no le añade una nueva cabecera al final del archivo)
				fs = new FileOutputStream (f, true);
				insertar = new MiObjectOutputStream (fs);
				
				// Insertar objetos en el fichero
				for (int i=0;i<amigos.length;i++){
					Amigo a = new Amigo (amigos[i],telefonos[i]);
					// Insertar el objeto a en el fichero oos
					insertar.writeObject(a);
				}				
				
			}
			else {
				// el fichero no existe, no se puede crear con MiObjectOutputStream porque no añade la cabecera
				// se tiene que hacer con ObjectOutputStream que si la añade
				System.out.println ("\n El fichero NO existe. Se crea un fichero de objetos nuevo.");
				
				// Apertura del fichero de objetos amigos.dat para crearlo nuevo				
				fs = new FileOutputStream (f);
				nuevo = new ObjectOutputStream (fs);
				
				// Escribir objetos en el fichero
				for (int i=0;i<amigos.length;i++){
					Amigo a = new Amigo (amigos[i],telefonos[i]);
					// Escribir el objeto a en el fichero oos
					nuevo.writeObject(a);
				}	
				
			}		
			
		} catch (FileNotFoundException ex) {
			// El fichero no se puede crear
			System.out.println ("\n Error, el fichero no se puede crear" + ex);
			
		} catch(IOException ex) {
			// Error de E/S
			System.out.println ("\n Error de E/S");
			ex.printStackTrace();
			
		} finally {
			
			try {
				// Cierre de los ficheros
				if (fs != null)
					fs.close();
				if (nuevo != null)
					nuevo.close();
				if (insertar != null)
					insertar.close();
			} catch (IOException ex) {
				// Error de E/S
				System.out.println ("\n Error de E/S al cerrar los ficheros");
				ex.printStackTrace();
			}			
		}	
		
	} // fin main
	
} // fin clase Escritura3FicheroObjetos


