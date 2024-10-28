import java.util.*;

public class LargestTwoPair {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = read.nextInt(); // 4
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = read.nextInt(); // {2,3,4,5}
		}
		read.close();
		int sum;
		int ans = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			sum = arr[i] + arr[i + 1]; // 2+3 //3+4 /4+5
			if (sum > ans) // 5>0 // 7>5 //9>7
				ans = sum; // 5 //7 //9

		}
		System.out.println(ans); // ans = 9
	}

}