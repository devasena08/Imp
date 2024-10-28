import java.util.*;
public class WeightSum {
    public static void main(String[] args) {
        int[] numbers = {10, 36, 54, 89, 12};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : numbers) {
            int weight = 0;
            if (Math.sqrt(num) == (int)Math.sqrt(num)) {//  perfect square
                weight += 5;
            }
            if (num % 12 == 0) {// divisible by both 4 and 6
                weight += 4;
            }
            if (num % 2 == 0) {//  even
                weight += 3;
            }
            map.put(num, weight);
	    
        }
        List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(map.entrySet());
        sortedList.sort(Map.Entry.comparingByValue());
        
        for (Map.Entry<Integer, Integer> entry : sortedList) {
            System.out.println("<" + entry.getKey() + ", " + entry.getValue() + ">");
        }
        
       
    }
}
