public class Fern2 {
    public static void main(String[] args) {
        //linear search
        int[] arr ={1,2,3,4,5,6};
        int target =4;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println(target +" is located at the index of "+i);
            }
        }
    }
}
