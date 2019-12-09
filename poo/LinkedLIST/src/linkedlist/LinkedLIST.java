
package linkedlist;

import java.util.LinkedList;

public class LinkedLIST {

    
    public static void main(String[] args) {
        
        LinkedList<String> nombres = new LinkedList<String>();
        
        nombres.add("Cristhian");
        nombres.add("Max");
        nombres.add("Chava");
        nombres.add("Paola");
        
        System.out.println(nombres);
        
        nombres.add(0,"Tula");
        
        System.out.println(nombres);
        
    }
    
}
