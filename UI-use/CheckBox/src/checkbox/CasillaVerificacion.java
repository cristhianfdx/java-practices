package chaeckbox;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CasillaVerificacion {

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Ventana extends JFrame{
	
	public Ventana() {
		setBounds(400, 200, 600, 400);		
		Panel panelCheck = new Panel();
		add(panelCheck);		
	}
}

class Panel extends JPanel{
	
	private JLabel texto;
	private JCheckBox negrita, cursiva;
	
	public Panel () {
		
		setLayout(new BorderLayout());
		Font miFuente = new Font("Serif",Font.PLAIN,24);
		
		texto = new JLabel("Cambio de caracteristicas");
		
		texto.setFont(miFuente);
		
		JPanel panelText = new JPanel();
		panelText.add(texto);
		add(panelText,BorderLayout.CENTER);
		
		negrita = new JCheckBox("Negrita");
		cursiva = new JCheckBox("Cursiva");
		
		negrita.addActionListener(new ManejoChecks());
		cursiva.addActionListener(new ManejoChecks());
		
		JPanel panelCheck = new JPanel();
		panelCheck.add(negrita);
		panelCheck.add(cursiva);
		
		add(panelCheck,BorderLayout.SOUTH);
		
	}
	
	private class ManejoChecks implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			int tipo = 0;
			
			//if (negrita.isSelected() ==true) tipo+=Font.BOLD;
			//if (cursiva.isSelected() ==true) tipo+=Font.ITALIC;
			if(negrita.isSelected() ==true) {
				tipo+=Font.BOLD;					
			}
			
			if(cursiva.isSelected() ==true) {
				tipo+=Font.ITALIC;
			}
			
			texto.setFont(new Font("Serif",tipo,24));
				
				
			
			
		}
		
	}
}
