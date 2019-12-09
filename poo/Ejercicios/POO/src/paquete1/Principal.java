
package paquete1;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Operaciones genProceso = new Operaciones();
        
        System.out.print("Ingrese un numero :");
        genProceso.setNum1(leer.nextInt());
         System.out.print("Ingrese un numero :");
        genProceso.setNum2(leer.nextInt());
        
        genProceso.sumar();
        
    }
    
}
