
package paquete1;


public class Suma extends Operacion{
   

    public Suma(double n1, double n2) {
        super(n1, n2);
        
    }  
    

    @Override
    public void RealizaOPeracion() {
        res = n1 + n2;
        System.out.println("Suma :"+res);
    }
    
    
    
}
