package grid;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Grid {

	public static void main(String[] args) {
		Ventana v1 = new Ventana();
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v1.setVisible(true);
	}

}

class Ventana extends JFrame{
	
	public  Ventana() {
		setTitle("Calculadora");
		setBounds(300,200,500,300);
		
		Panel panel_1 = new Panel();		
		add(panel_1);	
		
	}	
}

class Panel extends JPanel{
	
	private JPanel panel_2;
	private JButton display;
	private boolean inicio = false;
	private double resultado;
	private String ultimaOperacion;
	
	public Panel() {
		
		inicio = true;
		
		setLayout(new BorderLayout());
		display = new JButton("0");
		display.setEnabled(false);
		add(display,BorderLayout.NORTH);
		
		panel_2 = new JPanel();
		panel_2.setLayout(new GridLayout(4,4));
		
		ActionListener insertN =new InsertarNumeros();
		ActionListener simbolosOperaciones = new GestionNumerica();
		
		Botones("7",insertN);
		Botones("8",insertN);
		Botones("9",insertN);
		Botones("/",simbolosOperaciones);
		
		Botones("4",insertN);
		Botones("5",insertN);
		Botones("6",insertN);
		Botones("*",simbolosOperaciones);
		
		Botones("1",insertN);
		Botones("2",insertN);
		Botones("3",insertN);
		Botones("-",simbolosOperaciones);
		
		Botones("0",insertN);
		Botones(".",simbolosOperaciones);
		Botones("=",simbolosOperaciones);
		Botones("+",simbolosOperaciones);
		
		add(panel_2, BorderLayout.CENTER);
		
		ultimaOperacion = "=";
	}
	
	private void Botones(String marca,ActionListener oyente) {
		
		JButton boton = new JButton(marca);
		boton.addActionListener(oyente);
		panel_2.add(boton);
		
	}	
	
	private class InsertarNumeros implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(inicio == true) {
				display.setText(" ");
				inicio=false;
			}
			
			String entrada= e.getActionCommand();
			
			display.setText(display.getText()+entrada);			
		}				
	}
	
	private class GestionNumerica implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String Operacion = e.getActionCommand();						
			calcular(Double.parseDouble(display.getText()));
			ultimaOperacion = Operacion;
			
			
			inicio = true;			
		}
		
		public void calcular(double x) {
			
			if(ultimaOperacion.equals("+")) {
				
				resultado += x;								
			}
			else if(ultimaOperacion.equals("-")) {
				
				resultado-=x;
			}
			else if(ultimaOperacion.equals("*")) {
				
				resultado*=x;
			}
			else if(ultimaOperacion.equals("/")) {
				
				resultado/=x;
				
			}
			
			else if(ultimaOperacion.equals("=")) {
				resultado =x;
			}
			
			display.setText("" + resultado);
			
			
		}
	}
}




