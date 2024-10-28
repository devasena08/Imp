import java.util.*;

public class Xpattern {
    /*
     * a11 a12 a13
     * a21 a22 a23
     * a31 a32 a33
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt(); //5
        int m = (n + 1) / 2;   // 5+1/2 =3
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    if (i < m) {
                        System.out.print(n - i + 1); // 5-1+1=5 , 5-2+1=4
                    } else if (i > m) {
                        System.out.print(i);
                    } else if (i == m) {
                        System.out.print(m);
                    }
                } else if (i + j == n + 1) {
                    if (i < m){
                        System.out.print(i);
                    } else if (i > m){
                        System.out.print(j);
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        read.close();
    }
}