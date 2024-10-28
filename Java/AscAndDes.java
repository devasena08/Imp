import java.util.*;

public class AscAndDes {
	public static void main(String[] args) {
		int[] arr = { 13, 2, 4, 15, 12, 10, 5 };
		ArrayList<Integer
		> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				list1.add(arr[i]);
			} else {
				list2.add(arr[i]);
			}
		}
		Collections.sort(list1); // [4, 5, 12, 13]
		Collections.sort(list2); // [2,10,15]
		Collections.reverse(list2); // [15, 10, 2]

		ArrayList<Integer> merge = new ArrayList<>();

		int max = Math.max(list1.size(), list2.size()); // 4,3 = max is 4
		for (int i = 0; i < max; i++) { // for 4 iterations..list get added
			if (i < list1.size()) {
				merge.add(list1.get(i));
			}
			if (i < list2.size()) {
				merge.add(list2.get(i));
			}
		}

		System.out.println(merge);//  [4, 15, 5, 10, 12, 2, 13]

	}

}