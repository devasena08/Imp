import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("n: ");
        int n = read.nextInt();
        System.out.print("r: ");
        int r = read.nextInt();
        if (n >= r && r >= 0) {
            int result = permutation(n, r);
            System.out.println(result);
        } else {
            System.out.println("Invalid input!");
        }
        read.close();
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int permutation(int n, int r) {

        return factorial(n) / factorial(n - r);
    }
}
