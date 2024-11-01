import java.util.HashMap;

public class Secrepstring {
    public static void main(String[] args) {
        String[] str = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
        HashMap<String, Integer> map = new HashMap<>();

        // Count the frequency of each string
        for (String s : str) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        // Variables to keep track of the first and second highest frequencies
        int max = 0;
        int secondMax = 0;
        String maxString = null;
        String secondMaxString = null;

        // Iterate over the map to find the first and second most frequent strings
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            int frequency = entry.getValue();
            String key = entry.getKey();

            if (frequency > max) {
                secondMax = max;
                secondMaxString = maxString;
                max = frequency;
                maxString = key;
            } else if (frequency
             > secondMax && frequency < max) {
                secondMax = frequency;
                secondMaxString = key;
            }
        }

        System.out.println("Second most frequent string: " + secondMaxString);
    }
}
