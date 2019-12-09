//Superclase
package operacion;
import java.util.Scanner;

public class Operacion {
    //Atributos de la Superclase, se definen Protected  para que la subclase tenga acceso a dichos atributos
    protected Scanner leer;
    protected int num1;
    protected int num2;
    protected int resultado;
    
    //Constructor
    
    public Operacion(){
        leer = new Scanner(System.in);
        
    }
    
    //Metodos
    
    public void GuardarNum1(){
        System.out.print("Ingrese el primer valor :");
        num1 = leer.nextInt();
    }
    
    public void GuardarNum2(){
        System.out.print("Ingrese el segundo valor :");
        num2 = leer.nextInt();
    }
    
    public void MostarResultado(){
        System.out.println(resultado);
    }
}
