
package paquete2;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class VentanaE extends JFrame{

    public VentanaE() {
        setTitle("Botones y eventos 2");
        setBounds(500, 200, 500, 300);
        PanelV v1 = new PanelV();
        add(v1);
    }
    
}

class PanelV extends JPanel{
   JButton boton1 = new JButton("Azul");
   JButton boton2 = new JButton("Rojo");

    public PanelV() {
        add(boton1);
        add(boton2);
        ColorFondo rojo = new ColorFondo(new Color(220, 20, 60));
        ColorFondo azul = new ColorFondo(new Color(0, 255, 255));
        
        boton1.addActionListener(azul);
        boton2.addActionListener(rojo);
    }
    
    
   private class ColorFondo implements ActionListener{
    
        private Color colorDFondo;
    
        public ColorFondo(Color c) {
        colorDFondo = c;
        }   

        @Override
        public void actionPerformed(ActionEvent e) {
            setBackground(colorDFondo); 
        }    
    }
}



