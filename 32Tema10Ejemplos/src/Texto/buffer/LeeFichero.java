package Texto.buffer;

/* Lectura de ficheros de texto => Clases FileReader y BufferedReader
   se utilizan para lectura de texto y lectura de texto usando un Buffer. 
   * Esta clase tiene métodos que nos permiten leer caracteres. 
   * Sin embargo, suele ser habitual querer las líneas completas, 
   * bien porque nos interesa la línea completa, bien para poder analizarla luego 
   * y extraer campos de ella. 
   * FileReader no contiene métodos que nos permitan leer líneas completas, 
   * pero sí BufferedReader. */
import java.io.*;

class LeeFichero {
	public static void main(String [] arg) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;      
      
		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File ("Fichero.txt");
			fr = new FileReader (archivo);
			br = new BufferedReader(fr);

			// Lectura del fichero línea a línea
			String linea;
			while((linea=br.readLine())!=null)
				System.out.println(linea);
				
		} catch(Exception e) {
			e.printStackTrace();

		}finally{
			// En el finally cerrar el fichero, para asegurarse
			// que se cierra tanto si todo va bien como si salta una excepcion.
			try {                    
				if (null != fr) 
					fr.close();     
				if (br != null)
					br.close();               
	
			} catch (Exception e2) { 
            e2.printStackTrace();
			}
		} // fin finally
		
   } // fin main
}
