import java.util.Scanner;

public class Binaryrep {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int rem = 0;
        int fact =1;
        while (n !=0) {
            rem += (n%2 )* fact;
            fact *= 10;
            n = n/2;
        }
        System.out.println(rem);
        read.close();
    }
}
