
package multiple;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class EventosM {
    
    public static void main(String[] args) {
        Ventana v1 = new Ventana();
        v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class Ventana extends JFrame{
    
    public Ventana(){
        
        setVisible(true);
        setTitle("Acciones");
        setBounds(300, 100, 600, 450);
        Panel lamina= new Panel();
        add(lamina);
    }

}

class Panel extends JPanel{
    
    public Panel(){
        
        Evento AcAmarillo = new Evento ("Amarillo",Color.yellow, new ImageIcon("src/multiple/imagenes/iconoamarillo.png"));
        add(new JButton(AcAmarillo));
        
        Evento AcAzul = new Evento ("Azul",Color.blue, new ImageIcon("src/multiple/imagenes/iconoazul.png"));
        add(new JButton(AcAzul));
        
        Evento AcRojo = new Evento ("Rojo",Color.red, new ImageIcon("src/multiple/imagenes/iconorojo.png"));
        add(new JButton(AcRojo));
        
        //paintComponent(getGraphics());
    }
    
    private class Evento extends AbstractAction{
    
    public Evento(String nombre,Color colorBot,Icon icono){
        
        putValue(Action.NAME, nombre);
        putValue(Action.SMALL_ICON, icono);
        putValue(Action.SHORT_DESCRIPTION, "Poner la ventana de color"+" "+nombre);
        putValue("color_boton", colorBot);        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Color c = (Color)getValue("color_boton");//convierte al objeto en objeto Color
        setBackground(c);
        
        
       
    }
    
}
}


