import java.util.Arrays;
import java.util.Collections;

public class Halfascanddes {
    public static void main(String[] args) {
        Integer[] arr = {7, 2, 5, 9, 8};

        // Step 1: Sort the entire array in ascending order
        Arrays.sort(arr);

        // Step 2: Identify the midpoint
        int mid = arr.length / 2;

        // Step 3: Sort the first half in ascending order (already sorted in step 1)

        // Step 4: Sort the second half in descending order
        // Convert the second half to a list, sort in descending order, and convert back to array
        Integer[] secondHalf = Arrays.copyOfRange(arr, mid, arr.length);
        Arrays.sort(secondHalf, Collections.reverseOrder());

        // Combine the two halves
        Integer[] result = new Integer[arr.length];
        System.arraycopy(arr, 0, result, 0, mid);
        System.arraycopy(secondHalf, 0, result, mid, secondHalf.length);

        // Print the result
        System.out.println("Result: " + Arrays.toString(result));
    }
}


