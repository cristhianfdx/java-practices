
package paquete1;

public class Persona {
    String nombre;
    int edad;
    String Cedula;
    
    
    //Metodos

    public Persona(String Cedula) {
        this.Cedula = Cedula;
    }    

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void correr(){
        System.out.println("Soy"+nombre+"tengo"+edad);
    }
    
    public void correr(int km){
        System.out.println("He corrido"+km+"kilometros");
    }
}
