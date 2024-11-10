public class Set1a {
    public static void main(String[] args) {
        String s = "program";
        int n = s.length(); // 7
        for (int i = 0; i < n; i++) { // no of rows
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(s.charAt(i));
                } else if (i + j == n-1 ) {
                    System.out.print(s.charAt(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}