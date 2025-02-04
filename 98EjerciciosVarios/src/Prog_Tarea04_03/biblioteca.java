package Prog_Tarea04_03;

/**
*
* @author José Luis
* @version 4.3
*/

public class biblioteca {
   private String titulo;
   private String autor;
   private String isbn;
   
   /**
    * Constructor vacío que no admite parámetros e inicializa sus valores a ""
    */
   public void Libro(){
       titulo="";
       autor="";
       isbn="";
   }
   /**
    * Constructor al que le hemos de pasar los tres parámetros:
    * 
    * @param titulo String que contedrá el título del libro
    * @param autor String que contiene el autor del libro
    * @param isbn String que recogerá el isbn del libro comprobando la validez del mismo
    * @exception IllegalArgumentException Lanza esta excepción en caso de introducir un número de isbn no valido
    * 
    */
   public void Libro(String titulo, String autor, String isbn){
       this.titulo=titulo;
       this.autor=autor;
       if (compruebaIsbn10(isbn)||compruebaIsbn13(isbn)){
           this.isbn=isbn;
       }else{
           throw new IllegalArgumentException("isbn no válido");
       }
   }
   
   /**
    * Método usado para la consulta del titulo del libro
    * 
    * @return <code><b>titulo</b></code> Devuelve el <code>String</code> del título del libro
    */
   public String consulta_titulo(){
       return titulo;
   }
   /**
    * Método usado para la consulta del autor del libro
    * 
    * @return <code><b>autor</b></code> Devuelve el <code>String</code> del autor del libro
    */
   public String consulta_autor(){
       return autor;
   }
   /**
    * Método usado para la consulta del ISBN del libro
    * 
    * @return <code><b>ISBN</b></code> Devuelve el <code>String</code> del ISBN del libro
    */
   public String consulta_isbn(){
       return isbn;
   }
   
   /**
    * Cambiaremos el valor del título del libro
    * 
    * @param titulo String que ha de contener el título del libro
    */
   public void cambia_titulo(String titulo){
       this.titulo=titulo;
   }
   /**
    * Cambiaremos el valor del autor del libro
    * 
    * @param autor String que ha de contener el autor del libro
    */
   public void cambia_autor(String autor){
       this.autor=autor;
   }
   /**
    * Cambiaremos el valor del isbn del libro
    * 
    * @param isbn String que ha de contener el ISBN del libro
    * @exception IllegalArgumentException Lanza esta excepción en caso de introducir un número de isbn no valido
    */
   public void cambia_isbn(String isbn){
       if(compruebaIsbn10(isbn) || compruebaIsbn13(isbn)){
           this.isbn=isbn;
       }else{
           throw new IllegalArgumentException("isbn no válido");
       }
   }
   /**
    * Comprobación de la validez de un número isbn-10
    * 
    * @param isbn Valor del isbn-10 que le hemos de introducir para comprobar su validez
    * @return <code><b>Boolean</b></code> Devuelve <b>true</b> si es correcto o <b>false</b> si es un número isbn-10 erróneo
    */
   private boolean compruebaIsbn10(String isbn){
       int res=0,numero=0;
       String is=isbn.replace("-", "");
       for(int isb=0;isb<is.length();isb++){
           numero=is.charAt(isb)-48;
           res+=numero*(isb+1);
       }
       if(res%11==0) return true;
       return false;
   }
   /**
    * Comprobación de la validez de un número isbn-13
    * 
    * @param isbn Valor del isbn-13 que le hemos de introducir para comprobar su validez
    * @return <code><b>Boolean</b></code> Devuelve <b>true</b> si es correcto o <b>false</b> si es un número isbn-13 erróneo
    */
   private boolean compruebaIsbn13(String isbn){
       int res=0,numero=0;
       boolean par=false;
       String is=isbn.replace("-", "");
       for(int isb=0;isb<is.length()-1;isb++){
           numero=is.charAt(isb)-48;
           if(par){
               res+=numero*3;
               par = false;
           }else{
               res+=numero*1;
               par = true;
           }
       }
       numero=isbn.charAt(isbn.length()-1)-48;
       if(10-(res%10)==numero) return true;
       return false;
   }
}
