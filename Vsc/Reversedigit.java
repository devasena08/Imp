import java.util.Scanner;

public class Reversedigit {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = read.nextInt();
        System.out.println(Reverse(n));
        read.close();
    }
    static int Reverse(int n){
        int originalnum = n;
        int rev =0;
        while (originalnum !=0) { // 121 // 12 //1
            rev =rev*10 + originalnum % 10; // 0+1=1 // 10+2 = 12 //120 +1 =121
            originalnum /=10; //12 //1
        }
        return rev;
        
    }
}
