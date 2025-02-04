package Binario.Datos_Primitivos;

/*  Clases DataOutputStream  => para escribir datos de cualquier tipo de primitivo 
 * como (int, char, long, double, float, boolean, etc....) */

import java.io.*;

public class EscrituraDatosPrimitivos {
	
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
		
		
		
	} // fin main  

} // fin clase EscrituraDatosPrimitivos
