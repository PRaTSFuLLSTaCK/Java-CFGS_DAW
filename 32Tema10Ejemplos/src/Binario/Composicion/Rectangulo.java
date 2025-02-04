package Binario.Composicion;

import java.io.*;

public class Rectangulo implements Serializable{
	private int ancho ;
	private int alto ;
	private Punto origen;
	
	public Rectangulo (Punto pto, int ancho1, int alto1) {
		ancho = ancho1;
		alto = alto1;
		origen = pto;
	}
	

	public String toString(){
		String texto=origen+" ancho:"+ancho+" alto:"+alto;
		return texto;
	}
	
	public static void main (String args[]) {
		Rectangulo rect=new Rectangulo(new Punto(10,10), 30, 60);
		
		// escribir un objeto Rectangulo en el archivo figura.obj
		ObjectOutputStream salida = null;
		try {	
			salida=new ObjectOutputStream(new FileOutputStream("figura.obj"));
			salida.writeObject("guardar un objeto compuesto\n");
			salida.writeObject(rect);
		} catch (IOException ex) {
			System.out.println ("\nError de E/S: " + ex);
		} finally {
			try {
				if (salida != null)
					salida.close();
			} catch (IOException ex) {
				System.out.println ("\nError de E/S al cerrar el archivo: " + ex);
			}
		}
		
		// Leer un objeto del fichero de objetos figura.obj
		ObjectInputStream entrada = null;
		
		try {
			entrada=new ObjectInputStream(new FileInputStream("figura.obj"));
			String str=(String)entrada.readObject();
			Rectangulo obj1=(Rectangulo)entrada.readObject();
			System.out.println("------------------------------");
			System.out.println(str+obj1);
			System.out.println("------------------------------");			
		} catch (FileNotFoundException ex) {
			System.out.println("\n Error no existe el archivo. " + ex);
		} catch (ClassNotFoundException ex) {
			System.out.println("\n Clase incorrecta. " + ex);
		} catch (IOException ex) {
			System.out.println ("\nError de E/S: " + ex);
		} finally {
			try {
				entrada.close();
			} catch (IOException ex) {
				System.out.println ("\nError de E/S al cerrar el archivo: " + ex);
			}
		}
		
	} // fin main
	
} // fin clase Rectangulo
