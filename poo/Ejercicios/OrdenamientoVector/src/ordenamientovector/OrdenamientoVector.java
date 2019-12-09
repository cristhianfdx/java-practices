/*Crear un vector que almacene 5 numeros  y los ordene de menor a mayor */
package ordenamientovector;
import java.util.Scanner;

public class OrdenamientoVector {
private Scanner leer;
private int numeros [];
    
    public void IngresoNum(){
        leer = new Scanner(System.in);
        numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese numero:");
            numeros[i] = leer.nextInt();
        }
        for (int j = 0; j < numeros.length; j++) {
            
            System.out.print("["+ numeros[j]+ "]");
        }
        System.out.println(" ");
    }
    
    public void ordenar(){
        int aux;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (numeros[j] > numeros[j+1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;                    
                }
            }
        }
    }
    
    public void imprimir(){
        System.out.println("Numeros ordenados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("["+numeros[i]+"]");
            
        }
        System.out.println(" ");
    }
   
    public static void main(String[] args) {
        OrdenamientoVector ordenarv = new OrdenamientoVector();
        ordenarv.IngresoNum();
        ordenarv.ordenar();
        ordenarv.imprimir();
    }
    
}
