public class Arr_Max {
    public static void main(String[] args) {
        int[] arr ={12,34,2,33,1};
        int max =0;
        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
        System.out.println(max  +" is the Max Element..");
    }
}
