package vista;
import java.awt.*;
import javax.swing.*;
import controlador.*;

public class InterfazGrafica extends JFrame {

	
	private static final long serialVersionUID = 1L;
	public InterfazGrafica() {
		
		setTitle("Consulta BBDD MVC");
		setBounds(200, 100, 350,320);
		
		JPanel panel_p = new JPanel();
		panel_p.setLayout(new BorderLayout());
		
		combo_seccion = new JComboBox();
		combo_seccion.setEditable(false);
		combo_seccion.addItem("Todos");
		
		combo_paises = new JComboBox();
		combo_paises.setEditable(false);
		combo_paises.addItem("Todos");
		
		JPanel panel_sec = new JPanel();
		
		panel_sec.add(combo_seccion);
		panel_sec.add(combo_paises);
		
		panel_p.add(panel_sec,BorderLayout.NORTH);
		
		campo_texto = new JTextArea(4,50);		
		panel_p.add(campo_texto, BorderLayout.CENTER);
		
		JPanel panel_b = new JPanel();
		consulta = new JButton("Consulta");
		consulta.addActionListener(new EventoConsulta(this));
		panel_b.add(consulta);
		
		panel_p.add(panel_b,BorderLayout.SOUTH);		
		add(panel_p);
		
		addWindowListener(new Controlador_Combos(this));	
			
		
	}
	
	public JTextArea campo_texto;
	public JComboBox combo_seccion, combo_paises;
	private JButton consulta;
}
