public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isValidPalindrome(s));
    }

    public static boolean isValidPalindrome(String s) {
        String str = s.toLowerCase();
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (!Character.isLetterOrDigit(str.charAt(start))) {
                start++; 
            } 
            else if (!Character.isLetterOrDigit(str.charAt(end))) {
                end--; 
            } 
            else {
              
                if (str.charAt(start) != str.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
