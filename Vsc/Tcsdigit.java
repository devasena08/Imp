import java.util.Scanner;

public class Tcsdigit {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int rem=1;
        while(n !=0){
            rem *= (n %10);
            n /= 10;
        }
        System.out.println(rem);
        read.close();
    }
}
