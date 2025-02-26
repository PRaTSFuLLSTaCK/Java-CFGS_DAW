package Prog_Tarea09;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author José Luis
 * @version 9.1
 */
public class Movimiento extends javax.swing.JDialog {
    /*
     * Inicializamos las variables a usar
     */
    private boolean haPulsadoAceptar=false;
    Hashtable hashtable = new Hashtable<String,String>();
    ArrayList<CuentaAhorro> ahorro = new ArrayList<CuentaAhorro>();
    ArrayList<CuentaCorrientePersonal> personal = new ArrayList<CuentaCorrientePersonal>();
    ArrayList<CuentaCorrienteEmpresa> empresa = new ArrayList<CuentaCorrienteEmpresa>();
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
    String[] fichero={"ahorro.dat","personal.dat","empresa.dat"};
    Serializar serializa=new Serializar();
    static Pattern fechaValida = Pattern.compile("([0-9]|([0-2][0-9])|(3[0-1]))[\\/|\\-]([0-9]|(0[0-9])|([0-1][0-2]))[\\/|\\-]([1-2][0-9]{3})");
    String[] tipCuen={  "",
                        "Cuenta de Ahorro",
                        "Cuenta Corriente Personal",
                        "Cuenta Corriente de Empresa"};
    Object datos[][];
    Object misDatos;
    int seleccion=0;

    public Movimiento(java.awt.Frame parent, boolean modal){
        super(parent, modal);
        initComponents();
    }
    /** Creates new form Movimiento */
    public Movimiento(java.awt.Frame parent, boolean modal,int opcion) {
        super(parent, modal);
        initComponents();
        this.jPanel_datos.setVisible(false);
        this.jPanel_cantidad.setVisible(false);
        leerDatos();
        if(opcion==1){
            jLabel1.setText("Ingreso en cuenta");
            setTitle("Ingresar efectivo en la cuenta");
        }
        if(opcion==2){
            jLabel1.setText("Retirada de efectivo");
            setTitle("Retirar efectivo de la cuenta");
        }
        if(opcion==3){
            jLabel1.setText("Consulta de saldo");
            setTitle("Consultar el saldo");
        }
        seleccion=opcion;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel_CCC = new javax.swing.JPanel();
        digCon = new javax.swing.JTextField();
        nCuenta = new javax.swing.JTextField();
        entidad = new javax.swing.JTextField();
        oficina = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel_datos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        fecNac = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        apellidos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        saldo = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        cuenta = new javax.swing.JTextField();
        jPanel_cantidad = new javax.swing.JPanel();
        cantidad = new javax.swing.JTextField();
        ingresoTexto = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        aceptar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movimientos en cuenta");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18));
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Movimientos en la cuenta");

        jPanel_CCC.setBorder(javax.swing.BorderFactory.createTitledBorder("Número de la Cuenta de Cliente"));

        digCon.setToolTipText("Dígitos de control (2 dígitos)");

        nCuenta.setToolTipText("Nº de cuenta (10 dígitos)");
        nCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nCuentaActionPerformed(evt);
            }
        });

        entidad.setToolTipText("Nº de la entidad (4 dígitos)");

        oficina.setToolTipText("Nº de la oficina (4 dígitos)");

        jLabel14.setText("/");

        jLabel12.setText("/");

        jLabel13.setText("/");

        javax.swing.GroupLayout jPanel_CCCLayout = new javax.swing.GroupLayout(jPanel_CCC);
        jPanel_CCC.setLayout(jPanel_CCCLayout);
        jPanel_CCCLayout.setHorizontalGroup(
            jPanel_CCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CCCLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(entidad, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oficina, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(digCon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel_CCCLayout.setVerticalGroup(
            jPanel_CCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(entidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel12)
                .addComponent(jLabel13)
                .addComponent(jLabel14)
                .addComponent(nCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(oficina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(digCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel4.setText("Fecha de Nacimiento:");

        fecNac.setEditable(false);
        fecNac.setToolTipText("Fecha de nacimiento del cliente");
        fecNac.setMaximumSize(new java.awt.Dimension(10, 30));

        jLabel5.setText("Tipo de cuenta:");

        apellidos.setEditable(false);
        apellidos.setToolTipText("Apellidos del cliente");
        apellidos.setMaximumSize(new java.awt.Dimension(10, 30));

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Apellidos: ");

        jLabel10.setText("Saldo:");

        saldo.setEditable(false);
        saldo.setFont(new java.awt.Font("Tahoma", 1, 18));
        saldo.setForeground(new java.awt.Color(0, 0, 204));
        saldo.setToolTipText("Saldo actual de su cuenta");
        saldo.setMaximumSize(new java.awt.Dimension(10, 30));

        nombre.setEditable(false);
        nombre.setToolTipText("Nombre del cliente");
        nombre.setMaximumSize(new java.awt.Dimension(10, 30));

        cuenta.setEditable(false);
        cuenta.setFont(new java.awt.Font("Tahoma", 0, 10));
        cuenta.setToolTipText("Tipo de cuenta asignado");

        javax.swing.GroupLayout jPanel_datosLayout = new javax.swing.GroupLayout(jPanel_datos);
        jPanel_datos.setLayout(jPanel_datosLayout);
        jPanel_datosLayout.setHorizontalGroup(
            jPanel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_datosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(saldo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
                .addGap(7, 7, 7)
                .addGroup(jPanel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_datosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(190, 190, 190))
                    .addComponent(apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addGroup(jPanel_datosLayout.createSequentialGroup()
                        .addGroup(jPanel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fecNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(jLabel5))))
                .addContainerGap())
        );
        jPanel_datosLayout.setVerticalGroup(
            jPanel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_datosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_datosLayout.createSequentialGroup()
                        .addGroup(jPanel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saldo, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_datosLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        ingresoTexto.setText("INGRESAR");

        jLabel6.setText("Indique la cantidad a");

        javax.swing.GroupLayout jPanel_cantidadLayout = new javax.swing.GroupLayout(jPanel_cantidad);
        jPanel_cantidad.setLayout(jPanel_cantidadLayout);
        jPanel_cantidadLayout.setHorizontalGroup(
            jPanel_cantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_cantidadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingresoTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_cantidadLayout.setVerticalGroup(
            jPanel_cantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_cantidadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_cantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ingresoTexto)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        aceptar.setText("Aceptar");
        aceptar.setToolTipText("");
        aceptar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.setToolTipText("Volver al menú principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addComponent(jPanel_CCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_CCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(aceptar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nCuentaActionPerformed
        aceptarActionPerformed(evt);
    }//GEN-LAST:event_nCuentaActionPerformed

    
        /**
         * Cuando pulsamos sobre el botón de aceptar se realizan la mayor parte
         * de los procesos
         * @param evt 
         */
        private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        String ccc="";
        long numero=0;
//        float numero2=0;
        boolean bien=false;
        String parte="";
        int[] registro;
        /*
         * Sólo vemos el número de cuenta y hemos de teclearlo correctamente
         * para comprobar si existe
         */
        try{
            parte="Entidad, ";
            numero=Integer.parseInt(entidad.getText());
            parte="Oficina, ";
            numero=Integer.parseInt(oficina.getText());
            parte="Dígitos de Control, ";
            numero=Integer.parseInt(digCon.getText());
            parte="Nº Cuenta, ";
            numero=Long.parseLong(nCuenta.getText());
            /*
             * Si los valores introducidos son números comprobamos que los
             * dígitos de control sean correctos
             */
            if(digCon.getText().equals("") ||
                !digCon.getText().equals(CuentaNueva.obtenerDigitosControl( entidad.getText(),
                                                                            oficina.getText(),
                                                                            nCuenta.getText()))){
                JOptionPane.showMessageDialog(this, 
                        "Dígitos de control erróneo", 
                        "ERROR", 
                        JOptionPane.ERROR_MESSAGE);
                digCon.setText("");
            }
            // Convertimos el número de cuenta en cadena para poder 
            // comprobar su existencia
            ccc=entidad.getText()+oficina.getText()+digCon.getText()+nCuenta.getText();
        }catch(NumberFormatException nfe){
            parte=parte.substring(0, parte.length()-2);
            JOptionPane.showMessageDialog(this, 
                    "Sólo dígitos numéricos en\n"+parte, 
                    "ERROR", 
                    JOptionPane.ERROR_MESSAGE);
        }
        // Si es la primera vez que accedemos a esta pantalla, es decir, que
        // aún no se muestran los campos
        if(!isHaPulsadoAceptar()){

            // Comprobamos que el número de cuenta exista almacenado
            registro=compruebaCCC(ccc);
            // Si se encuentra se muestran los datos
            if(registro[1]>0&&registro[1]<4){
                
                siExiste(registro[1],registro[0]);
                haPulsadoAceptar = true;
                aceptar.setText("Grabar");
                if(seleccion==1)
                    ingresoTexto.setText("INGRESAR");
                if(seleccion==2)
                    ingresoTexto.setText("RETIRAR");
                if(seleccion==3){
                    this.jPanel_cantidad.setVisible(false);
                    this.aceptar.setVisible(false);
                }
                // Una vez que se muestran los datos se desactiva la
                // introducción del CCC
                this.entidad.setEditable(false);
                this.oficina.setEditable(false);
                this.digCon.setEditable(false);
                this.nCuenta.setEditable(false);
            // Si no se encuentra se avisa de ello
            }else{
                JOptionPane.showMessageDialog(this, 
                        "Nº de Cuenta inexistente", 
                        "ERROR", 
                        JOptionPane.ERROR_MESSAGE);
            }
        // Si ya estamos viendo los datos y pulsamos de nuevo en Aceptar
        }else{
            float numero1=0;
            float numero2=0;
            boolean error=false;
            /*
             * Desactivamos el CCC para que no se pueda cambiar al realizar
             * los movimientos de ingreso o retirada
             */
            this.entidad.setEditable(false);
            this.oficina.setEditable(false);
            this.digCon.setEditable(false);
            this.nCuenta.setEditable(false);
            // en registro[0] metemos el tipo de cuenta y en registro[1] el
            // el número de registro encontrado
            registro=compruebaCCC(ccc);
            
            aceptar.setText("Aceptar");
            if(seleccion!=3){
            try{
                numero2=Float.parseFloat(cantidad.getText());
                // si el número introducido en cantidad es negativo se lanza la excepción
                if(numero2<0)throw new NumberFormatException();
                // Si es de tipo Cuenta de Ahorro
                if(registro[1]==1){
                    // almacenamos el saldo de ese registro
                    numero1=ahorro.get(registro[0]).getSaldo();
                    // si es para ingresar
                    if(seleccion==1){
                        // se pone en saldo, saldo anterior mas cantidad
                        ahorro.get(registro[0]).setSaldo(numero1+numero2);
                        // se graba esta nueva información
                        serializa.grabaObjeto(ahorro, fichero[0]);
                        // si llegamos aquí es que todo se ha realizado correctamente
                        bien=true;
                    }
                    // Si es para retirar efectivo
                    if(seleccion==2){
                        if(numero1<numero2){
                            // si saldo es menor que la cantidad a retirar enviamos error
                            error=true;
                        }else{
                            // se pone en saldo, saldo anterior menos cantidad
                            ahorro.get(registro[0]).setSaldo(numero1-numero2);
                            // se graba esta nueva información
                            serializa.grabaObjeto(ahorro, fichero[0]);
                            // si llegamos aquí es que todo se ha realizado correctamente
                            bien=true;
                        }
                    }
                // Si es de tipo Cuenta Corriente Personal
                } else if(registro[1]==2){
                    // almacenamos el saldo de ese registro
                    numero1=personal.get(registro[0]).getSaldo();
                    // Si es para ingresar
                    if(seleccion==1){
                        // se pone en saldo, saldo anterior mas cantidad
                        personal.get(registro[0]).setSaldo(numero1+numero2);
                        // se graba esta nueva información
                        serializa.grabaObjeto(personal, fichero[1]);
                        // si llegamos aquí es que todo se ha realizado correctamente
                        bien=true;
                    }
                    // Si es para retirar efectivo
                    if(seleccion==2){
                        if(numero1<numero2){
                            // si saldo es menor que la cantidad a retirar enviamos error
                            error=true;
                        }else{
                            // se pone en saldo, saldo anterior menos cantidad
                            personal.get(registro[0]).setSaldo(numero1-numero2);
                            // se graba esta nueva información
                            serializa.grabaObjeto(personal, fichero[1]);
                             // si llegamos aquí es que todo se ha realizado correctamente
                            bien=true;
                        }
                    }
                // Si es de tipo Cuenta Corriente de Empresa
                } else if(registro[1]==3){
                    // almacenamos el saldo de ese registro
                    numero1=empresa.get(registro[0]).getSaldo();
                    // Si es para ingresar
                    if(seleccion==1){
                        // Se pone en saldo, saldo anterior mas cantidad
                        empresa.get(registro[0]).setSaldo(numero1+numero2);
                        // Se graba esta nueva información
                        serializa.grabaObjeto(empresa, fichero[2]);
                        // Si llegamos aquí es que todo se ha realizado correctamente
                        bien=true;
                    }
                    // Si es para retirar efectivo
                    if(seleccion==2){
                        // En este caso tenemos que tener en cuenta el máximo de
                        // descubierto permitido
                        if(numero1+empresa.get(registro[0]).getDescubierto()<numero2){
                            error=true;
                        }else{
                            // si todo es correcto se pone en saldo el valor de
                            // saldo anterior menos cantidad
                            empresa.get(registro[0]).setSaldo(numero1-numero2);
                            // Se graba esta nueva información
                            serializa.grabaObjeto(empresa, fichero[2]);
                            // Si llegamos aquí es que todo se ha realizad correctamente
                            bien=true;
                        }
                    }
                }
                // Si todo ha ido bien, se pone el nuevo saldo en la caja de texto
                // y hacemos aparecer una ventana indicando que el saldo se ha cambiado
                if(bien){
                    if(seleccion==1){
                        saldo.setText(String.valueOf(numero1+numero2));
                    }else if(seleccion==2){
                        saldo.setText(String.valueOf(numero1-numero2));
                    }
                    JOptionPane.showMessageDialog(this, 
                        "El saldo se ha cambiado a: "+saldo.getText(), 
                        "Saldo modificado", 
                        JOptionPane.INFORMATION_MESSAGE);
                    this.ingresoTexto.setText("INGRESAR");
                    haPulsadoAceptar=false;
                // Si existe algún error se avisa de ello 
                }else if(error){
                    JOptionPane.showMessageDialog(this, 
                        "La cantidad a retirar supera el límite permitido", 
                        "ERROR", 
                        JOptionPane.ERROR_MESSAGE);
                }
                // Se inicializa 'bien' y se ocultan los paneles excepto el de
                // código cuenta cliente, que de nuevo se habilita
                bien=false;
                this.jPanel_datos.setVisible(false);
                this.jPanel_cantidad.setVisible(false);
                this.entidad.setEditable(true);
                this.oficina.setEditable(true);
                this.digCon.setEditable(true);
                this.nCuenta.setEditable(true);
            // Si se ha producido algún error se avisa de ello 
            // (número como texto o número negativo)
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(this, 
                    "Ha de ser una cantidad numérica mayor de 0", 
                    "ERROR", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }else{
                this.aceptar.setVisible(false);
                this.jPanel_cantidad.setVisible(false);
            }
        }
    }//GEN-LAST:event_aceptarActionPerformed

    /**
     * Método que comprueba el CCC y nos devuelve el tipo de cuenta y el registro
     * donde fue encontrado dicho CCC
     * 
     * @param ccc
     * @return 
     */
    private int[] compruebaCCC(String ccc){
        int[] registroCampo=new int[2];
        // Comprobamos si es una Cuenta de Ahorro
        for(int i=0;i<ahorro.size()&&registroCampo[0]<1;i++){
            if(ahorro.get(i).CCC.equals(ccc)){
                registroCampo[1]=1;
                registroCampo[0]=i;
                i=ahorro.size();
            }
        }
        // Comprobamos si es una Cuenta Corriente Personal
        for(int i=0;i<personal.size()&&registroCampo[0]<1;i++){
            if(personal.get(i).CCC.equals(ccc)){
                registroCampo[1]=2;
                registroCampo[0]=i;
                i=personal.size();
            }
        }
        // Comprobamos si es una Cuenta Corriente de Empresa
        for(int i=0;i<empresa.size()&&registroCampo[0]<1;i++){
            if(empresa.get(i).CCC.equals(ccc)){
                registroCampo[1]=3;
                registroCampo[0]=i;
                i=empresa.size();
            }
        }
        // Devolvemos el número del registro y el tipo de cuenta
        return registroCampo;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Cargamos los datos en sus correspondientes arraylist siempre que existan
     * los ficheros que lo han de contener.
     */
    private void leerDatos(){
        File datosGrab1 = new File(fichero[0]);
        File datosGrab2 = new File(fichero[1]);
        File datosGrab3 = new File(fichero[2]);
        if(datosGrab1.exists())
            ahorro=(ArrayList<CuentaAhorro>)serializa.leeObjeto(fichero[0]);
        if(datosGrab2.exists())
            personal=(ArrayList<CuentaCorrientePersonal>)serializa.leeObjeto(fichero[1]);
        if(datosGrab3.exists())
            empresa=(ArrayList<CuentaCorrienteEmpresa>)serializa.leeObjeto(fichero[2]);
    }
    
    /**
     * Método para cargar las distintas cajas de texto con los valores del registro
     * y tipo de cuenta enviados.
     * 
     * @param cuen (1-C. Ahorro, 2-C. Corriente Personal, 3-C. Corriente de Empresa)
     * @param num registro encontrado
     */
    private void siExiste(int cuen,int num){
        Date miFecha;
        this.jPanel_datos.setVisible(true);
        this.jPanel_cantidad.setVisible(true);
        if(cuen==1){
            nombre.setText(ahorro.get(num).getNombre());
            apellidos.setText(ahorro.get(num).getApellidos());
            saldo.setText(ahorro.get(num).getSaldo().toString());
            saldo.setEditable(false);
            miFecha=(Date)ahorro.get(num).getFechaNac().getTime();
            fecNac.setText(formatoFecha.format(miFecha).toString());
            cuenta.setText(tipCuen[1]);
        }else if(cuen==2){
            nombre.setText(personal.get(num).getNombre());
            apellidos.setText(personal.get(num).getApellidos());
            saldo.setText(personal.get(num).getSaldo().toString());
            miFecha=(Date)personal.get(num).getFechaNac().getTime();
            fecNac.setText(formatoFecha.format(miFecha).toString());
            cuenta.setText(tipCuen[2]);
        }else if(cuen==3){
            nombre.setText(empresa.get(num).getNombre());
            apellidos.setText(empresa.get(num).getApellidos());
            saldo.setText(empresa.get(num).getSaldo().toString());
            miFecha=(Date)empresa.get(num).getFechaNac().getTime();
            fecNac.setText(formatoFecha.format(miFecha).toString());
            cuenta.setText(tipCuen[3]);
        }
        this.jPanel_datos.updateUI();
        this.jPanel_cantidad.updateUI();
    }

    /**
     * Función que nos devuelve si hemos pulsado aceptar
     * @return
     */
    private boolean isHaPulsadoAceptar(){
        return haPulsadoAceptar;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Movimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Movimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Movimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Movimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Movimiento dialog = new Movimiento(new javax.swing.JFrame(), true,0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JTextField apellidos;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField cuenta;
    private javax.swing.JTextField digCon;
    private javax.swing.JTextField entidad;
    private javax.swing.JTextField fecNac;
    private javax.swing.JLabel ingresoTexto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel_CCC;
    private javax.swing.JPanel jPanel_cantidad;
    private javax.swing.JPanel jPanel_datos;
    private javax.swing.JTextField nCuenta;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField oficina;
    private javax.swing.JTextField saldo;
    // End of variables declaration//GEN-END:variables
}

