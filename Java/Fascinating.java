import java.util.*;

public class Fascinating {
	public static void main(String[] args) {
		int num = 192;
		System.out.println(Fasci(num));
	}

	public static boolean Fasci(int num) {
		String str = num + "" + (num * 2) + "" + (num * 3); // 192 384 576 =192384576

		if (str.length() != 9) {
			return false;
		}
		HashSet<Character> set = new HashSet<>();
		for (char c : str.toCharArray()) {
			if (c == 0 || set.contains(c)) {
				return false;
			} else {
				set.add(c);
			}
		}
		return set.size() == 9;
	}
}