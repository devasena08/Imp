import java.util.Scanner;

public class Tcslogic1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        if(n == 1){
            System.out.println(10+" "+0);
        }else if(n == 2){
            System.out.println(10+" "+20);
        }else if(n == 3){
            System.out.println(-20+" "+20);
        }else if(n == 4){
            System.out.println(-20+" "+-20);
        }else if(n == 5){
            System.out.println(30+" "+-20);
        }else if(n == 6){
            System.out.println(90+" "+-20);
        }else if(n == 7){
            System.out.println(90+" "+50);
        }else if(n == 8){
            System.out.println(10+" "+50);
        }else if(n == 9){
            System.out.println(10+" "+-40);
        }else if(n == 10){
            System.out.println(110+" "+-40);
        }
        read.close();
    }
}
