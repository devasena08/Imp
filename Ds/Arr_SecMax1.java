import java.util.Arrays;

public class Arr_SecMax1 {
    public static void main(String[] args) {
        int[] arr ={12,34,2,33,34,21};
        Arrays.sort(arr); // 2, 12, 21 , 33 , 34, 34
        int n = arr.length; //6
        if(arr[n-1] == arr[n-2]){
            System.out.println(arr[n-3]+" is the Second Largest..");
        }
        else{
            System.out.println(arr[n-2]+" is the Second Largest..");
        }
        
    }
}
