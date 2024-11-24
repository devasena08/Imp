import java.util.*;
public class SubStr {
    public static void main(String[] args) {
        String s ="abcabcbbb";
        HashSet<Character> set = new HashSet<>();
        int count =0;
        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                break;
            }
            else{
                set.add(ch);
                count ++;
            }
        }
        System.out.println(count
        );
    }
}
