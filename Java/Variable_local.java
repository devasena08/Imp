public class Variable_local {
    public static void main(String[] args) {
        Sum();
       // Sum1();--->bcz non static method cant accessed without creating object
       Variable_local v = new Variable_local();
       v.Sum1();
    }
    public static void Sum(){
        int a =10;
        int b = 20;
        int sum = a+b;
        System.out.println(sum);
    }
    public void Sum1(){
        int a =10;
        int b = 20;
        int sum = a+b;
        System.out.println(sum);
    }
}
//local variable created inside method
// local var is stored in stack memory