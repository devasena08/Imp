import java.util.Arrays;

public class Arr_MoveZero {
    public static void main(String[] args) {
        int[] arr ={0,1,0,4,12};
        int n = arr.length;
        int[] arr1 = new int[n];
        int index =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr1[index]  = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
