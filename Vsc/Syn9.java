import java.util.HashSet;

public class Syn9 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 1, 0, 5};
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr2){
            set.add(num);  // inside hash set {2, 3, 1, 0, 5}
        }
        for(int n : arr1){
            if(!set.contains(n)){ // array 1 aah traverse pani....hashset oda  cmp panrom
                System.out.println(n);
            }
        }
    }
}
