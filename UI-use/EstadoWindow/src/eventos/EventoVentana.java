package eventos;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Frame;

public class EventoVentana {
	
	public static void main(String []args) {
		Ventana v1 = new Ventana();
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class Ventana extends JFrame{
	
	public Ventana(){
		
		setVisible(true);
		setBounds(400, 300, 500, 300);
		Estado nuevoEstado = new Estado();
		addWindowStateListener(nuevoEstado);
	}
}

class Estado implements WindowStateListener{
	
	@Override
	public void windowStateChanged(WindowEvent e) {
		
		if(e.getNewState()==Frame.ICONIFIED) {
			System.out.println("La ventana fue minimizada");
		}
		else if (e.getNewState()==Frame.MAXIMIZED_BOTH) {
			System.out.println("La ventana fue restaurada");
		}
		
	}
	
}
