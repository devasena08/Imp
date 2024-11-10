import java.util.Arrays;

public class DivPlayers {
    public static void main(String[] args) {
        int[] arr ={3,2,5,1,3,4};
        Arrays.sort(arr);// 1,2,3,3,4,5
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
