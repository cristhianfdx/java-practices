
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayLIST {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      ArrayList<String> lista = new ArrayList <String>();
     
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese elemento"+ i +":");
            String elem = leer.next();
            lista.add(elem);
        }
        
        System.out.println("Elementos:"+lista);
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
            
        }
    }
    
}
