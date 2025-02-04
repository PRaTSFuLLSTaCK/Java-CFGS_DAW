package ejercicioBasicoDePOO12;

import javax.swing.JOptionPane;

public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //se declaran las variables que vamos a utilizar
        String Nombre="Juan Antonio";
        String Apellildo="Ibarra Castro";
        int Edad=12;
        //se debe de crear una instancia de la clase persona
        Persona p=new Persona(Nombre,Apellildo,Edad);
        //se muestran los datos de la persona en un mensaje.-
        JOptionPane.showMessageDialog(null,"Nombre Completo:\n"+ p.datos()+"\n"
                + "Edad: "+p.edad()+" años");
    }
}
