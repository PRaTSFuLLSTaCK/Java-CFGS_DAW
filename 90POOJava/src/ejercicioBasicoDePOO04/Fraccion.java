package ejercicioBasicoDePOO04;

//Clase Fracción
public class Fraccion {

  private int num;
  private int den;

  public Fraccion() {
      this.num = 0;
      this.den = 1;
  }

  public Fraccion(int num, int den) {
      this.num = num;
      if(den==0){
          den = 1;
      }
      this.den = den;
      simplificar();
  }

  public Fraccion(int num) {
      this.num = num;
      this.den = 1;
  }

  public int getDen() {
      return den;
  }

  public void setDen(int den) {
      this.den = den;
  }

  public int getNum() {
      return num;
  }

  public void setNum(int num) {
      this.num = num;
  }

  //sumar fracciones
  public Fraccion sumar(Fraccion f) {
      Fraccion aux = new Fraccion();
      aux.num = this.num * f.den + this.den * f.num;
      aux.den = this.den * f.den;
      aux.simplificar();  //se simplifica antes de devolverla
      return aux;
  }
 
  //restar fracciones
  public Fraccion restar(Fraccion f) {
      Fraccion aux = new Fraccion();
      aux.num = this.num * f.den - this.den * f.num;
      aux.den = this.den * f.den;
      aux.simplificar();  //se simplifica antes de devolverla
      return aux;
  }
 
  //multiplicar fracciones
  public Fraccion multiplicar(Fraccion f) {
      Fraccion aux = new Fraccion();
      aux.num = this.num * f.num;
      aux.den = this.den * f.den;
      aux.simplificar();  //se simplifica antes de devolverla
      return aux;
  }

  //dividir fracciones
  public Fraccion dividir(Fraccion f) {
      Fraccion aux = new Fraccion();
      aux.num = this.num * f.den;
      aux.den = this.den * f.num;
      aux.simplificar();  //se simplifica antes de devolverla
      return aux;
  }
 
  //Cálculo del máximo común divisor por el algoritmo de Euclides
  private int mcd() {
      int u = Math.abs(num); //valor absoluto del numerador
      int v = Math.abs(den); //valor absoluto del denominador
      if (v == 0) {
          return u;
      }
      int r;
      while (v != 0) {
          r = u % v;
          u = v;
          v = r;
      }
      return u;
  }

  //método para simplificar fracciones
  private void simplificar() {
      int n = mcd(); //se calcula el mcd de la fracción
      num = num / n;
      den = den / n;
  }

  @Override
  public String toString() {
      simplificar();
      return num + "/" + den;
  }    
  
  public static void main(String[] args) {
      // Se crean 4 fracciones
      Fraccion f1 = new Fraccion(1, 4); // Fracción 1/4
      Fraccion f2 = new Fraccion(1, 2); // Fracción 1/2
      Fraccion f3 = new Fraccion(); // Fracción 0/1
      Fraccion f4 = new Fraccion(4); // Fracción 4/1
      // operaciones aritméticas con esas fracciones
      Fraccion suma = f1.sumar(f2);
      Fraccion resta = f1.restar(f3);
      Fraccion producto = f1.multiplicar(f4);
      Fraccion cociente = f1.dividir(f2);
      //mostrar resultados
      System.out.println(f1 + " + " + f2 + " = " + suma);
      System.out.println(f1 + " - " + f3 + " = " + resta);
      System.out.println(f1 + " * " + f4 + " = " + producto);
      System.out.println(f1 + " / " + f2 + " = " + cociente);
}
  
} //Fin de la clase Fraccion

