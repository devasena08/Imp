import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = read.nextInt();
        System.out.println(isArmstrong(n));
        read.close();
    }

    static boolean isArmstrong(int n) {
        int originalNumber = n;
        int rem;
        int digit = 0;
        int sum = 0;
        
        // Calculate the number of digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            digit++;
        }

        originalNumber = n;
        
        // Calculate the sum of digits raised to the power of digit count
        
        while (originalNumber != 0) {
            rem = originalNumber % 10;
            sum += Math.pow(rem, digit);
            originalNumber /= 10;
        }

        return n == sum;
    }
}
