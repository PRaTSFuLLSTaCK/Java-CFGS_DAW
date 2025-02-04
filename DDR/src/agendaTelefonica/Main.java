package agendaTelefonica;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 
 * 15) Nos piden realizar una agenda telefónica de contactos.

Un contacto está definido por un nombre y un teléfono (No es necesario de validar). Un contacto es igual a otro cuando sus nombres son iguales.

Una agenda de contactos está formada por un conjunto de contactos (Piensa en que tipo puede ser)

Se podrá crear de dos formas, indicándoles nosotros el tamaño o con un tamaño por defecto (10)

Los métodos de la agenda serán los siguientes:

aniadirContacto(Contacto c): Añade un contacto a la agenda, sino se pueden meter más a la agenda se indicara por pantalla. No se pueden meter contactos que existan, es decir, no podemos duplicar nombres, aunque tengan distinto teléfono.
existeContacto(Conctacto c): indica si el contacto pasado existe o no.
listarContactos(): Lista toda la agenda
buscaContacto(String nombre): busca un contacto por su nombre y muestra su teléfono.
eliminarContacto(Contacto c): elimina el contacto de la agenda, indica si se ha eliminado o no por pantalla
agendaLlena(): indica si la agenda está llena.
huecosLibres(): indica cuantos contactos más podemos meter.
Crea un menú con opciones por consola para probar todas estas funcionalidades.


 * 
 */
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        Agenda agendaTelefonica = new Agenda(3);
        String nombre;
        int telefono;
 
        Contacto c;
 
        while (!salir) {
 
            System.out.println("1. Añadir contacto");
            System.out.println("2. Listar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Existe contacto");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Contactos disponibles");
            System.out.println("7. Agenda llena");
            System.out.println("8. Salir");
            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
 
                        //Pido valores
                        System.out.println("Escribe un nombre");
                        nombre = sn.next();
 
                        System.out.println("Escribe un telefono");
                        telefono = sn.nextInt();
 
                        //Creo el contacto
                        c = new Contacto(nombre, telefono);
 
                        agendaTelefonica.aniadirContacto(c);
 
                        break;
                    case 2:
 
                        agendaTelefonica.listarContactos();
 
                        break;
                    case 3:
 
                        //pido el nombre
                        System.out.println("Escribe un nombre");
                        nombre = sn.next();
 
                        agendaTelefonica.buscarPorNombre(nombre);
 
                        break;
                    case 4:
 
                        //pido el nombre
                        System.out.println("Escribe un nombre");
                        nombre = sn.next();
 
                        //Creo el contacto auxiliar
                        c = new Contacto(nombre, 0);
 
                        if (agendaTelefonica.existeContacto(c)) {
                            System.out.println("Existe contacto");
                        } else {
                            System.out.println("No existe contacto");
                        }
 
                        break;
                    case 5:
 
                        //pido el nombre
                        System.out.println("Escribe un nombre");
                        nombre = sn.next();
 
                        //Creo el contacto auxiliar
                        c = new Contacto(nombre, 0);
 
                        agendaTelefonica.eliminarContacto(c);
 
                        break;
                    case 6:
 
                        System.out.println("Hay " + agendaTelefonica.huecosLibre() + " contactos libre");
 
                        break;
                    case 7:
 
                        //como devuelve un booleano, lo meto en un if
                        if (agendaTelefonica.agendaLlena()) {
                            System.out.println("La agenda esta llena");
                        } else {
                            System.out.println("Aun puedes meter contactoss");
                        }
 
                        break;
                    case 8:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 8");
                }
 
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
 
        }
 
    }
 
}
