import java.util.*;

public class Notes_toString {
    public static void main(String[] args) {
        // creating obj for string class
        String  s = new String("Deva");
        //printing the string obj
        System.out.println("String obj : "+s);

        // creating obj for Integer wrapper class
        //1 through valueOf 
        Integer i1 = Integer.valueOf(10);
        System.out.println("Integer obj : "+i1);

        //2 through using constructor 
        // Integer i2 = new Integer(10);--> is removed in java
       
        // 3 through autoboxing
        Integer obj = 2;
        System.out.println("Integer obj : "+obj);

        // creating obj for Collection classes like ArrayList , LinkedList, etc
        ArrayList<String> a = new ArrayList<>();
        a.add("Hello");
        System.out.println("ArrayList obj : "+a);


        //creating obj for class A
        A b = new A("Deva", 1);
        System.out.println(b);
    }
    
    public String toString(){
        return "Hi";
    }
    
}
class A{
    //instance variable ah create panipom
     String n;
     int id;
    A(String name, int i){
        this.n =name;
        this.id = i;
    }

    
}
