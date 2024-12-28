import java.util.Arrays;

public class Z1 {
    public static void main(String[] args){
        int[] arr = {2,7,5,1,3,2,9,7};
        int sum =14; //{3,2,9}
        System.out.println(Arrays.toString(method(arr,sum)));
    }
    public static int[] method(int[] arr, int sum){
        int s=0; //2
        int e=1; //7
        
        while(s < arr.length && e <arr.length){
            int a = e+1;//2
            int ans = arr[s]+arr[e]+arr[a];
            if(sum == ans){
                return new int[]{arr[s], arr[e], arr[a]};
            }
            s++;
            e++;
        }
        return null;
    }
}
