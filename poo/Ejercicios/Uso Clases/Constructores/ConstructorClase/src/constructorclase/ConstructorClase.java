/*
 Crear un arreglo de numeros, crearlo y guardar datos mediante el constructor.
 */
package constructorclase;
import java.util.Scanner;

public class ConstructorClase {
    private Scanner leer;
    private int [] numeros;
    
    public ConstructorClase(){
        leer = new Scanner(System.in);
                
        numeros = new int [4];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese numero :");
            numeros[i] = leer.nextInt();
        }
    }
    
    public void imprimir(){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("["+numeros[i]+"]");
        }
    }
    
    public static void main(String[] args) {
        ConstructorClase op = new ConstructorClase();
        op.imprimir();
    }
    
}
