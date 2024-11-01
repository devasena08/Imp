import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String s = str.toLowerCase();
        int[] arr = new int[26];

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                arr[ch - 'a']++;
            }
        }

        boolean isPangram = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        read.close();
    }
}
