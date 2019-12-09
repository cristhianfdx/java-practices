
package Met_Par_Arg;
import java.util.Scanner;


public class Metodo_P_A {
    
    int suma,resta,mult;
    float div;
    
     public static void main(String [] args){
      Scanner entrada = new Scanner(System.in);
         System.out.print("Ingrese el primer numero :");
       int leer1 = entrada.nextInt();
       System.out.print("Ingrese el segundo numero :");
       int leer2 = entrada.nextInt();
       
       Metodo_P_A OP = new Metodo_P_A();
       
       OP.SUMA(leer1, leer2);
       OP.RESTA(leer1, leer2);
       OP.MULTIPLICACION(leer1, leer2);
       OP.DIVISION(leer1, leer2);
       
       OP.IMPRIMIR_RESULTADO();   
            
               
    }
    
    public void SUMA(int num1,int num2){
       
        suma = num1 + num2;
    }
    
    public void RESTA(int num1,int num2){
          resta = num1 - num2;
    }
    
    public void MULTIPLICACION(int num1,int num2){
          mult = num1 * num2;
    }
    
    public void DIVISION(int num1,int num2){
          div = num1 / num2;
        
    }
    
    public void IMPRIMIR_RESULTADO(){
        
        System.out.println("La suma es :"+" "+suma);
        System.out.println("La resta es :"+" "+resta);
        System.out.println("La multiplicacion es :"+" "+mult);
        System.out.println("La division es :"+" "+div);
    }
}
