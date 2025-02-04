package Texto;

import java.io.*;

public class EjemploPrintWriter2 {
	
	public static void main (String args[]) {	
		
		String s = "Hello World.";		
								
		PrintWriter pw = null; 		
		
		try {
		
			// crea un objeto PrintStream (abre el fichero para escritura)		
			pw = new PrintWriter ("Fichero.txt");
			// escribe un String en el fichero
			pw.println(s);
			pw.append("Esto se añade al final del fichero");
			
			// Chequear para errores => true (hay errores), false (no hay errores)
			// Los métodos de PrintWriter no lanzan IOException 
			// para saber si ha habido un error hay que llamar a checkError() 
			// cada vez que se realice una operación de lectura/escritura
			if (pw.checkError())
				System.out.println ("\n Hay errores de E/S en el manejo del fichero");
			else {

				/* flush() => Si tienes datos que aún no han sido volcados al flujo, 
				* tales como un archivo donde estás escribiendo valores) 
				* flush los envía ahí y vacía el buffer temporal. 
				* Escribe cualquier valor pendiente en el archivo 
				* o conexión de red o consola, según el caso. */ 
				pw.flush();				
			}			
			
		} catch (FileNotFoundException ex) {
			// El fichero no se puede crear
			System.out.println ("\n El fichero no se puede crear " + ex);
			
		} catch (Exception ex) {
			System.out.println ("\n Error = " + ex);				
			
		} finally {
			if (pw != null)
				pw.close();			
		}

	} // fin main
	
} // fin clase EjemploPrintWriter2
		


