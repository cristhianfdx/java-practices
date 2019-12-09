/*Crear una clase que permita guardar el nombre y la edad de una persona. Mostrar los datos guardados, imprimir un mensaje 
si es mayor de edad (edad >= 18)  */

package declarando_clase;
import java.util.Scanner;

public class Declarando_clase {
    //Atributos
    private Scanner teclado;//Private no se permite acceso al atributo desde otra clase
    private String nombre;
    private int edad;
    
    //Metodos
    public void Ingreso_datos(){
        teclado = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre :");
        nombre = teclado.nextLine();
        
        System.out.print("Ingrese su edad :");
        edad = teclado.nextInt();
    }
    
    public void Mayor_edad(){
        if (edad >= 18) {
            System.out.println(String.format("%s es mayor de edad", nombre));
        }else{
            System.out.println(String.format("%s es menor de edad", nombre));
        }
    }
    
    public void imprimir(){
        System.out.println("Nombre : "+ nombre);
        System.out.println("Edad : "+ edad);
    }

    public static void main(String[] args) {
        Declarando_clase persona;
        persona = new Declarando_clase();//Se crea un objeto que permita invocar los metodos creados
        persona.Ingreso_datos();
        persona.imprimir();persona.Mayor_edad();
     
    }
    
}
