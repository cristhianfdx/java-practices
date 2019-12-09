
package paquete1;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class VentanaColor extends JFrame {

    public VentanaColor() {
        setSize(600,450);
        setLocation(500,200);
        setTitle("Ventana con color");
        setLocationRelativeTo(null);
        
        PanelColor colores = new PanelColor();
        add(colores);
        
        colores.setBackground(SystemColor.window);
        
    }    
}

class PanelColor extends JPanel{
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150); 
        g2.setPaint(Color.BLACK);
        g2.draw(rectangulo);
        g2.setPaint(new Color(250, 128, 114));        
        g2.fill(rectangulo); 
        
    }
    
}
