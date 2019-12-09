
package retorno;

import java.util.Scanner;


public class RetornO {
   
    
     public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        
         System.out.print("Ingrese el primer numero :");
        int leer1 = entrada.nextInt();
        System.out.print("Ingrese el segundo numero :");
        int leer2 = entrada.nextInt(); 
        
        RetornO op = new RetornO();
        
       int suma = op.SUMAR(leer1, leer2);
       int resta =op.RESTAR(leer1, leer2);
       int mult = op.MULTIPLICACION(leer1, leer2);
       float div = op.DIVISION(leer1, leer2);
        
        op.IMPRIMIR_RESULTADO(suma, resta, mult, div);
            
               
    }
    
    public int SUMAR(int num1,int num2){
       
        int suma = num1 + num2;
        return suma;
    }
    
    public int RESTAR(int num1,int num2){
          int resta = num1 - num2;
          return resta;
    }
    
    public int MULTIPLICACION(int num1,int num2){
          int mult = num1 * num2;
          return mult;
    }
    
    public float DIVISION(int num1,int num2){
          float div = (num1) / (num2);
          return div;
    }
    
    public void IMPRIMIR_RESULTADO(int suma, int resta, int mult, float div){
        
        System.out.println("La suma es :"+" "+suma);
        System.out.println("La resta es :"+" "+resta);
        System.out.println("La multiplicacion es :"+" "+mult);
        System.out.println("La division es :"+" "+div);
    }
}
