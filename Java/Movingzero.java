import java.util.*;
public class Movingzero{
    public static void main(String[] args) {
        int[] arr ={0,1,2,0,0,3,4,0};
        System.out.println(Arrays.toString(Move(arr)));
    }
    public static int[] Move(int[] arr){
        int n = arr.length; 
        int[] str = new int[n]; //new arr to copy
        int index=0;
        for(int i=0; i<arr.length; i++){ //copied only non zero elements rest all have default zero values
            if(arr[i] != 0){
                str[index++] = arr[i];
            }
        }
        return str;
    }
}