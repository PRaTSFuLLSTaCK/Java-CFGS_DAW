package ejercicioBasicoDePOO10;

//Clase Tecnico. Clase derivada de la clase Operario
public class Tecnico extends Operario{

  public Tecnico() {
  }

  public Tecnico(String nombre) {
      super(nombre);
      System.out.println("Constructor de Tecnico");
  }
 
  @Override
  public String toString() {
      return super.toString() + " -> Tecnico";
  }
}