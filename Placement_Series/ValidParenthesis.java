import java.util.*;
public class ValidParenthesis {
    public static void main(String[] args){
        String s ="()[]{}";
        Stack<Character> stc = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stc.push(c);
            }
            else if(c == ')' || c == ']' || c == '}'){
                char a = stc.peek();
                if((c == ')' && a =='(') || (c == '}' && a =='{') || (c == ']' && a =='[')){
                    stc.pop();
                }else{
                    System.out.println("False..");
                }
                
            }
        }
        if(stc.isEmpty()){
            System.out.println("True..");
        }else{
            System.out.println("False.");
        }
    }
}
