package Prog_Tarea09;

import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 *
 * @author José Luis
 * @version 9.1
 */
public abstract class CuentaBancaria extends Persona implements Serializable{
    protected Float saldo;
    protected String CCC;

    /**
     * Constructor sin parámetros
     */
    public CuentaBancaria() {
        super();
    }

    /**
     * Constructor con los campos heredados de Persona mas los propios de saldo y CCC
     * @param saldo
     * @param CCC
     * @param nombre
     * @param apellidos
     * @param fechaNac 
     */
    public CuentaBancaria(Float saldo, String CCC, String nombre, String apellidos, GregorianCalendar fechaNac) {
        super(nombre, apellidos, fechaNac);
        this.saldo = saldo;
        this.CCC = CCC;
    }

    /**
     * Obtenemos el nombre del cliente
     * @return 
     */
    @Override
    public String getNombre(){
        return nombre;
    }
    
    /**
     * Obtenemos los apellidos del cliente
     * @return 
     */
    @Override
    public String getApellidos(){
        return apellidos;
    }
    
    /**
     * Obtenemos la fecha de nacimiento del cliente
     * @return 
     */
    @Override
    public GregorianCalendar getFechaNac(){
        return fechaNac;
    }
    
    /**
     * Asignamos el nombre del cliente
     * @param nombre 
     */
    @Override
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    /**
     * Asignamos los apellidos del cliente
     * @param apellidos 
     */
    @Override
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    
    /**
     * Asignamos la fecha de creación de la cuenta
     * @param fechaNac 
     */
    @Override
    public void setFechaNac(GregorianCalendar fechaNac){
        this.fechaNac=fechaNac;
    }

    /**
     * Obtener el valor actual del saldo
     * @return the saldo
     */
    public Float getSaldo() {
        return saldo;
    }

    /**
     * Asignamos el valor del saldo.
     * @param saldo 
     */
    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtenemos el valor de la cuenta del cliente
     * 
     * @return the CCC
     */
    public String getCCC() {
        return CCC;
    }

    /**
     * Asignamos el valor para la cuenta del cliente
     * 
     * @param CCC el Código de Cuenta Cliente
     */
    public void setCCC(String CCC) {
        this.CCC = CCC;
    }
    
}
