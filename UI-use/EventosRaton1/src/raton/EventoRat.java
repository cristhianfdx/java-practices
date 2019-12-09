package raton;
import java.awt.event.*;

import javax.swing.JFrame;

public class EventoRat {

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Ventana extends JFrame{
	
	public Ventana() {
		setVisible(true);
		setBounds(400,100,500,350);
		//addMouseListener(new EventoR());//Acciones de click de botones del mouse
		//addMouseMotionListener(new EventoR());//Acciones de movimiento del mouse
		addMouseWheelListener(new EventoR());
		
	}
	
}

/*class EventoR extends MouseAdapter{
	
	@Override
	public void mouseClicked(MouseEvent e) {
		//System.out.println("Coordenada x :"+" "+e.getX()+" "+"Coordenada y:"+" "+e.getY());
		System.out.println("Numero de clicks:"+" "+e.getClickCount());
	
	
	@Override
	public void mousePressed(MouseEvent e) {
		
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("Has pulsado el boton izquierdo");
			
		} else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK){
			System.out.println("Has pulsado el boton rueda");
			
		}else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("Has pulsado el boton derecho");
		}
	}	
	
}*/

/*class EventoR implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Se arrastra elemento");
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("Se mueve mouse");
		
	}	
}*/

class EventoR implements MouseWheelListener{

	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		System.out.println("se giro rueda del mouse"+MouseWheelEvent.WHEEL_BLOCK_SCROLL);
		System.out.println("se giro rueda del mouse"+MouseWheelEvent.WHEEL_UNIT_SCROLL);
		
	}
	
}
