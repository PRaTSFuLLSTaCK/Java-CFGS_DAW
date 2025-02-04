package ExamenPractico01;

/*Implemente una función que sirva para cifrar un texto con el conocido método de César. 
 * El criptosistema consiste en el desplazamiento de 3 caracteres en la posición del 
 * carácter a cifrar, es decir, la A se sustituye por la D, la B por la E, …, 
 * la X por la A, la Y por la B y la Z por la C. Por simplicidad, supondremos que 
 * el texto a cifrar solo contiene caracteres alfabéticos. Por tanto el ejercicio 
 * consiste en implementar la siguiente función:
public String cifradoCesar(String cadenaACifrar)
La función recibe como parámetro la cadena a cifrar y devuelve un objeto String 
con la cadena cifrada mediante el sistema de Cesar.*/

public class Ejercicio5 {
	public static String cifradoCesar(String cadenaACifrar){
		String abc="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		int pos_c;
		String cadena_cifrada="";
		for(int i=0;i<cadenaACifrar.length();++i){
		//obtenemos la posición del caracter a cifrar en el abcedario
		pos_c=abc.indexOf(cadenaACifrar.charAt(i));
		//obtenemos el caracter tres posiciones avanzado, cuidando el extremo
		cadena_cifrada+=abc.charAt((pos_c+3)%abc.length());
	}
	return cadena_cifrada;
	}
	public static void main(String [] args){
		String abc="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		System.out.println("Cifrado Cesar: "+cifradoCesar(abc));
	}
}