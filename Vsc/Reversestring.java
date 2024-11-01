public class Reversestring {
    public static void main(String[] args) {
        String str = "Devasena";
        System.out.println(rev(str));
    }
    static String rev(String str){

        String rev = " ";
        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        return rev;
        
    }
}
