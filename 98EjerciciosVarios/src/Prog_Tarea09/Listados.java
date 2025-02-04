package Prog_Tarea09;

/*
 * Listados.java
 *
 * Created on 30-abr-2012, 20:01:52
 */
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
import org.freixas.jcalendar.JCalendar;

/**
 *
 * @author José Luis
 * @version 9.1
 */
public class Listados extends javax.swing.JDialog {
    // Inicializamos las variables de clase
    Serializar serializa=new Serializar();
    JCalendar jcal=new JCalendar();
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
    Date miFecha=new Date();
    String fecha=null;
    String[] columnas;
    String[][] cabecera={{"Nombre","Apellidos","Fech. Nac.","Saldo","Nº Cuenta","Interes"},
                        {"Nombre","Apellidos","Fech. Nac.","Saldo","Nº Cuenta","Comisión","Ent.Aut.","Cant.Aut."},
                        {"Nombre","Apellidos","Fecha Nac.","Saldo","Nº Cuenta","Int.Desc.","Max.Desc.","Com.Desc.","Ent.Aut","Cant.Aut."},
                        {"Nombre","Apellidos","Fecha Nac.","Saldo","Nº Cuenta","Interes","Comisión","Int.Desc.","Max.Desc.","Com.Desc.","Ent.Aut.","Cant.Aut."}
    };
    Object[][] datos;
    Object[][] nuevo;
    String[] nombreFic={"ahorro.dat","personal.dat","empresa.dat"};
    ArrayList<CuentaAhorro> ahorro1 = new ArrayList<CuentaAhorro>();
    ArrayList<CuentaCorrientePersonal> ahorro2 = new ArrayList<CuentaCorrientePersonal>();
    ArrayList<CuentaCorrienteEmpresa> ahorro3 = new ArrayList<CuentaCorrienteEmpresa>();
    ArrayList cuenta;
    /** Creates new form Listados */
    public Listados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jTabla_lis.setVisible(false);
        

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ahorro = new javax.swing.JButton();
        ccp = new javax.swing.JButton();
        cce = new javax.swing.JButton();
        todo = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panel1 = new javax.swing.JScrollPane();
        jTabla_lis = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listado de cuentas dadas de alta");

        ahorro.setText("Cuentas de Ahorro");
        ahorro.setToolTipText("Mostrar todas las cuentas de ahorro dadas de alta");
        ahorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ahorroActionPerformed(evt);
            }
        });

        ccp.setText("Cuentas Corrientes Personales");
        ccp.setToolTipText("Mostrar todas las cuentas corrientes personales dadas de alta");
        ccp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccpActionPerformed(evt);
            }
        });

        cce.setText("Cuentas Corrientes de Empresa");
        cce.setToolTipText("Mostrar todas las cuentas correintes de empresa dadas de alta");
        cce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cceActionPerformed(evt);
            }
        });

        todo.setText("Todas las cuentas");
        todo.setToolTipText("Mostrar todas las cuentas dadas de alta");
        todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todoActionPerformed(evt);
            }
        });

        jButton5.setText("Salir");
        jButton5.setToolTipText("Volver al menú principal");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14));
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Listados de cuentas");

        jTabla_lis.setModel(new javax.swing.table.DefaultTableModel(
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
        panel1.setViewportView(jTabla_lis);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ahorro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ccp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cce)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(todo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ahorro)
                    .addComponent(ccp)
                    .addComponent(cce)
                    .addComponent(todo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Si pulsamos sobre el botón de Cuentas de Ahorro
     * 
     * @param evt 
     */
    private void ahorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ahorroActionPerformed
        File datosGrab = new File(nombreFic[0]);
        // si existe el fichero de Cuentas de Ahorro
        if(datosGrab.exists()){
            // Se cargan los datos en el ArrayList de su tipo definido en la clase
            ahorro1=(ArrayList<CuentaAhorro>)serializa.leeObjeto(nombreFic[0]);
            // Cuentas de Ahorro usará 6 columnas de la tabla
            columnas=new String[6];
            // Se determina el número de filas que tendrá según el nº de registros
            datos=new Object[ahorro1.size()][columnas.length];
            // Se recorre el arreglo cargando su contenido en el array
            for(int i=0;i<ahorro1.size();i++){
                datos[i][0]=ahorro1.get(i).getNombre();
                datos[i][1]=ahorro1.get(i).getApellidos();
                miFecha=(Date)ahorro1.get(i).getFechaNac().getTime();
                datos[i][2]=formatoFecha.format(miFecha);
                datos[i][3]=ahorro1.get(i).getSaldo().toString();
                datos[i][4]=ahorro1.get(i).getCCC();
                datos[i][5]=ahorro1.get(i).getInteres();
            }
            // Se define la tabla y se presentan los datos
            ModeloTabla mTabla=new ModeloTabla(cabecera[0],datos);
            jTabla_lis.setModel(mTabla);
            jTabla_lis.updateUI();
            jTabla_lis.setVisible(true);
        }else{
            // Si el fichero de Cuentas de Ahorro no existe
            JOptionPane.showMessageDialog(this, 
                    "No existen datos que mostrar para Cuentas de Ahorro", 
                    "ERROR", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ahorroActionPerformed

    private void cceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cceActionPerformed
        // incialización de las variables
        File datosGrab = new File(nombreFic[2]);
        boolean uno=false;
        int cuantos=0;
        int total=0;
        Hashtable hashtable = new Hashtable<String,String>();
        // Si el fichero de Cuentas Corrientes de Empresa existe
        if(datosGrab.exists()){
            // Se carga en el arreglo correspondiente los valores leidos del fichero
            ahorro3=(ArrayList<CuentaCorrienteEmpresa>)serializa.leeObjeto(nombreFic[2]);
            columnas=new String[10];
            // Determinamos cuántas líneas necesitaremos en la tabla para presentar los datos
            for(int j=0;j<ahorro3.size();j++){
                hashtable=ahorro3.get(j).getEntidad().getEntidades();
                Iterator it2=hashtable.entrySet().iterator();
                while(it2.hasNext()){
                    Map.Entry c=(Map.Entry)it2.next();
                    cuantos++;
                }
                total+=cuantos-1;
                cuantos=0;
            }
            // Cuando se termina de recorrer el ArrayList tendremos en total el
            // número de filas que necesitaremos para la tabla
            cuantos=0;
            datos=new Object[total][columnas.length];
            // Se recorre el arreglo cargando su contenido en el array
            for(int j=0;j<ahorro3.size();j++){
                datos[j+cuantos][0]=ahorro3.get(j).getNombre();
                datos[j+cuantos][1]=ahorro3.get(j).getApellidos();
                miFecha=(Date)ahorro3.get(j).getFechaNac().getTime();
                datos[j+cuantos][2]=formatoFecha.format(miFecha).toString();
                datos[j+cuantos][3]=ahorro3.get(j).getSaldo().toString();
                datos[j+cuantos][4]=ahorro3.get(j).getCCC();
                datos[j+cuantos][5]=ahorro3.get(j).getInteres().toString();
                datos[j+cuantos][6]=ahorro3.get(j).getDescubierto().toString();
                datos[j+cuantos][7]=ahorro3.get(j).getComision().toString();
                // Los arrays 8 y 9 se utilizarán para los datos del hashtable
                datos[j+cuantos][8]="";
                datos[j+cuantos][9]="";
                hashtable=ahorro3.get(j).getEntidad().getEntidades();
                uno=false;
                // Se cargan todos los datos del hashtable ocupando únicamente
                // las posiciones 8 y 9 del array
                Enumeration<String> e = hashtable.keys();
                String titulo=null;
                Object tit=null;
                while(e.hasMoreElements()){
                    titulo=e.nextElement();
                    tit=hashtable.get(titulo);
                    // si el arreglo contiene datos 
                    if(!tit.equals("")&&!tit.equals(" ") ){
                        // Si no es el primer dato se ha de rellenar los huecos
                        // 0 a 6 del array
                        if(uno)
                            for(int g=0;g<7;g++)
                                datos[j+cuantos][g]="";
                        // Las posiciones 8 y 9 se ocupan por la clave y el valor del hashtable
                        datos[j+cuantos][8]=titulo;
                        datos[j+cuantos][9]=tit;
                        uno=true;
                        cuantos++;
                    }
                }
            }
            // Cuando tenemos todos los datos cargados en el Array 'datos' 
            // los mostramos en la tabla
            ModeloTabla mTabla=new ModeloTabla(cabecera[2],datos);
            jTabla_lis.setModel(mTabla);
            jTabla_lis.updateUI();
            jTabla_lis.setVisible(true);
        }else{
            // Si no existen datos en las Cuentas de Ahorro de Empresas
            JOptionPane.showMessageDialog(this, 
                    "No existen datos que mostrar para Cuentas Corrientes de Empresas", 
                    "ERROR", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cceActionPerformed

    private void ccpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccpActionPerformed
        File datosGrab = new File(nombreFic[1]);
        boolean uno=false;
        int cuantos=0;
        int contador=0;
        int total=0;
        Hashtable hashtable = new Hashtable<String,String>();
        // Si el fichero de Cuentas Corrientes Personales existe
        if(datosGrab.exists()){
            // introducimos los datos leidos en ahorro2
            ahorro2=(ArrayList<CuentaCorrientePersonal>)serializa.leeObjeto(nombreFic[1]);
            // Para presentar los datos de CC personales necesitaremos 8 columnas de la tabla
            columnas=new String[8];
            // Determinamos cuántas líneas necesitaremos para presentar los datos
            for(int j=0;j<ahorro2.size();j++){
                hashtable=ahorro2.get(contador).getEntidad().getEntidades();
                Iterator it2=hashtable.entrySet().iterator();
                while(it2.hasNext()){
                    Map.Entry c=(Map.Entry)it2.next();
                    cuantos++;
                }
                total+=cuantos-1;
                cuantos=0;
                contador++;
            }
            // En 'total' tenemos las líneas que conformarán la tabla
            contador=0;
            datos=new Object[total][columnas.length];
            // Se recorre el arreglo cargando su contenido en el array
            for(int j=0;j<ahorro2.size();j++){
                datos[contador][0]=ahorro2.get(j).getNombre();
                datos[contador][1]=ahorro2.get(j).getApellidos();
                miFecha=(Date)ahorro2.get(j).getFechaNac().getTime();
                datos[contador][2]=formatoFecha.format(miFecha).toString();
                datos[contador][3]=ahorro2.get(j).getSaldo().toString();
                datos[contador][4]=ahorro2.get(j).getCCC();
                datos[contador][5]=ahorro2.get(j).getMantenimiento().toString();
                // Los arrays 6 y 7 se utilizarán para los datos del hashtable
                datos[contador][6]="";
                datos[contador][7]="";
                hashtable=ahorro2.get(j).getEntidad().getEntidades();
                uno=false;
                cuantos=0;
                // Se cargan todos los datos del hashtable ocupando únicamente
                // las posiciones 6 y 7 del array
                Enumeration<String> e = hashtable.keys();
                String titulo=null;
                Object tit=null;
                while(e.hasMoreElements()){
                    titulo=e.nextElement();
                    tit=hashtable.get(titulo);
                    // si el arreglo contiene datos 
                    if(!tit.equals("")&&!tit.equals(" ") ){
                        // Si no es el primer dato se ha de rellenar los huecos
                        // 0 a 5 del array
                        if(uno)
                            for(int g=0;g<6;g++)
                                datos[contador+cuantos][g]="";
                        // Las posiciones 6 y 7 se ocupan por la clave y el valor del hashtable
                        datos[contador+cuantos][6]=titulo;
                        datos[contador+cuantos][7]=tit;
                        uno=true;
                        cuantos++;
                    }
                }
                // Se controla en qué fila de la tabla nos hemos quedado mostrando los datos
                contador+=cuantos;
            }
            // Cuando tenemos todos los datos cargados en el Array 'datos' 
            // los mostramos en la tabla
            ModeloTabla mTabla=new ModeloTabla(cabecera[1],datos);
            jTabla_lis.setModel(mTabla);
            jTabla_lis.updateUI();
            jTabla_lis.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, 
                    "No existen datos que mostrar para Cuentas Corrientes Personales", 
                    "ERROR", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ccpActionPerformed

    /**
     * Botón de salir
     * @param evt 
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todoActionPerformed
        int numReg=0;
        boolean uno=false;
        int cuantos=0;
        int total=0;
        int contar=0;
        int lleva=0;
        File datosGrab1 = new File(nombreFic[0]);
        File datosGrab2 = new File(nombreFic[1]);
        File datosGrab3 = new File(nombreFic[2]);
        Hashtable hashtable = new Hashtable<String,String>();
        /*
         * Primero hemos de saber cuántas líneas vamos a necesitar para crear
         * la tabla, por lo que tendremos que recorrer todos los datos para
         * contabilizar cuántos se han leido
         */
        // Si existen cuentas de ahorro
        if(datosGrab1.exists()){
            // se memorizan los datos de la cuenta
            ahorro1=(ArrayList<CuentaAhorro>)serializa.leeObjeto(nombreFic[0]);
            // se almacenan el número de clientes
            numReg=ahorro1.size();
            // Se va memorizando el número de registros mas dos, para las líneas
            // del titulo y una de separación
            total=numReg+2;
        }
        // Si existen cuentas corrientes personales
        if(datosGrab2.exists()){
            // Se memorizan los datos de la cuenta
            ahorro2=(ArrayList<CuentaCorrientePersonal>)serializa.leeObjeto(nombreFic[1]);
            // Se almacena el número de clientes
            numReg+=ahorro2.size();
            // se inicializa la variable que contendrá las entidades autorizadas
            // ya que cada una de ellas ocupará una línea en la tabla
            hashtable = new Hashtable<String,String>();
            // se recorren las cuentas corrientes personales dadas de alta para
            // ir memorizando todas las entidades autorizadas que posee cada registro
            for(int j=0;j<ahorro2.size();j++){
                // Se almacenan las entidades autorizadas
                hashtable=ahorro2.get(j).getEntidad().getEntidades();
                // Se inicializa una variable que sirva de iterador para recorrerlo
                Iterator it2=hashtable.entrySet().iterator();
                // Mientras existan datos
                while(it2.hasNext()){
                    // pone en c los datos de la entidad autorizada encontrada
                    // y pasa al siguiente registro del hashtable
                    Map.Entry c=(Map.Entry)it2.next();
                    // Se almacena el número de registros encontrados
                    cuantos++;
                }
                // Se siguen acumulando las líneas encontradas menos una, ya que
                // la primera es la utilizada por el resto de los datos de la
                // cuenta corriente personal
                total+=cuantos-1;
                // Se vuelve a inicializar la variable para contar los valores
                // de la hashtable del siguiente registro
                cuantos=0;
            }
            // Se acumulan el total de filas mas dos (una para el título y otra de separación)
            total+=2;
        }
        // Si existen Cuentas Corrientes de Empresa
        if(datosGrab3.exists()){
            // Se memorizan los datos de la cuenta
            ahorro3=(ArrayList<CuentaCorrienteEmpresa>)serializa.leeObjeto(nombreFic[2]);
            // Se almacena el número de clientes
            numReg+=ahorro3.size();
            // se inicializa la variable que contendrá las entidades autorizadas
            // ya que cada una de ellas ocupará una línea en la tabla
            hashtable = new Hashtable<String,String>();
            // se recorren las cuentas corrientes de empresa dadas de alta para
            // ir memorizando todas las entidades autorizadas que posee cada registro
            for(int j=0;j<ahorro3.size();j++){
                // Se almacenan las entidades autorizadas
                hashtable=ahorro3.get(j).getEntidad().getEntidades();
                // Se inicializa una variable que sirva de iterador para recorrerlo
                Iterator it3=hashtable.entrySet().iterator();
                // Mientras existan datos
                while(it3.hasNext()){
                    // pone en c los datos de la entidad autorizada encontrada
                    // y pasa al siguiente registro del hashtable
                    Map.Entry c=(Map.Entry)it3.next();
                    // Se almacena el número de registros encontrados
                    cuantos++;
                }
                // Se siguen acumulando las líneas encontradas menos una, ya que
                // la primera es la utilizada por el resto de los datos de la
                // cuenta corriente personal
                total+=cuantos-1;
                // Se vuelve a inicializar la variable para contar los valores
                // de la hashtable del siguiente registro
                cuantos=0;
            }
            // Se acumulan el total de filas mas dos (una para el título y otra de separación)
            total+=2;
        }
        // Sabiendo el número de filas que vamos a necesitar inicializamos el
        // array contenedor con este valor y 12 columnas que son las necesarias
        // para mostrar todos los datos de las distintas cuentas
        datos=new Object[total][12];
        // Ya empezamos a mostrar datos, comenzando por las cuentas de Ahorro
        if(datosGrab1.exists()){
            // Dejamos una línea en blanco
            for(int m=0;m<12;m++)datos[contar][m]="";
            // En la siguiente fila mostramos DATOS DE LAS CUENTAS DE AHORRO en
            // las cinco primeras posiciones
            contar++;
            datos[contar][0]="DATOS";
            datos[contar][1]="DE LAS";
            datos[contar][2]="CUENTAS";
            datos[contar][3]="DE";
            datos[contar][4]="AHORRO";
            // Después del texto dejamos el resto de columnas de esa fila en blanco
            for(int m=5;m<12;m++)datos[contar][m]="";
            // Nos movemos a la siguiente fila
            contar++;
            // Recorremos todos los datos de Cuentas de Ahorro incluyéndolos en
            // el array contenedor de la tabla
            for(int i=0;i<ahorro1.size();i++){
                datos[i+contar][0]=ahorro1.get(i).getNombre();
                datos[i+contar][1]=ahorro1.get(i).getApellidos();
                miFecha=(Date)ahorro1.get(i).getFechaNac().getTime();
                datos[i+contar][2]=formatoFecha.format(miFecha);
                datos[i+contar][3]=ahorro1.get(i).getSaldo().toString();
                datos[i+contar][4]=ahorro1.get(i).getCCC();
                datos[i+contar][5]=ahorro1.get(i).getInteres();
                // Estos datos sólo ocupan las seis primeras columnas, por lo
                // que ponemos en blanco las otras 6 de cada fila
                for(int m=6;m<12;m++)datos[i+contar][m]="";
                // En esta variable recogemos cuántos registros tiene Cuentas
                // de Ahorro mas 1 para separar el resto de la información
                lleva=i+1;
            }
        }
        // Ahora vemos si podemos incluir los datos de CC Personales
        if(datosGrab2.exists()){
            // memorizamos la posición por la que tendremos que empezar a
            // imprimir la nueva información
            contar+=lleva;
            // de nuevo dejamos una línea en blanco de separación
            for(int m=0;m<12;m++)datos[contar][m]="";
            // En la siguiente fila mostramos el texto DATOS DE LAS CUENTAS
            // CORRIENTES PERSONALES ocupando para ello las 5 primeras columnas
            contar++;
            datos[contar][0]="DATOS";
            datos[contar][1]="DE LAS";
            datos[contar][2]="CUENTAS";
            datos[contar][3]="CORRIENTES";
            datos[contar][4]="PERSONALES";
            // El resto de información para esa fila lo dejamos en blanco
            for(int m=5;m<12;m++)datos[contar][m]="";
            // Nos movemos a la siguiente fila
            contar++;
            // Recorremos todos los datos de Cuentas Corrientes Personales 
            // incluyéndolos en el array contenedor de la tabla
            for(int i=0;i<ahorro2.size();i++){
                datos[i+contar][0]=ahorro2.get(i).getNombre();
                datos[i+contar][1]=ahorro2.get(i).getApellidos();
                miFecha=(Date)ahorro2.get(i).getFechaNac().getTime();
                datos[i+contar][2]=formatoFecha.format(miFecha);
                datos[i+contar][3]=ahorro2.get(i).getSaldo().toString();
                datos[i+contar][4]=ahorro2.get(i).getCCC();
                // esta posición la dejamos en blanco ya que Cuentas Corrientes
                // Personales no tiene el campo 'interes'
                datos[i+contar][5]="";
                // Guardamos el campo propio de CC Personal 'mantenimiento'
                datos[i+contar][6]=ahorro2.get(i).getMantenimiento();
                // de las posiciones 7 a 12 las dejamos en blanco de momento
                for(int m=7;m<12;m++)datos[i+contar][m]="";
                // Cargamos en 'hashtable' las entidades almacenadas
                hashtable=ahorro2.get(i).getEntidad().getEntidades();
                uno=false;
                Enumeration<String> e = hashtable.keys();
                String titulo=null;
                Object tit=null;
                // Mientras existan datos recorremos el arreglo
                while(e.hasMoreElements()){
                    // ponemos en 'título' la clave y en 'tit' el valor
                    titulo=e.nextElement();
                    tit=hashtable.get(titulo);
                    // Si hemos tecleado algun valor en esta fila del hashtable.
                    // Esto nos vale para no presentar alguna fila si la hemos
                    // dejado en blanco
                    if(!tit.equals("")&&!tit.equals(" ")){
                        // sólo a partir de la segunda fila hemos de rellenar 
                        // los huecos de las 9 primeras columnas antes de poner
                        // estos datos
                        if(uno)
                            for(int g=0;g<10;g++)
                                datos[i+contar][g]="";
                        datos[i+contar][10]=titulo;
                        datos[i+contar][11]=tit;
                        // indicamos que ya hemos escrito la primera fila
                        uno=true;
                        // memorizamos el número de filas que estamos utilizando
                        contar++;
                    }
                }
                // Si hemos impreso mas de una fila memorizamos cuántas menos
                // una que es la última
                if(uno)contar-=1;
                // En esta variable recogemos cuántos registros tiene Cuentas
                // Corrientes Personales mas 1 para separar el resto de la información
                lleva=i+1;
            }
        }
        // Ahora vemos si podemos incluir los datos de CC de Empresas
        if(datosGrab3.exists()){
            // memorizamos la posición por la que tendremos que empezar a
            // imprimir la nueva información
            contar+=lleva;
            // de nuevo dejamos una línea en blanco de separación
            for(int m=0;m<12;m++)datos[contar][m]="";
            // En la siguiente fila mostramos el texto DATOS DE LAS CUENTAS
            // CORRIENTES DE EMPRESA ocupando para ello las 6 primeras columnas
            contar++;
            datos[contar][0]="DATOS";
            datos[contar][1]="DE LAS";
            datos[contar][2]="CUENTAS";
            datos[contar][3]="CORRIENTES";
            datos[contar][4]="DE";
            datos[contar][5]="EMPRESA";
            // El resto de información para esa fila lo dejamos en blanco
            for(int m=6;m<12;m++)datos[contar][m]="";
            // Nos movemos a la siguiente fila
            contar++;
            // Recorremos todos los datos de Cuentas Corrientes Personales 
            // incluyéndolos en el array contenedor de la tabla
            for(int i=0;i<ahorro3.size();i++){
                datos[i+contar][0]=ahorro3.get(i).getNombre();
                datos[i+contar][1]=ahorro3.get(i).getApellidos();
                miFecha=(Date)ahorro3.get(i).getFechaNac().getTime();
                datos[i+contar][2]=formatoFecha.format(miFecha);
                datos[i+contar][3]=ahorro3.get(i).getSaldo().toString();
                datos[i+contar][4]=ahorro3.get(i).getCCC();
                // estas posiciones las dejamos en blanco ya que Cuentas 
                // Corrientes de Empresa no tiene el campo 'interes' ni 'comision'
                datos[i+contar][5]="";
                datos[i+contar][6]="";
                // Guardamos los campos específicos de CC de Empresa
                datos[i+contar][7]=ahorro3.get(i).getComision();
                datos[i+contar][8]=ahorro3.get(i).getDescubierto();
                datos[i+contar][9]=ahorro3.get(i).getInteres();
                // de las posiciones 10 a 12 las dejamos en blanco de momento
                for(int m=10;m<12;m++)datos[i+contar][m]="";
                // Cargamos en 'hashtable' las entidades almacenadas
                hashtable=ahorro3.get(i).getEntidad().getEntidades();
                uno=false;
                Enumeration<String> f = hashtable.keys();
                String titulo=null;
                Object tit=null;
                // Mientras existan datos recorremos el arreglo
                while(f.hasMoreElements()){
                    // ponemos en 'titulo' la clave y en 'tit' el valor
                    titulo=f.nextElement();
                    tit=hashtable.get(titulo);
                    // Si hemos tecleado algun valor en esta fila del hashtable.
                    // Esto nos vale para no presentar alguna fila si la hemos
                    // dejado en blanco
                    if(!tit.equals("")&&!tit.equals(" ")){
                        // sólo a partir de la segunda fila hemos de rellenar 
                        // los huecos de las 10 primeras columnas antes de poner
                        // estos datos
                        if(uno)
                            for(int g=0;g<10;g++)
                                datos[i+contar][g]="";
                        datos[i+contar][10]=titulo;
                        datos[i+contar][11]=tit;
                        // indicamos que ya hemos escrito la primera fila
                        uno=true;
                        // memorizamos el número de filas que estamos utilizando
                        contar++;
                    }
                }
                // Si hemos impreso mas de una fila memorizamos cuántas menos
                // una que es la última
                if(uno)contar-=1;
                // En esta variable recogemos cuántos registros tiene Cuentas
                // Corrientes de Empresa mas 1 para separar el resto de la información
                lleva=i+1;
            }
            // Función para volcar los datos en un array que únicamente tenga 
            // el número de filas necesitado, eliminando los espacios finales en blanco
            nuevo= new Object[contar+2][12];
            for(int h=0;h<contar+2;h++){
                System.arraycopy(datos[h], 0, nuevo[h], 0, 12);
            }
        }
        // Sólo se muestra la tabla en caso de existir algún dato en algun fichero
        if(datosGrab1.exists()||datosGrab2.exists()||datosGrab3.exists()){
            ModeloTabla mTabla=new ModeloTabla(cabecera[3],nuevo);
            jTabla_lis.setModel(mTabla);
            jTabla_lis.updateUI();
            jTabla_lis.setVisible(true);
        // Si no existen datos que mostrar se avisa de ello
        }else{
            JOptionPane.showMessageDialog(this, 
                    "No existen datos que mostrar", 
                    "ERROR", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_todoActionPerformed

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
            java.util.logging.Logger.getLogger(Listados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Listados dialog = new Listados(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ahorro;
    private javax.swing.JButton cce;
    private javax.swing.JButton ccp;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTable jTabla_lis;
    private javax.swing.JScrollPane panel1;
    private javax.swing.JButton todo;
    // End of variables declaration//GEN-END:variables
}

