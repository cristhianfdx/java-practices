package arraylist;
import java.util.*;


public class Uso_ArrayList  {

	public static void main(String[] args) {
		//int numero;
		 ArrayList<Integer> listanumero =new ArrayList<Integer>();
		
		listanumero.add(1);
		listanumero.add(2);
		listanumero.add(3);
		listanumero.add(4);
		listanumero.add(5);
		listanumero.add(6);
		listanumero.add(7);
		listanumero.add(8);
		 
		 Iterator<Integer> mi_iterador = listanumero.iterator();
		 
		 while(mi_iterador.hasNext()) {
			 System.out.println(mi_iterador.next());
		 }
		 
		 System.out.println(listanumero);

	}

}
