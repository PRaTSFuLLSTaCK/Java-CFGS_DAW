package ExamenPractico02;

/**
*
* @author jose
 * @param <T>
*/
public class CargarGuardar<T> {

   public boolean guardar(ArrayList<T> lista, File fichero) {
       try {
           ObjectOutputStream ficheroSalida = new ObjectOutputStream(new FileOutputStream(fichero));
           ficheroSalida.writeObject(lista);
           ficheroSalida.flush();
           ficheroSalida.close();
           return true;
       } catch (FileNotFoundException fnfe) {
           return false;
       } catch (IOException ioe) {
           return false;
       }
   }

   public ArrayList<T> cargar(File fichero) {
       ArrayList<T> lista = null;
       try {
           ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream(fichero));
           lista = (ArrayList<T>) ficheroEntrada.readObject();
           ficheroEntrada.close();
           return lista;
       } catch (ClassNotFoundException onfe) {
           return null;
       } catch (FileNotFoundException fnfe) {
           return null;
       } catch (IOException ioe) {
           return null;
       }
   }
}

