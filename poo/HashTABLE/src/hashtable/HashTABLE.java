
package hashtable;
import java.util.Hashtable;

public class HashTABLE {

    
    public static void main(String[] args) {
       
        Hashtable<Integer,String> diccionario = new Hashtable<Integer,String>();
        
        diccionario.put(123, "Cristhian");
        
        System.out.println(diccionario.get(123));
        System.out.println(diccionario);
    }
    
}
