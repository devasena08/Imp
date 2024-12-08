public class Ef2 {
    // add digit
    public static void main(String[] args) {
        int n = 129; //1+2+9=1+2=3
        System.out.println(method(n));
    }
    public static int method(int n){
        if(n < 9 ){
            return n;
        }else if(n % 9 == 0){
            return  9;
        }
        return n%9;
    }
}
