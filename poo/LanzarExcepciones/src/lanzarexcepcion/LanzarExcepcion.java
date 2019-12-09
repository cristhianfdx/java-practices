package lanzarexcepcion;
import java.util.*;

public class LanzarExcepcion {
	
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		LanzarExcepcion p1 = new LanzarExcepcion();
		p1.PedirDato();

	}
	
	
	public  void PedirDato() throws InputMismatchException {
		
		try {
		System.out.print("Ingrese nombre :");		
		String nombre = entrada.next();
		
		System.out.print("Ingrese edad :");
		int edad = entrada.nextInt();
		System.out.println("  El nombre es :  "+nombre+ "  y su edad es :  "+edad);
		}catch(InputMismatchException e) {
		System.out.println("Error "+e);
		}
	}

}
