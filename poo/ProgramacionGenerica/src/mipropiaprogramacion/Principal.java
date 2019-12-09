package mipropiaprogramacion;


public class Principal {

	public static void main(String[] args) {
		MiProgramacion n1 = new MiProgramacion(4);
		
		n1.add("Cristhian");
		n1.add("Alexander");
		n1.add("Forero");
		n1.add("Dominguez");
		
		String nombre = (String)n1.get(3);
		
		System.out.println(nombre);
		

	}

}
