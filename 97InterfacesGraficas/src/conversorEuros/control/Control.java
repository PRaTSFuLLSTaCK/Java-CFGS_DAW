/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import model.Conversor;
import model.Moneda;

/**
 *
 * @author Azzeddine Lakbir
 */
public class Control implements ActionListener {

    private int cont = 0;
    private ControlDeFinestres controlFinestres;

    public Control(ControlDeFinestres controlFinestres) {
        this.controlFinestres = controlFinestres;
    }

    private Conversor conversor = new Conversor();

    @Override
    public void actionPerformed(ActionEvent ae) {
        //Borramos los elementos de los combobox
        if (cont == 0) {
            controlFinestres.getInterfG().getjComboBoxA().removeAllItems();
            controlFinestres.getInterfG().getjComboBox2().removeAllItems();

        }

        if (ae.getSource().equals(controlFinestres.getConfig().getjButtonAceptar())) {
            try {

                String monedaBase = (String) controlFinestres.getConfig().getjTFMonedaBase().getText();
                double valor = Double.parseDouble(controlFinestres.getConfig().getjTFValorMonedaBase().getText());
                Moneda moneda = new Moneda(monedaBase, valor);
                conversor.afegirMoneda(moneda);
                controlFinestres.getInterfG().setVisible(true);
                actualitzarMonedesCombobox();
                controlFinestres.getConfig().setVisible(false);
                cont++;
            } catch (NumberFormatException e) {
                controlFinestres.getConfig().missatgeError();
                controlFinestres.getConfig().getjTFMonedaBase().setText("");
                controlFinestres.getConfig().getjTFValorMonedaBase().setText("");

            }

        } else if (ae.getSource().equals(controlFinestres.getConfig().getjButtonSalir())) {
            controlFinestres.getConfig().dispose();
            System.exit(0);
        } else if (ae.getSource().equals(controlFinestres.getConfig().getjButtonLimpiar())) {
            controlFinestres.getConfig().getjTFMonedaBase().setText("");
            controlFinestres.getConfig().getjTFValorMonedaBase().setText("");
        } else if (ae.getSource().equals(controlFinestres.getFm().getjButtonAfegirMoneda())) {

            try {

                String monedaBase = (String) controlFinestres.getFm().getjTextFieldNomMoneda().getText();
                double valor = Double.parseDouble(controlFinestres.getFm().getjTextFieldValorMoneda().getText());
                Moneda moneda = new Moneda(monedaBase, valor);
                if (conversor.afegirMoneda(moneda) == true) {
                    controlFinestres.getFm().missatgeError();
                } else {
                    controlFinestres.getInterfG().setVisible(true);
                    controlFinestres.getFm().missatgeConfirm();
                    controlFinestres.getFm().getjTextFieldNomMoneda().setText("");
                    controlFinestres.getFm().getjTextFieldValorMoneda().setText("");
                    actualitzarMonedesCombobox();

                }
                cont++;
                controlFinestres.getFm().getjTextFieldNomMoneda().setText("");
                controlFinestres.getFm().getjTextFieldValorMoneda().setText("");
            } catch (NumberFormatException e) {
                controlFinestres.getConfig().missatgeError();
                controlFinestres.getFm().getjTextFieldNomMoneda().setText("");
                controlFinestres.getFm().getjTextFieldValorMoneda().setText("");

            }

        } else if (controlFinestres.getInterfG().getjMenuAfegirMoneda().equals(ae.getSource())) {
            controlFinestres.getFm().setVisible(true);
        } else if(ae.getSource().equals(controlFinestres.getFm().getjButtonTornar())){
            controlFinestres.getFm().dispose();
        }else if (controlFinestres.getInterfG().getjButtonCalcular().equals(ae.getSource())) {
            Moneda monedaOrigen = null;
            Moneda monedaDesti = null;
            try {
                double quantitat = Double.parseDouble(controlFinestres.getInterfG().getjTFQuantitat().getText());

                String nomMonedaOrigen = (String) this.controlFinestres.getInterfG().getjComboBox2().getSelectedItem();
                String nomMonedaDesti = (String) this.controlFinestres.getInterfG().getjComboBoxA().getSelectedItem();

                for (int i = 0; i < conversor.getLlistaMonedes().size(); i++) {
                    if (nomMonedaOrigen.equals(nomMonedaDesti)) {
                        monedaOrigen = conversor.getLlistaMonedes().get(i);
                        monedaDesti = conversor.getLlistaMonedes().get(i);;
                    } else if (conversor.getLlistaMonedes().get(i).getNom().equals(nomMonedaOrigen)) {
                        monedaOrigen = conversor.getLlistaMonedes().get(i);
                    } else if (conversor.getLlistaMonedes().get(i).getNom().equals(nomMonedaDesti)) {
                        monedaDesti = conversor.getLlistaMonedes().get(i);
                    }
                }
                double resultat = conversor.canvi(monedaOrigen, monedaDesti, quantitat);
                DecimalFormat formatter = new DecimalFormat("#0.00");
                controlFinestres.getInterfG().getjTFCanvi().setText(formatter.format(resultat) + "");
            } catch (NumberFormatException ex) {
                controlFinestres.getConfig().missatgeError();
                controlFinestres.getInterfG().getjTFQuantitat().setText("");
                controlFinestres.getInterfG().getjTFCanvi().setText("");
            }

        } else if (ae.getSource().equals(controlFinestres.getInterfG().getjMenuSortir2())) {
            controlFinestres.getInterfG().dispose();
            System.exit(0);
        } else if (ae.getSource().equals(controlFinestres.getInterfG().getjMenuItemEliminarMoneda())) {
            controlFinestres.getFinestraEliminarMoneda().setVisible(true);
        } else if (ae.getSource().equals(controlFinestres.getFinestraEliminarMoneda().getjButtonAceptarEliminarMoneda())) {
            String nom = controlFinestres.getFinestraEliminarMoneda().getjComboBoxEliminarMonedes().getSelectedItem().toString();
            Moneda moneda = null;
            for (int i = 0; i < conversor.getLlistaMonedes().size(); i++) {
                if (conversor.getLlistaMonedes().get(i).getNom().equals(nom)) {
                    moneda = conversor.getLlistaMonedes().get(i);
                    break;
                }
            }
            conversor.eliminarMoneda(moneda);

            controlFinestres.getFinestraEliminarMoneda().missatgeConfirmacio();
            controlFinestres.getFinestraEliminarMoneda().setVisible(false);
            actualitzarMonedesCombobox();

            controlFinestres.getInterfG().setVisible(true);
        } else if (ae.getSource().equals(controlFinestres.getFinestraEliminarMoneda().getjButtonCancelar())) {
            controlFinestres.getFinestraEliminarMoneda().setVisible(false);
        }

    }

    public void actualitzarMonedesCombobox() {
        controlFinestres.getInterfG().getjComboBox2().removeAllItems();
        controlFinestres.getInterfG().getjComboBoxA().removeAllItems();
        controlFinestres.getFinestraEliminarMoneda().getjComboBoxEliminarMonedes().removeAllItems();

        for (int i = 0; i < conversor.getLlistaMonedes().size(); i++) {

            controlFinestres.getInterfG().getjComboBoxA().addItem(conversor.getLlistaMonedes().get(i).getNom());
            controlFinestres.getInterfG().getjComboBox2().addItem(conversor.getLlistaMonedes().get(i).getNom());
            controlFinestres.getFinestraEliminarMoneda().getjComboBoxEliminarMonedes().addItem(conversor.getLlistaMonedes().get(i).getNom());

        }

    }

}
