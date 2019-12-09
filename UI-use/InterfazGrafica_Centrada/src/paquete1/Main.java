/*Ubica una JFrame en el centro de la pantalla en cualquier resolucion*/
package paquete1;

import javax.swing.JFrame;


public class Main {
    
    public static void main(String[] args) {
        
        VentanaCentro ventana = new VentanaCentro();
        
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
