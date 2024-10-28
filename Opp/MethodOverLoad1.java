public class MethodOverLoad1 {
    public static void main(String[] args) {
         System.out.println("2 Args : "+ add(2,3));
         System.out.println("3 Args : "+ add(2,3,4));
    }
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b,int c){
        return a+b+c;
    }
}

