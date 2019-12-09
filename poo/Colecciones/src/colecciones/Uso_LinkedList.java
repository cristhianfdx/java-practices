package colecciones;
import java.util.*;

public class Uso_LinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> personas = new LinkedList<String>();
	    
		
		personas.add("Cristhian");
		personas.add("Alexander");
		personas.add("Maria");
		personas.add("Felipe");
		
		System.out.println(personas.size());
		
		ListIterator<String> it = personas.listIterator();
		
		it.next();
		
		it.add("Pablo");
		
		for(String s : personas) {
			System.out.println(s);
		}

	}

}
