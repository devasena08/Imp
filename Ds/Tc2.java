public class Tc2 {
    public static void main(String[] args) {
        //sum of n  natural numbers
        
        System.out.println(finSum1(10));

        //Tc find
        double now = System.currentTimeMillis();
        System.out.println("Tc " + (System.currentTimeMillis()- now));

    }
    //takes more time than previous
    public static int finSum1(int n){
        int sum =0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        return sum;
    }
}
