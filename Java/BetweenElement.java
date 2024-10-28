import java.util.*;

public class BetweenElement {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("N="); //6
		int N = read.nextInt();
		System.out.print("X="); //1
		int X = read.nextInt();
		System.out.print("Y="); //4
		int Y = read.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < a.length; i++) {
			a[i] = read.nextInt(); // 1 2 3 4 5 6
		}
		for (int i = 0; i < a.length; i++) {
			int ele = a[i];
			if (ele > X && ele < Y) {
				System.out.print(ele);  // ele should be greater than 1 and less than 4
				// ans is 23
			}
			read.close();
		}

	}
}