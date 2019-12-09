package coleccion_banco;
import java.util.*;

public class ColeccionBanco {

	public static void main(String[] args) {
		
		Clientes c1 = new Clientes("Paola Diaz", "00001", 200000);
		Clientes c2 = new Clientes("Cristhian Forero", "00002", 250000);
		Clientes c3 = new Clientes("Maria Dominguez", "00003", 300000);
		Clientes c4 = new Clientes("Julio Vargas", "00004", 500000);
		//Clientes c5 = new Clientes("Paola Diaz", "00001", 200000);
		
		Set <Clientes> clientesBanco = new HashSet <Clientes>();
		
		clientesBanco.add(c1);
		clientesBanco.add(c2);
		clientesBanco.add(c3);
		clientesBanco.add(c4);	
		//clientesBanco.add(c5);
		
		
		
		Iterator<Clientes> it = clientesBanco.iterator();
		
		while(it.hasNext()) {
			
			Clientes c = it.next();	
			
			if (c.getNombre().equals("Paola Diaz")) {
				
				it.remove();				
			}			
		}
		
		for(Clientes c :clientesBanco) {
		System.out.println(c.getNombre()+" "
				+c.getN_cuenta()+" "+c.getSaldo());
		}		
	}
}

class Clientes{
	
	private String nombre;
	private String n_cuenta;
	private double saldo;
	
	public Clientes(String nombre,String num_cuenta, double saldo) {
		this.nombre = nombre;
		this.n_cuenta = num_cuenta;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getN_cuenta() {
		return n_cuenta;
	}

	public void setN_cuenta(String n_cuenta) {
		this.n_cuenta = n_cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
