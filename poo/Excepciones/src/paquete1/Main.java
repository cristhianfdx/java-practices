
package paquete1;
import java.util.Scanner;


public class Main {
    
    public static boolean error;
    public static double n1,n2,res;
    
    public static void main(String[] args) {
        
        try {
            Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero:");
        n1 = leer.nextDouble();
        System.out.println("Ingrese numero:");
        n2 = leer.nextDouble();
        res = n1 /n2;
            System.out.println("El resultado es :"+res);
        }
        
        catch(Exception e) {
            error = true;
            System.out.println("Error en la ejecucion de tipo :"+e);
        }
        finally{
            if (error==true) {
               System.out.println("Hubo una excepcion al ejecutar el codigo"); 
            }else{
                System.out.println("Se ejecuta correctamente");
            }
            
        }
        
        
        
    }
    
}
