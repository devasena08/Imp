
import java.util.*;

public class Lc5 {

    //digit 
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter : ");
        int n = read.nextInt();
        System.out.println(method(n));
        read.close();
    }

    public static int method(int n) {
        int q;
        int r;
        String ans = "";
        while (n >0) {
            q = n / 2;  //n=5/2->2 //2/2-->1
            r = n % 2;  //n=5%2->1 //2%2 -->0
            ans += r; //10
            n = q; //2 //1
        }
        String s = ans + (Integer.toString(n));
        String s1="";
        for(int i=s.length()-1; i>=0; i--){
            s1+=s.charAt(i);
        }
        int a = Integer.parseInt(s1);
        return a;
    }
}
