package areastexto;

import javax.swing.*;
import java.awt.event.*;

public class AreasDeTexto {

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Ventana extends JFrame{
	
	public Ventana() {
		
		setBounds(400,200,500,350);
		Panel panel_1 = new Panel();
		add(panel_1);
		setVisible(true);		
	}
}

class Panel extends JPanel{
	
	private JTextArea area;
	
	public Panel() {
		
		area = new JTextArea(8,20);		
		JScrollPane panel_scroll = new JScrollPane(area);		
		area.setLineWrap(true);
		add(panel_scroll);
		
		JButton boton = new JButton("Enviar");
		boton.addActionListener(new G_Area());
		add(boton);
		
	}
	
	private class G_Area implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(area.getText());
			
		}
		
	}
}
