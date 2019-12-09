
package paquete1;

import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
        Adapter ventana1 = new Adapter();
         Adapter ventana2 = new Adapter();
        
        ventana1.setVisible(true);
        ventana1.setTitle("ventana 1");
        ventana1.setBounds(500, 300, 500, 300);
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ventana2.setVisible(true);
        ventana2.setTitle("ventana 2");
        ventana2.setBounds(300, 200, 500, 300);       
        ventana2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
}
