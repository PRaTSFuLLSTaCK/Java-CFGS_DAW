package gestionarEmpleados;

/*
 * 
 * 12)  Nos piden hacer una un programa que gestione empleados.

Los empleados se definen por tener:

Nombre
Edad
Salario
También tendremos una constante llamada PLUS, que tendrá un valor de 300€

Tenemos dos tipos de empleados: repartidor y comercial.

El comercial, aparte de los atributos anteriores, tiene uno más llamado comisión (double).

El repartidor, aparte de los atributos de empleado, tiene otro llamado zona (String).

Crea sus constructores, getters and setters y toString (piensa como aprovechar la herencia).

No se podrán crear objetos del tipo Empleado (la clase padre) pero si de sus hijas.

Las clases tendrán un método llamado plus, que según en cada clase tendrá una implementación distinta. Este plus básicamente aumenta el salario del empleado.

En comercial, si tiene más de 30 años y cobra una comisión de más de 200 euros, se le aplicara el plus.
En repartidor, si tiene menos de 25 y reparte en la “zona 3”, este recibirá el plus.
Puedes hacer que devuelva un booleano o que no devuelva nada, lo dejo a tu elección.

Crea una clase ejecutable donde crees distintos empleados y le apliques el plus para comprobar que funciona.
 * 
 */

public class Main {
	 
    public static void main(String[] args) {
 
        //Creamos los objetos
        Comercial c1 = new Comercial(300, "DDR", 37, 1000);
        Repartidor r1 = new Repartidor("zona 3", "Fer", 26, 900);
 
        //Llamamos a plus
        c1.plus();
        r1.plus();
 
        //Mostramos la informacion
        System.out.println(c1);
        System.out.println(r1);
    }
 
}
