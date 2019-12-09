package multipleO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VariosOyentes {

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Ventana extends JFrame{
	
	public Ventana() {
		
		setTitle("Multiples oyentes");
		setVisible(true);
		setBounds(700,200,300,150);
		add(new Panel());
		
	}
	
}

class Panel extends JPanel{
	
	JButton botonCerrar;
	
	public Panel() {
		JButton botonNuevo = new JButton("Nuevo");
		add(botonNuevo);
		botonCerrar = new JButton("Cerrar");
		add(botonCerrar);	
		
		Oyente mioyente = new Oyente();
		botonNuevo.addActionListener(mioyente);
	}
	
	private class Oyente implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			VentanasEmergentes ventanaN = new VentanasEmergentes(botonCerrar);
			ventanaN.setVisible(true);
			
			
			
		}
		
	}
	
}

class VentanasEmergentes extends JFrame{
	
	private static int contadorOpen =0;
	
	public VentanasEmergentes(JButton botonC) {
		
		contadorOpen++;
		setTitle("Ventana"+" "+contadorOpen);
		setBounds(40*contadorOpen,40*contadorOpen,300,150);
		
		CierraTodo cerrar = new CierraTodo();
		botonC.addActionListener(cerrar);
					
	}
	
	private class CierraTodo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			
		}
		
	}
	
}


