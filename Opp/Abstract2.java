public class Abstract2 {
    public static void main(String[] args) {
        Shape1 s = new Circle1();
        s.printst();
        System.out.println( "Area of Circle is :- "+s.Area());
        Shape1 s1 = new Square1();
        s1.printst();
        System.out.println( "Area of Square is :- "+s1.Area());
    }
}
abstract class Shape1{
    int r =3;
    // i dont have any prob here..bcz, it is no arg parameter
    // super keyword will present in all the constructors in the first line by default
    // if i pass parameter to the con..then i need to use super(parameter)
    Shape1(){
        System.out.println("Parent classs 1");
    }
    abstract int Area();
    public void printst(){
        System.out.println("Area is given below..");
    }
}
class Circle1 extends Shape1{
    

    public int Area(){
        return (int) (Math.PI * r * r);
    }
}
class Square1 extends Shape1{
    
    public int Area(){
        return  r * r;
    }
}