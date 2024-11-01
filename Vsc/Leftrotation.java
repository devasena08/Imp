import java.util.Arrays;

public class Leftrotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int key = 3;
        System.out.println(Arrays.toString(rotate(arr, key)));
    }
    static int[] rotate(int[] arr, int k){
        int n = arr.length;
        reverse(arr, 0, n-1);
        reverse(arr,0, k-1);
        reverse(arr, k, n-1);
        return arr;

    }

    static void reverse(int[] arr,int start , int end){
       
        int temp;
        while (start <= end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
}
