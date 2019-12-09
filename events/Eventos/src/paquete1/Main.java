/*El ejemplo cambia el fondo del JPanel segun el botón pulsado*/
package paquete1;

import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
        VentanaEvento ventana = new VentanaEvento();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
