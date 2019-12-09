
package holamundo;
import javax.swing.*;//Se importa la clase swing
//JFrame = ventanas
//JLabel = Texto dentro de una ventana

public class HolaMundo extends JFrame {//Se heredan todos los atributos y metodos de la clase JFrame de la superclase Swing
    //Atributos
private JLabel label1;//Se crea un objeto de la clase JLabel 
    //Constructor
    public HolaMundo(){
     setLayout(null);//Indica que se puede utilizar todo el espacio de la ventana
     label1 = new JLabel("Hola Mundo");//Se crea el objeto de la clase JLabel y tiene como parametro el texto a mostrar
     label1.setBounds(10, 20, 200, 30);//indica la ubicacion del texto dentro de la ventana
     add(label1);//Permite aañadir el texto en la venta
    }
    
    public static void main(String[] args) {
        //Se hace visible la ventana en pantalla
        HolaMundo formulario = new HolaMundo();//Objeto que permite ejecutar los metodos
        formulario.setBounds(10, 10, 400, 300);//Indica la posicion de la ventana
        formulario.setVisible(true);//Permite hacer visible la ventana creada
        
    }
    
}
