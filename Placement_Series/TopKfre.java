import java.util.*;
public class TopKfre {
    public static void main(String[] args){
        int[] arr ={1,1,1,2,2,3};
        int k = 2;
        HashMap<Integer, Integer> map =  new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> map.get(b)-map.get(a));

        for(int key : map.keySet()){
            maxHeap.add(key);
        }
        int[] res = new int[k];
        for(int i=0; i<k; i++){
            res[i]= maxHeap.poll();
        }
        System.out.println(Arrays.toString(res));

    }
}
