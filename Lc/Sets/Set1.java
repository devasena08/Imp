public class Set1 {
    public static void main(String[] args) {
        String s = "program";
        int n = s.length(); // 7
        for (int i = 1; i <= n; i++) { // no of rows
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print(s.charAt(i-1));
                } else if (i + j == n + 1) {
                    System.out.print(s.charAt(i-1));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}