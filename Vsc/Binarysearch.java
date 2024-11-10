import java.util.Arrays;

public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {23, 45, 67, 89, 33, 55, 66};
        int target = 33;
        
        // The array needs to be sorted for binary search
        Arrays.sort(arr);
        
        // Print the sorted array for verification
        System.out.println("Sorted array: " + Arrays.toString(arr));
        
        System.out.println("Target found at index: " + search(arr, target));
    }
    
    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // target found
            }
        }
        
        return -1; // target not found
    }
}
