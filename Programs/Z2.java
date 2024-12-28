import java.util.*;

public class Z2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Input for the first array
        System.out.print("No of Digits in First Array: "); // 1 2 3 4
        int a = read.nextInt();
        int[] arr1 = new int[a];
        System.out.println("Enter digits for the first array:");
        for (int i = 0; i < a; i++) {
            arr1[i] = read.nextInt();
        }

        // Input for the second array
        System.out.print("No of Digits in Second Array: "); //5 6 7
        int b = read.nextInt();
        int[] arr2 = new int[b];
        System.out.println("Enter digits for the second array:");
        for (int i = 0; i < b; i++) {
            arr2[i] = read.nextInt();
        }

        // Adding both arrays
        List<Integer> list = new ArrayList<>();//  1 8 0 1
        int carry = 0;
        int i = a - 1;//4
        int j = b - 1;//7

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? arr1[i] : 0;
            int digit2 = (j >= 0) ? arr2[j] : 0;

            int sum = digit1 + digit2 + carry;//11
            list.add(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }

        // Print the result in reverse
        System.out.print("Result: ");
        for (int k = list.size() - 1; k >= 0; k--) {
            System.out.print(list.get(k) + " ");
        }
        read.close();
    }
}
