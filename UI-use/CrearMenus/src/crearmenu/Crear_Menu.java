package crearmenu;

import javax.swing.*;

public class Crear_Menu {

	public static void main(String[] args) {
		Ventana  v1 = new Ventana();
		v1.setVisible(true);
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Ventana extends JFrame{
			
	public Ventana() {
		setTitle("Ventana con menu");
		setBounds(400, 200, 600, 350);
		Panel lamina = new Panel();
		add(lamina);
	}
}

class Panel extends JPanel{
	
	public Panel() {
		
		JMenuBar barramenu = new JMenuBar();
		
		JMenu archivo = new JMenu("Archivo");		
		JMenu edicion = new JMenu("Edición");
		JMenu herramientas = new JMenu("Herramientas");
		
		JMenu opciones = new JMenu("Opciones");
		
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem guardar_como = new JMenuItem("Guardar como");
		
		JMenuItem cortar = new JMenuItem("Cortar");
		JMenuItem copiar = new JMenuItem("Copiar");
		JMenuItem pegar = new JMenuItem("Pegar");
		
		JMenuItem configurar = new JMenuItem("Configurar");
		
		JMenuItem opcion1= new JMenuItem("Opcion 1");
		JMenuItem opcion2= new JMenuItem("Opcion 2");
		
		archivo.add(guardar);
		archivo.add(guardar_como);
		
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);
		edicion.addSeparator();
		
		edicion.add(opciones);
		
		herramientas.add(configurar);
		
		opciones.add(opcion1);
		opciones.add(opcion2);	
		
		barramenu.add(archivo);
		barramenu.add(edicion);
		barramenu.add(herramientas);
		
		add(barramenu);//agregando la barra al panel
	}
}
