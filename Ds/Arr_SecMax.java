public class Arr_SecMax {
    public static void main(String[] args) {
        int[] arr ={12,34,2,33,34,2}; //op is 33
        int max =Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = secMax; //minvalue ,12 ,34
                secMax = arr[i]; //12, 34, 33
            }
    
        }
        System.out.println(secMax);
    }
}
