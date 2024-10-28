public class Abstract1 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.printst();
        System.out.println( "Area of Circle is :- "+s.Area());
        Shape s1 = new Square();
        System.out.println( "Area of Square is :- "+s1.Area());
    }
}
abstract class Shape{
    int r =3;
    
    abstract int Area();
    public void printst(){
        System.out.println("Areas are..");
    }
}
class Circle extends Shape{
    
    public int Area(){
        return (int) (Math.PI * r * r);
    }
}
class Square extends Shape{
    
    public int Area(){
        return  r * r;
    }
}