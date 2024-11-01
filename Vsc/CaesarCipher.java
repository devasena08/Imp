import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the string to encrypt:");
        String str = read.nextLine();
        System.out.println("Enter the shift value:");
        int k = read.nextInt();
        System.out.println("Encrypted string: " + CC(str, k));
        read.close();
    }

    static String CC(String str, int k) {
        String cipher = "";
        int temp;

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                temp = ch - 'A'; // Shift within uppercase letters
                temp = (temp + k) % 26;
                cipher += (char) (temp + 'A');
            } else if (Character.isLowerCase(ch)) {
                temp = ch - 'a'; // Shift within lowercase letters
                temp = (temp + k) % 26;
                cipher += (char) (temp + 'a');
            } else if (Character.isDigit(ch)) {
                temp = ch - '0'; // Shift within digits
                temp = (temp + k) % 10;
                cipher += (char) (temp + '0');
            } else {
                // Non-alphanumeric characters remain unchanged
                cipher += ch;
            }
        }

        return cipher;
    }
}
