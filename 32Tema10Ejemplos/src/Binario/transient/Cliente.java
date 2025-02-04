

import java.io.*;

public class Cliente implements java.io.Serializable{
	
	private String nombre;	
	
	// atributo protegido al guardar en el flujo de salida
	private transient String passWord; 
	
	public Cliente(String nombre, String pw) {
		this.nombre=nombre;
		passWord=pw;
	}
	
	public String toString(){
		String texto=(passWord==null) ? "(no disponible) " : passWord;
		texto+=nombre;
		return texto;
	}
	
	public static void main (String args[]) {
		
		// escribir un objeto en el fichero cliente.obj
		Cliente cliente = new Cliente("Angel", "xyz");
		
		ObjectOutputStream salida = null;		
		try {	
			salida = new ObjectOutputStream(new FileOutputStream("cliente.obj"));
			salida.writeObject("Datos del cliente\n");
			salida.writeObject(cliente);
			
		} catch (IOException ex) {
			System.out.println ("\nError de E/S" + ex);							
		} finally {
			try {
				if (salida != null)
					salida.close();
			} catch (IOException ex) {
				System.out.println ("\nError de E/S al cerrar el archivo" + ex);
			}	
		}
		
		// leer el fichero cliente.obj
		ObjectInputStream entrada = null;
		
		try {		
			entrada = new ObjectInputStream(new FileInputStream("cliente.obj"));
			String str=(String)entrada.readObject();
			Cliente obj1 = (Cliente)entrada.readObject();
			System.out.println ("------------------------------");
			System.out.println (str+obj1);
			System.out.println ("------------------------------");
		} catch (FileNotFoundException ex) {
			System.out.println ("\nError no existe el archivo" + ex);	
		} catch (IOException ex) {			
			System.out.println ("\nError de E/S" + ex);
		} catch (ClassNotFoundException ex) {
			System.out.println ("\nError lectura de clase del objeto incorrecta");		
		} finally {
			try {
				if (entrada != null)
					entrada.close();
			} catch (IOException ex) {
				System.out.println ("\nError de E/S al cerrar el archivo" + ex);
			}	
		}
		
	} // fin main
	
} // fin clase Cliente
