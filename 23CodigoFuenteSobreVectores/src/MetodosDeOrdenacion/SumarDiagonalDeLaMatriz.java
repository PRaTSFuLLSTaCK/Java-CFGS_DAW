package MetodosDeOrdenacion;

import java.util.Scanner;

public class SumarDiagonalDeLaMatriz {

    //fondo verde para la consola
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    
    //fondo azul para la consola
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    
    //color azul para las letras de consola
    public static final String ANSI_BLUE = "\u001B[34m";
    
    //color blanco para las letras de consola
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static void main(String[] args) {
        
        Scanner en = new Scanner (System.in);
        byte dim = 3; // DIMENSION DE LA MATRIZ
        int aux = 0; 
        int matriz[][] = new int [dim][dim];
        System.out.println(ANSI_GREEN_BACKGROUND+"SUMA DE LA DIAGONAL DE UNA MATRIZ CUADRADA");
        System.out.println("INGRESE LOS VALORES DE LA MATRIZ");
        for(int i=0 ; i<matriz.length ; i++)
        {
            for(int j=0; j<matriz.length; j++)
            {
                System.out.print("matriz["+i+"]"+"["+j+"] = ");
                matriz[i][j]=en.nextInt();
            }
        }
        
        for(int k=0 ; k<matriz.length ; k++)
        {
            for(int l=0; l<matriz.length; l++)
            {
                if (k==l) 
                {
                    aux = aux + matriz[k][l];
                    System.out.print( ANSI_BLUE_BACKGROUND + ANSI_WHITE + matriz[k][l] + "\t");
                }
                else System.out.print( ANSI_GREEN_BACKGROUND + ANSI_BLUE + matriz[k][l] + "\t");
            }
            System.out.println();
        }
        System.out.println("LA SUMA DE LA DIAGONAL DE LA MATRIZ ES : "+aux);
        
    }
    
}