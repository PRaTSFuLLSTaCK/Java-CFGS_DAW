/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import vista.FinestraAfegirMoneda;
import vista.FinestraConfiguracioConversor;
import vista.FinestraEliminarMoneda;
import vista.FinestraPrincipal;



/**
 *
 * @author Azzeddine Lakbir
 */
public class ControlDeFinestres {
    private FinestraConfiguracioConversor config;
    private FinestraPrincipal interfG;
    private FinestraAfegirMoneda fm;
    private FinestraEliminarMoneda FEliminarMoneda;
    private Control control = new Control(this);

    public FinestraConfiguracioConversor getConfig() {
        if (config == null){
            config = new FinestraConfiguracioConversor(this, control);
        }
        return config;
    }

    public FinestraPrincipal getInterfG() {
        if (interfG == null){
           interfG = new FinestraPrincipal(this, control);
        }
        return interfG;
    }

    public FinestraAfegirMoneda getFm() {
        if (fm == null){
            fm = new FinestraAfegirMoneda(this, control);
        }
        return fm;
    }
    public FinestraEliminarMoneda getFinestraEliminarMoneda(){
           if (FEliminarMoneda == null){
            FEliminarMoneda = new FinestraEliminarMoneda(this, control);
        }
        return FEliminarMoneda;
    }
    
}
