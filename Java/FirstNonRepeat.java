import java.util.Scanner;
public class FirstNonRepeat {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String str = read.next();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            int count = 0;  
            for (int j = 0; j < n; j++) {
                if (str.charAt(i) == str.charAt(j) && i != j) {
                    count++;
                    break;  
                }
            }
            if (count == 0) {
                System.out.println(str.charAt(i));
                break;
            }
        }
        read.close();
    }
}
