package ejemplo;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class EjemploRadioButton {

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v1.setVisible(true);

	}

}

class Ventana extends JFrame{
	
	public Ventana() {
		
		setTitle("Ejemplo RadioButton");
		setBounds(400,200,500,350);
		Panel panel_1 = new Panel();
		add(panel_1);
		
	}
}

class Panel extends JPanel{
	
	private JLabel texto;
	private JRadioButton boton1, boton2,boton3,boton4;
	
	public Panel() {
		
		setLayout(new BorderLayout());
		
		texto = new JLabel("Probando los RadioButton");
		add(texto,BorderLayout.CENTER);
		
		ButtonGroup grupo = new ButtonGroup();
		
		 boton1= new JRadioButton("Pequeño",false);
		 boton2= new JRadioButton("Mediano",true);
		 boton3= new JRadioButton("Grande",false);
		 boton4= new JRadioButton("Muy grande",false);
		 
		 JPanel panel_2 = new JPanel();
		 
		 CambioTamaño evento = new CambioTamaño();
		 boton1.addActionListener(evento);
		 boton2.addActionListener(evento);
		 boton3.addActionListener(evento);
		 boton4.addActionListener(evento);
		 
		 grupo.add(boton1);
		 grupo.add(boton2);
		 grupo.add(boton3);
		 grupo.add(boton4);
		 
		 panel_2.add(boton1);
		 panel_2.add(boton2);
		 panel_2.add(boton3);
		 panel_2.add(boton4);
		 
		 add(panel_2,BorderLayout.SOUTH);
		
	}
	
	private class CambioTamaño implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()== boton1) 
			{
				texto.setFont(new Font("Serif",Font.PLAIN,10));
				
			}
			else if (e.getSource()==boton2) 
			{
				texto.setFont(new Font("Serif",Font.PLAIN,12));
				
			}
			else if (e.getSource()==boton3)
			{
				texto.setFont(new Font("Serif",Font.PLAIN,18));
				
			}
			else if (e.getSource()==boton4) 
			{
				texto.setFont(new Font("Serif",Font.PLAIN,24));
				
			}
		}
		
	}
}


