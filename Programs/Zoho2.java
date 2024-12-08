import java.util.*;
class Zoho2 {

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 5, 6, 7, 9, 10, 15};
        int[] arr2 = {2, 3, 4, 5, 6, 7, 8, 9, 11, 13};
        HashSet<Integer> set = new HashSet<>();
        for (int num1 : arr1) {
            set.add(num1);
        }
        for (int num2 : arr2) {
            set.add(num2);
        }
        System.out.println(set);
    }
}
