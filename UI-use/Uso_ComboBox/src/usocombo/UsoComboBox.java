package usocombo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UsoComboBox {

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Ventana extends JFrame{
	
	public Ventana () {
		setBounds(200,100,500,350);
		Lamina lamina_1= new Lamina();
		add(lamina_1);
	}
	
}

class Lamina extends JPanel{
	
	private JLabel texto;
	private JComboBox combo;
	
	public Lamina () {
		
		setLayout(new BorderLayout());
		texto = new JLabel("Probando ComboBox");
		texto.setFont(new Font("Serif", Font.PLAIN, 24));
		add(texto,BorderLayout.CENTER);
		
		JPanel lamina_2 = new JPanel();
		
		combo = new JComboBox();
		//combo.setEditable(true); 
		
		combo.addItem("times new roman");
		combo.addItem("Verdana");
		combo.addItem("Arial");
		combo.addItem("courier new");
		
		eventoCombo evento = new eventoCombo();
		combo.addActionListener(evento);
		lamina_2.add(combo);
		add(lamina_2,BorderLayout.NORTH);
		
	}
	
	private class eventoCombo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			texto.setFont(new Font((String)combo.getSelectedItem(),Font.PLAIN,18));
			
		}
		
	}
}
