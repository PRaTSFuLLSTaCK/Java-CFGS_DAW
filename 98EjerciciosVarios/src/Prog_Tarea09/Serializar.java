package Prog_Tarea09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author José Luis
 * @version 9.1
 */
public class Serializar {
    private ObjectOutputStream graba;
    private ObjectInputStream lee;

    /**
     * Método que grabara un ArrayList en un fichero (pasados por parámetro)
     * 
     * @param arreglo
     * @param fichero 
     */
    public void grabaObjeto(ArrayList arreglo, String fichero){
        try {
            File file = new File(fichero);
            graba = new ObjectOutputStream(new FileOutputStream(file));
            graba.writeObject(arreglo);
        } catch (FileNotFoundException fnfe){
            Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, fnfe);
        } catch (IOException ex) {
            Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                graba.close();
            } catch (IOException ex) {
                Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    /**
     * Creamos un objeto a partir de los datos leidos desde un fichero
     * @param archivo
     * @return 
     */
    public Object leeObjeto(String archivo){
        Object retorno=null;
        try {
            lee = new ObjectInputStream(new FileInputStream(archivo));
            retorno = lee.readObject();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                lee.close();
            } catch (IOException ex) {
                Logger.getLogger(Serializar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return retorno;
    }
}
