import java.util.*;
public class Ef3{
    // power of 4
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter : ");
        int n = read.nextInt();
        System.out.println(method(n));
        read.close();
    }//should be power of 2 and lat digit should be.either 4 or 6
    public static boolean method(int n ){
        return Math.pow(2, 30) % n == 0 && ((n % 10 ==4) || (n % 10 ==6));
    }
}
