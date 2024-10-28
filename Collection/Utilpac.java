import java.util.Arrays;

public class Utilpac {
    /*
     * java.util.Arrays
     * Arrays classs
     * all classes in java,...is NON Prmimitive Datatype
     * 
     * Arrays.sort(arr); 
     * only for primitive ku..apo Non primitive ku..?
     * 
     */
    public static void main(String[] args) {
        int[] arr ={4,3,2,1};
        for(int i : arr){
            System.out.println(i);
        }
        Arrays.sort(arr); //sort is a static method, adhn cls vachu access panrom
        System.out.println(arr);

       
    }
}
