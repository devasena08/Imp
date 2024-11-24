import java.util.Arrays;

public class RemoveEle {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 3, 7, 6};
        int target = 3; 
        int n = arr.length;
        int[] arr1 = new int[n - 1]; 
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) {
                arr1[index] = arr[i]; 
                index++; 
            }
        }
        System.out.println(Arrays.toString(arr1)); 
    }
}
