public class Fern9 {
    public static void main(String[] args) {
        //merge sort
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
/*
i=0; 3,5,7,2,9---->         9--->j 0 to 4  -->n=5-->n-i-1-->5-0-1---4
i=1; 3,5,2,7,9---->       7,9--->j 0 to 3  -->n=5-->n-i-1-->5-1-1---3
i=2; 3,2,5,7,9---->     5,7,9--->j 0 to 2  -->n=5-->n-i-1-->5-2-1---2
i=3; 2,3,5,7,9---->   3,5,7,9--->j 0 to 1  -->n=5-->n-i-1-->5-3-1---1
i=4; 2,3,5,7,9----> 2,3,5,7,9--->j 0 to 0  -->n=5-->n-i-1-->5-4-1---0
*/
