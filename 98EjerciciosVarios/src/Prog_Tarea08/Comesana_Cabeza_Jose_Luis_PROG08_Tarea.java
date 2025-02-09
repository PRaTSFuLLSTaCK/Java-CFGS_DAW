package Prog_Tarea08;

import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author José Luis Comesaña
 * @version 8.2
 */
public class Comesana_Cabeza_Jose_Luis_PROG08_Tarea extends javax.swing.JFrame {
    // Creamos un objeto Telefono de tipo ArrayList basado en la clase Telefonos
    ArrayList<Telefonos> Telefono;
    // Creamos un objeto Email de tipo ArrayList basado en la clase Emails
    ArrayList<Emails> Email;
    // Creamos las plantillas a utilizar:
    
    /* El DNI=
     * - puede tener una X o Y al principio (no obligatoria)
     * - tiene entre 1 y 9 dígitos numéricos
     * - Finaliza en una letra (Mayúscula o minúscula obligatoria)
     */
    Pattern pDni = Pattern.compile("^[XYxy]?[0-9]{1,9}[A-Za-z]$");
    
    /* El Teléfono:
     * - puede comenzar con el signo + (se agrupa para poder coger su valor
     *   de forma independiente 'Telefono.mas')
     * - puede existir un prefijo compuesto por dos o tres dígitos encerrados
     *   entre paréntesis
     * - Ha de tener entre 6 y 9 dígitos numéricos (depende de que tenga o no
     *   prefijo)
     */
    Pattern pTlf = Pattern.compile("(\\+)?(\\([0-9]{2,3}\\))?([0-9]{6,9})");
    
    /* El Email:
     * - No puede comenzar por número, punto, símbolo de arroba o tres 'w'
     * - Admite sólo los caracteres permitidos (letras mayúsculas, minúculas, números, _, -, ~, #)
     * - Tendrá un símbolo de arroba obligatorio
     * - Después del símbolo de arroba tendrá sólo caracteres permitidos, un punto y finalizará
     *   con tres caracteres alfabéticos
     */
    Pattern pEma = Pattern.compile("^[^0-9|^@|^\\.|^www\\.][A-Za-z0-9_-~#]+[\\@][A-Za-z0-9_-~#]+\\.[A-Za-z]{2,3}$");
    //Pattern pEma = Pattern.compile("^[^0-9|^@|^\\.][^\\@.]+[\\@].+\\..+");
    
    /* Nombre y Apellidos:
     * - Deben comenzar y terminar por el símbolo de comillas dobles o simples
     * - Pueden contener cualquier carácter pero al menos uno
     */
    Pattern pTex = Pattern.compile("^[\"\'](.+)[\"\']$");
    
    /*
     * Inicializamos las variables que utilizaremos para gestionar los errores
     * en la descomposición de la cadena que introduzcamos
     */
    String[] opcionT ={"DNI","Teléfono","Email","Nombre","Apellidos"};
    boolean[] opcionB=new boolean[5];
    
    // Variable que recogerá la posición del botón de buscar
    Rectangle capa;
    
    // Variable donde pondremos el fichero XML que queremos grabar
    String fichero=null;
    
    /**
     * Creamos el Frame principal:
     *  -   Inicializamos los componentes
     *  -   Ocultamos el JPane donde se mostrará el fichero XML resultante
     *  -   Memorizamos la posición del botón de buscar
     */
    public Comesana_Cabeza_Jose_Luis_PROG08_Tarea() {
        initComponents();
        resul.setVisible(false);
        capa = botonBuscar.getBounds();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        etiqueta = new javax.swing.JLabel();
        cadena = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        resul = new javax.swing.JTextPane();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiqueta.setText("Introduzca la cadena a convertir en fichero XML");

        cadena.setToolTipText("Introduzca la cadena a convertir en XML");
        cadena.setName("cadena"); // NOI18N
        cadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadenaActionPerformed(evt);
            }
        });

        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comesana_cabeza_jose_luis_prog08_tarea/adelante.gif"))); // NOI18N
        botonBuscar.setToolTipText("Pulse para convertir la cadena a XML");
        botonBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonBuscar.setBorderPainted(false);
        botonBuscar.setContentAreaFilled(false);
        botonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonBuscarMouseExited(evt);
            }
        });
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        botonBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                botonBuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                botonBuscarFocusLost(evt);
            }
        });

        resul.setEditable(false);
        resul.setToolTipText("fichero XML resultado");
        jScrollPane2.setViewportView(resul);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiqueta)
                        .addGap(0, 155, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cadena, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiqueta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonBuscar)
                    .addComponent(cadena, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Si pulsamos Intro sobre la caja de texto
    private void cadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadenaActionPerformed
        descomponerCadena(cadena.getText());
    }//GEN-LAST:event_cadenaActionPerformed

    // Si pulsamos Intro sobre el botón
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        descomponerCadena(cadena.getText());
    }//GEN-LAST:event_botonBuscarActionPerformed

    // Cuando seleccionamos el botón buscar
    private void botonBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_botonBuscarFocusGained
        botonBuscar.setBounds(350, 20, 100, 50);
    }//GEN-LAST:event_botonBuscarFocusGained

    // Cuando ponemos el ratón sobre el botón buscar
    private void botonBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseEntered
        botonBuscar.setBounds(350, 20, 100, 50);
    }//GEN-LAST:event_botonBuscarMouseEntered

    // Cuando dejamos de tener seleccionado el botón buscar
    private void botonBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_botonBuscarFocusLost
        botonBuscar.setBounds(capa);
    }//GEN-LAST:event_botonBuscarFocusLost

    // Cuando dejamos de estar con el ratón sobre el botón buscar    
    private void botonBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBuscarMouseExited
        botonBuscar.setBounds(capa);
    }//GEN-LAST:event_botonBuscarMouseExited

    /**
     * El método más importante de la clase Comesana_Cabeza_Jose_Luis_PROG08_Tarea
     * Es donde se recoge el texto introducido y se transforma en sus correspondientes
     * datos de acuerdo a la aplicación de sus plantillas
     * @param cadena Texto del que se han de extraer los datos
     */
    public void descomponerCadena(String cadena){
        /* 
         * Inicializamos aquí los objetos para poder utilizar uno nuevo cada
         * vez que tecleemos una nueva cadena a descomponer
         */
        Telefono = new ArrayList<Telefonos>();
        Email = new ArrayList<Emails>();
        Cliente c=new Cliente();
        Matcher mD,mT,mE,mX;
        boolean nomApe=false;
        String masT="";
        String prefi;
        String tl="";
        String mensaje="-";
        boolean repetido=false;
        for(int i=0;i<5;i++) opcionB[i]=false;
        String[] subCad = cadena.split(",");
        /*
         * Con la cadena descompuesta (las comas separan cada dato que se 
         * introduce en cada elemento del array subCad) se comprueba si encajan
         * dentro de los diferentes Pattern (plantillas)
         */
        for(String x:subCad){
            prefi="";
            x = x.trim();
            mD=pDni.matcher(x);
            mT=pTlf.matcher(x);
            mE=pEma.matcher(x);
            mX=pTex.matcher(x);
            if(mD.matches()){ 
                // si el DNI es correcto, se mete en el campo IdCliente de la clase Cliente
                opcionB[0]=true;
                c.setIdCliente(x);
            }else if(mT.matches()){
                /*
                 * Si es el teléfono, se introduce el prefijo(si lo tiene) y el 
                 * número como un dato de tipo Long en el campo telefono de la
                 * clase Telefonos y el signo más (si lo tiene) en el campo mas 
                 * de la misma clase Telefono, siempre que el valor del teléfono
                 * no exista previamente dentro de la clase. 
                 * Dicha clase se almacenará dentro de la clase Cliente.
                 */
                opcionB[1]=true;
                if(mT.group(1)!=null){
                    if(mT.group(1).equals("+")){
                        masT="+";
                    }else{
                        masT="";
                    }         
                }
                if(mT.group(2)!=null){
                    prefi = mT.group(2).substring(1, mT.group(2).length()-1);
                }
                if(mT.group(3)!=null){
                    tl=mT.group(3);
                }
                Telefonos t = new Telefonos();
                t.tlf=Long.valueOf(prefi+tl);
                t.mas=masT;
                for(int i=0;i<Telefono.size();i++){
                if(t.tlf.equals(Telefono.get(i).tlf)) {repetido=true;}
                }
                if(!repetido) {Telefono.add(t);}
                repetido=false;
                masT="";
            }else if(mE.matches()){
                /*
                 * Si es el email se introduce en su clase Email siempre que
                 * no esté repetido. 
                 * Los valores de esta clase se almacenarán en la clase Cliente
                 * una vez que se han convertido a minúsculas
                 */
                opcionB[2]=true;
                Emails e = new Emails();
                e.email=x.toLowerCase();
                for(int i=0;i<Email.size();i++){
                    if(e.email.equals(Email.get(i).email)) {repetido=true;}
                }
                if(!repetido) {Email.add(e);}
            }else if(mX.matches()){
                /*
                 * Si es un valor de nombre o apellido (como se indica que irán
                 * ordenados: primero el nombre y después los apellidos entre 
                 * comillas) se inserta el primer texto capturado entre comillas
                 * en el campo nombre y el segundo dentro de apellido.
                 */
                x=mX.group(1);
                if(!nomApe){
                    opcionB[3]=true;
                    c.setNombre(x);
                    nomApe=true;
                } else {
                    opcionB[4]=true;
                    c.setApellidos(x);
                }
            }else{
                /*
                 * Si el texto no coincide con ninguna plantilla será porque hemos
                 * cometido un error, por lo que mostramos la cadena que no se 
                 * entiende
                 */
                mensaje="";
                JOptionPane.showMessageDialog(this, 
                        "Error en la conversión de los datos\n"+x+" NO conocido.",
                        "ERROR de conversión",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        for(int i=0;i<5;i++)if(opcionB[i]==false)mensaje="";
        /*
         * Si no hemos cometido ningún error:
         * - se ordenan los emails y se introducen en Cliente
         * - se ordenan los teléfonos y se invierte la cadena (ordena de mayor a
         *   menor) y se introduce en cliente
         * - El resto de los datos ya han sido introducidos en Cliente cuando
         *   fueron tratados
         * - Creamos un DOM vacío, con el elemento raiz que se indica para el
         *   ejercicio, y llamamos al método que se encaarga de introducirle 
         *   todos los datos
         */
        if(mensaje.equals("-")){
            Collections.sort(Email);
            c.setEmail(Email);
            Collections.sort(Telefono);
            Collections.reverse(Telefono);
            c.setTelefono(Telefono);
            Document doc=DOMUtil.crearDOMVacio("datos_cliente");
            pasarClienteXML(doc,c);
            /*
             * Llamamos al método encargado de seleccionar el fichero donde
             * guardar nuestro documento XML.
             * Si le damos a escape le asigna a la variable fichero el valor de
             * null para que no se intente grabar la información (control del error)
             */
            try{
                fichero=ficheroXML().toString();
            }catch(NullPointerException npe){
                fichero=null;
            }
            /*
             * Si hemos tecleado correctamente el nombre del fichero a generar
             * volcaremos el contenido del XML en dicho fichero, haremos visible
             * el contenedor de la parte inferior al cuadro de texto con el fin
             * de leer todas las líneas del fichero recien guardado y reproducirlo
             * en el contenedor
             */
            if(fichero!=null){
                DOMUtil.DOM2XML(doc,fichero);
        
                resul.setVisible(true);

                try{
                    File leer=new File(fichero);
                    FileReader leerFR=new FileReader(leer);
                    BufferedReader leerBR=new BufferedReader(leerFR);
                    String linea;
                    int numLin=0;
                    resul.setText("Contenido del fichero: \n>>>"+fichero+"<<< \n\n");
                    while((linea=leerBR.readLine())!=null){
                        numLin++;
                        resul.setText(resul.getText()+String.valueOf(numLin)+" - ");
                        resul.setText(resul.getText()+linea+"\n");
                    }
                } catch(IOException ioe){
                    resul.setText("Ha sido imposible leer el fichero "+fichero);
                }
            }
        }else{
            /*
             * Si existen errores en la cadena de texto a tratar se avisa cuáles
             * son y se indica que la vuelva a introducir
             * - Si el tipo de dato ya ha sido utilizado no podremos memorizar
             *   el error por lo que informaremos de un error general, pero si
             *   ese tipo de dato no ha sido utilizado antes se indicará el tipo
             *   de dato a corregir (no es lo mismo tener un dni,nombre, apellido,
             *   telefono y email y equivocarnos en un segundo email o teléfono)
             */
            for(int i=0;i<=4;i++) 
                if(!opcionB[i]) mensaje+=opcionT[i]+", ";
            if(mensaje.equals("")){
                mensaje="-";
                JOptionPane.showMessageDialog(this, 
                    "Vuelva a teclear la cadena a convertir (DNI, Nombre, Apellidos, emails y teléfonos),\n "+
                    "y pulse Intro o haga clic sobre la flecha de la derecha",
                    "ERROR de conversión",
                    JOptionPane.INFORMATION_MESSAGE);
            }else{
                mensaje=!mensaje.equals("-")?mensaje.substring(0, mensaje.length()-2):"-";
                JOptionPane.showMessageDialog(this, 
                    "Error en: "+mensaje+
                    "\nVuelva a teclear la cadena a convertir (DNI, Nombre, Apellidos, emails y teléfonos),\n "+
                    "y pulse Intro o haga clic sobre la flecha de la derecha",
                    "ERROR de conversión",
                    JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    /**
     * Pasa los datos de la cadena descompuesta en descomponerCadena()
     * a formato XML con los nombres de campo y atributos que se han establecido
     * para el presente ejercicio
     * 
     * @param doc fichero XML donde se guardará la información
     * @param cliente Datos del cliente que se va a guardar
     */
    private void pasarClienteXML(Document doc,Cliente cliente){
        Element e=null;
        e=doc.createElement("id");
        e.setTextContent(cliente.getIdCliente());
        doc.getDocumentElement().appendChild(e);
        e=doc.createElement("nombre");
        e.setTextContent(cliente.getNombre());
        doc.getDocumentElement().appendChild(e);
        e=doc.createElement("apellidos");
        e.setTextContent(cliente.getApellidos());
        doc.getDocumentElement().appendChild(e);
        e=doc.createElement("telefonos");
        e.setAttribute("total", String.valueOf(cliente.getTelefono().size()));
        // Creamos los nodos para los teléfonos que no tengan el signo mas
        for(Telefonos telefono:cliente.getTelefono()){
            if(telefono.mas.equals("")){
                Element tele=doc.createElement("telefono");
                tele.setTextContent(telefono.mas+String.valueOf(telefono.tlf));
                e.appendChild(tele);
            }
        }
        // Creamos los nodos para los telefonos que si tengan el signo mas
        for(Telefonos telefono:cliente.getTelefono()){
            if(!telefono.mas.equals("")){
                Element tele=doc.createElement("telefono");
                tele.setTextContent(telefono.mas+String.valueOf(telefono.tlf));
                e.appendChild(tele);
            }
        }
        doc.getDocumentElement().appendChild(e);
        e=doc.createElement("mails");
        for(Emails email:cliente.getEmail()){
            Element emai=doc.createElement("mail");
            emai.setTextContent(email.email);
            e.appendChild(emai);
        }
        doc.getDocumentElement().appendChild(e);
    }
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Comesana_Cabeza_Jose_Luis_PROG08_Tarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Comesana_Cabeza_Jose_Luis_PROG08_Tarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Comesana_Cabeza_Jose_Luis_PROG08_Tarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Comesana_Cabeza_Jose_Luis_PROG08_Tarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Crea y visualiza el formulario
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Comesana_Cabeza_Jose_Luis_PROG08_Tarea().setVisible(true);
            }
        });
    }

    /**
     * Indicamos nombre y ubicación donde se guardará el fichero XML
     * 
     * @return Fichero que se ha guardado (null) si no se ha seleccionado ninguno
     */
    private File ficheroXML() { 
        File fichero=null;
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("XML","xml");
        fc.setFileFilter(filtro);
        int seleccion = fc.showSaveDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION){
            fichero = fc.getSelectedFile();
        }
        return fichero;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JTextField cadena;
    private javax.swing.JLabel etiqueta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane resul;
    // End of variables declaration//GEN-END:variables
}

