package controlador;


import java.awt.event.*;
import java.sql.*;

import modelo.*;
import vista.*;


public class EventoConsulta implements ActionListener {
	
	private InterfazGrafica ventana;
	EjecutarConsulta obj = new EjecutarConsulta();
	private ResultSet resultadoConsulta;
	
	public EventoConsulta(InterfazGrafica ventana) {
		
		this.ventana = ventana;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String seleccion_seccion = (String)ventana.combo_seccion.getSelectedItem();
		String seleccion_paises = (String)ventana.combo_paises.getSelectedItem();
		
		ventana.campo_texto.setText("");
		
		resultadoConsulta = obj.filtraBD(seleccion_seccion, seleccion_paises);
		
		try {
			while (resultadoConsulta.next()) {
				
				ventana.campo_texto.append(resultadoConsulta.getString(1));
				ventana.campo_texto.append(" , ");
				
				ventana.campo_texto.append(resultadoConsulta.getString(2));
				ventana.campo_texto.append(" , ");
				
				ventana.campo_texto.append(resultadoConsulta.getString(3));
				ventana.campo_texto.append(" , ");
				
				ventana.campo_texto.append(resultadoConsulta.getString(4));
				ventana.campo_texto.append("\n");
				
			}
		} catch (SQLException e1) {
			
			
		}
		
	}

}
