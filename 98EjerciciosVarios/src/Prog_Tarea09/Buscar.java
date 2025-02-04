package Prog_Tarea09;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author José Luis
 * @version 9.1
 */
public class Buscar extends javax.swing.JDialog {
    /*
     * Inicialización de variables a utilizar
     *
     * Esta variable será usada para comprobar si es la primera vez que pulsamos
     * la tecla de aceptar
     */
    private boolean haPulsadoAceptar=false;
    // Aquí almacenaremos el arreglo que contiene las entidades autorizadas
    Hashtable hashtable = new Hashtable<String,String>();
    // Preparamos las variables que recibirán los datos almacenados en disco
    ArrayList<CuentaAhorro> ahorro = new ArrayList<CuentaAhorro>();
    ArrayList<CuentaCorrientePersonal> personal = new ArrayList<CuentaCorrientePersonal>();
    ArrayList<CuentaCorrienteEmpresa> empresa = new ArrayList<CuentaCorrienteEmpresa>();
    // Indicamos el formato de fecha que vamos a utilizar
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
    // Esta variable será utilizada para indicar el nombre del fichero a cargar o guardar
    String fichero=null;
    // Creamos un objeto que será el encargado de leer o grabar en fichero
    Serializar serializa=new Serializar();
    // Variable para indicar el tipo de cuenta
    String[] tipCuen={  "",
                        "Cuenta de Ahorro",
                        "Cuenta Corriente Personal",
                        "Cuenta Corriente de Empresa"};
    // Variable para almacenar el hashtable
    Object datos[][];
   
    /**
     * Constructor sin parámetros
     */
    public Buscar(){
    }
    /**
     * Constructor que recibe la ventana llamante y si es de tipo modal
     * 
     * @param parent
     * @param modal 
     */
    public Buscar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        // Visualiza sólo los campos comunes vacíos
        limpiar();
        // Cargar los ArrayList con sus datos provenientes de los ficheros
        leerDatos();
        // Ponemos el título a la ventana
        setTitle("Mostrar los datos de una cuenta");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        jPanel_int = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        interes = new javax.swing.JTextField();
        jPanel_CCP = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        comision = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        mTabla = new javax.swing.JTable();
        jPanel_CCE = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        intDesc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        maxDesc = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        comDesc = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        mTablaEmp = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        cancelar = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        jPanel_CCC = new javax.swing.JPanel();
        digCon = new javax.swing.JTextField();
        nCuenta = new javax.swing.JTextField();
        entidad = new javax.swing.JTextField();
        oficina = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar un cliente");

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
        saldo.setToolTipText("Saldo actual de su cuenta");
        saldo.setMaximumSize(new java.awt.Dimension(10, 30));

        nombre.setEditable(false);
        nombre.setToolTipText("Nombre del cliente");
        nombre.setMaximumSize(new java.awt.Dimension(10, 30));

        cuenta.setEditable(false);
        cuenta.setFont(new java.awt.Font("Tahoma", 0, 10));
        cuenta.setToolTipText("Tipo de cuenta asignado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(190, 190, 190))
                            .addComponent(apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fecNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(jLabel5))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(saldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fecNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("Intereses: ");

        interes.setEditable(false);
        interes.setToolTipText("Interés de remuneración a aplicar a esta Cuenta de Ahorro");

        javax.swing.GroupLayout jPanel_intLayout = new javax.swing.GroupLayout(jPanel_int);
        jPanel_int.setLayout(jPanel_intLayout);
        jPanel_intLayout.setHorizontalGroup(
            jPanel_intLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_intLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(interes, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(304, Short.MAX_VALUE))
        );
        jPanel_intLayout.setVerticalGroup(
            jPanel_intLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_intLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(interes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel_CCP.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel_CCP.setMinimumSize(new java.awt.Dimension(500, 150));

        jLabel7.setText("Comisión: ");

        comision.setEditable(false);
        comision.setToolTipText("Comisión por mantenimiento de una Cuenta Corriente Personal");

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Entidades Autorizadas"));

        mTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        mTabla.setToolTipText("Entidades autorizadas a cobrar recibos en la Cuenta Corriente Personal");
        jScrollPane2.setViewportView(mTabla);

        javax.swing.GroupLayout jPanel_CCPLayout = new javax.swing.GroupLayout(jPanel_CCP);
        jPanel_CCP.setLayout(jPanel_CCPLayout);
        jPanel_CCPLayout.setHorizontalGroup(
            jPanel_CCPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CCPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(4, 4, 4)
                .addComponent(comision, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290))
        );
        jPanel_CCPLayout.setVerticalGroup(
            jPanel_CCPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CCPLayout.createSequentialGroup()
                .addGroup(jPanel_CCPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CCPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_CCPLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel_CCPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(comision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_CCE.setAlignmentX(0.0F);
        jPanel_CCE.setAlignmentY(1.0F);
        jPanel_CCE.setPreferredSize(new java.awt.Dimension(300, 125));

        jLabel8.setText("Intereses descubierto: ");

        intDesc.setEditable(false);
        intDesc.setToolTipText("Porcentaje que se aplicará en caso de descubierto");

        jLabel9.setText("Máximo descubierto: ");

        maxDesc.setEditable(false);
        maxDesc.setToolTipText("Cantidad máxima permitida como descubierto de fondos");

        jLabel11.setText("Comisión por descubierto:");

        comDesc.setEditable(false);
        comDesc.setToolTipText("Cantidad fija que se cobrará si se produce un descubierto");

        jScrollPane3.setBorder(javax.swing.BorderFactory.createTitledBorder("Entidades Autorizadas"));

        mTablaEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        mTablaEmp.setToolTipText("Entidades autorizadas a cobrar recibos en la Cuenta Corriente de Empresa");
        jScrollPane3.setViewportView(mTablaEmp);

        javax.swing.GroupLayout jPanel_CCELayout = new javax.swing.GroupLayout(jPanel_CCE);
        jPanel_CCE.setLayout(jPanel_CCELayout);
        jPanel_CCELayout.setHorizontalGroup(
            jPanel_CCELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CCELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_CCELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel_CCELayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_CCELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel_CCELayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel_CCELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maxDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(intDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel_CCELayout.setVerticalGroup(
            jPanel_CCELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CCELayout.createSequentialGroup()
                .addGroup(jPanel_CCELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CCELayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel_CCELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(intDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_CCELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(maxDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_CCELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cancelar.setText("Salir");
        cancelar.setToolTipText("Volver al menú principal");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelar)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelar)
        );

        aceptar.setText("Aceptar");
        aceptar.setToolTipText("Buscar al cliente");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel_int, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel_CCP, 0, 338, Short.MAX_VALUE)
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel_CCE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                                .addComponent(aceptar)))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel_CCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(130, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_CCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_int, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_CCP, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_CCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(aceptar)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nCuentaActionPerformed
        aceptarActionPerformed(evt);
    }//GEN-LAST:event_nCuentaActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // Variable a utilizar para convertir cada parte del CCC en número
        // y así poder comprobar si se han introducido números
        long numero=0;
        // Variable que recogerá/visualizará el lugar donde se ha producido el error
        String parte="";
        // Variables utilizadas para recoger el valor de la cuenta donde se ha
        // encontrado el registro y el número de orden de éste
        int cccRep=0,registro=0;
        // Si es la primera vez que se accede a la pantalla
        if(!isHaPulsadoAceptar()){
            // Cambiamos la variable para que la próxima pulsación sobre el
            // botón aceptar se dirija al else de este bloque
            haPulsadoAceptar = true;
            try{
                // Se comprueba que el código de cuenta sea correcto
                parte="Entidad, ";
                numero=Integer.parseInt(entidad.getText());
                parte="Oficina, ";
                numero=Integer.parseInt(oficina.getText());
                parte="Dígitos de Control, ";
                numero=Integer.parseInt(digCon.getText());
                parte="Nº Cuenta, ";
                numero=Long.parseLong(nCuenta.getText());
                // Si llega aquí sin errores es porque se ha introducido un número
                // como CCC y se ha de comprobar la validez de los dígitos de control
                if(digCon.getText().equals("") ||
                    !digCon.getText().equals(CuentaNueva.obtenerDigitosControl(entidad.getText(),
                    oficina.getText(),
                    nCuenta.getText()))){
                    JOptionPane.showMessageDialog(this, 
                            "Dígitos de control erróneo", 
                            "ERROR", 
                            JOptionPane.ERROR_MESSAGE);
                    digCon.setText("");
                }
                // El CCC es correcto y se une todo el código de cuenta en un string
                String ccc=entidad.getText()+oficina.getText()+digCon.getText()+nCuenta.getText();
                // Se comprueba si ese código existe en Cuenta de Ahorro
                for(int i=0;i<ahorro.size()&&registro<1;i++){
                    if(ahorro.get(i).CCC.equals(ccc)){
                        cccRep=1;
                        registro=i;
                        i=ahorro.size();
                    }
                }
                // Se comprueba si ese código existe en Cuenta Corriente Personal
                for(int i=0;i<personal.size()&&registro<1;i++){
                    if(personal.get(i).CCC.equals(ccc)){
                        cccRep=2;
                        registro=i;
                        i=personal.size();
                    }
                }
                // Se comprueba si ese código existe en Cuenta Corriente de Empresa
                for(int i=0;i<empresa.size()&&registro<1;i++){
                    if(empresa.get(i).CCC.equals(ccc)){
                        cccRep=3;
                        registro=i;
                        i=empresa.size();
                    }
                }
                // Si existe se muestran los datos
                if(cccRep>0&&cccRep<4){
                    siExiste(cccRep,registro);
                }else{
                    // Si no existe se avisa de ello
                    JOptionPane.showMessageDialog(this, 
                            "Nº de Cuenta inexistente", 
                            "ERROR", 
                            JOptionPane.ERROR_MESSAGE);
                }
            // Si se han tecleado caracteres no permitidos
            }catch(NumberFormatException nfe){
                parte=parte.substring(0, parte.length()-2);
                JOptionPane.showMessageDialog(this, 
                        "Sólo dígitos numéricos en\n"+parte, 
                        "ERROR", 
                        JOptionPane.ERROR_MESSAGE);
            }
        // Si ya se estan mostrando los datos y pulsamos sobre aceptar mostramos
        // únicamente los campos comunes vacíos
        }else{
            haPulsadoAceptar=false;
            limpiar();
        }
	}//GEN-LAST:event_aceptarActionPerformed

    /**
     * Volvemos al menú principal
     * @param evt
     */
    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.haPulsadoAceptar = false;         
	this.setVisible(false);     
	}//GEN-LAST:event_cancelarActionPerformed

    /**
     * Si el registro existe, lo mostramos
     * 
     * @param cuen 1-Cuenta de Ahorro,2-C.C. Personal,3-C.C. Empresa
     * @param num Número del registro localizado
     */
    private void siExiste(int cuen,int num){
        Date miFecha;
        String[] cabecera={"Entidad","Cantidad"};
        // Si es una cuenta de ahorro
        if(cuen==1){
            // Se visualizan los paneles de datos ocultos
            this.jPanel1.setVisible(true);
            this.jPanel_int.setVisible(true);
            // Se impide modificar el CCC
            sinoCCC(false);
            // Se actualizan todos los datos con los encontrados
            nombre.setText(ahorro.get(num).getNombre());
            apellidos.setText(ahorro.get(num).getApellidos());
            saldo.setText(ahorro.get(num).getSaldo().toString());
            saldo.setEditable(false);
            miFecha=(Date)ahorro.get(num).getFechaNac().getTime();
            fecNac.setText(formatoFecha.format(miFecha).toString());
            cuenta.setText(tipCuen[1]);
            interes.setText(ahorro.get(num).getInteres().toString());
        // Si es una cuenta corriente personal
        }else if(cuen==2){
            // Se visualizan los paneles de datos ocultos
            this.jPanel1.setVisible(true);
            this.jPanel_CCP.setVisible(true);
            // Se impide modificar el CCC
            sinoCCC(false);
            // Se muestran todos los datos
            saldo.setEditable(false);
            nombre.setText(personal.get(num).getNombre());
            apellidos.setText(personal.get(num).getApellidos());
            saldo.setText(personal.get(num).getSaldo().toString());
            miFecha=(Date)personal.get(num).getFechaNac().getTime();
            fecNac.setText(formatoFecha.format(miFecha).toString());
            cuenta.setText(tipCuen[2]);
            cuenta.setEditable(false);
            comision.setText(personal.get(num).getMantenimiento().toString());
            // Comprobamos cuántas entidades autorizadas existen para poder
            // inicializar el array
            hashtable=personal.get(num).getEntidad().getEntidades();
            int cuantos=0;
            Iterator it2=hashtable.entrySet().iterator();
            while(it2.hasNext()){
                Map.Entry c=(Map.Entry)it2.next();
                cuantos++;
            }
            // Cargamos los datos de la tabla con todas las entidades autorizadas
            Enumeration<String> e = hashtable.keys();
            String titulo=null;
            Object tit=null;
            // Ya sabemos cuántos elementos contendrá el array de datos
            datos=new Object[cuantos][2];
            cuantos=0;
            while(e.hasMoreElements()){
                titulo=e.nextElement();
                tit=hashtable.get(titulo);
                if(!tit.equals("")){
                    datos[cuantos][0]=titulo;
                    datos[cuantos][1]=tit;
                    cuantos++;
                }
            }
            // Visualizamos la tabla con todos los datos
            ModeloTabla jTabla=new ModeloTabla(cabecera,datos);
            mTabla.setModel(jTabla);
            mTabla.updateUI();
        // si es una cuenta corriente de empresa
        }else if(cuen==3){
            this.jPanel1.setVisible(true);
            this.jPanel_CCE.setVisible(true);
            sinoCCC(false);
            saldo.setEditable(false);
            nombre.setText(empresa.get(num).getNombre());
            apellidos.setText(empresa.get(num).getApellidos());
            saldo.setText(empresa.get(num).getSaldo().toString());
            miFecha=(Date)empresa.get(num).getFechaNac().getTime();
            fecNac.setText(formatoFecha.format(miFecha).toString());
            cuenta.setText(tipCuen[3]);
            cuenta.setEditable(false);
            intDesc.setText(empresa.get(num).getInteres().toString());
            maxDesc.setText(empresa.get(num).getDescubierto().toString());
            comDesc.setText(empresa.get(num).getComision().toString());
            hashtable=empresa.get(num).getEntidad().getEntidades();
            int cuantos=0;
            // Comprobamos las entidades autorizadas para poder inicializar su array
            Iterator it2=hashtable.entrySet().iterator();
            while(it2.hasNext()){
                Map.Entry c=(Map.Entry)it2.next();
                cuantos++;
            }
            // Sabiendo cuántos elementos contiene, los cargamos en su Array y los
            // mostramos en la tabla
            Enumeration<String> e = hashtable.keys();
            String titulo=null;
            Object tit=null;
            datos=new Object[cuantos][2];
            cuantos=0;
            while(e.hasMoreElements()){
                titulo=e.nextElement();
                tit=hashtable.get(titulo);
                if(!tit.equals("")){
                    datos[cuantos][0]=titulo;
                    datos[cuantos][1]=tit;
                    cuantos++;
                }
            }
            // Visualiza la tabla con todos sus datos
            ModeloTabla jTabla=new ModeloTabla(cabecera,datos);
            mTablaEmp.setModel(jTabla);
            mTablaEmp.updateUI();
        }
    }

    // Se impide/permite modificar el CCC
    private void sinoCCC(boolean sino){
        oficina.setEditable(sino);
        entidad.setEditable(sino);
        digCon.setEditable(sino);
        nCuenta.setEditable(sino);
    }

    /**
     * Comprobamos si existen los ficheros de datos y los cargamos en sus
     * correspondientes ArrayList
     */
    private void leerDatos(){
        File datosGrab1 = new File("ahorro.dat");
        File datosGrab2 = new File("personal.dat");
        File datosGrab3 = new File("empresa.dat");
        if(datosGrab1.exists())
            ahorro=(ArrayList<CuentaAhorro>)serializa.leeObjeto("ahorro.dat");
        if(datosGrab2.exists())
            personal=(ArrayList<CuentaCorrientePersonal>)serializa.leeObjeto("personal.dat");
        if(datosGrab3.exists())
            empresa=(ArrayList<CuentaCorrienteEmpresa>)serializa.leeObjeto("empresa.dat");
    }

    /**
     * Inicializamos el número de cuenta y ocultamos el resto de paneles
     */
    private void limpiar(){
        this.jPanel1.setVisible(false);
        this.jPanel_int.setVisible(false);
        this.jPanel_CCE.setVisible(false);
        this.jPanel_CCP.setVisible(false);
        this.entidad.setText("");
        this.entidad.setEditable(true);
        this.digCon.setText("");
        this.digCon.setEditable(true);
        this.nCuenta.setText("");
        this.nCuenta.setEditable(true);
        this.oficina.setText("");
        this.oficina.setEditable(true);
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
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Buscar dialog = new Buscar(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField comDesc;
    private javax.swing.JTextField comision;
    private javax.swing.JTextField cuenta;
    private javax.swing.JTextField digCon;
    private javax.swing.JTextField entidad;
    private javax.swing.JTextField fecNac;
    private javax.swing.JTextField intDesc;
    private javax.swing.JTextField interes;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_CCC;
    private javax.swing.JPanel jPanel_CCE;
    private javax.swing.JPanel jPanel_CCP;
    private javax.swing.JPanel jPanel_int;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable mTabla;
    private javax.swing.JTable mTablaEmp;
    private javax.swing.JTextField maxDesc;
    private javax.swing.JTextField nCuenta;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField oficina;
    private javax.swing.JTextField saldo;
    // End of variables declaration//GEN-END:variables
}

