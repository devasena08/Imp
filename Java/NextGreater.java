public class NextGreater {
    public static void main(String[] args) {
        int[] arr = { 16, 17, 3, 5, 2 };
        Largest(arr);
    }

    public static void Largest(int[] arr) {
        // Loop through the array
        for (int i = 0; i < arr.length - 1; i++) { // 16 to 5 traversal
            for (int j = i + 1; j < arr.length; j++) { // 17 to last traversal
                if (arr[j] > arr[i]) {
                    System.out.print(arr[j] + " "); // 17, 5

                }
            }
        }

        // Print the last element as required
        System.out.print(arr[arr.length - 1] + " "); // 2 So, 17,5,2
    }
}
