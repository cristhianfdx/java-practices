
package matriz;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Matriz {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int matriz [][],Nfilas,Ncolumnas;
       
       Nfilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas de la matriz"));
       Ncolumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de colmnas del arreglo"));
       
       matriz = new int [Nfilas][Ncolumnas];
       
        System.out.println("Ingrese la matriz");
        for (int i = 0; i < Nfilas; i++) {
            for (int j = 0; j < Ncolumnas; j++) {
                System.out.print("Matriz"+"["+i+"]"+"["+j+"] :");
                matriz [i][j] = entrada.nextInt();
                          
                
            }
            
        }
        System.out.println("\n La matriz es :");
       for(int i = 0;i<3;i++){
           for(int j = 0;j < 3; j++){
               System.out.print(matriz[i][j]);
           }
           System.out.println("");
                         
       }
        
    }
}
