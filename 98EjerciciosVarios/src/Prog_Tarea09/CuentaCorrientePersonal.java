package Prog_Tarea09;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Hashtable;

/**
 *
 * @author José Luis
 * @version 9.1
 */
public class CuentaCorrientePersonal extends CuentaCorriente {
    private Float mantenimiento;

    /**
     * Constructor sin parámetros
     */
    public CuentaCorrientePersonal() {
        super();
    }

    /**
     * Constructor con los parámetros heredados mas el propio de mantenimiento
     *
     * @param mantenimiento
     * @param entidad
     * @param saldo
     * @param CCC
     * @param nombre
     * @param apellidos
     * @param fechaNac
     */
    public CuentaCorrientePersonal(Float mantenimiento, Entidades entidad, Float saldo, String CCC, String nombre, String apellidos, GregorianCalendar fechaNac) {
        super(entidad, saldo, CCC, nombre, apellidos, fechaNac);
        this.mantenimiento = mantenimiento;
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
     * Obtener la cantidad cobrada por mantenimiento de la cuenta corriente personal
     *
     * @return mantenimiento
     */
    public Float getMantenimiento() {
        return mantenimiento;
    }

    /**
     * Asignar una cantidad a cobrar por el mantenimiento de la cuenta corriente personal
     *
     * @param mantenimiento
     */
    public void setMantenimiento(Float mantenimiento) {
        this.mantenimiento = mantenimiento;
    }
    
}

