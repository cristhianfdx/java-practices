package prueba;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Prueba {

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Ventana extends JFrame{
	public Ventana() {
		
		setTitle("Probando JAR");
		setBounds(400, 200, 500, 500);
		add(new Panel());
	}
}

class Panel extends JPanel{
	
	private JButton boton,boton2;
	public Panel() {
				
		boton = new JButton("Inicio");
		boton.addActionListener(new Evento());
		boton2 = new JButton("Fin");
		boton2.addActionListener(new Evento());
		add(boton);
		add(boton2);
	}
	
	private class Evento implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==boton) {
				setBackground(new Color(0,255,0));
			}
			else if (e.getSource()==boton2) {
				setBackground(Color.WHITE);
			}
						
		}		
	}
	
	
}


