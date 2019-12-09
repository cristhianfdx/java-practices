
package paquete1;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class VentanaDibujo extends JFrame{

    public VentanaDibujo() {
        
        setSize(600,450);
        setLocation(400, 200);
        setTitle("Ventana con Dibujos");
        
        PanelDibujo dibujo = new PanelDibujo();
        add(dibujo);
        
    }    
    
}

class PanelDibujo extends JPanel{
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //g.drawRect(100, 50, 200, 200);//Dibuja un rectangulo
        //g.drawLine(50, 50, 100, 200);//dibuja una linea
        Graphics2D g2 = (Graphics2D)g;
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200.25,150);
        g2.draw(rectangulo);
        
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.draw(elipse);
        
        g2.draw(new Line2D.Double(100,100,300,250));
        
        double CentroX = rectangulo.getCenterX();//se obtiene el centro del rectangulo en x
        double CentroY = rectangulo.getCenterY();//Se obtiene el centro del rectangulo en y
        
        double radio = 150;
        
        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrameFromCenter(CentroX,CentroY,CentroX+radio,CentroY+radio);
        g2.draw(circulo);
    }
}


