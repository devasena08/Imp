public class Fern7 {
    public static void main(String[] args) {
        int r =2;
        int c =3;
        int[][] mat1 = {{1,2,3},{4,5,6}};
        int[][] mat2 = {{1,2,3},{4,5,6}};
        int[][] res = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                res[i][j] = mat1[i][j]+mat2[i][j];
            }
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
               System.out.print(res[i][j]+" ");
            }System.out.println();
        }
    }
}
/*
2 4 6 
8 10 12 



*/
