package colecciones;

import java.util.Comparator;
import java.util.TreeSet;

public class Uso_TreeSet {

	public static void main(String[] args) {


		/*TreeSet<String> ordena_persona = new TreeSet<String>();
		
		ordena_persona.add("Sandra");
		ordena_persona.add("Isabel");
		ordena_persona.add("Andrea");		
	
		
		for (String s : ordena_persona) {
			System.out.println(s);
		}*/
		
		Articulo primero = new Articulo(1, "Primer articulo");
		Articulo segundo = new Articulo(2, "Segundo articulo");
		Articulo tercero = new Articulo(3, "Tercer articulo");
		
		TreeSet<Articulo> articulos = new TreeSet<Articulo>();
		
		articulos.add(primero);
		articulos.add(tercero);
		articulos.add(segundo);
		
		for (Articulo articulo : articulos) {
			
			System.out.println(articulo.getDescripcion());
		}
		
		System.out.println();
		
		//ComparadorArticulos comparador_articulos = new ComparadorArticulos();
		
		TreeSet<Articulo> ordena_articulos2 = new TreeSet<Articulo>(new Comparator<Articulo>() {
			
			@Override
			public int compare(Articulo o1, Articulo o2) {
				
				String desA = o1.getDescripcion();
				String desB = o2.getDescripcion();
				
				return desA.compareTo(desB);
			}			
		});
		
		ordena_articulos2.add(primero);
		ordena_articulos2.add(tercero);
		ordena_articulos2.add(segundo);
		
		for (Articulo articulo : ordena_articulos2) {
			System.out.println(articulo.getDescripcion());
		}

	}

}

class Articulo implements Comparable<Articulo>{
	
	private int numero_articulo;
	private String descripcion;	
	
	
	public Articulo(int num, String des) {
		
		numero_articulo=num;
		descripcion=des;
		
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	@Override
	public int compareTo(Articulo o) {
		
		return numero_articulo - o.numero_articulo;
	}	
}


