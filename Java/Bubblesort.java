import java.util.*;
public class Bubblesort{
    public static void main(String[] args) {
        int[] arr ={7,3,5,9,2};
        int n = arr.length;
        for(int i=0; i<n-1; i++){ // 0 1 2 3
            for(int j=0; j<n-i-1; j++){  // i=0--4 ,i=1--3, i=2--2, i=3--1 
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
