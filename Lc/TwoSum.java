import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr ={1,3,4,2,7,11,15};
        int target =9;
        System.out.println(Arrays.toString(Ts(arr, target)));
    }
    public static int[] Ts(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]+arr[i+1] == target){
                return new int[]{i, i+1};
            }
        }
        return new int[]{-1,-1};
    }
}
