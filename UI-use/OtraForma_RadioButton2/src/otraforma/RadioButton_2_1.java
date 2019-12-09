package otraforma;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButton_2_1 {
	
	public static void main(String [] args) {
		
		Ventana v1 = new Ventana();
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class Ventana extends JFrame{
	
	private JPanel panel1, panel2;
	//private JRadioButton boton1,boton2,boton3,boton4;
	private ButtonGroup grupo;
	private JLabel texto;
		
	
	public Ventana() {
		
		setBounds(400, 300, 500, 370);
		
		 panel1 = new JPanel();
		 panel1.setLayout(new BorderLayout());
		 
		 texto = new JLabel("Prueba con RadioButton");
		 texto.setFont(new Font("Serif",Font.PLAIN,12));
		 panel1.add(texto,BorderLayout.CENTER);
		 
		 add(panel1);
		 		 
		 panel2= new JPanel();
		 
		 grupo= new ButtonGroup();
		 		 
		 crearBotones("Pequeño", false, 10);
		 crearBotones("Mediano", true, 12);
		 crearBotones("Grande", false, 18);
		 crearBotones("Muy Grande", false, 24);
		 
		 add(panel2,BorderLayout.SOUTH);		
	}
	
	public void crearBotones(String nombre, boolean seleccion, final int tamano) {
		
		JRadioButton boton = new JRadioButton(nombre,seleccion);
		
		
		grupo.add(boton);
		panel2.add(boton);
		
		ActionListener evento = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				texto.setFont(new Font("Serif",Font.PLAIN,tamano));
				
			}
		};
		
		boton.addActionListener(evento);
	}	
	
}
