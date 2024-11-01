import java.util.Arrays;
import java.util.Scanner;

public class Trailing {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = read.nextInt();
        }
        int[] result = new int[n];
        int index = 0;

        // First loop to add non-zero elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[index++] = arr[i];
            }
        }

        // Second loop to add zeros
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                result[index++] = 0;
            }
        }

        // Copy result array back to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = result[i];
        }

        System.out.println(Arrays.toString(arr));
        read.close();
    }
}
