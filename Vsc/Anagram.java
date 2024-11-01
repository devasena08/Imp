import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String s1 = read.nextLine();
        String s2 = read.nextLine();
        read.close();

        int result = An(s1, s2);
        System.out.println(result);
        
    }

    static int An(String s1, String s2){
        if (s1.length() != s2.length()) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<s1.length(); i++){
            char c1 = s1.charAt(i);
            map.put(c1, map.getOrDefault(map, 0) +1);
        }
        
        for(int i=0; i<s2.length(); i++){
            char c2 = s2.charAt(i);
            map.put(c2, map.getOrDefault(c2, 0)-1);
        }
        for(int count : map.values() ){
            if( count == 0){
                continue;
            }
            return 0;
        }
       
        
        return 1;
    }
}
