
package paquete3;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        WindowE ventana = new WindowE(); 
        ventana.setTitle("Ventana 1");
        ventana.setBounds(300, 300, 500, 350);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        WindowE ventana2= new WindowE();
        ventana2.setTitle("Ventana 2");
        ventana2.setBounds(900, 300, 500, 300);
        ventana2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
