public class Hr3 {
    public static void main(String[] args){
        //palindrome
        String s = "Medam";
        String str = s.toLowerCase();
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String str){
        int st = 0;
        int end = str.length() - 1;
        while (st < end) {
            
            if (!Character.isLetter(str.charAt(st))) {
                st++;
                continue;
            }
            if (!Character.isLetter(str.charAt(end))) {
                end--;
                continue;
            }
            
            if (str.charAt(st) != str.charAt(end)) {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}
