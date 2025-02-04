package Binario.Fichero_Objetos;

// Ejemplo de escritura y lectura de un fichero de objetos
import java.io.*;

public class FicheroObjetos{

	public static void main(String[] args){
	
		String [] amigos = {"Andrés Rosique","Pedro Ruiz","Isaac Sanchez","Juan  Serrano"};
		long [] telefonos = {653364787,627463746,644567346,623746348};
		
		//======= Escritura del fichero =========
		try {
			// Apertura del fichero de objetos amigos.dat para escritura
			FileOutputStream fs = new FileOutputStream ("amigos.dat");
			ObjectOutputStream oos = new ObjectOutputStream (fs);
			
			// Escribir 4 objetos en el fichero
			for (int i=0;i<4;i++){
				Amigo a = new Amigo (amigos[i],telefonos[i]);
				// escribir el objeto a en el fichero oos
				oos.writeObject(a);
			}
			
			// Cierre del fichero
			if (oos != null){
				oos.close();
				fs.close();
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		//======== Lectura del fichero ==========
		try {
			File f=null;
			FileInputStream fe = null;
			ObjectInputStream ois = null;
			
			
			try {
				
				f = new File("amigos.dat");
				// Primero se comprueba si el fichero de objetos amigos.dat existe	
				if (f.exists()){
					// Abrir ficheros para lectura
					fe = new FileInputStream (f);
					ois = new ObjectInputStream (fe);
					
					// leer objetos del fichero mientras que no salte la excepción de fin del fichero EOFException 
					while(true) {
						Amigo a = null;
						// leer el objeto a del fichero ois 
						a = (Amigo)ois.readObject();
						// mostrar por pantalla la información del objeto
						a.print();
						System.out.println("");
					} 
					
				} // fin if
				
			} catch (EOFException eof) {
				// Se ha alcanzado el final del fichero
				System.out.println(" --------------------------");
			
			} catch (FileNotFoundException fnf) {
				// El fichero no existe
				System.err.println("Fichero no encontrado " + fnf);
				
			} catch(IOException e) {
				// Error de E/S
				System.err.println("Se ha producido una IOException");
				e.printStackTrace();
				
			} catch (Throwable e) {
				// Error de programa
				System.err.println("Error de programa: " + e);
				e.printStackTrace();
				
			} finally {
				// Cerrar ficheros
				if (ois != null) {
					ois.close();
					fe.close();
				}
			}
			
		} catch(IOException e){
			e.printStackTrace();
		}
		
	} // fin main
	
} // fin clase FiheroObjetos


