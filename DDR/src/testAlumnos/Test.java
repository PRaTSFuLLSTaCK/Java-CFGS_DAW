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


import Leer.Leer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import listaDinamica.ListaDinamica;
 
public class Test {
 
    //atributos
    private ListaDinamica<Pregunta> preguntas;
    private int puntosTotales;
    private int preguntaActual;
 
    //Constructor
    public Test() {
        preguntas = new ListaDinamica<>();
        puntosTotales = 0;
        preguntaActual = 0;
    }
 
    //Getter
    public ListaDinamica<Pregunta> getPreguntas() {
        return preguntas;
    }
 
    public int getPuntosTotales() {
        return puntosTotales;
    }
 
    public int getPreguntaActual() {
        return preguntaActual;
    }
 
    public Pregunta siguientePregunta() {
 
        //cojo la siguiente pregunta
        Pregunta p = preguntas.get(preguntaActual);
 
        //si la pregunta es distinto de null, paso la siguiente
        if (p != null) {
            preguntaActual++;
        }
 
        return p;
 
    }
 
    public void reiniciarTest() {
        preguntaActual = 0;
        puntosTotales = 0;
    }
 
    public void realizarTest() {
 
        //si estan vacias las preguntas, no hacemos nada
        if (preguntas.isEmpty()) {
            System.out.println("No hay preguntas");
        } else {
 
            //Creamos un objeto leer
            Leer teclado = new Leer();
 
            int i = 0, respuesta;
            Pregunta p;
 
            //recorremos las preguntas
            while (i < preguntas.size()) {
 
                //Cojemos una pregunta
                p = preguntas.get(i);
                //La mostramos
                p.mostrarPregunta();
 
                //Pedimos una respuesta
                respuesta = teclado.pedirIntRango(1, p.getRespuestas().size(), "Introduce la respuesta");
 
                //Comprobamos si es correcta o no
                if (p.comprobarRespuesta(respuesta)) {
                    System.out.println("Has acertado");
                    puntosTotales += p.getPuntos();
                } else {
                    System.out.println("No has acertado");
                }
 
                i++;
            }
 
        }
 
        //muestro los puntos
        System.out.println("Has obtenido " + puntosTotales + " puntos");
 
    }
 
    public void cargarFichero(String fichero) throws FileNotFoundException, IOException {
 
        //Creo el buffer
        BufferedReader br = new BufferedReader(new FileReader(fichero));
 
        //variables necesarias
        String linea;
        Pregunta p;
        ListaDinamica<Respuesta> respuestas = new ListaDinamica<>();
        String texto_pregunta = "";
        int puntosPregunta = 0, opcioncorrecta = 0;
        boolean pregunta = false, respuesta = false, puntos = false;
 
        //leo el fichero
        while ((linea = br.readLine()) != null) {
 
            try {
 
                //si empieza por ;P; es una pregunta
                if (linea.startsWith(";P;")) {
                    texto_pregunta = linea.substring(3);
                    pregunta = true; //marco que ya tengo la pregunta
                    //si tengo la pregunta y empieza por ;R; cojo la respuesta correcta
                } else if (pregunta && linea.startsWith(";R;")) {
                    opcioncorrecta = Integer.parseInt(linea.substring(3).trim());
                    respuesta = true; //marco que ya tengo la respuesta
                    //Si la respuesta esta marcada, cojo los puntos
                } else if (respuesta) {
                    puntosPregunta = Integer.parseInt(linea.trim());
                    puntos = true; //marco los puntos
                    //Si tengo la pregunta marcada, cojo la respuesta
                    //Lo pongo el ultimo en caso de que no haya nada mas
                } else if (pregunta) {
                    respuestas.addLast(new Respuesta(linea));
 
                    //Si tiene mas de 4 respuestas, lanzo excepcion
                    if (respuestas.size() > 4) {
                        throw new Exception();
                    }
                }
 
                //Si tenemos marcado la pregunta, la respuesta, los puntos y hay entre 2 y 4 opciones
                if (pregunta && respuesta && puntos && (respuestas.size() >= 2 && respuestas.size() <= 4)) {
 
                    //Marcamos la respuesta correcta como la correcta
                    respuestas.get(opcioncorrecta - 1).setCorrecta(true);
 
                    //creo la pregunta
                    p = new Pregunta(texto_pregunta, respuestas, puntosPregunta);
 
                    //añado la pregunta
                    preguntas.addLast(p);
 
                    //reincio
                    pregunta = false;
                    respuesta = false;
                    puntos = false;
                    respuestas = new ListaDinamica<>();
 
                }
 
            } catch (Exception ex) {
                //reincio
                pregunta = false;
                respuesta = false;
                puntos = false;
                respuestas = new ListaDinamica<>();
            }
 
        }
 
        br.close();
 
    }
 
}