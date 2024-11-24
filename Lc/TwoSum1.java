import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] arr ={2,7,11,15,17};
        int target =9;
        System.out.println(Arrays.toString(Ts(arr, target)));
    }
    public static int[] Ts(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            int c= target- arr[i]; //9-2=7 //9-7=2
            if(map.containsKey(c)){ //no 7 //yes 2

                return new int[]{map.get(c),i};  //apo..return comp(2) oda index and 7 index
            }
            map.put(arr[i], i); //2,0
        }
        return new int[]{-1,-1};
    }
}
