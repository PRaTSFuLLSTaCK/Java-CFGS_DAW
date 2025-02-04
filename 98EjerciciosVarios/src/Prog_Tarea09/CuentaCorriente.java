package Prog_Tarea09;

import java.util.GregorianCalendar;

/**
 *
 * @author José Luis
 * @version 9.1
 */
public abstract class CuentaCorriente extends CuentaBancaria{
    private Entidades entidad;

    /**
     * Constructor sin parámetros
     */
    public CuentaCorriente() {
        super();
    }

    /**
     * Constructor con los campos heredados mas el propio de entidad
     *
     * @param entidad
     * @param saldo
     * @param CCC
     * @param nombre
     * @param apellidos
     * @param fechaNac
     */
    public CuentaCorriente(Entidades entidad, Float saldo, String CCC, String nombre, String apellidos, GregorianCalendar fechaNac) {
        super(saldo, CCC, nombre, apellidos, fechaNac);
        this.entidad = entidad;
    }

    /**
     * Obtener las entidades autorizadas de las cuentas corrientes
     *
     * @return the entidad
     */
    public Entidades getEntidad() {
        return entidad;
    }

    /**
     * Asignar los datos de las entidades autorizadas a las cuentas corrientes
     * 
     * @param entidad the entidad to set
     */
    public void setEntidad(Entidades entidad) {
        this.entidad = entidad;
    }
    
//    @Override
//    public String toString(){
//        return "[Saldo] {"+this.getSaldo()+"} "+
//                "[numCuenta] {"+this.getCCC()+"} "+
//                "[tipoCuenta] {"+1+"} "+
//                "[Nombre] {"+this.getNombre()+"} "+
//                "[Apellidos] {"+this.getApellidos()+"} "+
//                "[fecNacim] {"+this.getFechaNac().get(5) + "-"
//                              +this.getFechaNac().get(2) + 1 + "-"
//                              +this.getFechaNac().get(1) + "}";
//    }
}

