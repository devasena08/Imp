import java.util.Arrays;

public class Fern15 {
    public static void main(String[] args) {
        //swap elements
        int[] arr ={2,4,6,8,1,2,6};
        int s =0;
        int e = arr.length-1;
        while (s<=e) {
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;
            e--;
        }
        System.out.println(Arrays.toString(arr));//{6,2,1,8,6,4,2}
    }
}
