
package paquete1;
import javax.swing.*;

public class Ventana extends JFrame{
        
	//Metodo constructor 
    //Inicializando atributos
    public Ventana(){
        setSize(800,600);//Se define el tamaño de la ventana
        setLocationRelativeTo(null);//Coloca la ventana en el centro de la pantalla
        //setBounds(500, 300, 800, 600);//Define el tama�o y ubicacion de la ventana simultaneamente
        //setResizable(false);//Permitir modificar el tamaño de la ventana
        //setExtendedState(Frame.MAXIMIZED_BOTH);//Abre la ventana a pantalla completa
        setTitle("Primera Ventana");//Coloca un titulo a la ventana
        
    }
    
}
