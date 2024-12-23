import java.util.*;
public class LongestConSeq {
    public static void main(String[] args){
        int[] arr ={100,4, 200, 3, 2, 1};
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        
        int max =0;
        for(int s : set){
            if(!set.contains(s-1)){
                int sequence =s;
                int count =1;

                while(set.contains(sequence+1)){
                sequence ++;
                count++;
            }
            max = Math.max(max, count);
            }
            
            
        }
        System.out.println(max);
    }
}
