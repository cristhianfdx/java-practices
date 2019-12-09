
package paquete1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VentanaEvento extends JFrame{

    public VentanaEvento() {
        setTitle("Botones y eventos");
        setBounds(700, 300, 500, 300);//Posicion y tamaño
        Ventana v1 = new Ventana();
        add(v1);
        
    }        
    
}

class Ventana extends JPanel implements ActionListener{// como el panel es quien recibe el evento se debe implementar la interfaz
    //objeto fuente
    JButton botonA = new JButton("Azul");
    JButton botonAm = new JButton("Amarillo");
    JButton botonR = new JButton("Rojo");
    
    

    public Ventana() {
        //Objeto evento hacer clic en el boton
        //this es el objeto listener
        add(botonA);
        botonA.addActionListener(this);
        
        add(botonAm);
        botonAm.addActionListener(this);
        
        add(botonR);
        botonR.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object botonPulsado = e.getSource();// quien es el origen de la fuente
        
        if (botonPulsado == botonA) {
           setBackground(Color.BLUE);//metodo que desencadena la accion que es cambiar el fondo del panel  
        }else if(botonPulsado==botonAm){
           setBackground(Color.YELLOW);//metodo que desencadena la accion que es cambiar el fondo del panel 
        }else{
            setBackground(Color.RED);
        }
         
    }
    
    
    
}
