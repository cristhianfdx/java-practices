
package paquete1;

import java.awt.*;
import javax.swing.*;


public class VentanaTexto extends JFrame{

    public VentanaTexto() {
        setSize(500,350);
        setLocation(300, 250);
        setTitle("Ventana con fuentes");
        PanelFuente f = new PanelFuente();
        add(f);
    }
    
    
}

class PanelFuente extends JPanel{
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D)g;
        //Font fuente = new Font("Arial",Font.BOLD,26);
        g2.setFont(new Font("Times New Roman", Font.BOLD, 28));
        //g2.setFont(fuente);
        g2.setColor(new Color(0,255,0).darker());
        g2.drawString("Cristhian Forero", 100, 100);
    }
}
