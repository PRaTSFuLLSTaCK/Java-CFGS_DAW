package Prog_Tarea08;

/*Imagina que te proporcionan, en el siguiente formato, los datos de un cliente, con todos sus teléfonos y todos sus
direcciones de correo electrónico:
DNI, “nombre”, “apellidos”, teléfono 1, teléfono 2, email 1, teléfono 3, email 2,...
En una misma línea se encuentran, separados por comas, todos los datos del cliente: DNI (o NIE), nombre,
apellidos, teléfonos y direcciones de correo electrónico. Fijate que los teléfonos y los correos electrónicos pueden
aparecer desordenados, y que pueden ser más de uno. La idea es meter dichos datos en un documento XML que
contenga los datos de contacto del cliente. No es necesario leer los datos de un archivo, basta con que se
capturen del teclado. Además, el documento XML solo contendrá los datos de un cliente, por lo que no debes
preocuparte de procesar múltiples líneas (solo una).*/

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author José Luis
 */
class Telefonos implements Comparable<Telefonos>  {
        public Long tlf;
        public String mas;
        
        @Override
        public int compareTo(Telefonos t){
            return tlf.compareTo(t.tlf);
        }

}