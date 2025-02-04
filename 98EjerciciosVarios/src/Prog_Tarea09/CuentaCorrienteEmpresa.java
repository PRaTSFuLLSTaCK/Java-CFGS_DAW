package Prog_Tarea09;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Hashtable;

/**
 *
 * @author José Luis
 * @version 9.1
 */
public class CuentaCorrienteEmpresa extends CuentaCorriente {
    private Float descubierto;
    private Double interes;
    private Double comision;

    /**
     * Constructor sin parámetros
     */
    public CuentaCorrienteEmpresa() {
        super();
    }

    /**
     * Constructor con los parámetros heredados mas los propios de descubierto, interes e identidad
     *
     * @param descubierto
     * @param interes
     * @param comision
     * @param entidad
     * @param saldo
     * @param CCC
     * @param nombre
     * @param apellidos
     * @param fechaNac
     */
    public CuentaCorrienteEmpresa(Float descubierto, Double interes, Double comision, Entidades entidad, Float saldo, String CCC, String nombre, String apellidos, GregorianCalendar fechaNac) {
        super(entidad, saldo, CCC, nombre, apellidos, fechaNac);
        this.descubierto = descubierto;
        this.interes = interes;
        this.comision = comision;
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
     * Obtener la cantidad de descubierto en la cuenta corriente de empresa
     *
     * @return descubierto
     */
    public Float getDescubierto() {
        return descubierto;
    }

    /**
     * Asignar la cantidad de descubierto a la cuenta corriente de empresa
     *
     * @param descubierto 
     */
    public void setDescubierto(Float descubierto) {
        this.descubierto = descubierto;
    }

    /**
     * Obtener el porcentaje de interés por la utilización del descubierto
     *
     * @return interes
     */
    public Double getInteres() {
        return interes;
    }

    /**
     * Asignar un interés por hacer uso del descubierto
     *
     * @param interes
     */
    public void setInteres(Double interes) {
        this.interes = interes;
    }

    /**
     * Obtener cuánto nos cobrarán de comisión por el descubierto
     *
     * @return comision
     */
    public Double getComision() {
        return comision;
    }

    /**
     * Asignar la comisión por utilizar un descubierto
     *
     * @param comision
     */
    public void setComision(Double comision) {
        this.comision = comision;
    }
    
}

