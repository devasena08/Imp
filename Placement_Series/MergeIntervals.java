import java.util.*;

public class MergeIntervals {
    public static void main(String[] args){
        int[][] intervals = {{2,6},{8,10},{2,3},{15,18}};
        //sorting to get {{2,3},{2,6},{8,10},{15,18}};
        //sorting only using 0 th index
        Arrays.sort(intervals,(a,b) -> a[0]-b[0] );
        int index =0;
        List<int[]> list = new ArrayList<>();
        while(index < intervals.length){
            int start = intervals[index][0]; //2 is the first element--->00
        
            int cur_end = intervals[index][1];//3------>01
            //check 
            while(index < intervals.length-1 && cur_end >= intervals[index+1][0]){  //3>=2----(10)
                cur_end = Math.max(cur_end, intervals[index+1][1]);// 0+1 1-->11 (3,6)-->max->6
                index++;
            }
            int end = cur_end;
            list.add(new int[]{start, end} );
            index++;//0-->1--->2--->3
        }
        // we needto return 2 d array
        int[][] res = new int[list.size()][2]; // we know the col..but we dont knoew the no of rows...so,list.size
        int i=0; //for index to add elements
        // list has array as elements..
        for(int[] arr : list){
            res[i++] = arr;// arr added to 2d array
        }

        System.out.println(Arrays.deepToString(res));//[[2, 6], [8, 10], [15, 18]]
    }
}
/*
 * [2,3]  =00 01
 * [2,6]  =10 11
 * [8,10] =20 21
 * [15,18]=30 31
 */
