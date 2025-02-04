package Binario.Datos_Primitivos;

/*  Clases DataInputStream y DataOutputStream 
 * => para escribir datos de cualquier tipo de primitivo 
 * como (int, char, long, double, float, boolean, etc....) */

import java.io.*;

public class DatosPrimitivos {
	
	public static void main(String[] args)  {
			
		// vectores de datos a escribir en el fichero
		double[] precios = {1350, 400, 890, 6200, 8730};
		int[] unidades = {5, 7, 12, 8, 30};
		String[] descripciones = {"paquetes de papel", "lápices", "bolígrafos", "carteras", "mesas"};
		
		// ===== ESCRITURA DE DATOS PRIMITIVOS EN EL FICHERO pedido.dat =====
		try {
			// abrir fichero pedido.dat para escritura 
			DataOutputStream salida = new DataOutputStream (new FileOutputStream("pedido.dat"));
			
			// escribir los elementos de los 3 vectores en el fichero
			for (int i=0; i<precios.length; i++) {				
				salida.writeUTF(descripciones[i]);				
				salida.writeInt(unidades[i]);				
				salida.writeDouble(precios[i]);
			}
			
			// cerrar fichero
			if (salida != null)
				salida.close();
								
		} catch (IOException e) {		
			// caso de haber algún error en la escritura del fichero
			System.out.println ("Error en la escritura del fichero: ");
			e.printStackTrace();
		}
		
		// ===== LECTURA DE DATOS PRIMITIVOS EN EL FICHERO pedido.txt =====
		try {
			// Hay que comprobar que existe el fichero pedido.txt
			File f = new File ("pedido.dat");
			
			DataInputStream entrada = null;
			
			if (!f.exists())
				System.out.println ("Error, no se puede leer el fichero pedido.txt, ya que no existe");
			else {
				// existe el fichero => se puede leer
				double precio;
				int unidad;
				String descripcion;
				double total=0.0;

        try {
        	// abrir fichero para lectura
        	entrada = new DataInputStream(new FileInputStream("pedido.txt"));
        	
        	// leer todos los datos del fichero => con un bucle infinito!!!
        	while(true) {
        		descripcion = entrada.readUTF();
        		unidad = entrada.readInt();
        		precio = entrada.readDouble();
        		System.out.println("has pedido "+unidad+" "+descripcion+" a "+precio+" pts.");
        		total = total + unidad*precio;
        	}        	
        	
        	// OjO => no poner instrucciones aquí, ya que no se ejecutan => bucle infinito
        	
        } catch (EOFException eof) {
        	// Excepción al alcanzar el final del fichero => acabar el bucle infinito
					System.out.println("Excepción cuando se alcanza el final del archivo");
				
				} catch (FileNotFoundException fnf) {
					System.err.println("Fichero no encontrado " + fnf);
				
				} catch (IOException e) {
					System.err.println("Se ha producido un error de E/S ");
					e.printStackTrace();				
				
				} catch (Throwable e) {
					System.err.println("Error de programa" + e);
					e.printStackTrace();				
					
				} finally {
					System.out.println("por un TOTAL de: "+total+" pts.");						
        	
        	if (entrada != null)
						entrada.close();				
				}        
        			
			}	// fin else
				
		} catch (IOException e) {				
			// caso de haber algún error en la lectura del fichero
			System.out.println ("Error en la comprobación de que el fichero exista: ");
			e.printStackTrace();		
		}
		
	} // fin main  

} // fin clase DatosPrimitivos
