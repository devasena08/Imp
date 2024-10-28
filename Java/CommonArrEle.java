import java.util.*;
public class CommonArrEle {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 1, 0, 5};
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int a : arr1){
            set.add(a);
        }
        for(int b : arr2){
           if(set.contains(b)){
             list.add(b);
           }
        }
        System.out.println(list);
    }
}
