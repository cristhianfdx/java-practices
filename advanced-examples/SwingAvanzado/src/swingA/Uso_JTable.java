package swingA;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Uso_JTable {

	public static void main(String[] args) {
		
		VentanaTabla v2 = new VentanaTabla();
		v2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v2.setVisible(true);

	}

}

class VentanaTabla extends JFrame{
	
	private String [] n_columnas = {"Nombre", "Radio","Lunas","Gaseoso"};
	private Object [][] datos_fila = {
			
			{"Mercurio",2440,0,false},
			{"Venus",6052,0,false},
			{"Tierra",6378,1,false},
			{"Marte",3397,2,false},
			{"Jupiter",71492,16,true},
			{"Saturno",60268,18,true},
			{"Urano",25559,17,true},
			{"Neptuno",24776,8,true},
			{"Pluton",1137,1,false}
			
	};
	
	public VentanaTabla() {
		
		setTitle("Los planetas");
		setBounds(300,300,400,200);
		
		JTable tabla_planetas = new JTable(datos_fila, n_columnas);
		
		add(new JScrollPane(tabla_planetas),BorderLayout.CENTER);
		
		JButton imprimir = new JButton("Imprimir Tabla");
		
		imprimir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					tabla_planetas.print();
					
				} catch (Exception e2) {
					
				}
				
			}
		});
		
		JPanel panelB = new JPanel();
		
		panelB.add(imprimir);
		
		add(panelB,BorderLayout.SOUTH);
		
		
	}
	
}
