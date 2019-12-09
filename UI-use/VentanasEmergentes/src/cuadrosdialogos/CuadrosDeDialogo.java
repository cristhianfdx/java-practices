package cuadrosdialogos;

import java.awt.event.*;
import javax.swing.*;

public class CuadrosDeDialogo {

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class Ventana extends JFrame{
	
	public Ventana() {
		
		setBounds(500,300,400,250);
		add(new Panel());
	}
}

class Panel extends JPanel {
	
	private JButton boton1,boton2,boton3,boton4;
	
	public Panel() {
		
		boton1 = new JButton("Boton 1");
		boton2 = new JButton("Boton 2");
		boton3 = new JButton("Boton 3");
		boton4 = new JButton("Boton 4");
		
		boton1.addActionListener(new AccionBotones());
		boton2.addActionListener(new AccionBotones());
		boton3.addActionListener(new AccionBotones());
		boton4.addActionListener(new AccionBotones());
		
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);		
	}
	
	private class AccionBotones implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource()==boton1) {
				
				//JOptionPane.showMessageDialog(Panel.this,"Mensaje Prueba");
				JOptionPane.showMessageDialog(Panel.this, "Mensaje prueba", "Prueba", 0);
			}
			else if (e.getSource()==boton2) {
				
				JOptionPane.showInputDialog(Panel.this, "MENSAJE PRUEBA", "Ingrese", 3);
			}
			else if (e.getSource()==boton3) {
				
				JOptionPane.showConfirmDialog(Panel.this, "PRUEBA","ESTA SEGURO",1);
			}
			else if (e.getSource()== boton4) {
				
				JOptionPane.showOptionDialog(Panel.this, "Hola", "Prueba", 1, 1, null, null, null);
			}
		}		
	}
}


