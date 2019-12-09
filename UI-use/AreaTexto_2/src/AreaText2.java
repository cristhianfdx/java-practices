package areatexto2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AreaText2 {

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v1.setVisible(true);

	}

}

class Ventana extends JFrame{
	
	private JPanel panel_1;
	private JScrollPane panel_2;
	
	private JButton insert;
	private JButton saltoL;
	
	private JTextArea areaText;
	
	public Ventana() {
		
		setTitle("Areas de texto");
		setBounds(500, 300, 500, 350);
		setLayout(new BorderLayout());
		
		panel_1 = new JPanel();
		insert = new JButton("Insertar");
		insert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				areaText.append("hola este texto se agrega al final del documento....");
				
			}
		});
		
		
		panel_1.add(insert);
				
		saltoL = new JButton("Salto linea");
		saltoL.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean saltar =! areaText.getLineWrap();
				
				areaText.setLineWrap(saltar);
				
				if(saltar == true) {
					
					saltoL.setText("Quitar salto");
				}else {
					saltoL.setText("Salto Linea");
				}
				
			}
		});
		panel_1.add(saltoL);
		add(panel_1,BorderLayout.SOUTH);
		
		areaText = new JTextArea(8,20);
		panel_2= new JScrollPane(areaText);
		add(panel_2,BorderLayout.CENTER);
		
		
	}
	
}
