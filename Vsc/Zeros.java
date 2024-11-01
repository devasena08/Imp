import java.util.Arrays;
import java.util.Scanner;

public class Zeros {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = read.nextInt();
        }
        
        int index = 0;
        int[] result = new int[n];
        
        // First, place all zeros at the front of the result array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                result[index++] = 0;
            }
        }
        
        // Then place the non-zero elements after the zeros
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[index++] = arr[i];
            }
        }
        
        // Copy the result array back to the original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = result[i];
        }

        System.out.println(Arrays.toString(arr));
        read.close();
    }
}
