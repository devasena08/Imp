import java.util.*;

public class Majority {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 3, 3, 3, 3, 2, 2, 3}; // Expected output: 3
        int result = findMajority(arr);
        System.out.println(result);
    }

    public static int findMajority(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int majorityElement = -1;
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                majorityElement = entry.getKey();
            }
        }

        return majorityElement;
    }
}
