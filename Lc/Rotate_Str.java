import java.util.*;
public class Rotate_Str {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        String s = rd.next(); //abcde
        String goal = rd.next(); // cdeab--->ethunai time venalum shift panikalam...
        // thn s == goal ah pakanum, s means return true, orelse false
        rd.close();
        System.out.println(Rotate(s, goal));
    }
    public static boolean Rotate(String s, String goal){
        if(s.length() != goal.length()){
            return false;
        }
        String str = s+s; //logic is abcdeabcde nu akum
        //abcde  bcdea   cdeab   deabc   eabcd  --->bcz 5 shift irkum , en naa length 5
        // ipo concat pani...we got that..if it is substring ah nu patha podhum
        return str.contains(goal);  // contains use panirkom
    }
}