
package paquete1;
import java.awt.*;
import javax.swing.*;


public class VentanaTexto extends JFrame{

    public VentanaTexto() {
        
        setVisible(true);
        setSize(600,450);
        setLocation(400,200);
        setTitle("Ventana con texto"); 
        
        Panel panel = new Panel();//se instancia la clase Panel la cual tiene el Panel
        add(panel);//Se agrega el panel generado a la ventana principal
        
    }
    
    
}

class Panel extends JPanel{
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);//Invoca el metodo paintComponent de la clase padre JComponent
        g.drawString("Hola esto es un panel con swing", 50, 100);// Dibuja el texto en el panel
        
        
    }
}
