package Texto.buffer;

/* Escritura de ficheros de texto => Clases FileWriter y PrintWiter
   se utilizan para escritura de texto y escritura de texto línea a línea */

import java.io.*;

public class EscribeFichero
{
	public static void main(String[] args)
	{
		FileWriter fichero = null;
		PrintWriter pw = null;
		
		try
		{
			fichero = new FileWriter("Fichero.txt");
			pw = new PrintWriter(fichero);

			// Escribir en el fichero línea a línea
			for (int i = 1; i <= 10; i++)
				pw.println("Línea " + i);
				
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				// Nuevamente aprovechar el finally para asegurarse que se cierra el fichero.
				if (null != fichero)
					fichero.close();
				if (null != pw)
					pw.close();
              
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} // fin finally
	} // fin main
	
} // fin clase EscribeFichero

