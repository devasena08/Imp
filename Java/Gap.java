import java.util.*;

public class Gap {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = read.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = read.nextInt();
		}
		System.out.println("Gap: ");
		int a = read.nextInt();
		int sum = 0, sum1 = 0, sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % a == 0) {
				sum += arr[i];
			} else if (i % a == 1) {
				sum1 += arr[i];
			} else if (i % a == 2) {
				sum2 += arr[i];
			}

		}
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(sum2);
		read.close();
	}
}