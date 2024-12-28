import java.util.Arrays;

public class TwoSumPointer {
    public static void main(String[] args){
        int[] arr ={2,7,11,15};
        int target =9;
        System.out.println(Arrays.toString(method(arr, target)));
    }
    public static int[] method(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        while(s<e){
            int current = arr[s]+arr[e];
            if(current == target){
                return new int[]{s+1,e+1};
            }
            else if(current > target){
                e--;
            }
            else if(current < target){
                s++;
            }
        }
        return null;
    }
}