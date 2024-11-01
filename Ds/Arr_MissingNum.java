import java.util.Arrays;

public class Arr_MissingNum {
    public static void main(String[] args) {
        int[] arr ={2,4,1,6,5,3,7,9};
        Arrays.sort(arr); // 1 2 3 4 6 7 9
        System.out.println(change(arr));
    }
    public static int change(int[] arr){
        for(int i=0; i<arr.length; i++){
            int t = arr[i] -1; // 1-1 =0, 2-1, 3-1, 4-1, 6-1
            if(i != t){ // 4 != 5
                return t;
            }
        }
        return 1;
    }
}
