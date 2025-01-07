import java.util.*;
public class Fern13 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 6, 8 };
	int[] arr2 = { 2, 4, 5, 7 };
        ArrayList<Integer> list = new ArrayList<>();
        for(int num1 : arr1){
            list.add(num1);//1,3,6,8
        }
        for(int num2 : arr2){
            list.add(num2);//1,3,6,8,2,4,5,7
        }
        
        Collections.sort(list);//1,2,3,4,5,6,7
        System.out.println(list);
    }
}
