public class TcConst {
     
    public int Sum(int x, int y){  // two elements are passes inside the methos..take as cons
        // x takes 1 y takes 1 , + takes 1, res storing the value takes 1
        int res = x+y; // ----> 1+1+1+1= 4
        return res;// 1+! = 2   ---->6 in total...--->T(C) = O(1)
    }
    public  int get(int[] arr, int i){ // two elements are passes inside the methos.one is arr, other is ele take as cons
        return arr[i];// this return takes cons time
    }//---->O(1)
    
}

