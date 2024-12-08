import java.util.*;
public class Zoho1 {
    public static void main(String[] args) {
        String str = "(((ab)";   //"(a+b)(a-b)" 
        Stack<Character> stc = new Stack<>();
        boolean ans = true;
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch) || ch == '+' || ch == '-' || ch == '(') {
                stc.push(ch);
                if (ch == '(') {
                    count++;
                }
            } else if (ch == ')') {

                if (stc.peek() != '+' || stc.peek() != '-' || stc.peek() != '(') {
                    stc.pop();
                    count--;
                    ans = true;
                } else {
                    System.out.println("InValid..");
                	return;
                }
            }

        }
        if (ans == true && count == 0) {
            System.out.println("Valid..");
        } else if(ans == false) {
            System.out.println("InValid..");
        }

    }
}
