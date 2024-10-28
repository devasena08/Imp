public class Abstract3 {
    public static void main(String[] args) {
        Shape2 s = new Circle2(3);
        s.printst();
        System.out.println( "Area of Circle is :- "+s.Area());
        Shape2 s1 = new Square2(3);
        s1.printst();
        System.out.println( "Area of Square is :- "+s1.Area());
    }
}
abstract class Shape2{
    int r ;
    // no argument constructor
    // called when objects of sub class gets created
    Shape2(){
        System.out.println("Parent classs 1");
    }
    // parameterized constructor
    Shape2(int r){
        System.out.println("Parent classs 2");
    }
    abstract int Area();
    public void printst(){
        System.out.println("Area is given below..");
    }
}
class Circle2 extends Shape2{
    
    Circle2(int r){
        super(r);
        System.out.println("Child Class..");
    }
    
    public int Area(){
        return (int) (Math.PI * r * r);
    }
}
class Square2 extends Shape2{

    Square2(int r){
        super(r);
        System.out.println("Child Class..");
    }
    
    public int Area(){
        return  r * r;
    }
}
/*
 * Parent classs 1
Child Class..        
Area is given below..
Area of Circle is :- 0
Parent classs 1       
Child Class..
Area is given below.. 
Area of Square is :- 0   
this called the parent class no argument constructor
child classs will call the parent class no argument constructor by default
if i want to call the argument constructor, then i need to use super
now we are doing expicit call of constructor
 */