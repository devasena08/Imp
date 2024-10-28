import java.util.*;

public class AlternateSorting {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 8, 4, 6 };
        Arrays.sort(arr); // 1234568

        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) { // if only one element is given then...this cond works
            if (start == end) {
                list.add(arr[end]);//if 5 is given, then 5,5 will print if this if cond is not avail
                break;
            }
            list.add(arr[end]);
            list.add(arr[start]);
            end--;
            start++;

        }
        System.out.println(list); // [8, 1, 6, 2, 5, 3, 4]
    }
}