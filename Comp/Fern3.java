import java.util.*;

public class Fern3 {
    public static void main(String[] args) {
        //Binary Search
        int[] arr ={3,5,7,9,1,2,4};
        int target = 5;
        Arrays.sort(arr); //1,2,3,4,5,7,9
        System.out.println(target+" is located at "+search(arr, target));
    }
    public static int search(int[] arr, int target){
        int s =0;
        int e = arr.length-1;
        
        while (s<=e) {
            int mid =(s + e)/2; //3
            if(target > arr[mid]){ //5>4
                s = mid +1; //s =4
            }else if(target < arr[mid]){
                e = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
