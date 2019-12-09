
package operacion;


public class Prueba {
  
    public static void main(String [] args){
        Suma suma1 = new Suma();
        suma1.GuardarNum1();
        suma1.GuardarNum2();
        suma1.operar();
        System.out.print("La suma es :");
        suma1.MostarResultado();
        
        Resta resta1 = new Resta();
        resta1.GuardarNum1();
        resta1.GuardarNum2();
        resta1.operar();
        System.out.print("La resta es :");
        resta1.MostarResultado();
    }
}
