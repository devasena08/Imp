import java.util.*;
public class LongestSubStr {
    public static void main(String[] args){
        String str = "abcab";
        int s =0;
        int e=0;
        int max =0;
        Set<Character> set = new HashSet<>();
        while(e<str.length()){
            char c = str.charAt(e);
            // untill the repeated element goes..looop runs
            while(set.contains(c)){
                set.remove(str.charAt(s));
                s++;
            }
            set.add(c);
            int windowsize = e-s+1;
            max = Math.max(windowsize, max);
            e++; // most imp step...else loop will go infinately
        }
        System.out.println(max);
    }
}
