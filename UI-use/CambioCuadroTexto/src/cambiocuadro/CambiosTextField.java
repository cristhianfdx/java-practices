package cambiocuadro;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;


public class CambiosTextField {

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Ventana extends JFrame{
	
	public Ventana() {
		setBounds(500, 300, 500, 350);
		Panel panel_1 = new Panel();
		add(panel_1);
		setVisible(true);
		
	}
	
}

class Panel extends JPanel{
	
	public Panel () {
		
		JTextField cuadro = new JTextField(20);
		EscuchaTexto evento = new EscuchaTexto();
		Document midoc = cuadro.getDocument();
		midoc.addDocumentListener(evento);
		add(cuadro);
		
	}
	
	private class EscuchaTexto implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent e) {
			
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			System.out.println("Se inserto texto");
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			System.out.println("Se borro texto");
			
		}
		
	}
}
