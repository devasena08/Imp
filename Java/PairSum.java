import java.util.Scanner;

public class PairSum {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int arr[] = { 1, 4, 45, 6, 10, 8 };
		int target = 16;
		System.out.println(imp(arr, target));
		read.close();
	}

	public static boolean imp(int[] arr, int target) {
		for (int i = 0; i < arr.length - 1; i++) {
			int res = arr[i] + arr[i + 1]; // 5, 50, 51, 16
			if (target == res) {// 16==16
				return true;

			}
		}
		return false;
	}

}
