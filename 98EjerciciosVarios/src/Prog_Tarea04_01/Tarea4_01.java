package Prog_Tarea04_01;

/*Esta cuarta unidad se ha centrado en el estudio de las estructuras de control de flujo que Java pone
a disposición del programador/a. Posteriormente, la unidad se ha enfocado hacia el ámbito de las
excepciones en el código fuente. Se tratan cuestiones sobre cómo capturar dichas excepciones, su
manejo y posible delegación.
En la misma línea, se ha continuado más tarde con la prueba de programas, detallando los tipos de
pruebas a que pueden someterse y cerrando esta parte con la estandarización de las pruebas que
puede realizarse a través del FrameWork JUnit.
A continuación se ha visto la importancia de la depuración de programas para la detección y
corrección de errores y para finalizar la unidad se ha atendiendo a una cuestión tan importante
como es la documentación del código y el uso de herramientas estandarizadas para ello.
Para la realización de esta tarea se han propuesto 3 ejercicios en los que deberéis de utilizar las
distintas estructuras de control vistas en la unidad. Además se deberá tratar los posibles errores que
se puedan producir en la entrada de datos.
Ejercicio 1
Escribe un programa que lea una secuencia de notas que se van introduciendo por el teclado (las
notas serán valores numéricos que pueden contener decimales). La secuencia de notas finalizará
cuando se introduzca un valor negativo. El programa informará al final del número de aprobados,
el número de suspensos y la nota media. El programa deberá controlar los posibles errores que se
puedan producir a la hora de introducir las notas por teclado de tal forma que si alguna nota
introducida fuera errónea la vuelva a solicitar.*/

import java.io.*;
/**
 *
 * @author José Luis
 * @version 4.1
 */
public class Tarea4_01 {
    public static void main(String[] args) {
        float calificacion=0,media=0;
        int aprobados=0,suspensos=0,alumnos=0;
        String dato;
        
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        do{
            calificacion=100;
            try{
                while(calificacion>=0){
                    System.out.print("Introduzca una calificación entre 0 y 10: ");
                    dato = teclado.readLine();
                    calificacion = Float.parseFloat(dato);
                    while(calificacion>10) {
                        System.err.println("Sólo calificaciones válidas (un número negativo para finalizar)");
                        System.out.print("Introduzca una calificación entre 0 y 10: ");
                        dato = teclado.readLine();
                        calificacion = Float.parseFloat(dato);
                    }   
                    if(calificacion>=0) {
                        if(aprobado(calificacion)){
                            aprobados++;
                        }else{
                            suspensos++;
                        }
                        alumnos++;
                        media+=calificacion;
                    }
                }
            }catch(IOException e){
                System.err.println("Error al leer del teclado.");
                
            }catch(NumberFormatException e){
                System.err.println("Debe introducir una calificación entre 0 y 10.");
                
            }finally{
                //intentos++;
            }
        }while (calificacion >= 0);
        media=media/alumnos;
        System.out.println("El número de alumnos es: " + alumnos);
        System.out.printf("La media alcanzada ha sido de: %.2f\n ",media);
    }
    public static boolean aprobado(float num){
        if(num>=5){
            return true;
        }else{
            return false;
        }
    }
}
