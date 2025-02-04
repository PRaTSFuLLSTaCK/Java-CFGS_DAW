package Binario.Fichero_Objetos;

// Ejemplo de añadir al final de un fichero de objetos
// NO FUNCIONA BIEN al añadir datos sobre un ObjectOutputStream
// http://www.chuidiang.com/java/ficheros/ObjetosFichero.php

import java.io.*;

public class Escritura2FicheroObjetos{

	public static void main(String[] args){
	
		String [] amigos = {"Pedro Rosique","Luis Perez","Carlos Sanchez","Felipe Martin"};
		long [] telefonos = {950111111,950221111,95033111,950444422};		
		
		FileOutputStream fs = null;
		ObjectOutputStream oos = null;
		try {
			// Apertura del fichero de objetos amigos.dat para añadir al final
			// NO FUNCIONA BIEN (le añade una nueva cabecera al final del archivo)
			fs = new FileOutputStream ("amigos.dat", true);
			oos = new ObjectOutputStream (fs);
			
			// Escribir 4 objetos en el fichero
			for (int i=0;i<4;i++){
				Amigo a = new Amigo (amigos[i],telefonos[i]);
				// escribir el objeto a en el fichero oos
				oos.writeObject(a);
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
				if (oos != null)
					oos.close();
			} catch (IOException ex) {
				// Error de E/S
				System.out.println ("\n Error de E/S al cerrar los ficheros");
				ex.printStackTrace();
			}			
		}	
		
	} // fin main
	
} // fin clase Escritura2FicheroObjetos


