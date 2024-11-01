import java.util.Arrays;

public class Arr_reverse {
    public static void main(String[] args) {
        int[] arr ={2,11,5,10,7,8};
        int start =0;
        int end =arr.length-1;
        while (start <= end) {// (0<=6), (1<=5) ,  (2<=5) ,(3<3)  (4<=2)once the cond failed, comes out
            int temp = arr[start]; //2 , 11 , 5 , 5
            arr[start] = arr[end]; //8, 7 ,10, 5
            arr[end] = temp; // 2, 11 ,5 ,5
            start ++; //1, 2, 3, 4
            end --; //5, 4, 3,2
        }
        System.out.println(Arrays.toString(arr));
    }
}
