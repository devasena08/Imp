import java.util.*;

public class AddString {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter : ");
		String a = read.next(); // 123 in string
		System.out.println("Enter : ");
		String b = read.next(); // 2 in string
		// String to integer using Integer.parseInt
		int one = Integer.parseInt(a); // 123 in int
		int two = Integer.parseInt(b); // 2 in int
		int ans = one + two; // 123+2=125
		System.out.println(ans);// 125
		read.close();
	}
}