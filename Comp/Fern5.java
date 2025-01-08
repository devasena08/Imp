public class Fern5 {
    public static void main(String[] args) {
        //sum of elements in 2d array
        int[][] arr = {{1,2,3},
                       {4,5,6}};
                       
        int sum =0;         
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
        
    }
}
/*
Bc...it 3*2
For i = 0 (first row):
j = 0 → Process arr[0][0] (value 1).
j = 1 → Process arr[0][1] (value 2).
j = 2 → Process arr[0][2] (value 3).
For i = 1 (second row):
j = 0 → Process arr[1][0] (value 4).
j = 1 → Process arr[1][1] (value 5).
j = 2 → Process arr[1][2] (value 6).
*/
