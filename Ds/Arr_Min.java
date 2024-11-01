public class Arr_Min{
    public static void main(String[] args) {
        int[] arr ={12,34,21,33,11,3,5,7,2};
        int min =arr[0]; //12,2,1
        for(int num : arr){
            if(num < min){
                min = num;
            }
        }
        System.out.println(min  +" is the Min Element..");
    }
}
