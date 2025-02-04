package ExamenPractico02;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan
 */
public class Alumno implements Serializable{
    private String nombre;
    private String localidad;
    private List<Modulo> modulos;

    public Alumno(String nombre, String localidad) {
        this(nombre,localidad,new ArrayList<Modulo>());
    }
    public Alumno(String nombre, String apellidos, List<Modulo> lista_modulos){
        this.nombre = nombre;
        this.localidad = apellidos;
        this.modulos=lista_modulos;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void añadirModulo(Modulo modulo){
        this.modulos.add(modulo);
    }
    public String [] getNombreModulos(){        
        String[] nombreModulos=new String[this.modulos.size()];
        int i=0;
        for(Modulo m:this.modulos)
            nombreModulos[i++]=m.getNombre();
        return nombreModulos;
    }
    public int getNumeroHoras(){
        int totalHoras=0;
        int i;
        for(Modulo m:this.modulos)
            totalHoras+=m.getHoras();
        return totalHoras;
    }
}

