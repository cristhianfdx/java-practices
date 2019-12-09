/*
 Programa que muestra un boton y cuando este sea oprimido finalize la ejcucion en java
 */
package uso_jbutton;
import javax.swing.*;
import java.awt.event.*;

public class Uso_JButton extends JFrame implements ActionListener {
    JButton boton;
    
    public Uso_JButton(){
        setLayout(null);
        boton = new JButton("Finalizar");
        boton.setBounds(300, 250, 100, 30);
        add(boton);
        boton.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==boton) {
            System.exit(0);
            
        }
    }

    
    public static void main(String[] args) {
     Uso_JButton form = new Uso_JButton();
     form.setBounds(0, 0, 450, 350);
     form.setVisible(true);
    }
    
}
