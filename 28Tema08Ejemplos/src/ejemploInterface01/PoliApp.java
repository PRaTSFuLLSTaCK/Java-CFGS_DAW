package ejemploInterface01;

public class PoliApp {
  /* método que hace uso del polimorfismo con una interfaz
     E: sujeto => variable de la interfaz Parlanchin que contendrá la referencia a  
                  un objeto de una subclase que implementa la interfaz
     S: nada, llama al método habla() de la subclase a la que apunta la variable             
        sujeto */
  public static void hazleHablar(Parlanchin sujeto){
    sujeto.habla();
  }
  
  public static void main(String[] args) {
    Gato gato=new Gato();
    hazleHablar(gato);
    Cucu cucu=new Cucu();
    hazleHablar(cucu);
  }  
}
