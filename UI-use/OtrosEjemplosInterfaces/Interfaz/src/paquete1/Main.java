
package paquete1;
import javax.swing.JOptionPane;


public class Main {
    
    public static void main(String[] args) {
        double num1;
        double num2;
        
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero"));
        
        System.out.println("Los numeros ingresados son:");
        System.out.println(num1+" , "+num2);
        
        
        Suma sumar = new Suma(num1,num2);        
        sumar.RealizarOperacion();
        
        Resta restar = new Resta(num1, num2);
        restar.RealizarOperacion();
        
        Multiplicacion multi = new Multiplicacion(num1, num2);
        multi.RealizarOperacion();
        
        Division divide = new Division(num1, num2);
        divide.RealizarOperacion();
        
        
    }
    
}
