package Funciones;


import static matematicas.Varias.esCapicua;

public class S08Ejercicio38 {

  public static void main(String[] args) {
    int[] numeros = Array.generaArrayInt(20, 1, 1000);

    System.out.println("Array original: ");
    Array.muestraArrayInt(numeros);
    System.out.println("Capicúas: ");
    Array.muestraArrayInt(filtraCapicuas(numeros));
  }

  public static int[] filtraCapicuas(int x[]) {
    int[] capicuas = new int[x.length];
    
    int cuentaCapicuas = 0;
    for (int numero : x) {
      if (esCapicua(numero)) {
        capicuas[cuentaCapicuas++] = numero;
      }
    }
    
    int[] resultado = new int[cuentaCapicuas];
    
    for (int i = 0; i < cuentaCapicuas; i++) {
      resultado[i] = capicuas[i];
    }
   
    return resultado;
  }
  
}
