package muelle;

import javax.swing.*;

public class DisposicionEnMuelle {

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class Ventana extends JFrame{
	
	public Ventana() {
		setTitle("Disposicion Muelle");
		setBounds(300,200, 1000, 350);
		add(new Panel());		
	}
	
}

class Panel extends JPanel{
	
	public Panel() {
		
		JButton boton1 = new JButton("Boton 1");
		JButton boton2 = new JButton("Boton 2");
		JButton boton3 = new JButton("Boton 3");
		
		SpringLayout miLayout = new SpringLayout();		
		setLayout(miLayout);
		
		add(boton1);
		add(boton2);
		add(boton3);
		
		Spring muelle = Spring.constant(0, 10, 100);
		
		miLayout.putConstraint(SpringLayout.WEST, boton1, muelle, SpringLayout.WEST, this);
		miLayout.putConstraint(SpringLayout.WEST, boton2, muelle, SpringLayout.EAST, boton1);
		miLayout.putConstraint(SpringLayout.WEST, boton3, muelle, SpringLayout.EAST, boton2);
		miLayout.putConstraint(SpringLayout.EAST, this, muelle, SpringLayout.EAST, boton3);
		
		
	}
}
