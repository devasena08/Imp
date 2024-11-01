public class Palindrome1 {
    public static void main(String[] args) {
        String str = "Madam";
        String s = str.toLowerCase();
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return s.equals(rev);
    }
}

