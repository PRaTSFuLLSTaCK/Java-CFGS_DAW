package StringStringBuffer;


public class StringFrenteStringBuffer {
    
     public static void main(String[] args) {

       /*El presente ejemplo pretende poner de manifiesto que los objetos de la clase String son inmutables, es decir,
         *que modificar un objeto de la clase String supone realmente construir un nuevo objeto y actualizar la referencia, 
         *haciendo que apunte al nuevo objeto, mientras que los objetos StringBuffer pueden ser modificados directamente, al
         *disponer de un  espacio adicional de almacenamiento que puede usarse para realizar esas modificaciones. 
         *        
         *Si igualamos dos objetos, ten en cuenta que lo que realmente se están igualando son sus referencias, es decir, que 
         *si a una variable por referencia le asignamos otra, lo que estamos haciendo es almacenando en ambas la misma dirección 
         *de memoria, o lo que es lo mismo, estamos haciendo que ambas apunten al mismo objeto. 
         */
         
        /*Inicializamos la variable frase, de tipo String*/
        
        String frase= "Java es un lenguaje novedoso"; 
        String frase2=frase; //realmente estoy haciendo que la referencia frase2 apunte al mismo objeto String que la referencia frase
        System.out.println("La longitud de frase es: "+frase.length());
        System.out.println("La longitud de frase2 e: "+frase2.length());
        
        /*Inicializamos la variable texto, de tipo StringBuffer,  con el mismo valor que le dimos inicialemente a frase. Nótese que 
         *aunque la longitud de ambas cadenas coincide, el espacio de almacenamiento reservado para texto, que es de tipo StringBuffer,
         * es mayor. Ese espacio extra es el que permitirá hacer modificaciones sin tener que crear un nuevo objeto. */
       
        StringBuffer texto = new StringBuffer("Java es un lenguaje novedoso");
        StringBuffer texto2 = texto; // texto2 también es una referencia que apunta al mismo objeto de tipo StringBuffer
        System.out.println("La longitud de texto es: "+texto.length());
        System.out.println("El espacio reservado para la variable texto en memoria permite almacenar "+texto.capacity()+" caracteres");
        
        /*Escribimos el valor de ambas variables de tipo String y StringBuffer respectivamente, antes de ser modificadas */

        System.out.println("frase= "+frase); 
        System.out.println("texto= "+texto);
        
        /*Modificamos ambas variables añadiéndoles el mismo texto. Como el texto que hemos añadido a texto excede la capacidad o espacio libre
         *reservado, ese espacio se aumenta.
         */

        frase=frase+" y fácil de aprender.";
        System.out.println("La nueva longitud para frase tras las modificaciones es: "+frase.length());
        
        texto=texto.append(" y fácil de aprender.");
        System.out.println("La nueva longitud de texto tras las modificaciones es: "+texto.length());
        System.out.println("El nuevo espacio reservado para texto tras las modificaciones es: " + texto.capacity());
        
        /*Escribimos el valor de ambas referencias de tipo String, y comprobamos que sus valores son diferentes
         *debido a que para modificar el String hemos creado un nuevo objeto modificado, y hemos actualizado la referencia. 
         *frase apunta al nuevo objeto, mientras que frase2 sigue apuntando al antiguo. 
         */

        System.out.println("frase = "+frase);
        System.out.println("frase2 = "+frase2);
        
        /*Escribimos el valor de ambas referencias de tipo StringBuffer, y comprobamos que ambas siguen teniendo el mismo valor
         *debido a que las modificaciones se hacen sobre el mismo objeto, sin crear otro nuevo. Como ambas referencias siguen 
         *apuntando al mismo objeto, las modificaciones efectuadas a través de texto son visibles a través de texto2. 
         */

        System.out.println("texto = "+texto);
        System.out.println("texto2= "+texto2);
        
    }
    
}
