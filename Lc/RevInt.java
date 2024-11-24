public class RevInt {
    public static void main(String[] args) {
        int n = 123;
        int originalnum =n;
        int digit=0;
        while ( originalnum !=0) {
            digit = digit * 10 +  originalnum %10; //0*10 +3 = 3 //3*10+2=32 //320+1 =321
            originalnum /=10;//12 //1
        }
        System.out.println(digit);
    }
}
