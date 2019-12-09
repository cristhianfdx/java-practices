package verofocarpass;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;


public class VerificaPassword {

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Ventana extends JFrame{
	
	public Ventana() {
		setBounds(300, 300, 500, 350);
		Panel panelP = new Panel();
		add(panelP);
		setVisible(true);
	}
	
}


class Panel extends JPanel{
	
	private JPasswordField c_pass;
	
	public Panel(){
		
		setLayout(new BorderLayout());		
		
		JPanel panelsup= new JPanel();
		panelsup.setLayout(new GridLayout(2, 2));
		add(panelsup,BorderLayout.NORTH);
		
		JLabel eUsuario= new JLabel("Usuario:");
		JLabel ePass= new JLabel("Contraseña:");
		
		JTextField c_usuario = new JTextField(15);
		c_pass= new JPasswordField(15);
		
		c_pass.getDocument().addDocumentListener(new CompruebaPass());
		
		panelsup.add(eUsuario);
		panelsup.add(c_usuario);
		
		panelsup.add(ePass);
		panelsup.add(c_pass);
		
		JButton enviar = new JButton("Enviar");
		add(enviar,BorderLayout.SOUTH);		
		
	}
	
	private class CompruebaPass implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent e) {
			
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			
			char [] pass;
			pass = c_pass.getPassword();
			
			if (pass.length < 8 || pass.length > 12) {
				c_pass.setBackground(Color.red);
			}else {
				c_pass.setBackground(Color.WHITE);
			}			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			char [] pass;
			pass = c_pass.getPassword();
			
			if (pass.length < 8 || pass.length > 12) {
				c_pass.setBackground(Color.red);
			}else {
				c_pass.setBackground(Color.WHITE);
			}
			
		}
		
	}
	
}