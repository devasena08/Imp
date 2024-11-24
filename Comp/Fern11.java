public class Fern11 {
    public static void main(String[] args) {
        // fibonacci...0 1 1 2 3 5 8 13
        Fibo(6);
    }

    public static void Fibo(int n) {
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + " " + n2); // 0 1
        int i=1;
        while (i <= (n-2)) {
            int sum = n1 + n2; // 1
            n1 = n2;
            n2 = sum;
            System.out.print(" " + sum); // 1
            i++;
        }
    }
}
