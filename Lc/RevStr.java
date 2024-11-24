
public class RevStr {
    public static void main(String[] args) {
        String s ="the sky is blue";
        String[] arr = s.split(" ") ;
        int start =0;
        int end = arr.length-1;
        while (start <= end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        String st ="";
        for(String c : arr){
            st += c+" ";
            
        }
        System.out.println(st);
    }
}
