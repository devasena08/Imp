import java.util.*;
public class StringPermutation {
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = "bdbccba"; // cba contains in abc..So, true
        System.out.println(metod(s1, s2));
    }
    public static boolean metod(String s1, String s2){
        HashMap<Character, Integer> have = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        //sliding window
        int start =0;
        int end =0;

        while (end < s2.length()) {
            char e = s2.charAt(end); //b
            /*
             *need map kula podurathuku munadi...we have to check...b venuma nu
             *by cmp with have amp
             */

            if(!need.containsKey(e)){
               
                /* ipo d vanthu have map illa
                 * already map la potathum waste...which does not 
                 * gona form..permuattion,..so del and move end...place the start toend
                 */
                end++;
                start = end;
                have.clear();
                continue;
            }
        
            if(!have.containsKey(e)) have.put(e, 0);

                have.put(e,have.get(e)+1);

            // ipo b=1 dhn venum,...but 2 vanthurchu naaa....value ah dec pananum
            //start ah increme pananum
            while(have.get(e) > need.get(e)){
                char s = s2.charAt(start);
                have.put(s,have.get(s)-1);
                start ++;
            }
            //finally window size and end ++ bcz, while loop 
            int ws = end-start+1;
            if(ws == s1.length()){
                return true;
            }
            end++;
        }
        
        return false;
    }
}