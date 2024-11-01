import java.util.Arrays;

public class Arr_Remove {
    public static void main(String[] args) {
        int[] arr ={3,2,4,7,10,6,5};//o/p :- 3,7,5
        int count = 0; //odddcount
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                count++; //3
            }
        }
        int[] arr1 = new int[count]; // 3 box get created
        int index=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                arr1[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
