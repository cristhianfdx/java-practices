package radiobutton;

import javax.swing.*;

public class SintaxisRadioB {

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Ventana extends JFrame{
	
	public Ventana(){
		
		setTitle("RadioButton");
		setBounds(300,200,500,370);
		Panel panel_1 = new Panel();
		add(panel_1);
		
	}
	
}

class Panel extends JPanel{
	
	public Panel() {
		
		ButtonGroup grupo1= new ButtonGroup();
		ButtonGroup grupo2= new ButtonGroup();
		
		
		JRadioButton boton1 = new JRadioButton("Azul",false);
		JRadioButton boton2 = new JRadioButton("Rojo",false);
		JRadioButton boton3 = new JRadioButton("Verde",false);
		JRadioButton boton4 = new JRadioButton("Masculino",false);
		JRadioButton boton5 = new JRadioButton("Femenino",false);
		
		grupo1.add(boton1);
		grupo1.add(boton2);
		grupo1.add(boton3);
		
		grupo2.add(boton4);
		grupo2.add(boton5);		
		
		add(boton1);
		add(boton2);
		add(boton3);
		
		add(boton4);
		add(boton5);
		
		
	}
	
}
