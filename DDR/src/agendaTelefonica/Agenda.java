package agendaTelefonica;

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
 
public class Agenda {
 
    //Atributos
    private Contacto[] contactos;
 
    //Constructores
    public Agenda() {
        this.contactos = new Contacto[10]; //por defecto
    }
 
    public Agenda(int tamanio) {
        this.contactos = new Contacto[tamanio]; //tamaño que nosotros queramos
    }
 
    //Metodos
    /**
     * Añade un contacto a la agenda
     *
     * @param c
     */
    public void aniadirContacto(Contacto c) {
 
        if (existeContacto(c)) { //Indico si existe el contacto
            System.out.println("El contacto con ese nombre ya existe");
        } else if (agendaLlena()) { //Indico si la agenda esta o no llena
            System.out.println("La agenda esta llena, no se pueden meter mas contactos");
        } else {
 
            boolean encontrado = false;
            for (int i = 0; i < contactos.length && !encontrado; i++) {
                if (contactos[i] == null) { //controlo los nulos
                    contactos[i] = c; //Inserto el contacto 
                    encontrado = true; //Indico que lo he encontrado
                }
            }
 
            if (encontrado) {
                System.out.println("Se ha añadido");
            } else {
                System.out.println("No se ha podido añadir");
            }
        }
 
    }
 
    /**
     * Indica si existe un contacto
     *
     * @param c
     * @return
     */
    public boolean existeContacto(Contacto c) {
 
        for (int i = 0; i < contactos.length; i++) {
            //Controlo nulos e indico si el contacto es el mismo
            if (contactos[i] != null && c.equals(contactos[i])) {
                return true;
            }
        }
        return false;
 
    }
 
    /**
     * Lista los contactos de la agenda
     */
    public void listarContactos() {
 
        if (huecosLibre() == contactos.length) {
            System.out.println("No hay contactos que mostrar");
        } else {
            for (int i = 0; i < contactos.length; i++) {
                if (contactos[i] != null) { //Controlo nulos
                    System.out.println(contactos[i]);
                }
            }
        }
 
    }
 
    /**
     * Busca un contacto por su nombre
     *
     * @param nombre
     */
    public void buscarPorNombre(String nombre) {
 
        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            //Controlo nulos y cxompruebo que es el contacto buscado (forma mas engorrosa)
            if (contactos[i] != null && contactos[i].getNombre().trim().equalsIgnoreCase(nombre.trim())) {
                System.out.println("Su telefono es " + contactos[i].getTelefono()); //muestro el telefono
                encontrado = true; //Indico que lo he encontrado
            }
        }
 
        if (!encontrado) {
            System.out.println("No se ha encontrado el contacto");
        }
 
    }
 
    /**
     * Indica si la agenda esta llena o no
     *
     * @return
     */
    public boolean agendaLlena() {
 
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) { //Controlo nulos
                return false; //indico que no esta llena
            }
        }
 
        return true; //esta llena
 
    }
 
    /**
     * Elimina el contacto de la agenda
     *
     * @param c
     */
    public void eliminarContacto(Contacto c) {
 
        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if (contactos[i] != null && contactos[i].equals(c)) {
                contactos[i] = null; //Controlo nulos
                encontrado = true; //Indico que lo he encontrado
            }
        }
 
        if (encontrado) {
            System.out.println("Se ha eliminado el contacto");
        } else {
            System.out.println("No se ha eliminado el contacto");
 
        }
 
    }
 
    /**
     * Indica cuantos contactos más podemos meter
     *
     * @return
     */
    public int huecosLibre() {
 
        int contadorLibres = 0;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) { //Controlo nulos
                contadorLibres++; //Acumulo
            }
        }
 
        return contadorLibres;
 
    }
 
}
