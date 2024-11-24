public class Fern6 {
    public static void main(String[] args) {
        int[][] mat1 = {{1,2},{3,4}};
        int[][] mat2 = {{1,2},{3,4}};
        int n = mat1.length;
        int[][] c= new int[n][n];
        
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                c[i][j] = mat1[i][j] +mat2[i][j];
            }
        }
        for(int i=0; i<c.length; i++){
            for(int j=0; j<c.length; j++){
               System.out.print(c[i][j]+" ");
            }System.out.println();
        }
    }
}
