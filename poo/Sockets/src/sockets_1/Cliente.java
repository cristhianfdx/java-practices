package sockets_1;

import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.net.*;

public class Cliente {

	public static void main(String[] args) {
		
		VentanaCliente v1 = new VentanaCliente();
		v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v1.setVisible(true);
	}
}

class VentanaCliente extends JFrame{	
	
	public VentanaCliente() {		
		
		setBounds(600,300,280,350);
		add(new PanelCliente());
		
		addWindowListener(new EventoOnline());
		
	}	
}

//---------------------Envio señal online---------------------------------------------------------
class EventoOnline extends WindowAdapter{
	
	public void windowOpened(WindowEvent e) {
		
		try {
			
			Socket n_socket = new Socket("192.168.1.101", 9999);
			
			DatosEnvio datos = new DatosEnvio();
			datos.setMensaje("Online");
			ObjectOutputStream paquete_datos = new ObjectOutputStream(n_socket.getOutputStream());
			paquete_datos.writeObject(datos);
			
			n_socket.close();
			
		} catch (Exception e2) {
			
		}		
	}	
}
//---------------------------------------------------------------------------------------------------

class PanelCliente extends JPanel implements Runnable{	
		
	private JTextField campo1;
	private JLabel nick;	
	private JComboBox ip;
	private JButton boton1;
	private JTextArea campo_chat;
	
	public PanelCliente() {
		
		String nick_usuario = JOptionPane.showInputDialog("Nick:  ");		
		
		JLabel n_nick = new JLabel("Nick:");
		add(n_nick);
		
		nick = new JLabel();
		
		nick.setText(nick_usuario);		
		add(nick);
		
		JLabel cliente = new JLabel("   Online:");
		add(cliente);
		
		ip = new JComboBox();
		
		ip.addItem("Usuario 1");
		ip.addItem("Usuario 2");
		ip.addItem("Usuario ");
		
		add(ip);
		
		campo_chat = new JTextArea(12,20);
		add(campo_chat);
		
		campo1 = new JTextField(20);
		add(campo1);
		
		boton1 = new JButton("Enviar");
		boton1.addActionListener(new Eventos());
		add(boton1);	
		
		Thread hilocliente = new Thread(this);
		hilocliente.start();
	}
	
	
	private class Eventos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			campo_chat.append("\n "+ campo1.getText());
			
			
			try {
				Socket mi_socket = new Socket("192.168.1.101", 9999);
				
				DatosEnvio pkgDatosOut = new DatosEnvio();
				
				pkgDatosOut.setNick(nick.getText());
				pkgDatosOut.setIp(ip.getSelectedItem().toString());
				pkgDatosOut.setMensaje(campo1.getText());
				
				ObjectOutputStream data_salida = new ObjectOutputStream(mi_socket.getOutputStream());				
				
				data_salida.writeObject(pkgDatosOut);
				
				mi_socket.close();
				
				/*DataOutputStream data_salida = new DataOutputStream(mi_socket.getOutputStream());
				
				data_salida.writeUTF(campo1.getText());
				
				data_salida.close();*/
				
				
			} catch (UnknownHostException e1) {
				
				System.out.println(e1.getMessage());				
				
			} catch (IOException e1) {
				
				System.out.println(e1.getMessage());
			}			
		}		
	}


	@Override
	public void run() {
		
		try {
			
		ServerSocket servidor_cliente = new ServerSocket(9090);
		
		Socket socket_cliente;
		
		DatosEnvio pkgRecibido;
		
		while (true) {
			
			socket_cliente = servidor_cliente.accept();
			
			ObjectInputStream flujo_entrada = new ObjectInputStream(socket_cliente.getInputStream());
			
			pkgRecibido = (DatosEnvio) flujo_entrada.readObject();
			
			campo_chat.append("\n" + pkgRecibido.getNick()+" : "+  pkgRecibido.getMensaje());
		}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}


class DatosEnvio implements Serializable{		
	
	
	private String nick,ip,mensaje;	
	

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}	
}
