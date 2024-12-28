import java.util.*;
public class Hr4 {
    public static void main(String[] args){
        int[] arr = {4,3,2,8,2,3,1}; //o/p:-{2,3}
        Method(arr);
    }
    public static void Method(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int n : arr){
            if(!set.contains(n)){
                set.add(n);
            }else{
                list.add(n);
            }
        }
        System.out.println(list);
    }
}
