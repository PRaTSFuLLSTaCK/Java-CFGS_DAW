package testAlumnos;

/*
 * 
 * 17) Una academia nos pide hacer un programa para hacer un pequeño test a sus alumnos.

Estas preguntas, para facilitar la inclusión, estarán escritas en un txt (incluido en la descarga del proyecto).

Una opción se compone de:

El texto de la opción (digamos la respuesta)
Es correcto o no
Una pregunta consta de:

Pregunta (tendrá delante dos puntos y coma ;P;)
Opciones de la pregunta (entre 2 y 4)
Opción correcta (tendrá delante dos puntos y coma ;R;)
Puntos
La pregunta no será válida en los siguientes casos:

Las opciones no están entre 2 y 4.
La opción correcta esta entre el número de opciones y es un número.
Los puntos es un número entero.
Sus métodos son:

mostrarPregunta(): muestra la pregunta con sus opciones.
comprobarRespuesta(int respuestaUsuario): comprueba la respuesta del usuario si es correcta o no.
Getter de los atributos.
Un test está formado por un conjunto preguntas y los puntos acumulados. Piensa que debemos saber por cual pregunta vamos.

Sus métodos son:

cargarPreguntas(String fichero): carga todas las preguntas del fichero
siguientePregunta(): devuelve la siguiente pregunta
reiniciarTest(): nos permite reiniciar el test.
realizarTest(): empieza el test y empieza a formular las preguntas
El fichero de preguntas tiene el siguiente formato:

;P;Pregunta 1

Opción 1 pregunta 1

Opción 2 pregunta 1

Opción 3 pregunta 1

Opción 4 pregunta 1

;R;Numero opción correcta

Puntos pregunta 1

;P;Pregunta 2

Opción 1 pregunta 2

Opción 2 pregunta 2
 * 
 */

public class Nodo<T> {
 
    //Atributos
    private T elemento;
    private Nodo<T> siguiente; //Apunta al siguiente nodo
 
    //Contructor
    public Nodo(T elemento, Nodo<T> siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }
 
    //Metodos
    public T getElemento() {
        return elemento;
    }
 
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
 
    public Nodo<T> getSiguiente() {
        return siguiente;
    }
 
    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
 
    @Override
    public String toString() {
        return elemento + "\n";
    }
 
     
     
}
