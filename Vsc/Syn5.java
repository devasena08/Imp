public class Syn5 {
    public static void main(String[] args) {
        // reverse string
        String str ="madam";
        String rev =" ";
        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);

        }System.out.println(rev);
    }
}
