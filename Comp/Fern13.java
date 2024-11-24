import java.util.*;
public class Fern13 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 6, 8 };
		int[] arr2 = { 2, 4, 5, 7 };
        ArrayList<Integer> list = new ArrayList<>();
        for(int num1 : arr1){
            list.add(num1);
        }
        for(int num2 : arr2){
            list.add(num2);
        }
        
        Collections.sort(list);
        System.out.println(list);
    }
}
