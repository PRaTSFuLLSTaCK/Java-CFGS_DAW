package superMercado;

/**
 * @author DiscoDurodeRoer
 */
public class SupermercadoApp {

    public static void main(String[] args) {
        
        //Creamos la lista de productos
        ListaEnlazada<Producto> productos=new ListaEnlazada<>();
        
        //Generamos los productos
        generarProductos(productos);
        
        //Declaramos variables que necesitaremos
        String ticket="************Cantidad***Precio***Total\n";
        double precioTotal=0;
        Producto productoActual;
        
        //Recorremos la lista
        for(int i=0;!productos.estaVacia();i++){
            
            productoActual=productos.devolverYBorrarPrimero();
            precioTotal+=productoActual.precioFinal();
            ticket+="Producto"+(i+1)+"\t"+productoActual.getCantidad()+
                    "\t"+productoActual.getPrecio()+
                    "\t"+productoActual.precioFinal()+"\n";
            
        }
        
        ticket+="Precio final\t\t\t"+precioTotal;
        
        System.out.println(ticket);
        
    }
    
     /**
     * Genera productos que se almacenan en la lista
     * @param lista
     */
    public static void generarProductos(ListaEnlazada<Producto> lista){
        
       int numeroPersonas=generaNumeroAleatorio(1,8);
       
       int cantidad;
       double precio;
       
       for(int i=0;i<numeroPersonas;i++){
           cantidad=generaNumeroAleatorio(1,10);;
           precio=generaNumeroRealAleatorio(0.05, 50);
           lista.insertarUltimo(new Producto(cantidad, precio));
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
