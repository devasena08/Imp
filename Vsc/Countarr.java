import java.util.Scanner;

public class Countarr {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = read.nextInt();
        }
        int count =1;
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                count ++;
            }
        }
        System.out.println(count);
        read.close();
    }
}
