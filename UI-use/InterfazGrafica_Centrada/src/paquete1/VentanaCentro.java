
package paquete1;
import javax.swing.*;
import java.awt.*;


public class VentanaCentro extends JFrame{

    public VentanaCentro() {
        int altura, ancho;
        
        Toolkit pantalla = Toolkit.getDefaultToolkit();//Retorna la pantalla utilizada en el dispositivo
        Dimension tamanho = pantalla.getScreenSize();//Retorna el tamaño en pixeles de dicha pantalla
        
        altura =tamanho.height;//La variable toma el valor de la altura de la pantalla
        ancho = tamanho.width;//Guarda el ancho de la pantalla
        
        setSize(ancho/2,altura/2);
        setLocation(ancho/4,altura/4);
        
        
        setTitle("Ventana centrada");
        
        Image icono_1 = pantalla.getImage("src/paquete1/icono.png");
        setIconImage(icono_1);
        
    }
    
       
    
    
}
