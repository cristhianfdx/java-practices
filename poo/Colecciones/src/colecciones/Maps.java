package colecciones;

import java.util.*;

public class Maps {

	public static void main(String[] args) {
		
		HashMap<String, Empleado> empleados = new HashMap<String, Empleado>();
		
		empleados.put("145", new Empleado("Cristhian"));
		empleados.put("146", new Empleado("Alexander"));
		empleados.put("147", new Empleado("Sebastian"));
		
		System.out.println(empleados);
		
		//System.out.println(empleados.entrySet());
		
		for (Map.Entry<String, Empleado> entrada : empleados.entrySet()) {
			
			
			//System.out.println(entrada);
			String clave = entrada.getKey();
			Empleado valor = entrada.getValue();
			
			System.out.println(clave+valor);
		}
		
	}

}

class Empleado{
	
	private String nom;
	private double sueldo;
	
	public Empleado(String nombre) {
		
		nom = nombre;
		sueldo = 2000;		
	}
	
	public String toString() {
		return "[Nombre = "+ nom + "; Sueldo = "+ sueldo+" ]";		
	}
	
}
