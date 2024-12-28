public class MatMul{
    public static void main(String[] args) {
        int[][] arr1 ={{1,2,3},{1,2,3},{1,2,3}};
        int[][] arr2 ={{1,2,3},{1,2,3},{1,2,3}};
        int[][] arr = new int[3][3];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j] =0;
                for(int k=0; k<arr.length; k++){
                    arr[i][j] += arr1[i][k] + arr2[k][j];
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
