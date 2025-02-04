package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import control.Control;
import control.ControlDeFinestres;
import vista.FinestraConfiguracioConversor;
import vista.FinestraPrincipal;

/**
 *
 * @author alumneDAM
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            
            ControlDeFinestres cf=new ControlDeFinestres();
            /*FinestraAfegirMoneda fm = new FinestraAfegirMoneda(cf);
            fm.setVisible(true);*/
            Control control = new Control(cf);
             FinestraConfiguracioConversor conf =  cf.getConfig();
             
             conf.setVisible(true);
            /* FinestraPrincipal fp =  cf.getInterfG();
             
             fp.setVisible(true);*/
            }
        });
    }
    
}
