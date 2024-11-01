import java.util.Arrays;

public class Arr_rem_Even {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        int n =arr.length/2;
        int[] arr1 = new int[n];
        int index =0;

        for(int i=0; i<arr.length; i++){
            if(i % 2 != 0){
                arr1[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
