import java.util.Scanner;

public class Prime {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = read.nextInt();
        System.out.println(prime(n));
        read.close();
    }
    static boolean prime(int n){
        int count =0;
        for(int i=1; i<=n ; i++){
            if(n%i == 0){
                count ++;
            }
        }
        if(count == 2){
            return true;
        }
        return false;
        
    }
}
