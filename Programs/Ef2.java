public class Ef2 {
    // add digit
    public static void main(String[] args) {
        int n = 129; //1+2+9=1+2=3
        System.out.println(method(n));
    }
    public static int method(int n){
        if(n < 9 ){ // n =1,2..8 = 1 digit dhn,so..retrun n
            return n;
        }else if(n % 9 == 0){ // n=9,18,27..90 return 9
            return  9;
        }
        return n%9; // remainder 129%9 = 3
    }
}
