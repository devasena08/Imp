import java.util.*;
public class Hr1{
    //valid string
    public static void main(String[] args){
        String s = "aabbcc"; //abbcc=false
        HashMap<Character,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        //map to store frequency count
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        //inserting into set,...which does not hold duplicate values
        for (int value : map.values()) {
            set.add(value);
        }
        //if size of the set == 1..then it is valid string
        if (set.size() == 1) {
            System.out.println("True..");
        } else {
            System.out.println("False..");
        }
    }
}
