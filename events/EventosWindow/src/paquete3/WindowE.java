
package paquete3;

import javax.swing.*;
import java.awt.event.*;

public class WindowE extends JFrame{

    public WindowE() {
        //setTitle("Eventos Window");
        //setBounds(500, 300, 600, 350);
        setVisible(true);
        M_Ventana oyenteW = new M_Ventana();
        
        addWindowListener(oyenteW);
        
    }   
}

class M_Ventana implements WindowListener{

    @Override
    public void windowClosing(WindowEvent we) {
        System.out.println("Ventana cerrada");}        
    
    @Override
    public void windowClosed(WindowEvent we) {
        System.out.println("Ventana cerrada");}    
    
    @Override
    public void windowDeiconified(WindowEvent we) {
        System.out.println("Ventana restaurada");}
        
    @Override
    public void windowActivated(WindowEvent we) {
        System.out.println("Ventana Activa");}

    @Override
    public void windowDeactivated(WindowEvent we) {
        System.out.println("Ventana desactivada");}
    
     @Override
    public void windowIconified(WindowEvent we) {
         System.out.println("Ventana minimizada");
    }
    
    @Override
    public void windowOpened(WindowEvent we) {
        System.out.println("Ventana abierta");
    }
    
}
