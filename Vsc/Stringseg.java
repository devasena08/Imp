import java.util.Scanner;

public class Stringseg {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String str = read.next();
        int L = read.nextInt();
        read.close();

        int maxAs = 0;

        // Process the string in sets of L characters
        for (int i = 0; i < str.length(); i += L) {
            int countA = 0;
            for (int j = i; j < i + L && j < str.length(); j++) {
                if (str.charAt(j) == 'a') {
                    countA++;
                }
            }
            if (countA > maxAs) {
                maxAs = countA;
            }
        }

        System.out.println(maxAs);
    }
}
