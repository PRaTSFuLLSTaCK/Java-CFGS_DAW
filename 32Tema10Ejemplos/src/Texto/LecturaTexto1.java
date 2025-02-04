package Texto;

// paquete java.io contiene todas las clases para E/S => manejo de ficheros
import java.io.*;

public class LecturaTexto1 {
	
	public static void main(String[] args) {
		FileReader entrada = null;
		// StringBuffer usado para la lectura de datos del fichero
		StringBuffer str = new StringBuffer();
		
		try  {
			// abrir el fichero LecturaTexto1.java para lectura en modo texto con FileReader
			// que lee caracter a caracter
			entrada=new FileReader("LecturaTexto1.java");
			
			// aunque sea c un entero, lo uso para leer caracteres
			int c; 
			
			// leer todos los caracteres del fichero  => -1 es el caracter EOF (final del fichero);
			while((c=entrada.read())!=-1)
				// añado el caracter c al StringBuffer str
				str.append((char)c);			
		
			System.out.println(str);
			System.out.println("--------------------------------------");
			
		} catch (FileNotFoundException ex) {			
			System.out.println("\n Error, el fichero no existe!! ");					
		} catch (IOException ex) {
			System.out.println ("\n Error de E/S. " + ex);			
		} finally {
			// el bloque finally siempre se ejecuta
			
			//cerrar los flujos de datos
			if(entrada!=null) {
				try{
					entrada.close();
				}catch(IOException ex){
					System.out.println ("\n Error de E/S al cerrar el archivo. " + ex);					
				}
			}
			System.out.println("el bloque finally siempre se ejecuta");
		}
	}
}
