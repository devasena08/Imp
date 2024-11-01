import java.util.Arrays;

public class Arr_Resizearr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        int capacity = n * 2;
        System.out.println(Arrays.toString(resize(arr, capacity)));
    }

    public static int[] resize(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];  // Correctly copy each element
        }
        
        return temp;
    }
}
