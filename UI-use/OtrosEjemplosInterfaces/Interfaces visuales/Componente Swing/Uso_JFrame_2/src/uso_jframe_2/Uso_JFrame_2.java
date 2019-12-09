
package uso_jframe_2;
import javax.swing.JFrame;

public class Uso_JFrame_2 extends JFrame {

  public Uso_JFrame_2(){
      setSize(500, 500);//establecer el tamaño de la ventana
      setDefaultCloseOperation(EXIT_ON_CLOSE);//Permite finalizar el programa al cerrar la ventana
      setTitle("Ventana");//permite poner titulo a la ventana
      //setLocation(0,0);//Posicion de la venta en pantalla
      setLocationRelativeTo(null);//Posicion de la ventana en el centro de la pantalla
  }
    public static void main(String[] args) {
        Uso_JFrame_2 form = new Uso_JFrame_2();
        form.setVisible(true);
    }
    
}
