/*Se desean mezclar el arreglo a y el arreglo, dicha mezcla sera realizada dentro de un arreglo c, donde los terminos de c
iran de la siguiente manera:
primer termino de a sera el primer termino de c, el primer termino de b sera el segundo termino de b y asi sucesivamente*/
package arreglos_mezcla;
import java.util.Scanner;

public class Arreglos_Mezcla {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int a[],b[],c[];
    int i,j = 0;
    a = new int [5];
    b = new int [5];
    c = new int[10];
    
        System.out.println("Ingrese el primer arreglo");
        for( i = 0; i < 5;i++){
            System.out.print("Ingrese un numero : ");
            a [i] = entrada.nextInt();
            
        }
        
          System.out.println("\nIngrese el segundo arreglo");
          
        for( i = 0; i < 5;i++){
            System.out.print("Ingrese un numero : ");
            b [i] = entrada.nextInt();
            
        }
        //Mezcla del arreglo a y b == al arreglo c
        for(i = 0;i < 5; i++){
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
            
        }
        System.out.println(" ");
        //Imprimir c
        for(i = 0; i< 10;i++){
            
            System.out.print(c[i]+" ");
        }
        System.out.println(" ");
    }
    }
    

