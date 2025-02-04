package ejercicioBasicoDePOO10;

/*
 * 
 * 
 * 
 * La clase base es la clase Empleado. Esta clase contiene:
Un atributo privado nombre de tipo String que heredan el resto de clases. 
Un constructor por defecto.
Un constructor con parámetros que inicializa el nombre con el String que recibe.
Método set y get para el atributo nombre.
Un método toString() que devuelve el String: "Empleado " + nombre.
 */

//Clase Empleado. Clase Base de la jerarquía
public class Empleado {
  private String nombre;

  //constructor por defecto
  public Empleado() {
  }

  //constructor con un parámetro
  public Empleado(String nombre) {
      this.nombre = nombre;
      System.out.println("Constructor de Empleado " + nombre);
  }
 
  //métodos get y set
  public String getNombre() {
      return nombre;
  }
  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  //método toString()
  //devuelve un String formado por la palabra “Empleado” y el nombre de empleado
  @Override
  public String toString() {
      return "Empleado " + nombre;
  }
}