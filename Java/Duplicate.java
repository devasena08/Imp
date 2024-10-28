import java.util.*;
public class Duplicate {
    public static void main(String[] args) {
        int[] arr ={2,4,6,8,1,2,6};
        System.out.println(Result(arr));
        
    }
    public static boolean Result(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(set.contains(num)){
                return false;
            }else{
                set.add(num);
            }
        }
        return true;
    }
}
