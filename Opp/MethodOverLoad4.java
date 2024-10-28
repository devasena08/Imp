public class MethodOverLoad4 {
    public static void main(String[] args) {
        // methods are non static
        // only one object is enough to call all the overloaded method
        M4 m = new M4(2,3);
        System.out.println("2 Args : " + m.add(2, 3));
        System.out.println("3 Args : " + m.add(2, 3, 4));

    }

}

class M4 {

    int a;
    int b;
    
    M4(int a, int b) {
        System.out.println("Cons Called ..");
    }
    

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
/*
 * bcz, method overloading
 * The constructor is only used when an object of the class is created. Once the object is created,
 *  any overloaded method can be called based on the number and types of arguments you pass to i
 */