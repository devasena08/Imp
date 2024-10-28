import java.util.*;
public class TwoSum {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 3, 5 };
		int target = 9;
		System.out.print(Arrays.toString(Sum(arr, target)));
	}
	public static int[] Sum(int[] arr, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int c = target - arr[i];
			if (map.containsKey(c))
				return new int[] { map.get(c), i };
			map.put(arr[i], i);
		}
		return null;
	}
}