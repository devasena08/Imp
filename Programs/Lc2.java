import java.util.*;
public class Lc2{
    // power of 4
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter : ");
        int n = read.nextInt();
        boolean ans = false;
        System.out.println(method(n, ans));
        read.close();
    }
    public static boolean method(int n, boolean ans){
        for(int i=1; i<=n; i++){
            if(Math.pow(4,i) == n){
                ans = true;
            }
        }
        
        return ans == true;
    }
}