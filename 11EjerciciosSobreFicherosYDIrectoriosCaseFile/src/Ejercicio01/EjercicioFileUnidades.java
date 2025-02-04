package Ejercicio01;


//Ejemplo de utilización de la clase File para obtener información sobre las unidades del sistema
import java.io.File;
public class EjercicioFileUnidades {
  public static void main(String[] args) {
      File [] unidades = File.listRoots();
      System.out.printf("   %20s %20s %n" , "Tamaño Total", "Tamaño disponible");
      for(File f : unidades){
          System.out.print(f);
          System.out.printf("%20s %20s %n", f.getTotalSpace(), f.getFreeSpace());
      }
  }
}