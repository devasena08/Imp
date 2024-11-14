public class RecursionDemo1 {
    int sum = 0; //instance variable

    public static void main(String[] args) {
        RecursionDemo1 rd = new RecursionDemo1();
        System.out.println(rd.Add(1));
    }

    private int Add(int n) {
        sum += n; // 1
        n++; // 2
        if (n <= 5) {

            Add(n);
        }
        return sum;
    }
}
