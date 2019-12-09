
package paquete1;
import java.awt.event.*;
import javax.swing.*;


public class Adapter extends JFrame {

    public Adapter() {
        //setTitle("Evento ventana");
        //setBounds(500,300,500,300);
        addWindowListener(new Window());
        
        //Panlel_1 v1 = new Panlel_1();
        //add(v1);
    }
    
    
}

/*class Panlel_1 extends JPanel{
    
} */

class Window extends WindowAdapter{
    
    @Override
    public void windowIconified(WindowEvent e){
        System.out.println("Ventana minimizada");
    }
}
