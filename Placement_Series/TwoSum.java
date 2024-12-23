import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int[] arr ={2,7,11,15};
        int target =9;
        System.out.println(Arrays.toString(method(arr, target)));
    }
    public static int[] method(int[] arr, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int c = target - arr[i];
            if(map.containsKey(c)){
                return new int[]{map.get(c),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}