public class NextLargest {
    public static void main(String[] args) {
        int[] arr ={8,4,1,9,6,2};
        
        for(int i=0; i<arr.length; i++){
            int count=0;
            int big =0;
            for(int j=0; j<arr.length; j++){
                if(arr[j] > arr[i]){
                    if(count ==0){
                        big = arr[j];
                        count++;
                    }else{
                        if(big > arr[j]){
                            big = arr[j];
                        }
                    }
                }
                    
            }
            if(count == 0){
                System.out.print(arr[i] +"->"+",");
            }else{
                System.out.print(arr[i] +"->"+ big +",");
            }
        }
        
    }
}
