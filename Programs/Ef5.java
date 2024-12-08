import java.util.*;
public class Ef5{
    // power of 3
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter : ");
        int n = read.nextInt();
        System.out.println(method(n));
        read.close();
    }
    public static boolean method(int n ){
        return Math.pow(3, 19) % n == 0 ;
        
    }
}