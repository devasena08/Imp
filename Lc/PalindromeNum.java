public class PalindromeNum {
    public static void main(String[] args) {
        int n =121;
        int originalNum =n;
        int dig =0;
        while(originalNum != 0){
            dig = dig *10 + originalNum %10; //0+10+1=1 //10+2 =12 //120+1 = 121
            originalNum /=10; //12//1
        }
        if(n == dig){
            System.out.println("Yes..");
        }else{
            System.out.println("No..");
        }
    }
}
