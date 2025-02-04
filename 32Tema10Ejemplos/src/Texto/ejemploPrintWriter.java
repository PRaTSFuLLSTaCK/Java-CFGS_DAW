package Texto;

import java.io.*;

public class ejemploPrintWriter {

	// Los métodos de PrintWriter no lanzan IOException 
	// una forma de evitarlo es crearte tu, tu propio método, 
	// por ejemplo, en este caso asociado a la escritura
	// y que lance la excepcion IOExcepcion
	public static void escribir (String nomFich,int i, double x, String str) throws IOException {		
		PrintWriter salida = null;
		try {
			// crea el flujo de salida asociado al nombre del fichero nomFich
			salida = new PrintWriter(nomFich);
			// escribe los datos en el fichero
			salida.println("Entero: "+i+", Real: "+x);
			salida.println("String: "+str);
			
		} catch (FileNotFoundException ex) {
			// El fichero no se puede crear
			System.out.println ("\n El fichero no se puede crear " + ex);
			
		} catch (Exception ex) {
			System.out.println ("\n Error = " + ex);		
		} finally {
			if (salida != null)
				salida.close();
		}
	} // fin escribir


	public static void main (String args[]) {
		
		try {
			// escribe en el fichero borrame.txt
			escribir ("borrame.txt", 55, 40.67, "Texto");		
		} catch (IOException ex) {
			System.out.println ("\n Error de E/S " + ex);
		}
		
	} // fin main
	
} // fin clase ejemploPrintWriter
