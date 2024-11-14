import java.util.*;
public class Adddigi {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt(); //38
        System.out.println(Digit(t)+" is the O/P.....");
        read.close();
    }
    public static int Digit(int t){
        int sum =0;
        while (t > 9) {//38<9 //11>9
           sum=0;
           while (t >0) {//38<0 //3<0 //11>0 //1>0
            sum += (t % 10); //sum = 8  //sum=11 //sum=1 //sum=2
            t /=10;//t =3 //t=1
           }
           t = sum; //t = 11
            
        }
        return sum;
    }

}
