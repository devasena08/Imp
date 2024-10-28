public class MethodOverRide3 {
    public static void main(String[] args) {
        Parent p1 = new Child();
        p1.shown();
        p1.shown();
       
    }
}
class Parent{
    static void show(){
        System.out.println("Parent ....");
    }
    void shown(){
        System.out.println("Parent1 ....");
    }

}
class Child extends Parent{
    static void show(){
        System.out.println("Child..");
    }
    void shown(){
        System.out.println("Child1 ....");
    }
}
// static method cannot be overriden