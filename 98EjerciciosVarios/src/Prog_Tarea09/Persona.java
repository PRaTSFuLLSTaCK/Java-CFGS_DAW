package Prog_Tarea09;

import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 *
 * @author José Luis
 * @version 9.1
 */
public abstract class Persona implements Serializable,Imprimible {
    protected String nombre;
    protected String apellidos;
    protected GregorianCalendar fechaNac;

    /**
     * Constructor sin parámetros
     */
    public Persona() {
    }

    /**
     * Constructor con párametros
     * @param nombre
     * @param apellidos
     * @param fechaNac 
     */
    public Persona(String nombre, String apellidos, GregorianCalendar fechaNac) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
    }

    /**
     * Obtener el nombre del cliente
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asignar nombre al cliente
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtener los apellidos del cliente
     * @return apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Asignar los apellidos del cliente
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Obtener la fecha de nacimiento del cliente
     * @return fechaNac
     */
    public GregorianCalendar getFechaNac() {
        return fechaNac;
    }

    /**
     * Asignar una fecha de nacimiento al cliente
     * @param fechaNac
     */
    public void setFechaNac(GregorianCalendar fechaNac) {
        this.fechaNac = fechaNac;
    }
}

