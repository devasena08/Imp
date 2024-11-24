import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4}; //123  // 9-->10 //999
        // if lasst ele is less than 9..inceremny by one
            if(arr[arr.length-1] < 9){
                arr[arr.length-1]++;
                System.out.println(Arrays.toString(arr));
                
            }
        //else equal to 9..then 10..so,..arr[o]=1 and arr[last ele] = 0
            else{
                arr[arr.length-1] =0;
                int[] newarr = new int[(arr.length)+1];
                newarr[0] =1;
                System.out.println(Arrays.toString(newarr));
                
            }
        
       
    }
}
