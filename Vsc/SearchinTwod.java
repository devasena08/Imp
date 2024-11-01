import java.util.Arrays;

public class SearchinTwod {
    public static void main(String[] args) {
        int[][] arr = {
            {23,4,5},
            {18,12,3,9},
            {33,99,}
        };
        int target = 33;
        int[] a = Search(arr, target);
        System.out.println(Arrays.toString(a));
    }
    static int[] Search(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{-1,-1};
        
    }
}
