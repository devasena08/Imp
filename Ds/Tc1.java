public class Tc1 {
    public static void main(String[] args) {
        //sum of n  natural numbers
        
        System.out.println(finSum(5));

        //Tc find
        double now = System.currentTimeMillis();
        System.out.println("Tc " + (System.currentTimeMillis()- now));

    }
    public static int  finSum(int n){
        return n*(n+1)/2;
    }
}
