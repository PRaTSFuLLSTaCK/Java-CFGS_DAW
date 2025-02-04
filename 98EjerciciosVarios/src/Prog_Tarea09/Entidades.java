package Prog_Tarea09;

import java.io.Serializable;
import java.util.Hashtable;

/**
 *
 * @author José Luis
 * @version 9.1
 */
public class Entidades implements Serializable{
    private Hashtable entidades;

    /**
     * Constructor sin parámetros
     */
    public Entidades() {
    }
    
    /**
     * Constructor con parámetro
     * @param entidades 
     */
    public Entidades(Hashtable entidades) {
        this.entidades = entidades;
    }

    /**
     * Obtener los datos de las entidades autorizadas
     * @return the entidades
     */
    public Hashtable getEntidades() {
        return entidades;
    }

    /**
     * Asignar los datos de las entidades autorizadas
     * @param entidades the entidades to set
     */
    public void setEntidades(Hashtable entidades) {
        this.entidades = entidades;
    }
    
}

