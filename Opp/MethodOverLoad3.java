public class MethodOverLoad3 {
    public static void main(String[] args) {
        // methods are non static
        M3 m = new M3();
        System.out.println("2 Args : "+ m.add(2,3));
        System.out.println("3 Args : "+ m.add(2,3,4));

    }
    
}
class M3{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b,int c){
        return a+b+c;
    }
}

