package Prog_Tarea02;

/*4.- Realiza las siguientes modificaciones en el programa anterior:
1. Añade comentarios, entre otros:
• Nombre de clase, descripción y autor
• Comentario para la clase main y para cada una de las llaves de cierre
2. Utiliza el operador de asignación para inicializar las variables a los valores que se indican
en los mensajes.
3. Utiliza la secuencia de escape correspondiente para generar un tabulador al principio de
cada línea salvo de la primera
4. Mostrar el siguiente resultado:
• Usando sólo la orden println:
----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----
El valor de la variable casado es true
El valor de la variable MAXIMO es 999999
El valor de la variable diasem es 1
El valor de la variable diaanual es 300
El valor de la variable miliseg es 1298332800000
El valor de la variable totalfactura es 10350.678
El valor de la variable poblacion es 6775235741
El valor de la variable sexo es M
• Usando sólo la orden printf:
----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----
El valor de la variable casado es true
El valor de la variable MAXIMO es 999999
El valor de la variable diasem es 1
El valor de la variable diaanual es 300
El valor de la variable miliseg es 1298332800000
El valor de la variable totalfactura es 10350,677734
El valor de la variable totalfactura en notación científica es 1.035068E+04
El valor de la variable poblacion es 6775235741
El valor de la variable sexo es M
*/
/**
*
* @author José Luis
* @class variables
* @description Uso de variables en Java
*/
public class Ejercicio04 { // clase que habrá de ser del mismo nombre que el fichero java
   //public enum Sexo{H,M};
   public static void main(String args[]){ // Comienza la clase principal
       boolean casado;
       final long MAXIMO;
       byte diasem;
       short diaanual;
       long miliseg;
       float totalfactura;
       long poblacion;
       char sexo1;
   //    variables.Sexo sexo;
       casado = true;
       MAXIMO = 999999;
       diasem = 1;
       diaanual = 300;
       miliseg = System.currentTimeMillis();
       totalfactura = 10350.677734F;
       poblacion = 6775235741L;
   //    sexo = Sexo.M;
       sexo1 = 'M';
       // Usando la orden println
       System.out.println("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
       System.out.println("El valor de la variable casado es "+casado);
       System.out.println("El valor de la variable MAXIMO es "+MAXIMO);
       System.out.println("El valor de la variable diasem es "+diasem);
       System.out.println("El valor de la variable diaanual es "+diaanual);
       System.out.println("El valor de la variable miliseg es "+miliseg);
       System.out.println("El valor de la variable totalfactura es "+totalfactura);
       System.out.println("El valor de la variable población es "+ poblacion);
       System.out.println("El valor de la variable sexo es "+ sexo1);
       // Usando la orden printf
       System.out.printf("----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----");
       System.out.printf("\nEl valor de la variable casado es "+casado);
       System.out.printf("\nEl valor de la variable MAXIMO es "+MAXIMO);
       System.out.printf("\nEl valor de la variable diasem es "+diasem);
       System.out.printf("\nEl valor de la variable diaanual es "+diaanual);
       System.out.printf("\nEl valor de la variable miliseg es "+miliseg);
       System.out.printf("\nEl valor de la variable totalfactura es %.6f",totalfactura);
       System.out.printf("\nEl valor de la variable totalfactura en notación científica es %E",totalfactura);
       System.out.printf("\nEl valor de la variable población es "+ poblacion);
       System.out.printf("\nEl valor de la variable sexo es "+ sexo1+"\n");
       
   } // Cierre de main
   
} // Cierre de la clase

