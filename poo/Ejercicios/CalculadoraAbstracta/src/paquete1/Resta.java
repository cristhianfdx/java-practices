
package paquete1;


public class Resta extends Operacion{

    public Resta(double n1, double n2) {
        super(n1, n2);
    }

    @Override
    public void RealizaOPeracion() {
        res = n1-n2;
        System.out.println("Resta:"+res);
    }
    
    
    
    
}
