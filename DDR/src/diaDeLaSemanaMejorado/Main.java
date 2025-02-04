package diaDeLaSemanaMejorado;

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
         
        Scanner sn = new Scanner(System.in);
        System.out.println("Escribe un dia de la semana");
        String dia = sn.next();
         
        DiasSemana diaS = DiasSemana.valueOf(dia.toUpperCase());
         
        System.out.println(diaS.toString());
         
    }
     
}