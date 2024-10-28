import java.util.*;

public class Anagram {
	// replaceFirst
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter : ");
		String A = read.next(); // Anagram
		System.out.println("Enter : ");
		String B = read.next(); // Manaagr
		String s1 = A.toLowerCase(); // anagram
		String s2 = B.toLowerCase(); // manaagr
		String s3 = s2; // to copy the sec string
		if (s1.length() != s2.length()) {
			System.out.println("Invalid... ");
		} else {
			for (int i = 0; i < s1.length(); i++) {
				for (int j = 0; j < s2.length(); j++) {
					if (s1.charAt(i) == s2.charAt(j)) {
						s3 = s3.replaceFirst(Character.toString(s1.charAt(i)), "");
						// replace the first appered char with string.
						// elame string aa irkanum, so..Character.toString
					}
				}
			}
			if (s3.length() == 0) {
				System.out.println("Vaild string");
			} else {
				System.out.println("Invalid ");
			}
		}
		read.close();
	}
}