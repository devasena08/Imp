public class Fern4 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                      {4,5,6},
                      {7,8,9}};
        int n = arr.length;
        int[][] tr =new int[n][n];//2,2

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                tr[i][j] = arr[j][i];
            }
        }
        for(int i=0; i<tr.length; i++){
            for(int j=0; j<tr.length; j++){
                System.out.print(tr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
 