public class Notes_Hash{
     public static void main(String[] args) {

/* 
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }

    for (Integer key : map.keySet()) {
    System.out.println("Key: " + key + ", Value: " + map.get(key));
    }
	
    for (Integer value : map.values()) {
    System.out.println(value); // Only prints values
    }

    map.put(1, "Apple");

    String value = map.get(1);

    map.remove(1);

    map.clear();

    boolean hasKey = map.containsKey(1);

    boolean hasValue = map.containsValue("Apple");
 
   int size = map.size();
 
   boolean isEmpty = map.isEmpty();


   The HashMap in Java does not have a direct sort method because 
   HashMap does not maintain order. 
   If you want to sort a HashMap by its keys or values, 
   you need to extract the data into a collection like a List or TreeMap, and then sort it manually.


import java.util.*;

public class SortByValue {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(10, "Apple");
        map.put(5, "Banana");
        map.put(20, "Orange");

        // Convert the HashMap to a list of Map.Entry
        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
        
        // Sort the list by values
        list.sort(Map.Entry.comparingByValue());
        
        // Printing the sorted entries
        for (Map.Entry<Integer, String> entry : list) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}


*/
     }
}