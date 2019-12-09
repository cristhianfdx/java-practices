package swingA;

import java.awt.*;
import java.util.*;
import java.util.List;

import javax.swing.*;
import javax.swing.event.*;


public class Prueba_JList {

	public static void main(String[] args) {
		
		Ventana v1 = new Ventana();
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v1.setVisible(true);

	}

}

class Ventana extends JFrame{
	
	private JList<String> lista_meses;
	private JPanel panel_1 = new JPanel(), panel_2;
	private JLabel rotulo;
	
	public Ventana() {
		
		setTitle("Prueba Lista");
		setBounds(400,300,400,300);
		
		String [] meses = {"Enero", "Febrero","Marzo","Abril","Mayo","Junio",
							"Julio","Agosto","Septiembre","Octubre", "Noviembre", "Diciembre"};
		
		lista_meses= new JList<String>(meses);
		lista_meses.setVisibleRowCount(4);
		
		JScrollPane desplazamiento = new JScrollPane(lista_meses);
		panel_1.add(desplazamiento);
		
		lista_meses.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				List<String> valores= lista_meses.getSelectedValuesList();
				
				StringBuilder texto = new StringBuilder("Mes selecionado: ");
				
				for (String elemento : valores) {
					
					String palabra = elemento;
					
					texto.append(palabra);
					
					texto.append("");
					
				}
				
				rotulo.setText(texto.toString());
				
			}
		});
		
		panel_2=new JPanel();
		
		rotulo= new JLabel("Mes selecionado:");
		
		panel_2.add(rotulo);
		
		add(panel_1,BorderLayout.NORTH);
		add(panel_2, BorderLayout.SOUTH);
		
	}
	
}
