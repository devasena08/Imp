import java.util.Stack;

public class Sample2 {
    public static void main(String[] args) {
        // deva is good
        // o/p :- good is deva
        String s = "deva is good";
        Stack<String> st = new Stack<>();
        String rev =" ";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                st.push(rev);
                rev =" ";
            }else{
                rev += s.charAt(i);
            }
           
        }
        if(!rev.isEmpty()){
           st.push(rev);
        }
        String out =" ";
        while(!st.isEmpty()){
            out += st.pop()+" ";
        }
        System.out.print(out);
    }
}
