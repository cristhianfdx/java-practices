
package paquete1;
import javax.swing.JOptionPane;


public class Main {
    
    public static void main(String[] args) {
        double num1,num2;
        
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero :"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero :"));
        
        Suma sumar = new Suma(num1, num2);
        sumar.RealizaOPeracion();
        
        Resta restar = new Resta(num1, num2);
        restar.RealizaOPeracion();
        
        Multiplicacion multi = new Multiplicacion(num1, num2);
        multi.RealizaOPeracion();
        
        Division divide = new Division(num1, num2);
        divide.RealizaOPeracion();
        
    }
    
}
