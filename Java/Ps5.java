public class Ps5 {
    public static void main(String[] args) {
        Sivakumar s = new Sivakumar();
        Sivakumar s1 = new Surya();
        s.act();
        s1.act();
    }
}
class Sivakumar{
    void act(){
        System.out.println("Sivakumar Act is good...");
    }
}
class Surya extends Sivakumar{
    void act(){
        System.out.println("Surya Act is Good...");
    }
}
/*
 * method overriding has a feature that allows a subclass to provide its own implementation
 * of method...that has already defined in the super class 
 */