/*Interfaz grafica basica*/
package paquete1;

import javax.swing.JFrame;


public class Principal {
	
    public static void main(String[] args) {
        Ventana v1 = new Ventana();//Se instancia la clase Ventana
        v1.setVisible(true);//Hace visible en pantalla la ventana
        v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//AL oprimir click en cerrar permite finalizar el programa
        
    }
    
    
    
}
