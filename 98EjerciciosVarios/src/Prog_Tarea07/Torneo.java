package Prog_Tarea07;

/*Enunciado.
Te han encargado que diseñes e implementes una aplicación llamada GesTenis, que se ocupará de
gestionar el circuito profesional de tenis de la ATP (Asociación de Tenistas Profesionales). El programa debe
ser capaz de crear tenistas y torneos y almacenar el palmarés de cada tenista junto a su puntuación. Por
palmarés entenderemos aquellos torneos que un tenista ha ganado, y su puntuación irá en función del tipo
de torneo ganado. Así, la Tabla 1 muestra la relación entre los diferentes tipos de torneos a tener en cuenta
y su puntuación:
TIPO DE TORNEO PUNTUACIÓN
Grand Slam 2000
ATP World Tour Masters 1000 1000
ATP World Tour 500 500
ATP World Tour 250 250
Tabla 1: Tipo de torneos y puntuación
Para el desarrollo de la aplicación, vamos a considerar tres partes diferenciadas: el diseño e implementación
de las clases Tenista y Torneo, el diseño de la interfaz gráfica de la aplicación y la implementación de
las funciones que debe realizar la aplicación.*/

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author José Luis Comesaña
 * @version 7.0
 */
public class Torneo implements Serializable {
    public static String GRAND_SLAM = "Grand Slam";
    public static String MASTER1000 = "ATP World Tour Master 1000";
    public static String MASTER500 = "ATP World Tour 500";
    public static String MASTER250 = "ATP World Tour 250";
    
    private String nombre;
    private int puntuacion;
    
    Torneo (String nombre,int puntuacion){
        this.nombre=nombre;
        this.puntuacion=puntuacion;
    }

    /**
     * Devuelve el nombre del torneo
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asignamos un nombre de torneo
     * @param <code>nombre</code> del torneo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la puntuación asignada al torneo
     * @return
     */
    public int getPuntuacion() {
        return puntuacion;
    }

    /**
     * Introducimos la puntuación asignada para el torneo
     * @param
     */
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    /**
     * Carga los datos del <code>fichero</code> en el ArrayList <code>lista</code>
     * y devuelve <code>true</code> si todo ha ido bien o <code>false</code> si ha fallado algo
     * @param <code>fichero</code>
     * @return
     */
    public static ArrayList<Torneo> cargar(File fichero){
        ArrayList<Torneo> lista = null;
        try{
            ObjectInputStream ficheroEntrada = new ObjectInputStream(new FileInputStream(fichero));
            lista = (ArrayList<Torneo>) ficheroEntrada.readObject();
            ficheroEntrada.close();
            return lista;
        }catch(ClassNotFoundException cnfe){
            return null;
        }catch(FileNotFoundException fnfe){
            return null;
        }catch (IOException ioe){
            return null;
        }
    }
    /**
     * Guarda los datos del ArrayList <code>lista</code> en el fichero <code>fichero</code>
     * Si todo ha ido bien devuelve <code>true</code> y en caso contrario <code>false</code> 
     * @param <code>lista</code>
     * @param <code>fichero</code>
     * @return
     */
    public static boolean guardar(ArrayList<Torneo> lista,File fichero){
        try{
            ObjectOutputStream ficheroSalida = new ObjectOutputStream(new FileOutputStream (fichero));
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
