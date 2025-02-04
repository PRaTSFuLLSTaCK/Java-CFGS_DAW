package Prog_Tarea09;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
*
* @author José Luis
* @version 9.1
*/
public class CuentaNueva extends javax.swing.JDialog {
  /*
   * Inicialización de variables a utilizar
   */
  ArrayList<CuentaAhorro> ahorro = new ArrayList<CuentaAhorro>();
  ArrayList<CuentaCorrientePersonal> personal = new ArrayList<CuentaCorrientePersonal>();
  ArrayList<CuentaCorrienteEmpresa> empresa = new ArrayList<CuentaCorrienteEmpresa>();
  ArrayList<CuentaAhorro> ahorro2 = new ArrayList<CuentaAhorro>();
  String fichero=null;
  Serializar serializa=new Serializar();
  static Pattern fechaValida = Pattern.compile("([0-9]|([0-2][0-9])|(3[0-1]))[\\/|\\-]([0-9]|(0[0-9])|([0-1][0-2]))[\\/|\\-]([1-2][0-9]{3})");
  private boolean haPulsadoAceptar=false;
  String[] tipCuen={  "",
                      "Cuenta de Ahorro",
                      "Cuenta Corriente Personal",
                      "Cuenta Corriente de Empresa"};
  DefaultComboBoxModel modeloCombo;
  /**
   * Constructor sin parámetros
   */
  public CuentaNueva() {
  }

  /**
   * Constructor con dos parámetros
   * @param parent para memorizar la ventana llamante
   * @param modal para desactivar las funciones de la ventana llamante mientras
   * se esté mostrando esta.
   */
  public CuentaNueva(java.awt.Frame parent, boolean modal) {
      super(parent,modal);
      initComponents();
      // Cargamos los ArrayList con sus correspondientes datos
      leeDatos();
      // Preparamos las tablas que usaremos
      String[] columnas={"Entidad","Cantidad Máx"};
      Object[][] datos={{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""},{"",""}};
      ModeloTabla model=new ModeloTabla(columnas,datos);
      mTabla.setModel(model);
      mTablaEmp.setModel(model);
      mTabla.updateUI();
      mTablaEmp.updateUI();
      // Sólo visualizamos los datos generales para todas las cuentas
      jPanel_int.setVisible(false);
      jPanel_CCP.setVisible(false);
      jPanel_CCE.setVisible(false);
      // Cargamos el combo de tipos de cuentas con sus datos
      modeloCombo = new DefaultComboBoxModel(tipCuen);
      cuenta.setModel(modeloCombo);
  }


  /**
   * Función que nos devuelve si hemos pulsado aceptar
   * @return
   */
  public boolean isHaPulsadoAceptar(){
      return haPulsadoAceptar;
  }

 /**
   * Cargar en memoria los ArrayList con los datos almacenados en disco
   */
  private void leeDatos(){
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

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jLabel4 = new javax.swing.JLabel();
      fecNac = new javax.swing.JTextField();
      calendario = new javax.swing.JButton();
      jLabel5 = new javax.swing.JLabel();
      apellidos = new javax.swing.JTextField();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel10 = new javax.swing.JLabel();
      saldo = new javax.swing.JTextField();
      nombre = new javax.swing.JTextField();
      cuenta = new javax.swing.JComboBox();
      jPanel_CCC = new javax.swing.JPanel();
      digCon = new javax.swing.JTextField();
      nCuenta = new javax.swing.JTextField();
      entidad = new javax.swing.JTextField();
      oficina = new javax.swing.JTextField();
      jLabel14 = new javax.swing.JLabel();
      jLabel12 = new javax.swing.JLabel();
      jLabel13 = new javax.swing.JLabel();
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
      aceptar = new javax.swing.JButton();
      cancelar = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
      setTitle("Abrir una cuenta nueva");

      jLabel4.setText("Fecha de Nacimiento:");

      fecNac.setToolTipText("Fecha de nacimiento del cliente en el formato DD-MM-AAAA");
      fecNac.setMaximumSize(new java.awt.Dimension(10, 30));
      fecNac.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              fecNacActionPerformed(evt);
          }
      });

      calendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.png"))); // NOI18N
      calendario.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              calendarioActionPerformed(evt);
          }
      });

      jLabel5.setText("Tipo de cuenta:");

      apellidos.setToolTipText("Introduzca los apellidos del cliente");
      apellidos.setMaximumSize(new java.awt.Dimension(10, 30));

      jLabel2.setText("Nombre: ");

      jLabel3.setText("Apellidos: ");

      jLabel10.setText("Saldo:");

      saldo.setToolTipText("Cantidad con la que abre la cuenta");
      saldo.setMaximumSize(new java.awt.Dimension(10, 30));

      nombre.setToolTipText("Introduzca el nombre del cliente");
      nombre.setMaximumSize(new java.awt.Dimension(10, 30));

      cuenta.setToolTipText("Seleccione el tipo de cuenta que desea abrir");
      cuenta.setMaximumSize(new java.awt.Dimension(10, 200));
      cuenta.setPreferredSize(new java.awt.Dimension(10, 30));
      cuenta.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              cuentaActionPerformed(evt);
          }
      });

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
                          .addComponent(apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                          .addComponent(jLabel3)))
                  .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                          .addComponent(saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                          .addComponent(jLabel10))
                      .addGap(18, 18, 18)
                      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                          .addComponent(fecNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                          .addComponent(jLabel4))
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                      .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addGap(18, 18, 18)
                      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                          .addComponent(cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                  .addComponent(cuenta, 0, 0, Short.MAX_VALUE)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                      .addComponent(calendario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
                      .addComponent(saldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addComponent(fecNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addContainerGap())
      );

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

      jLabel6.setText("Intereses: ");

      interes.setToolTipText("Interés de remuneración a aplicar a esta Cuenta de Ahorro");

      javax.swing.GroupLayout jPanel_intLayout = new javax.swing.GroupLayout(jPanel_int);
      jPanel_int.setLayout(jPanel_intLayout);
      jPanel_intLayout.setHorizontalGroup(
          jPanel_intLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel_intLayout.createSequentialGroup()
              .addContainerGap()
              .addComponent(jLabel6)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(interes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addContainerGap(348, Short.MAX_VALUE))
      );
      jPanel_intLayout.setVerticalGroup(
          jPanel_intLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel_intLayout.createSequentialGroup()
              .addGroup(jPanel_intLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jLabel6)
                  .addComponent(interes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addContainerGap(10, Short.MAX_VALUE))
      );

      jPanel_CCP.setMaximumSize(new java.awt.Dimension(500, 500));
      jPanel_CCP.setMinimumSize(new java.awt.Dimension(500, 150));

      jLabel7.setText("Comisión: ");

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
              "Title 1", "mponent", "Title 3", "Title 4"
          }
      ) {
          boolean[] canEdit = new boolean [] {
              true, false, true, true
          };

          public boolean isCellEditable(int rowIndex, int columnIndex) {
              return canEdit [columnIndex];
          }
      });
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
              .addGap(292, 292, 292))
      );
      jPanel_CCPLayout.setVerticalGroup(
          jPanel_CCPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel_CCPLayout.createSequentialGroup()
              .addContainerGap()
              .addGroup(jPanel_CCPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(jPanel_CCPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                      .addComponent(jLabel7)
                      .addComponent(comision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      jPanel_CCE.setAlignmentX(0.0F);
      jPanel_CCE.setAlignmentY(1.0F);
      jPanel_CCE.setPreferredSize(new java.awt.Dimension(300, 125));

      jLabel8.setText("Intereses descubierto: ");

      jLabel9.setText("Máximo descubierto: ");

      jLabel11.setText("Comisión por descubierto:");

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

      aceptar.setText("Aceptar");
      aceptar.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              aceptarActionPerformed(evt);
          }
      });

      cancelar.setText("Cancelar");
      cancelar.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              cancelarActionPerformed(evt);
          }
      });

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
          jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
              .addComponent(cancelar)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
              .addComponent(aceptar))
      );
      jPanel2Layout.setVerticalGroup(
          jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(aceptar)
              .addComponent(cancelar))
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
                      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addContainerGap())
                  .addGroup(layout.createSequentialGroup()
                      .addComponent(jPanel_CCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addContainerGap(156, Short.MAX_VALUE))
                  .addGroup(layout.createSequentialGroup()
                      .addComponent(jPanel_CCP, 0, 430, Short.MAX_VALUE)
                      .addGap(20, 20, 20))
                  .addGroup(layout.createSequentialGroup()
                      .addComponent(jPanel_CCE, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addContainerGap(48, Short.MAX_VALUE))
                  .addGroup(layout.createSequentialGroup()
                      .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addGap(54, 54, 54))))
      );
      layout.setVerticalGroup(
          layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
              .addContainerGap()
              .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(jPanel_CCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(jPanel_int, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(jPanel_CCP, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(jPanel_CCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      pack();
  }// </editor-fold>//GEN-END:initComponents

  private void nCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nCuentaActionPerformed
      // Si pulsamos intro sobre el número de cuenta es igual que si hubiésemos
      // pulsado sobre el botón de aceptar
      aceptarActionPerformed(evt);
}//GEN-LAST:event_nCuentaActionPerformed

  private void fecNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecNacActionPerformed
      // Si no es correcta la fecha se borra
      if(!compruebaFecha(fecNac.getText().trim())){
          fecNac.setText(null);
      }
}//GEN-LAST:event_fecNacActionPerformed

  // Botón del calendario
  private void calendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calendarioActionPerformed
      JCalendar jcal=new JCalendar();
      SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
      // Si tenemos alguna fecha tecleada, la usamos para asignarla al calendario
      if(fecNac.getText()!=null){
          try{
              Date fechaBoton=formatoFecha.parse(fecNac.getText());
              jcal.setDate(fechaBoton);
          }catch(Exception e){}
      }
      // Dibujamos el calendario en una ventana emergente, igual que cualquier aviso
      JOptionPane.showMessageDialog(this, jcal,"Seleccione la fecha",JOptionPane.PLAIN_MESSAGE);
      // Cuando seleccionemos una fecha en el calendario la ponemos en fecNac
      // en el formato DD-MM-AAAA
      fecNac.setText(
              String.valueOf(jcal.getCalendar().get(5))+"-"+
              String.valueOf(jcal.getCalendar().get(2)+1)+"-"+
              String.valueOf(jcal.getCalendar().get(1)));
}//GEN-LAST:event_calendarioActionPerformed

  /**
   * Método para visualizar sólo los apartados que necesitemos según el tipo
   * de cuenta seleccionado en el Combo
   * 
   * @param evt 
   */
  private void cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuentaActionPerformed
      // Recogemos el valor de la selección realizada
      String textoCuenta=cuenta.getSelectedItem().toString();
      if(textoCuenta.equals("Cuenta de Ahorro")){
          jPanel_int.setVisible(true);
          jPanel_CCP.setVisible(false);
          jPanel_CCE.setVisible(false);
      }else if(textoCuenta.equals("Cuenta Corriente Personal")){
          jPanel_int.setVisible(false);
          jPanel_CCP.setVisible(true);
          jPanel_CCE.setVisible(false);
      }else if(textoCuenta.equals("Cuenta Corriente de Empresa")){
          jPanel_int.setVisible(false);
          jPanel_CCP.setVisible(false);
          jPanel_CCE.setVisible(true);
      }else{
          jPanel_int.setVisible(false);
          jPanel_CCP.setVisible(false);
          jPanel_CCE.setVisible(false);
      }
}//GEN-LAST:event_cuentaActionPerformed

  /**
   * Cuando pulsamos el botón de cancelar ocultamos esta ventana
   * @param evt 
   */
  private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
      this.haPulsadoAceptar=false;
      this.setVisible(false);
}//GEN-LAST:event_cancelarActionPerformed

  /**
   * Al pulsar sobre aceptar
   * @param evt
   */
  private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
      String error="";
      /*
       * Creamos un objeto serializar para poder grabar y leer los ficheros
       */
      Serializar serial = new Serializar();
      /*
       * Creamos un arreglo Hashtable para ir memorizando los datos de las
       * entidades autorizadas y posteriormente volcar su contenido en la 
       * clase 'ent' de tipo Entidades
       */
      Hashtable entidadesAut = new Hashtable<String,String>();
      Entidades ent=new Entidades();
      // recogemos el valor del tipo de cuenta seleccionado en el combo
      String textoCuenta=cuenta.getSelectedItem().toString();
      // Se prepara el formato de la fecha
      GregorianCalendar fecCal=new GregorianCalendar();
      SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
      Date fechaBoton=null;
      // Se comprueba si existe algún tipo de error
      error=comprobacion();
      // Si no existen errores, grabamos los datos y volvemos
      if(error.equals("")){
          try {
              fechaBoton = formatoFecha.parse(fecNac.getText());
          } catch (ParseException ex) {
              error="Fecha errónea";
              JOptionPane.showMessageDialog(this,
                      "Formato de fecha no admitido",
                      "ERROR",
                      JOptionPane.ERROR_MESSAGE);
          }
          fecCal.setTime(fechaBoton);
          //  Se une todo el número de cuenta, que es como se guardará
          String ccc=entidad.getText()+oficina.getText()+digCon.getText()+nCuenta.getText();

          /*
           * si es una cuenta de ahorro
           */
          if(textoCuenta.equals(tipCuen[1])){
              fichero="ahorro.dat";
              CuentaAhorro cliente=new CuentaAhorro();
              // Se recogen todos los datos en el ArrayList de tipo CuentaAhorro
              cliente.setInteres(Float.parseFloat(interes.getText()));
              cliente.setSaldo(Float.parseFloat(saldo.getText()));
              cliente.setCCC(ccc);
              cliente.setNombre(nombre.getText());
              cliente.setApellidos(apellidos.getText());
              cliente.setFechaNac(fecCal);
              // Se añaden los datos introducidos al ArrayList
              ahorro.add(cliente);
              // Se graba el ArrayList en su fichero
              serial.grabaObjeto(ahorro, fichero);
          /* 
           * Si es una cuenta corriente personal    
           */
          }else if(textoCuenta.equals(tipCuen[2])){
              fichero="personal.dat";
              CuentaCorrientePersonal cliente=new CuentaCorrientePersonal();
              for(int i=0;i<mTabla.getRowCount();i++){
                  entidadesAut.put(mTabla.getValueAt(i, 0),mTabla.getValueAt(i, 1));
              }
              // Se graba un registro en blanco para prevenir que no se haya
              // indicado ninguna entidad autorizada
              entidadesAut.put(" ", " ");
              ent.setEntidades(entidadesAut);
              // Se recogen todos los datos en el ArrayList de tipo CuentaCorrientePersonal
              cliente.setMantenimiento(Float.parseFloat(comision.getText()));
              cliente.setEntidad(ent);
              cliente.setSaldo(Float.parseFloat(saldo.getText()));
              cliente.setCCC(ccc);
              cliente.setNombre(nombre.getText());
              cliente.setApellidos(apellidos.getText());
              cliente.setFechaNac(fecCal);
              // Se añaden los datos introducidos al ArrayList
              personal.add(cliente);
              // Se graba el ArrayList en su fichero
              serial.grabaObjeto(personal, fichero);
          /*
           * Si es una cuenta Corriente de Empresa    
           */
          }else if(textoCuenta.equals(tipCuen[3])){
              fichero="empresa.dat";
              CuentaCorrienteEmpresa cliente=new CuentaCorrienteEmpresa();
              for(int i=0;i<mTabla.getRowCount();i++){
                  entidadesAut.put(mTablaEmp.getValueAt(i, 0),mTablaEmp.getValueAt(i, 1));
              }
              // Se graba un registro en blanco para prevenir que no se haya
              // indicado ninguna entidad autorizada
              entidadesAut.put(" ", " ");
              ent.setEntidades(entidadesAut);
              // Se recogen todos los datos en el ArrayList de tipo CuentaCorrienteEmpresa
              cliente.setInteres(Double.parseDouble(intDesc.getText()));
              cliente.setDescubierto(Float.parseFloat(maxDesc.getText()));
              cliente.setComision(Double.parseDouble(comDesc.getText()));
              cliente.setSaldo(Float.parseFloat(saldo.getText()));
              cliente.setCCC(ccc);
              cliente.setNombre(nombre.getText());
              cliente.setApellidos(apellidos.getText());
              cliente.setFechaNac(fecCal);
              cliente.setEntidad(ent);
              // Se añaden los datos introducidos al ArrayList
              empresa.add(cliente);
              // Se graba el ArrayList en su fichero
              serial.grabaObjeto(empresa, fichero);
          // Si no se ha seleccionado una cuenta se avisa
          }else{
              JOptionPane.showMessageDialog(this,
                      "No ha seleccionado el tipo de cuenta",
                      "ERROR",
                      JOptionPane.ERROR_MESSAGE);
          }
          // Se vuelve al menú principal
          this.setVisible(false);
      // Si existen errores se indican cuáles son
      }else{
          JOptionPane.showMessageDialog(this,
                  "No se puede grabar el registro\nError en: "+error.substring(0, error.length()-2),
                  "ERROR",
                  JOptionPane.ERROR_MESSAGE);
      }
}//GEN-LAST:event_aceptarActionPerformed

  /**
   * Método que nos devolverá si nos hemos equivocado en la introducción de algún
   * dato, o devuelve una cadena vacía si todo está correcto
   * @return 
   */
  public String comprobacion(){
      String error="";
      boolean cccRep1=false,cccRep2=false,cccRep3=false;
      String textoCuenta=cuenta.getSelectedItem().toString();
      // Comprobamos que la cuenta no esté dada de alta ya
      String ccc=entidad.getText()+oficina.getText()+digCon.getText()+nCuenta.getText();
      // Comprobamos su existencia en el ArrayList de Cuentas de Ahorro
      for(int i=0;i<ahorro.size();i++){
          if(ahorro.get(i).CCC.equals(ccc)){
              cccRep1=true;
              i=ahorro.size();
          }
      }
      // Comprobamos su existencia en el ArrayList de Cuentas Corrientes Personales
      for(int i=0;i<personal.size();i++){
          if(personal.get(i).CCC.equals(ccc)){
              cccRep2=true;
              i=personal.size();
          }
      }
      // Comprobamos su existencia en el ArrayList de Cuentas Corrientes de Empresa
      for(int i=0;i<empresa.size();i++){
          if(empresa.get(i).CCC.equals(ccc)){
              cccRep3=true;
              i=empresa.size();
          }
      }
      // Comprobamos que hayamos tecleado algo como Nombre
      if(nombre.getText().equals("")) {
          error="Nombre, ";}
      // Comprobamos que hayamos tecleado algo como Apellidos
      if(apellidos.getText().equals("")) {
          error+="Apellidos, ";}
      // Comprobamos que la fecha tenga un formato completamente válido
      if(!compruebaFecha(fecNac.getText().trim())) {
          error+="Fecha nacimiento, ";
          fecNac.setText(null);
      }
      // Comprobamos que el saldo tenga valor, que sea numérico y que sea positivo
      if(saldo.getText().equals("")) {
          error+="Saldo vacío, ";}
      try{
          if(Integer.parseInt(saldo.getText())<=0){
              error+="Saldo negativo, ";
          }
      }catch(NumberFormatException nfe){
          error+="Nº para saldo erróneo, ";
      }
      // Comprobamos que se haya seleccionado un valor en el combo de Tipo de Cuenta
      if(textoCuenta.equals("")) {
          error += "Tipo de cuenta, ";}
      // Comprobamos que los dígitos de control sean correctos
      if(digCon.getText().trim().equals("") ||
              !digCon.getText().equals(obtenerDigitosControl( entidad.getText(),
                                                              oficina.getText(),
                                                              nCuenta.getText()))){
          error+="Dígitos Control, ";
          digCon.setText("");
      }
      // Memorizamos el tipo de cuenta a la que pertenece (Si está repetido)
      if(cccRep1||cccRep2||cccRep3){
          error+="Código de cuenta ya introducido en ";
          if(cccRep1){
              error+="Cuenta de Ahorro, ";
          }else if(cccRep2){
              error+="Cuenta Corriente Personal, ";
          }else if(cccRep3){
              error+="Cuenta Corriente de Empresa, ";
          }
          entidad.setText("");
          oficina.setText("");
          digCon.setText("");
          nCuenta.setText("");
      }
      // Comprobamos la parte específica del tipo de cuenta
      
      // Si es una Cuenta de Ahorro comprobamos que 'interes' sea numérico
      if(textoCuenta.equals(tipCuen[1])){
          float inter=0;
          try{
              inter=Float.parseFloat(interes.getText());
          } catch(NumberFormatException nfe){
              error+="Interes, ";
          }
      }
      // Si es una Cuenta Corriente Personal comprobamos que 'comision' sea numérico
      if(textoCuenta.equals(tipCuen[2])){
          float manten=0;
          try{
              manten=Float.parseFloat(comision.getText());
          }catch(NumberFormatException nfe){
              error+="Comisión de mantenimiento, ";
          }
      }
      // Si es una Cuenta Corriente de Empresa comprobamos que tanto los 
      // intereses como el máximo de descubierto y la comisión, sean numéricos
      if(textoCuenta.equals(tipCuen[3])){
          double des1;
          float des2;
          try{
              des1=Double.parseDouble(intDesc.getText());
          }catch(NumberFormatException nfe1){
              error+="Intereses descubierto, ";
          }
          try{
              des2=Float.parseFloat(maxDesc.getText());
          }catch(NumberFormatException nfe2){
              error+="Máximo descubierto, ";
          }
          try{
              des1=Double.parseDouble(comDesc.getText());
          }catch(NumberFormatException nfe3){
              error+="Comisión por mantenimiento, ";
          }
      }
      return error;
  }
  
  /**
   * Método para comprobar la validez de la fecha que hayamos tecleado
   * 
   * @param fechaTexto
   * @return 
   */
  public boolean compruebaFecha(String fechaTexto){
      Matcher deteccionFecha = fechaValida.matcher(fechaTexto);
      // Si la fecha introducida no coincide con el formato permitido se indica
      if (!deteccionFecha.matches()) {
          JOptionPane.showMessageDialog(this,
                  "La fecha " + fechaTexto + " es errónea.\nIntrodúzcala de nuevo en el formato:\n DD/MM/AAAA\no\nDD-MM-AAAA",
                  "Fecha errónea",
                  JOptionPane.ERROR_MESSAGE);
          return false;
      }else{
          /*
           * Se almacenan los meses y los días por mes para la comprobación
           * de la fecha (si la hemos introducido sin usar el botón del 
           * calendario).
           */
          int[] numDia={31,28,31,30,31,30,31,31,30,31,30,31};
          String[] nomMes={
              "Enero",
              "Febrero",
              "Marzo",
              "Abril",
              "Mayo",
              "Junio",
              "Julio",
              "Agosto",
              "Septiembre",
              "Octubre",
              "Noviembre",
              "Diciembre"};
          int bisiesto=0;
          try{
              // si no se corresponde con una fecha válida se avisa de ello
              int dia = Integer.parseInt(deteccionFecha.group(1));
              int mes = Integer.parseInt(deteccionFecha.group(4));
              int anno = Integer.parseInt(deteccionFecha.group(7));
              bisiesto=((anno%4==0 && anno%100!=0) || anno%400==0)?1:0;
              if((dia>numDia[mes-1] && mes!=2) || (mes==2 && dia>numDia[mes-1]+bisiesto)){
                  JOptionPane.showMessageDialog(this,
                      nomMes[mes-1]+" del "+anno+" no tiene "+dia+" dias",
                      "Fecha errónea",
                      JOptionPane.ERROR_MESSAGE);
                  return false;
              }
          // Si no se introducen valores numéricos en la fecha
          }catch(Exception e){
              JOptionPane.showMessageDialog(this,
                  "La fecha "+fechaTexto+" NO es válida.",
                  "Fecha NO válida",
                  JOptionPane.ERROR_MESSAGE);
              fecNac.setText(null);
              return false;
          }
      }
      return true;
  }

  // Método para comprobar que se ha introducido un número y que tiene la
  // longitud indicada
  public boolean compruebaNumero(String cadena,int longitud){
      try{
          if(Integer.parseInt(cadena)<=0 || cadena.length()>longitud){
              JOptionPane.showMessageDialog(this,
                          "Valor "+cadena+" no permitido",
                          "Código Cuenta Cliente ",
                          JOptionPane.ERROR_MESSAGE);
              return false;
          }else{
              return true;
          }
      }catch(NumberFormatException nfe){
          JOptionPane.showMessageDialog(this,
                          "Imposible pasar "+cadena+" a número",
                          "Código Cuenta Cliente ",
                          JOptionPane.ERROR_MESSAGE);
          return false;
      }
  }

  /**
   * Método para obtener los dígitos de control enviándole el número de la
   * entidad, oficina y cuenta.
   *
   * @param entidad
   * @param oficina
   * @param numCuenta
   * @return
   */
  public static String obtenerDigitosControl(String entidad, String oficina, String numCuenta){
      // memorizamos los valores multiplicadores
      int [] numeSerie={1,2,4,8,5,10,9,7,3,6};
      // añadimos dos ceros al principio para poder hacer los cálculos con entidad y oficina
      String entOfi="00"+entidad+oficina;
      // Inicializamos variables a usar
      String nume=numCuenta;
      String DC="";
      int dc1=0;
      int dc2=0;
      // Sumamos cada dígito de entidad y oficina, y numCuenta multiplicados por
      // el que ocupa su misma posición  de numeSerie
      for(int x=0;x<numeSerie.length;x++){
          dc1+=numeSerie[x]*(entOfi.charAt(x)-48);
          dc2+=numeSerie[x]*(nume.charAt(x)-48);
      }
      // Le restamos a 11 el resto de la división entre el valor obtenido y el número 11
      dc1=11-(dc1%11);
      dc2=11-(dc2%11);
      // Comprobamos si nos ha dado 11 (pondremos 0) ó 10 (pondremos 1)
      dc1=dc1==11?0:dc1==10?1:dc1;
      dc2=dc2==11?0:dc2==10?1:dc2;
      // Unimos los dos valores finales antes de devolver el resultado al método llamante
      DC=String.valueOf(dc1)+String.valueOf(dc2);
      return DC;
  }

  /**
   * Metodo principal
   * 
   * @param args the command line arguments
   */
  public static void main(String args[]) {
      java.awt.EventQueue.invokeLater(new Runnable() {
          public void run() {
              CuentaNueva dialog = new CuentaNueva(new javax.swing.JFrame(), true);
              dialog.addWindowListener(new java.awt.event.WindowAdapter() {
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
  private javax.swing.JButton calendario;
  private javax.swing.JButton cancelar;
  private javax.swing.JTextField comDesc;
  private javax.swing.JTextField comision;
  private javax.swing.JComboBox cuenta;
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

