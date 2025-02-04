package conversionDeNumeros;
import java.util.Scanner;
 
public class convertirDecimalBinario {
 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
 
        System.out.println("\nIndica el numero a convertir a binario (base 2): ");
        int n = sc.nextInt();
        System.out.print("binario (base 2): "+toBinary(n)+"\n");
    }
 
    /**
     * Hace la conversión de base 10 a base 2 (binario)
     *
     * Debemos dividir n por 2 sucesivamente hasta que el resultado es 0, y
     * la representación binaria resultante estará compuesto por los restos de
     * todas las divisiones, desde el último al primero.
     */
    public static long toBinary(int n)
    {
        String b = ""; // binary representation as a string
        while (n != 0) {
            int r = (int)(n % 2); // remainder
            b = r + b; // concatenate remainder
            n /= 2; // reduce n
        }
        return Long.parseLong(b);
    }
}