import java.util.*;

public class DivPlayers1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        int[] arr = new int[t];
        for(int i=0; i<arr.length; i++){
            arr[i] = read.nextInt();
        }
        read.close();
        System.out.println(Div(arr));
    }
    public static int Div(int[] arr){
        int s =0; //1 
        int e =arr.length-1;//5
        int sum=0;
        while (s<=e) {
            int ans = arr[s] * arr[e]; //5 ,8, 9
            sum += ans; //5+8+9=22
            s++; //2
            e--; //4
        }
        return sum;
    }
}

