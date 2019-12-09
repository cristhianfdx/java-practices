package cuadro_texto;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class CuadroTexto {

	public static void main(String[] args) {
		
		Ventana v1 = new Ventana();
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v1.setVisible(true);

	}

}

class Ventana extends JFrame{
	
	public Ventana() {
		setTitle("Ventana con texto");
		setBounds(600, 300, 600, 350);		
		Panel panel_1 = new Panel();
		
		add(panel_1);
		
		
	}
	
}

class Panel extends JPanel{
	
	private JTextField cuadroT;
	private JLabel resultado;
	
	public Panel () {
		
		setLayout(new BorderLayout());		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(new FlowLayout());
		
		resultado = new JLabel("",JLabel.CENTER);
		
		JLabel etiqueta = new JLabel("Email :");
		panel_2.add(etiqueta);
		
		cuadroT = new JTextField(15);
		panel_2.add(cuadroT);
		add(resultado,BorderLayout.CENTER);
		
		JButton boton = new JButton("Comprobar");		
		
		GuardarInfo evento = new GuardarInfo();
		boton.addActionListener(evento);
		panel_2.add(boton);
		
		add(panel_2,BorderLayout.NORTH);
	}
	
	private class GuardarInfo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			int correcto = 0;
			String email= cuadroT.getText().trim();
			
			for (int i = 0; i < email.length(); i++) {
				
				if (email.charAt(i)== '@') {
					
					correcto++;					
				}
				
				if(correcto!=1) {
					resultado.setText("Incorrecto");
				}else{
					resultado.setText("Correcto");
				}
				
			}
			
		}
		
	}
}


