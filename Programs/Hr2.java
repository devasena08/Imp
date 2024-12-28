import java.util.*;
public class Hr2 {
    public static void main(String[] args){
        //diff pair count
        int[] arr = {5,7,2};
        int target = 5;
        Set<Integer> set = new HashSet<>();
        int count=0;
        for(int a : arr){
            set.add(a);
        }
        for (int a : arr) {
            int ans = a+target;
            if(set.contains(ans)){
                count++;
            }
        }    
        System.out.println(count);
    }
}
/*
 *  int[] arr ={1,2,3,4}; //1,5,3,4,2 tar=2 
    int target =1;

    {1,5,3,4,2};
    int target = 2;
 */