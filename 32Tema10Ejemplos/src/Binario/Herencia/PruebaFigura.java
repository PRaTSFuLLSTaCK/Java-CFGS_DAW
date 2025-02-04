package Binario.Herencia;

import java.io.*;

public class PruebaFigura {

    public static void main(String[] args) {
        Figura fig1=new Rectangulo(10,15, 30, 60);
        Figura fig2=new Circulo(12,19, 60);
        
        ObjectOutputStream salida = null;
        ObjectInputStream entrada = null;

        try  {
			// Escritura de dos objetos de la clase Figura
            salida = new ObjectOutputStream(new FileOutputStream("figura.obj"));
            salida.writeObject("guardar un objeto de una clase derivada\n");
            salida.writeObject(fig1);
            salida.writeObject(fig2);
        
            
			// Lectura de dos objetos de la clase Figura
            entrada=new ObjectInputStream(new FileInputStream("figura.obj"));
            String str=(String)entrada.readObject();
            Figura obj1 = (Figura)entrada.readObject();
            Figura obj2 = (Figura)entrada.readObject();
            
            System.out.println("------------------------------");
            System.out.println(obj1.getClass().getName()+" origen ("+obj1.x+", "+obj1.y+")"+" area="+obj1.area());
            System.out.println(obj2.getClass().getName()+" origen ("+obj2.x+", "+obj2.y+")"+" area="+obj2.area());
            System.out.println("------------------------------");
           
		
        }catch (IOException ex) {
            System.out.println ("\n Error de E/S: " + ex);
            
        }catch (ClassNotFoundException ex) {
            System.out.println("\n Lectura de un objeto de una Clase incorrecta: " + ex);
            
        } finally {
			
			try {
				if (salida != null)
					salida.close();
				if (entrada != null)
					entrada.close();
				
			} catch (IOException ex) {
				System.out.println("\n Error E/S al cerrar los ficheros: " + ex);
			}
			
		}
		       
   } // fin main
   
} // fin clase PruebaFigura
