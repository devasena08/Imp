public class Fern9 {
    public static void main(String[] args) {
        int[] arr ={7,3,5,9,2};
        int n = arr.length;
        for(int i=0; i<(n-1); i++){
            for(int j=0; j<(n-i-1); j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
       for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
       }
    }
}