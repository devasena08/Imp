import java.util.*;
public class ArrrayList_Demo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        // add panrom
        al.add(10);
        al.add(10);
        al.add(10);
        al.add(20);
        System.out.println(al);
        // return booleamn value to added or not
        System.out.println(al.add(80));
        // to return the size
        System.out.println(al.size());

        // add at the mid index--->use index 
        al.add(4,90);
        System.out.println(al);

        System.out.println(al.contains(90));

        // get method---->to pick
        // only for retrieval
        System.out.println(al.get(0));

        // retreive and del the element
        System.out.println(al.remove(5));
        System.out.println(al);

        //set method--> changing the value 10  t0 30
        al.set(1, 30);
        System.out.println(al);

        // to print the index
        System.out.println(al.indexOf(30));

        //add All
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.addAll(al);
        System.out.println(al2);

        // addAll  using index position
        ArrayList<Integer> al3 = new ArrayList<>();
        al3.add(1);
        al3.add(2);
        al3.add(3);
        System.out.println(al3);

        al3.addAll(1,al2);
        System.out.println(al3);

        List<Integer> al4 = al3.subList(1,5);
        System.out.println(al4);

        

    }

}
