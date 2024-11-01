import java.util.Stack;

public class Syn6 {
    public static void main(String[] args) {
        // deva is good
        // o/p :- good is deva
        String s = "deva is good";
        Stack<String> st = new Stack<>();
        String reversed =" ";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){ //d e v a  //space  // i s
                st.push(reversed); //dont push.... // reversed = deva is..alone thats why reverseing is deleted
                reversed=" ";  // empty aakanum
            }else{
                reversed += s.charAt(i); // deva // is
            }
        }
        if(!reversed.isEmpty()){
            st.push(reversed);
        }
        String output=" ";
        while (!st.isEmpty()) { // untill it gets empty pop and after pop we need space 
            output += st.pop()+" ";
            
        }
        System.out.println(output);
    }
}
