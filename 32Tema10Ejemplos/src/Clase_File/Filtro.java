package Clase_File;

import java.io.*;

/* Un filtro es un objeto de una clase que implemente el interface FilenameFilter, 
 * y tiene que redefinir la única función del interface denominada accept. 
 * Esta función devuelve un dato de tipo boolean. 
 * En este caso, la hemos definido de forma que si el nombre del archivo termina 
 * con una determinada extensión devuelve true en caso contrario devuelve false. 
 * La función endsWith de la clase String realiza esta tarea tal 
 * como se ve en la porción de código que viene a continuación. 
 * La extensión se le pasa al constructor de la clase Filtro para inicializar 
 * el miembro dato extension.*/

public class Filtro implements FilenameFilter{
    String extension;
    
    Filtro(String extension){
        this.extension=extension;
    }
    
    // método que 'hereda' del interface FileNameFilter
    // y que se ha de implementar para definir el tipo de filtro
    @Override
    public boolean accept(File dir, String name){
        return name.endsWith(extension);
    }
    
    public static void main (String args[]) {		
		
		File fichero=new File("Filtro.java");
		
		if(fichero.exists()){
			System.out.println("Nombre del archivo "+fichero.getName());
			System.out.println("Camino             "+fichero.getPath());
			System.out.println("Camino absoluto    "+fichero.getAbsolutePath());
			System.out.println("Se puede escribir  "+fichero.canRead());
			System.out.println("Se puede leer      "+fichero.canWrite());
			System.out.println("Tamaño             "+fichero.length());
			
			//para calcular el tamaño del archivo en KB se divide entre 1024
			System.out.println(" ******* lista de los archivos de este directorio *******");
			fichero=new File(".");
			
			String[] listaArchivos=fichero.list();
			
			for(int i=0; i<listaArchivos.length; i++)
				System.out.println(listaArchivos[i]);
			
			System.out.println(" ******* lista de los archivos con filtro *******");
			
			listaArchivos=fichero.list(new Filtro(".java"));
			
			for(int i=0; i<listaArchivos.length; i++)
				System.out.println(listaArchivos[i]);
			

		}
		try  {
			//espera la pulsación de una tecla y luego RETORNO
			System.in.read();
		}catch (Exception e) {  }
		
	} // fin main 
		
		
	
}
