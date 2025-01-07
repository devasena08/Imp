import java.util.*;
public class Fern14 {
    public static void main(String[] args) {
        //remove duplicates
        int[] arr ={2,4,6,8,1,2,6};
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(set.contains(num)){
                System.out.println(num);
            }else{
                set.add(num);
            }
        }
    }
}
