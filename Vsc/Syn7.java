public class Syn7 {
    public static void main(String[] args) {
       int[] arr ={80,20,30,20,30,60,40,50,44,22,60,40};
       for(int i=0; i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
            if(arr[i] == arr[j]){
                System.out.println("The duplicates are :"+ arr[i]);
            }
        }System.out.println();
       }

    }
}
