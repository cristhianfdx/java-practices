
package paquete1;

import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.geom.*;
import java.io.File;
import java.io.IOException;

public class VentanaImagenes extends JFrame{

    public VentanaImagenes() {
        setSize(600,400);
        setLocation(500,250);
        setTitle("Ventana con Imagenes");
        
        PanelImage panel1 = new PanelImage();
        add(panel1);
    }
    
}

class PanelImage extends JPanel{
    protected Image imagen;
    
    @Override
    protected void paintComponent(Graphics g){
        
        super.paintComponent(g);
        File archivo = new File("src/paquete1/imagenes/mario.png");
        
        try{
          imagen = ImageIO.read(archivo);  
        }
        catch(IOException e){
            System.out.println("Error:"+e);            
        } 
        
        g.drawImage(imagen, 5, 5, 400, 300, null);
       
    }    
}
