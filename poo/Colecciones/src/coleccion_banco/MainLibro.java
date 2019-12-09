package coleccion_banco;

public class MainLibro {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("P en Java", "Cristhian", 25);
		Libro libro2 = new Libro("P en Java", "Cristhian", 25);
		
		
		
		if(libro1.equals(libro2)) {
			System.out.println("Es el mismo Libro");
			System.out.println(libro1.hashCode());
			System.out.println(libro2.hashCode());
		}else {
			System.out.println("No es el mismo Libro");
			System.out.println(libro1.hashCode());
			System.out.println(libro2.hashCode());
		}
	}
}
