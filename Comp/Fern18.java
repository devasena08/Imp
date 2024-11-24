import java.util.*;

public class Fern18 {
    public static void main(String[] args) {
        String str = "Hardwork Never Fails";
        Stack<String> stc = new Stack<>();
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                rev += str.charAt(i);
            } else {
                stc.push(rev);
                rev = ""; // Reset rev to an empty string
            }
        }
        if (!rev.isEmpty()) {
            stc.push(rev);
        }
        String s = "";
        while (!stc.isEmpty()) {
            s += stc.pop()+" ";
            
        }
        System.out.println(s);
    }
}
