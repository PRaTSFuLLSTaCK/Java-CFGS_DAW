package Prog_Tarea09;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Hashtable;

/**
 *
 * @author José Luis
 * @version 9.1
 */
public class CuentaAhorro extends CuentaBancaria implements Serializable{
    private Float interes;

    /**
     * Constructor con los parámetros heredados y el propio
     *
     * @param interes
     * @param saldo
     * @param CCC
     * @param nombre
     * @param apellidos
     * @param fechaNac
     */
    public CuentaAhorro(Float interes, Float saldo, String CCC, String nombre, String apellidos, GregorianCalendar fechaNac) {
        super(saldo, CCC, nombre, apellidos, fechaNac);
        this.interes = interes;
    }

    /**
     * Constructor sin parámetros
     */
    public CuentaAhorro() {
        super();
    }
    
    @Override
    public ArrayList ContenidoArrayList() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Hashtable ContenidoHashtable() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Obtener los intereses almacenados en la cuenta
     *
     * @return the interes
     */
    public Float getInteres() {
        return interes;
    }

    /**
     * Asignar un valor a los intereses de la cuenta
     * @param interes the interes to set
     */
    public void setInteres(Float interes) {
        this.interes = interes;
    }
    
//    @Override
//    public String toString(){
//        return "[Interes] {"+this.getInteres()+"} "+
//                "[Saldo] {"+this.getSaldo()+"} "+
//                "[numCuenta] {"+this.getCCC()+"} "+
//                "[tipoCuenta] {"+1+"} "+
//                "[Nombre] {"+this.getNombre()+"} "+
//                "[Apellidos] {"+this.getApellidos()+"} "+
//                "[fecNacim] {"+this.getFechaNac().get(5) + "-"
//                              +this.getFechaNac().get(2) + "-"
//                              +this.getFechaNac().get(1) + "}";
//    }
    
}

