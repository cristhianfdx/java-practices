package colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class PracticaLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> paises = new LinkedList<String>();
		
		paises.add("España");
		paises.add("Colombia");
		paises.add("Mexico");
		paises.add("Peru");
		
		LinkedList<String> capitales = new LinkedList<String>();
		
		capitales.add("Madrid");
		capitales.add("Bogota");
		capitales.add("Mexico D.F.");
		capitales.add("Lima");
		
		ListIterator<String> itP = paises.listIterator();
		ListIterator<String> itC = capitales.listIterator();
		
		while (itC.hasNext()) {
			
			if (itP.hasNext()) {
				
				itP.next();
			}
			
			itP.add(itC.next());
			
		}
		
		System.out.println(paises);
		
		itC=capitales.listIterator();
		
		while (itC.hasNext()) {
			
			itC.next();
			
			if (itC.hasNext()) {
				
				itC.next();
				
				itC.remove();
			}
		}
		
		System.out.println(capitales);
		paises.removeAll(capitales);
		System.out.println(paises);
	}
}


