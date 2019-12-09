
package ejemploenum;


public class EjemploEnum {

    
    public static void main(String[] args) {
        
        for(Miclase persona : Miclase.values()){
            System.out.println(persona+" "+persona.getApellido().toUpperCase());
        }
    }
    
}
