
package Operacion;

import java.util.Scanner;


public class OPeracion1 {
    //Atributos
    int num1,num2;
    int suma,resta,mult;
    float div;
    
    //Metodos
    
    public static void main(String [] args){
       OPeracion1 OP = new OPeracion1 ();
       OP.LEER_NUM();
       OP.SUMA();
       OP.RESTA();
       OP.MULTIPLICACION();
       OP.DIVISION();
       
       OP.IMPRIMIR_RESULTADO();
        
    }
    public void LEER_NUM(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero:");
        num1 = entrada.nextInt();
        System.out.print("\nIngrese el segundo numero:");
        num2 = entrada.nextInt();
    }
    
    public void SUMA(){
        suma = num1 + num2;
        
    }
    
    public void RESTA(){
        resta = num1 - num2 ;
    }
    
    public void MULTIPLICACION(){
        mult = num1 * num2;
    }
    
    public void DIVISION(){
        div = num1 / num2;
        
    }
    
    public void IMPRIMIR_RESULTADO(){
        System.out.println("La suma es :"+" "+suma);
        System.out.println("La resta es :"+" "+resta);
        System.out.println("La multiplicacion es :"+" "+mult);
        System.out.println("La division es :"+" "+div);
        
    }
}
