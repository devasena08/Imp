import java.util.*;

public class Conv_1Dto2D {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();// no of elements to get for array= 4

        // 1D
        int[] arr = new int[t];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = read.nextInt();
        }
        System.out.println("1D Array " + Arrays.toString(arr));
        int m = read.nextInt();
        int n = read.nextInt();
        read.close();
        System.out.println(Arrays.deepToString(Conv(arr, m, n))); // used for 2D arraay
    }

    public static int[][] Conv(int[] arr, int m, int n) { // 1234 , m =2, n=2
        if (m * n != arr.length) {
            return new int[][] {};
        }
        int[][] arr1 = new int[m][n];
        for (int i = 0; i < arr.length; i++) { // i=0, 0<4 || i=1; 1<4, || i=2; 2<4, || i=3; 3<4
            arr1[i / n][i % n] = arr[i];
        }
        // 0/2 =0, 0%2 =0, 00-->arr[0]->1
        // 1/2 =0, 1%2 =1, 01-->arr[1]->2
        // 2/2 =1, 2%2 =0, 10-->arr[2]->3
        // 3/2 =1, 3%2 =1, 11-->arr[3]->4
        return arr1;

    }

}
// 1234
// 1--00 2--01 3--10 4--11
// if cond fails then only sec loop comes out