import java.util.Scanner;

public class Lcm1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        int ans = (a>b) ? a : b;
        read.close();

        
        while(true){
            if(ans % a == 0 &&  ans % b ==0)
                break;
            ans++;
        }
        System.out.println(ans);

        
        
    }
}
