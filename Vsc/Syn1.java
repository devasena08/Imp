public class Syn1 {
    public static void main(String[] args) {
        // string palindrome
        String str = "mam";
        String s = str.toLowerCase();
        String rev = "";
        // m=0; a =1; m=2;
        //but mam length is 3...so while reversing from back take length-1
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if (rev.equals(s)) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
