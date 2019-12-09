
package ventana_jpanel;
import javax.swing.*;
import java.awt.Color;//Clase que permite manejar colores en las ventanas
//import java.awt.Dimension;//Clase que permite establecer dimensiones de la ventana

public class Ventana_JPanel extends JFrame {

    public Ventana_JPanel(){
        setSize(500, 500);
        setLocationRelativeTo(null);
        setTitle("Programa");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setMinimumSize(new Dimension(200,200));//Se establece el tamaño minimo de la ventana
        //this.getContentPane().setBackground(Color.BLUE);//Se establece el fondo de la pantalla
        Iniciar();
    }
    
    public void Iniciar(){
        JPanel panel = new JPanel();
        this.getContentPane().add(panel);
        panel.setBackground(Color.yellow);
    }
    public static void main(String[] args) {
        Ventana_JPanel form = new Ventana_JPanel();
        form.setVisible(true);
    }
    
}
