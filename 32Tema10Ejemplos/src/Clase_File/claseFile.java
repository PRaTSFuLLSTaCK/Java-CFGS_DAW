package Clase_File;

// la clase File proporciona información acerca de los archivos, de sus atributos, de los directorios, etc. 
import java.io.File;

import java.text.SimpleDateFormat; /* http://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html*/

public class claseFile {

	public static void main (String args[]) {
		
		File fichero = new File ("claseFile.java");
		// el directorio actual en Linux o Windows es el punto
		File directorio = new File (".");
		
		// ver si el fichero existe
		if (fichero.exists ()) {
			System.out.println ("El fichero " + fichero.getName() + " existe ");			
			
			// ver si puedo escribir en el fichero
			if (fichero.canWrite())
				System.out.println ("El fichero " + fichero.getName() + " puede escribirse ");
			else
				System.out.println ("El fichero " + fichero.getName() + " no puede escribirse ");
			
			// mostrar la ruta absoluta del fichero, longitud, modificación		
			System.out.println ("La ruta absoluta del fichero es: " + fichero.getAbsolutePath());	
			System.out.println ("El fichero ocupa " + fichero.length() + " bytes ");							
					
			SimpleDateFormat modificado = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
			System.out.println("Última modificación: " + modificado.format(fichero.lastModified()));
		}
		else 	
			System.out.println ("El fichero " + fichero.getName() + " no existe ");
		
		// listar el contenido del directorio
		if (directorio.exists()) {
			String listado[] = directorio.list();
			System.out.println ("El directorio actual está formado por: ");
			for (String elemento: listado)
				System.out.println (elemento);				
		}
		
		// crea un directorio a partir del actual, si puede (si tiene permisos y no existe ya)
		File carpeta = new File ("borrame");
		if (!carpeta.exists())
			if (carpeta.mkdir())
				System.out.println ("Directorio borrame creado");
			else
				System.out.println ("Directorio borrame no creado, no hay permisos suficientes");
		else
			System.out.println ("Directorio borrame no creado, ya existe!!");	
	} // fin main

} // fin claseFile
