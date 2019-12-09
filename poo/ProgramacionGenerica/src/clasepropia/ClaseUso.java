package clasepropia;

public class ClaseUso {

	public static void main(String[] args) {
		
		ClaseGen<String> clase_1 = new ClaseGen<String>();
		clase_1.setPrimero("Cristhian");
		
		System.out.println(clase_1.getPrimero());
		
		Persona p1 = new Persona("Alexander");
		
		ClaseGen<Persona> clase_2= new ClaseGen<Persona>();
		clase_2.setPrimero(p1);
		
		System.out.println(clase_2.getPrimero());

	}

}
class Persona{
	
	private String nombre;
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return nombre;
	}
	
}
