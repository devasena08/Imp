import java.util.Scanner;

public class Bubbledescen {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = read.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length; i++){
            arr[i] = read.nextInt();
        }
        sort(arr);
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        read.close();
    }
    static int[] sort(int[] arr){
        int len = arr.length;
        for(int i=0; i<len-1; i++){
            for(int j=0; j<len-i-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
        
    }
}

