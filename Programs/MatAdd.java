public class MatAdd{
    public static void main(String[] args) {
        int[][] arr1 ={{1,2,3},{2,5,7},{6,8,9}};
        int[][] arr2 ={{5,4,3},{6,1,3},{4,7,9}};
        int[][] arr = new int[3][3];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j] = arr1[i][j] + arr2[i][j];
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
/*
 * 
6 6 6 
8 6 10 
10 15 18 
 */