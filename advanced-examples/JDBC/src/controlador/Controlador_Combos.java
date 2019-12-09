package controlador;

import java.awt.event.*;
import modelo.*;
import vista.*;

public class Controlador_Combos extends WindowAdapter {
	
	CargarCombos obj = new CargarCombos();
	private InterfazGrafica laVentana;
	
	public Controlador_Combos(InterfazGrafica laVentana) {
		
		this.laVentana = laVentana;
		
	}	
	
	@Override
	public void windowOpened(WindowEvent we) {
		
		obj.ejecutaConsulta();
		
		try {
			while(obj.rs.next()) {
				
				laVentana.combo_seccion.addItem(obj.rs.getString(1));				
			}
			
			while (obj.rp.next()) {
				
				laVentana.combo_paises.addItem(obj.rp.getString(1));
			}
			
			
		} catch (Exception e) {
			
		}
		
	}
	
}
