/*
Crear una matriz e imprimir solo la diagonal principal
 */
package matriz;
import java.util.Scanner;

public class Matriz {
private Scanner leer;
private int mat [][];
    
    public void ingreso(){
        leer = new Scanner(System.in);
        mat = new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese componente :");
                mat [i][j] = leer.nextInt();
            }
        }
        System.out.println("\n Matriz :");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public void ImprimirDiagonal(){
        System.out.println("\nDiagonal :");
        for (int i = 0; i < 3; i++) {
            System.out.println(mat[i][i]+"");
        }
    }
    
    public static void main(String[] args) {
    Matriz orden  = new Matriz();
    orden.ingreso();
    orden.ImprimirDiagonal();
    }
    
}
