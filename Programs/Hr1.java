import java.util.*;
public class Hr1{
    //valid string
    public static void main(String[] args){
        String s = "aabbcc"; //abbcc=false
        HashMap<Character,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (int value : map.values()) {
            set.add(value);
        }
        if (set.size() == 1) {
            System.out.println("True..");
        } else {
            System.out.println("False..");
        }
    }
}
