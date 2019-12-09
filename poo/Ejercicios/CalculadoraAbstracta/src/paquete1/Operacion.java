
package paquete1;


public abstract class  Operacion {
    
    protected double n1;
    protected double n2;
    protected double res;

    public Operacion(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
        
    }

        
    public abstract void RealizaOPeracion();
    
}

