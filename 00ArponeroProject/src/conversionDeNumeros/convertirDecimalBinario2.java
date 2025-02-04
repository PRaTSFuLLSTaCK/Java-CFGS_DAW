package conversionDeNumeros;
import javax.swing.*; 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class convertirDecimalBinario2 extends JFrame {
  static int ANCHO =375;
  static int ALTO = 300;
  private final JTextField bin,octo,hexa,dec,basen;
  JButton limpiar = new javax.swing.JButton();
  public convertirDecimalBinario2(){


    setLayout(new GridLayout(6,2,10,10));   
    add(new JLabel("Bin")); 
    add(bin=new JTextField("")); 
    add(new JLabel("Octo")); 
    add(octo=new JTextField("")); 
    add(new JLabel("Hexa"));   
    add(hexa =new JTextField("")); 
    add(new JLabel("Dec"));     
    add(dec=new JTextField("")); 
    add(new JLabel("Base N")); 
    add(basen=new JTextField("")); 
    add(new JLabel("N =")); 
    add(limpiar=new JButton("Limpiar"));  


    setSize(ANCHO,ALTO);     
    setVisible(true); 

    bin.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String texto = (dec.getText());//meternoa estring
            int potencia = Integer.parseInt(texto);//convertir a entero
            for(int i=potencia;i<=0;i--){
               int bina= potencia%2;

            }
            octo.setText(bin.getText().toString());
            hexa.setText(bin.getText().toString());
            dec.setText(bin.getText().toString());

            basen.setText(bin.getText().toString());                            
        }

    });
     octo.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            bin.setText(octo.getText().toString());
            hexa.setText(octo.getText().toString());
            dec.setText(octo.getText().toString());
            basen.setText(octo.getText().toString());                            
        }           
    });
     hexa.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            bin.setText(hexa.getText().toString());
            octo.setText(hexa.getText().toString());
            dec.setText(hexa.getText().toString());
            basen.setText(hexa.getText().toString());                            
        }           
    });
     
     dec.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {


             String texto = (dec.getText());//meterlo a String
             int potencia = Integer.parseInt(texto);//convertir a entero
             String binario = Integer.toBinaryString(potencia);
             String cadena = String.valueOf(binario);//convertir a string
             bin.setText(dec.getText().toString());
             bin.setText(cadena);

             octo.setText(dec.getText().toString());

             hexa.setText(dec.getText().toString());
             basen.setText(dec.getText().toString());                            
         }           
     });
      basen.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             bin.setText(basen.getText().toString());
             octo.setText(basen.getText().toString());
             hexa.setText(basen.getText().toString());
             dec.setText(basen.getText().toString());                            
         }           
     });
      limpiar.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent e) {
             revalidate();
         }

      });

 }





 public static void main(String[] args) {

      convertirDecimalBinario2 miMarco = new convertirDecimalBinario2();     
      miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 }

 }