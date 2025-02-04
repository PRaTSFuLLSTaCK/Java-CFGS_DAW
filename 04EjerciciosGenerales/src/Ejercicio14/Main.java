package Ejercicio14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double nota, suma = 0, mayor, menor;;
       
        System.out.println("Nota media, mayor y menor de una clase");
        System.out.println("--------------------------------------");

        do {
            System.out.print("Introduce numero de alumnos: ");
            n = sc.nextInt();  //n contiene el número de alumnos
        } while (n <= 0); //repetir mientras que el valor de n sea <= 0

        System.out.print("Nota del alumno 1: ");
        nota = sc.nextDouble(); // leemos la nota del primer alumno
       
        suma = suma + nota; //la sumamos al acumulador
       
        mayor = nota; //la tomamos como nota mayor y menor
        menor = nota;
       
        for (int i = 2; i <= n; i++) {  // leemos el resto de notas desde el alumno 2 hasta el n
            System.out.print("Nota del alumno " + i + ": ");
            nota = sc.nextDouble();
            suma = suma + nota; // la sumamos al acumulador
            if (nota > mayor){  // se compara la nota con la mayor y con la menor actual
                mayor = nota;
            } else if (nota < menor) {
                menor = nota;
            }
        }

        // mostrar resultados
        System.out.printf("Nota media: %.2f %n" , suma/n);
        System.out.println("La mayor nota ha sido un " + mayor);
        System.out.println("La menor nota ha sido un " + menor);
    }
   
}