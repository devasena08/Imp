public class Fern19 {
    public static void main(String[] args) {
        int n = 153;
        int originalnum =n;
        int rem ;
        int digit =0;
        int sum=0;
        while(originalnum != 0){
             originalnum /=10;
            digit ++; //3
        }
        originalnum =n;
        while (originalnum != 0) {
            rem = originalnum % 10; //3
            sum += Math.pow(rem, digit);
            originalnum /=10;
        }
        if(sum == n){
            System.out.println("Its is Armstrong");
        }else{
            System.out.println("Not an an..");
        }
    }
}
