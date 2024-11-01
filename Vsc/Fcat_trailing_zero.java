import java.util.Scanner;

public class Fcat_trailing_zero {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int sum =0;
        while(n >= 5 ){
            sum += n / 5;
            n = n/5;
        }
        System.out.println(sum);
        read.close();
    }
}
