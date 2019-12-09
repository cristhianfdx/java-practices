package repaso;
import java.util.Scanner;

public class Repaso {

   
    public static void main(String[] args) {
      Scanner ENTRADA = new Scanner(System.in);
      
      float arreglo_num []=new float[5];
        System.out.println("Guardando elementos en el arreglo");
        
        for(int i=0; i<5;i++){
            System.out.print((i+1)+"."+"Digite un numero:");
            arreglo_num[i] = ENTRADA.nextFloat();
               
          
      }
        System.out.println("\nImprimiendo elementos del arreglo");
        for(float i:arreglo_num){
            System.out.println(i);
        }
    }
    
}
