public class BestTimeSellBuy {
    public static void main(String[] args){
        int[] arr={7,1,4,3,6,5}; //o/p:-5
        // starting is buy only..apo dhn sell pana mudiyum
        int buy = arr[0];
        //initialize panirnum..apo dhn max find pana mudiyum
        int profit =0;
        // start from 1
        for(int i=1; i<arr.length; i++){
            if(arr[i] <= buy){
                buy = arr[i];
                continue;
            }
            else{
                //buy -sell =profit...wrg
                //sell-buy adhn profit varum..inga sell is arr[i]
                //from that we want themax..so
                 profit = Math.max(arr[i]-buy, profit);
            }
        }
        System.out.println(profit);
    }
}
