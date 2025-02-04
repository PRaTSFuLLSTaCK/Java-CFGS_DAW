package Binario.Fichero_Objetos;

// Ejemplo de escritura de un fichero de objetos
import java.io.*;

public class EscrituraFicheroObjetos{

	public static void main(String[] args){
	
		String [] amigos = {"Andrés Rosique","Juan Ruiz","Isaac Sanchez","Maria  Serrano"};
		long [] telefonos = {653364787,627463746,644567346,623746347};		
		
		FileOutputStream fs = null;
		ObjectOutputStream oos = null;
		try {
			// Apertura del fichero de objetos amigos.dat para escritura
			fs = new FileOutputStream ("amigos.dat");
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
	
} // fin clase EscrituraFicheroObjetos


