
import java.util.*;

public class Ef6 {

    //alternative digit 
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter : "); //10
        int n = read.nextInt();
        System.out.println(method(n));
        read.close();
    }

    public static boolean method(int n) {
        int xor = n ^ (n >> 1);
        // int ans = xor+1; //10000
        //10000 & 01111 --->00000=0
        //1010(10 >> 1)-->0101--->1010^0101=1111
        return (xor & (xor + 1)) == 0;
    }
}