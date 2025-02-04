package superMercadoArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author DiscoDurodeRoer
 */
public class SupermercadoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creamos la lista de productos 
        ArrayList<Producto> productos=new ArrayList<>();
        
        //Generamos la cola
        generarProductos(productos);
        
        //Declaramos variables que necesitaremos
        String ticket="************Cantidad***Precio***Total\n";
        double precioTotal=0;
        Producto productoActual;
        
        Iterator<Producto> it=productos.iterator();
        
        //Recorremos la lista
        for(int i=0;it.hasNext();i++){
            
            productoActual= it.next();
            precioTotal+=productoActual.precioFinal();
            ticket+="Producto"+(i+1)+"\t"+productoActual.getCantidad()
                    +"\t"+productoActual.getPrecio()
                    +"\t"+productoActual.precioFinal()+"\n";
            
        }
        
        ticket+="Precio final\t\t\t"+precioTotal;
        
        System.out.println(ticket);
        
    }
    
    /**
     * Genera productos que se almacenan en la lista
     * @param lista
     */
    public static void generarProductos(ArrayList<Producto> lista){
        
       int numeroPersonas=generaNumeroAleatorio(1,8);
       
       int cantidad;
       double precio;
       
       for(int i=0;i<numeroPersonas;i++){
           cantidad=generaNumeroAleatorio(1,10);
           precio=generaNumeroRealAleatorio(0.05, 50);
           lista.add(new Producto(cantidad, precio));
       } 
        
    }
    
   /**
     * Genera un numero aleatorio entre dos numeros.
     * Entre el minimo y el maximo incluidos
     * @param minimo Número mínimo
     * @param maximo Número máximo
     * @return Número entre minimo y maximo
     */
    public static int generaNumeroAleatorio(int minimo, int maximo){
        
        int num=(int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        return num;
    }
    
    /**
     * Genera un numero aleatorio entre dos numeros reales.
     * Entre el minimo y el maximo incluidos
     * Devuelve un numero con dos decimales.
     * @param minimo Número mínimo
     * @param maximo Número máximo
     * @return Número entre minimo y maximo
     */
    public static double generaNumeroRealAleatorio(double minimo, double maximo){
        
        double num=Math.rint(Math.floor(Math.random()*(minimo-((maximo*100)+1))+((maximo*100)+1)))/100;
        return num;
        
    }
    
}
