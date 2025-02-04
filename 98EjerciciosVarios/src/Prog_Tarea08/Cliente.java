package Prog_Tarea08;

import java.util.ArrayList;

/**
 *
 * @author José Luis
 */
public class Cliente {
    private String idCliente;
    private String nombre;
    private String apellidos;
    private ArrayList<Telefonos> telefono;
    private ArrayList<Emails> email;
    
    Cliente(){}
    Cliente(String idCliente,String nombre,String apellidos,ArrayList<Telefonos> telefono,ArrayList<Emails> email){
      this.idCliente=idCliente;
      this.nombre=nombre;
      this.apellidos=apellidos;
      this.telefono=telefono;
      this.email=email;
    }

  /**
   * @return the idCliente
   */
  public String getIdCliente() {
    return idCliente;
  }

  /**
   * @return the nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * @return the apellidos
   */
  public String getApellidos() {
    return apellidos;
  }

  /**
   * @return the telefono
   */
  public ArrayList<Telefonos> getTelefono() {
    return telefono;
  }

  /**
   * @return the email
   */
  public ArrayList<Emails> getEmail() {
    return email;
  }

  /**
   * @param idCliente the idCliente to set
   */
  public void setIdCliente(String idCliente) {
    this.idCliente = idCliente;
  }

  /**
   * @param nombre the nombre to set
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * @param apellidos the apellidos to set
   */
  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  /**
   * @param telefono the telefono to set
   */
  public void setTelefono(ArrayList<Telefonos> telefono) {
    this.telefono = telefono;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(ArrayList<Emails> email) {
    this.email = email;
  }
}

