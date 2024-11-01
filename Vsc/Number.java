import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int n = rd.nextInt(); // Example: 99
        int r = rd.nextInt(); // Example: 3
        rd.close();

        // Calculate the sum of the digits of n
        int rem = 0;
        while (n != 0) {
            rem += n % 10;
            n /= 10;
        }

        // Multiply the sum of digits by r
        int result = rem * r;

        // Repeatedly sum the digits of the result until a single digit is obtained
        while (result > 10) {
            int sum = 0;
            while (result != 0) {
                sum += result % 10;
                result /= 10;
            }
            result = sum;
        }

        System.out.println(result);
    }
}
