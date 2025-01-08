public class Fern21 {
    public static void main(String[] args) {
        //sec max
        int[] arr ={1,7,3,5,9,2};
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                sec = max;//-2 //1 //3//5 //7
                max = arr[i];//1//7//9
            }else if(arr[i] > sec && sec != max){
                sec = arr[i];
            }
        }
        System.out.println(sec);
    }
}
