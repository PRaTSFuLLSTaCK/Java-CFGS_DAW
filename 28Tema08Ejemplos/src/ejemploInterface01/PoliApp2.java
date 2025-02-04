package ejemploInterface01;

public class PoliApp2 {
  /* método que hace uso del polimorfismo con una interfaz
     E: sujeto => variable de la interfaz Parlanchin que contendrá la referencia a  
                  un objeto de una subclase que implementa la interfaz
     S: nada, llama al método habla() de la subclase a la que apunta la variable             
        sujeto */
  public static void hazleHablar(Parlanchin sujeto){
    sujeto.habla();
  }
  
  public static void main(String[] args) {
		// llamadas al método polimórfico hazlehablar()  
    Gato gato = new Gato();
    hazleHablar (gato);
    Cucu cucu = new Cucu();
    hazleHablar (cucu);
    Perro perro = new Perro();
    hazleHablar (perro);
    
    // creación de un vector de 3 variables del interfaz Parlanchin
    Parlanchin v[] = new Parlanchin [3]; 
    
    // dar valores al vector, para que apunte cada variable de la interfaz a un objeto que la implementa
    v[0] = gato;
    v[1] = cucu; 
    v[2] = perro;
    
    System.out.println ("\n Llamadas al método hazleHablar desde el vector v: \n");
    
    // procesar de forma polimórfica el vector v con el for mejorado
    for (Parlanchin hablador : v) {
    	hazleHablar (hablador);    
    	// en caso de ser el reloj de cucu atrasar una hora
    	if (hablador instanceof Cucu) {
    		// conversión descendente para poder llamar a un método que no está en el interface
    		Cucu reloj_cuco = (Cucu) hablador;
    		reloj_cuco.atrasar_hora();
    	}  
    }
        
  }  
}
