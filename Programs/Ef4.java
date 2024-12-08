import java.util.*;
public class Ef4{
    // power of 2
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter : ");
        int n = read.nextInt();
        System.out.println(method(n));
        read.close();
    }
    public static boolean method(int n ){
        return Math.pow(2, 30) % n == 0 ;
    }
}