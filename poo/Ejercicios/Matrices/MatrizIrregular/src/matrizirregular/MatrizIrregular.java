/*

 */
package matrizirregular;


public class MatrizIrregular {

    
    public static void main(String[] args) {
       int [][] mat;
       mat = new int [3][];
       mat[0] = new int [2];
       mat[1] = new int[4];
       mat[2] = new int[3];
       
       mat [0][0] = 2;
       
        System.out.println(mat.length);
        
        System.out.println("fila 0 :"+ mat[0].length);
        System.out.println("fila 1 :"+ mat[1].length);
        System.out.println("fila 2 :"+ mat[2].length);
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
