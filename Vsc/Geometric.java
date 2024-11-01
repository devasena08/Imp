import java.util.Scanner;

public class Geometric {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        System.out.println(geo(N));
        read.close();
    }
    // 1 1 2 3 4 9 16 27 32 81
    // use formula a * r^(n-1);
    static int geo(int N){
        int a = 1;
        int r ;
        int n ;
        if(N % 2 ==0){
            r = 3;
            n = (N/2 );
            a *= Math.pow(r, n-1);
        }
        else{
            r =2;
            n = (N/2 )+1;
            a *= Math.pow(r, n-1);
        }
        return a;
        
    }
}
