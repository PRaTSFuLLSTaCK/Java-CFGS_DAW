package Prog_Tarea07;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author José Luis Comesaña
 * @version 7.0
 */
public class Tenista implements Serializable {
    private String nombre;
    private int edad;
    private ArrayList<Torneo> palmares;
    
    Tenista(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
        palmares=new ArrayList<Torneo>();
    }

    /**
     * Obtenemos el nombre del tenista
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asignamos el nombre del tenista
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Nos devuelve la edad del tenista
     * @return la edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Asigna la edad del tenista
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Devuelve el palmarés con los nombres de los torneos ganados
     * @return
     */
    public String[] getPalmares(){
        String[] p = new String[palmares.size()];
        for(int i=0;i<p.length;i++){
            p[i] = palmares.get(i).getNombre();
        }
        return p;
    }
    /**
     * Añade el torneo ganado al palmarés
     * @param torneo
     */
    public void añadirPalmares(Torneo torneo){
        palmares.add(torneo);
    }
    /**
     * Recorre un bucle acumulando la puntuación obtenida
     * @return
     */
    public int getPuntuacionATP(){
        int puntuacion =0;
        for(Torneo t:palmares){
            puntuacion += t.getPuntuacion();
        }
        return puntuacion;
    }
    /**
     * Carga en <code>fichero</code> el archivo seleccionado e introduce
     * sus datos en el ArrayList <code>Tenista</code> y devuelve <code>lista</code>
     * @param fichero
     * @return
     */
    public static ArrayList<Tenista> cargar(File fichero){
        ArrayList<Tenista> lista = null;
        try{
            ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream(fichero));
            lista = (ArrayList<Tenista>) ficheroEntrada.readObject();
            ficheroEntrada.close();
            return lista;
        }catch(ClassNotFoundException onfe){
            return null;
        }catch(FileNotFoundException fnfe){
            return null;
        }catch(IOException ioe){
            return null;
        }
    }
    /**
     * Graba en <code>fichero</code> los datos del ArrayList <code>lista</code>
     * devolviendo <code>true</code> si ha sido todo correcto o <code>false</code> en caso contrario
     * @param lista
     * @param fichero
     * @return
     */
    public static boolean guardar(ArrayList<Tenista> lista, File fichero){
        try{
            ObjectOutputStream ficheroSalida = new ObjectOutputStream(new FileOutputStream(fichero));
            ficheroSalida.writeObject(lista);
            ficheroSalida.flush();
            ficheroSalida.close();
            return true;
        }catch(FileNotFoundException fnfe){
            return false;
        }catch(IOException ioe){
            return false;
        }
    }
}

