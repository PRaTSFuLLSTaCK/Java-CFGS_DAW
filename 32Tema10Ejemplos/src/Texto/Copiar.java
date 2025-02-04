package Texto;

// copiar un fichero de texto en otro fichero de texto

import java.io.*;

public class Copiar {
	
	public static void main(String[] args) {
		FileReader entrada = null;
		FileWriter salida = null;
		
		try  {		
			// debe existir el fichero uno.txt
			entrada=new FileReader("uno.txt");
			salida=new FileWriter("dos.txt");
			
			// copiar el fichero entrada en el fichero salida
			int c;
			while((c=entrada.read())!=-1)
				salida.write(c);		
			
		} catch (FileNotFoundException e) {
			System.out.println ("No se puede copiar el fichero uno.txt porque no existe!!");
		
		} catch (IOException ex) {
			System.out.println("\nError de E/S" + ex);
			
		}finally{
			//cerrar los flujos de datos
			if(entrada!=null)
				try{
					entrada.close();
				}catch(IOException ex){
					System.out.println ("\n Error de E/S al cerrar el archivo. " + ex);
				}
			
			if(salida!=null)
				try{
					salida.close();
				}catch(IOException ex){
					System.out.println ("\n Error de E/S al cerrar el archivo. " + ex);
				}			
			
			System.out.println("el bloque finally siempre se ejecuta");
		} // fin finally
		
	} //fin main
	
} // fin clase Copiar
