/*
ordenar un vector de 5 nombres por orden alfabetico.
 */
package ordenarvector2;
import java.util.Scanner;

public class OrdenarVector2 {
private Scanner leer;
private String nombres[];


    public void ingreso(){
        leer = new Scanner(System.in);
        nombres = new String [5];
        
        for(int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese nombre : ");
            nombres[i] = leer.next();
            
        }
    }
    
    public void ordenar(){
        String aux;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (nombres[j].compareTo(nombres[j+1]) > 0){
                    aux = nombres[j];
                    nombres[j] = nombres[j+1];
                    nombres[j+1] = aux;
                    
                }
            }
        }
    }
    
    public void imprimir(){
        System.out.println("Nombres ordenados : ");
        for (String i:nombres) {
            System.out.println(i);
        }
    }
 
    public static void main(String[] args) {
       OrdenarVector2 vector = new OrdenarVector2();
       vector.ingreso();
       vector.ordenar();
       vector.imprimir();
    }
    
}
