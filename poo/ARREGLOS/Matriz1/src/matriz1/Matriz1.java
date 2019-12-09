package matriz1;
import javax.swing.JOptionPane;


public class Matriz1 {
       
    public static int Ncolumnas(){
        int Ncol; 
        Ncol = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas :"));
        while (Ncol<1){
            Ncol = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas :"));
        }
        return Ncol;
    }
    
    public static int [] Guardar1(int n){
        int arreglo1 [] = new int[n];
        JOptionPane.showMessageDialog(null,"Vector 1:");
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i]= Integer.parseInt(JOptionPane.showInputDialog("Elemento"+"["+i+"]"+" : "));
        }
        return arreglo1;
    }
    
    public static int [] Guardar2(int n){
        int arreglo2 [] = new int [n];
        JOptionPane.showMessageDialog(null,"Vector 2:");
        for (int i = 0; i < arreglo2.length; i++) {
            arreglo2[i]= Integer.parseInt(JOptionPane.showInputDialog("Elemento"+"["+i+"]"+" : "));
        }
        return arreglo2;
    }
    
     public static int [] Guardar3(int n){
        int arreglo3 [] = new int [n];
         JOptionPane.showMessageDialog(null,"Vector 3:");
        for (int i = 0; i < arreglo3.length; i++) {
            arreglo3[i]= Integer.parseInt(JOptionPane.showInputDialog("Elemento"+"["+i+"]"+" : "));
        }
        return arreglo3;
    }
     
     public static int [] Guardar4(int n){
        int arreglo4 [] = new int [n];
        JOptionPane.showMessageDialog(null,"Vector 3:");
        for (int i = 0; i < arreglo4.length; i++) {
             arreglo4[i]= Integer.parseInt(JOptionPane.showInputDialog("Elemento"+"["+i+"]"+" : "));
        }
        return arreglo4;
    }
     
     public static int [][] GMatriz(int n, int [] arr1,int  []arr2, int [] arr3, int []arr4){
         int mat[][] = new int [4][n];
         
         for (int i = 0; i < 4; i++) {
             for (int j = 0; j < n; j++) {
               switch (i){
                    case 0:
                        mat[i][j] = arr1 [j];
                    break;
                    case 1:
                        mat[i][j] = arr2 [j];
                    break;
                    case 2:
                        mat[i][j] = arr3 [j];
                    break;
                    default:
                     mat[i][j] = arr4 [j]; 
                    break;
               }  
             }
         }
                         
         return mat;
     }
             
     public static int [] SumaFila(int n,int [][] mat){
         int suma;
         int Vsuma [] = new int[4];
         for (int i = 0; i < 4; i++) {
             suma = 0;
             for (int j = 0; j < n; j++) {
                suma += mat[i][j]; 
             } 
              Vsuma[i] = suma;
         }
         return Vsuma;
     }
     
      public static int [] SumaColumna(int n,int [][] mat){
         int suma;
         int Vsuma [] = new int[n];
         for (int j = 0; j < n; j++) {
             suma = 0;
             for (int i = 0; i < 4; i++) {
                suma += mat[i][j]; 
             } 
              Vsuma[j] = suma;
         }
         return Vsuma;
     }
      
       public static void Imprimir(int n,int [][]mat,int [] v1,int v2[]){
         System.out.println("La matriz es:\n");
        for (int k = 0; k < 4; k++) {
            for (int l = 0; l < n; l++) {
                System.out.print("["+mat[k][l]+"]");
            }
            System.out.println("");
        }
           System.out.println("Suma de filas\n");
           for (int i = 0; i < v1.length; i++) {
               System.out.println("["+v1[i]+"]");
           }
           System.out.println("");
           System.out.println("Suma de columnas\n");
           for (int i = 0; i < v2.length; i++) {
               System.out.print("["+v2[i]+"]");
           }
     }
   
    public static void main(String[] args) {
        int ncolumnas;
        int [] Vec1;
        int [] Vec2;
        int [] Vec3;
        int [] Vec4;
        int [][] matriz;
        int [] SumaF;
        int [] SumaC;
              
        ncolumnas = Ncolumnas();
        Vec1 = Guardar1(ncolumnas);
        Vec2 = Guardar2(ncolumnas);
        Vec3 = Guardar3(ncolumnas);
        Vec4 = Guardar4(ncolumnas);
        matriz = GMatriz(ncolumnas,Vec1,Vec2,Vec3,Vec4);
               
        SumaF = SumaFila(ncolumnas,matriz);
        SumaC = SumaColumna(ncolumnas,matriz);
        
        Imprimir(ncolumnas,matriz,SumaF,SumaC);
    }
    
}

