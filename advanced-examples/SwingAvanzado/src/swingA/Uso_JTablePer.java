package swingA;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class Uso_JTablePer {

	public static void main(String[] args) {
		
		VentanaTablaP vP = new VentanaTablaP();
		vP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vP.setVisible(true);

	}

}

class VentanaTablaP extends JFrame{
	
	
	
	public VentanaTablaP() {
		
		setTitle("Tabla Personalizada");
		setBounds(300,300,400,200);
		
		TableModel mi_model = new ModeloTabla();
		
		JTable mi_tabla = new JTable(mi_model);
		
		add(new JScrollPane(mi_tabla));
	}
	
}

class ModeloTabla extends AbstractTableModel{

	@Override
	public int getColumnCount() {
		
		return 3;
	}

	@Override
	public int getRowCount() {
		
		return 5;
	}

	@Override
	public Object getValueAt(int F1, int C1) {
		
		int z = F1 +1;
		int y = C1 +2;
				
		
		return " " + z +" "+y;
	}
	
	
}
