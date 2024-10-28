public class Variable_Instance {
    int n = 10;  // instance variable 
    public static void main(String[] args) {
      //  System.out.println(n);  //Cannot make a static reference to the non-static field
      Variable_Instance var1 = new Variable_Instance();
      System.out.println(var1.n);
    }
    
}
// declared inside a class but not inside method
// instance variable always get a default value
//new object creates space in heap memory
// non static variable it is.. so,we need to create object to access this variable...inside any method