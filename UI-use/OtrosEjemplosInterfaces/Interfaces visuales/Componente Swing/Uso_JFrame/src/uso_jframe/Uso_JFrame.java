/*Crear una ventana de 1024 x 800 pixeles, No permitir que el usuario modifique el tamaño de la ventana*/
package uso_jframe;
import javax.swing.*;

public class Uso_JFrame extends JFrame  {

    public Uso_JFrame(){
        setLayout(null);
    }
    
    public static void main(String[] args) {
        JFrame form = new JFrame();
        form.setBounds(0, 0, 1024,800);
        form.setResizable(false);//evita que se modifique el tamaño de la ventana
        form.setVisible(true);
    }
    
}
