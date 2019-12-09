package sockets_1;

import java.awt.*;
import java.io.*;
import java.net.*;

import javax.swing.*;

public class Servidor {
	
	public static void main(String[] args) {
		
		VentanaServidor v2 = new VentanaServidor();
		v2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v2.setVisible(true);
	}
}

class VentanaServidor extends JFrame implements Runnable{
	
	private JTextArea texto;
	
	public VentanaServidor() {
		
		setTitle("Servidor");
		setBounds(600,300,280,350);
		
		JPanel panel_servidor= new JPanel();
		panel_servidor.setLayout(new BorderLayout());
		
		texto = new JTextArea();
		panel_servidor.add(texto,BorderLayout.CENTER);	
		
		add(panel_servidor);
		
		Thread hilo =new Thread(this);
		hilo.start();
	}

	@Override
	public void run() {
		
		try {
			ServerSocket servidor = new ServerSocket(9999);
			
			String nick,ip,mensaje_in;
			
			DatosEnvio pkgDatosIn;
			
			
			while(true) {
				
				Socket mi_socket = servidor.accept();
				
				//--------------Detecta Online-----------------------
				
				InetAddress localizado = mi_socket.getInetAddress();
				
				String ip_remota = localizado.getHostAddress();
				
				System.out.println(ip_remota);
				//---------------------------------------------------
				
				ObjectInputStream datos_in= new ObjectInputStream(mi_socket.getInputStream());
				
				pkgDatosIn = (DatosEnvio)datos_in.readObject();
				
				nick = pkgDatosIn.getNick();
				ip = pkgDatosIn.getIp();
				mensaje_in = pkgDatosIn.getMensaje();
				
				texto.append("\n "+ nick + " : "+ mensaje_in +"  para  "+ ip);
				
				Socket envioDestinatario = new Socket(ip,9090);
				
				ObjectOutputStream datos_reenvio = new ObjectOutputStream(envioDestinatario.getOutputStream());
				
				datos_reenvio.writeObject(pkgDatosIn);
				
				datos_reenvio.close();
				
				envioDestinatario.close();
				
				mi_socket.close();
			
				/*DataInputStream dataIn = new DataInputStream(mi_socket.getInputStream());
			
				String mensaje = dataIn.readUTF();
			
				texto.append("\n" + mensaje);
			
				mi_socket.close();*/
			}
			
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}		
	}
}


