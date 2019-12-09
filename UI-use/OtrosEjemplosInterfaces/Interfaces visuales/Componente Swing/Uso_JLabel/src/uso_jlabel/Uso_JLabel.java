/*
Hacer una ventana que muestre el nombre de un programa en la parte superior y su numero de version en la parte inferior, no permitir 
modificar el tamaño de la ventana en su ejecucion
 */
package uso_jlabel;
import javax.swing.*;

public class Uso_JLabel extends JFrame {
private JLabel label1,label2;

    public Uso_JLabel(){
        setLayout(null);
        label1 = new JLabel("Sistema de Facturacion");
        label1.setBounds(10, 20, 300, 30);
        add(label1);
        label2 = new JLabel("Version 1.0");
        label2.setBounds(10,100, 100, 30);
        add(label2);
    }
    
    public static void main(String[] args) {
        Uso_JLabel form = new Uso_JLabel();
        form.setBounds(0, 0, 300, 200);
        form.setResizable(false);
        form.setVisible(true);
    }
    
}
